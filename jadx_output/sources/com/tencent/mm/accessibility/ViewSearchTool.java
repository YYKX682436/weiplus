package com.tencent.mm.accessibility;

/* loaded from: classes4.dex */
public class ViewSearchTool {
    private static final java.lang.String GET_DEFAULT_IMPL = "getDefault";
    private static final java.lang.String GET_GLOBAL_INSTANCE = "getInstance";
    private static final java.lang.String TAG = "ViewSearchTool";
    private static final java.lang.String VIEWS_FIELD = "mViews";
    private static final java.lang.String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
    private static final java.lang.String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
    private static final java.lang.String WINDOW_PARAMS_FIELD = "mParams";

    /* loaded from: classes4.dex */
    public interface Matcher {
        boolean match(android.view.View view);
    }

    private java.util.List<android.view.View> filter(android.view.View view, com.tencent.mm.accessibility.ViewSearchTool.Matcher matcher) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(0, java.util.Collections.singletonList(view));
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (android.view.View view2 : (java.util.List) arrayList.get(i17)) {
                if (view2 instanceof android.view.ViewGroup) {
                    int i18 = 0;
                    while (true) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                        if (i18 < viewGroup.getChildCount()) {
                            arrayList2.add(viewGroup.getChildAt(i18));
                            i18++;
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                break;
            }
            i17++;
            arrayList.add(arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (android.view.View view3 : (java.util.List) it.next()) {
                if (matcher.match(view3)) {
                    arrayList3.add(view3);
                }
            }
        }
        return arrayList3;
    }

    private java.util.List<android.view.View> findRoots() {
        java.lang.Class<?> cls = java.lang.Class.forName(WINDOW_MANAGER_GLOBAL_CLAZZ);
        java.lang.Object invoke = cls.getMethod(GET_GLOBAL_INSTANCE, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.reflect.Field declaredField = cls.getDeclaredField(VIEWS_FIELD);
        declaredField.setAccessible(true);
        cls.getDeclaredField(WINDOW_PARAMS_FIELD).setAccessible(true);
        java.util.List<android.view.View> list = (java.util.List) declaredField.get(invoke);
        if (list.size() != 0) {
            return list;
        }
        throw new java.lang.RuntimeException("something wrong");
    }

    @java.lang.Deprecated
    public static java.lang.String findText(android.view.View view) {
        if (view == null) {
            return null;
        }
        java.lang.CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null) {
            return contentDescription.toString();
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null && (((childAt instanceof android.view.ViewGroup) || (childAt instanceof android.widget.TextView)) && (contentDescription = findText(childAt)) != null)) {
                    break;
                }
            }
        } else if (view instanceof android.widget.TextView) {
            contentDescription = ((android.widget.TextView) view).getText();
        }
        if (contentDescription != null) {
            return contentDescription.toString();
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.String findViewDepth(android.view.View view, android.view.View view2, java.lang.String str) {
        if (view != null && view2 != null) {
            if (str == null) {
                str = "";
            }
            if (view.equals(view2)) {
                return str.startsWith("_") ? str.substring(1) : str;
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    java.lang.String findViewDepth = findViewDepth(viewGroup.getChildAt(i17), view2, str + "_" + i17);
                    if (findViewDepth != null && !findViewDepth.equals("")) {
                        return findViewDepth.startsWith("_") ? findViewDepth.substring(1) : findViewDepth;
                    }
                }
            }
        }
        return null;
    }

    public java.util.List<android.view.View> findView(com.tencent.mm.accessibility.ViewSearchTool.Matcher matcher) {
        java.util.Iterator<android.view.View> it = findRoots().iterator();
        while (it.hasNext()) {
            java.util.List<android.view.View> filter = filter(it.next(), matcher);
            if (filter != null && filter.size() > 0) {
                return filter;
            }
        }
        return null;
    }
}
