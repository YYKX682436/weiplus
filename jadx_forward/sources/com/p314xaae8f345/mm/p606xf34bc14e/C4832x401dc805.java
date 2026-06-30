package com.p314xaae8f345.mm.p606xf34bc14e;

/* renamed from: com.tencent.mm.accessibility.ViewSearchTool */
/* loaded from: classes4.dex */
public class C4832x401dc805 {

    /* renamed from: GET_DEFAULT_IMPL */
    private static final java.lang.String f20838xcc189be7 = "getDefault";

    /* renamed from: GET_GLOBAL_INSTANCE */
    private static final java.lang.String f20839x6b5fe2a8 = "getInstance";
    private static final java.lang.String TAG = "ViewSearchTool";

    /* renamed from: VIEWS_FIELD */
    private static final java.lang.String f20840xbe7bbba9 = "mViews";

    /* renamed from: WINDOW_MANAGER_GLOBAL_CLAZZ */
    private static final java.lang.String f20841x15dfe2fd = "android.view.WindowManagerGlobal";

    /* renamed from: WINDOW_MANAGER_IMPL_CLAZZ */
    private static final java.lang.String f20842xeadd57fa = "android.view.WindowManagerImpl";

    /* renamed from: WINDOW_PARAMS_FIELD */
    private static final java.lang.String f20843x96aa3cd0 = "mParams";

    /* renamed from: com.tencent.mm.accessibility.ViewSearchTool$Matcher */
    /* loaded from: classes4.dex */
    public interface Matcher {
        /* renamed from: match */
        boolean m42199x62dd9c5(android.view.View view);
    }

    /* renamed from: filter */
    private java.util.List<android.view.View> m42194xb408cb78(android.view.View view, com.p314xaae8f345.mm.p606xf34bc14e.C4832x401dc805.Matcher matcher) {
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
                if (matcher.m42199x62dd9c5(view3)) {
                    arrayList3.add(view3);
                }
            }
        }
        return arrayList3;
    }

    /* renamed from: findRoots */
    private java.util.List<android.view.View> m42195x18e96198() {
        java.lang.Class<?> cls = java.lang.Class.forName(f20841x15dfe2fd);
        java.lang.Object invoke = cls.getMethod(f20839x6b5fe2a8, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        java.lang.reflect.Field declaredField = cls.getDeclaredField(f20840xbe7bbba9);
        declaredField.setAccessible(true);
        cls.getDeclaredField(f20843x96aa3cd0).setAccessible(true);
        java.util.List<android.view.View> list = (java.util.List) declaredField.get(invoke);
        if (list.size() != 0) {
            return list;
        }
        throw new java.lang.RuntimeException("something wrong");
    }

    @java.lang.Deprecated
    /* renamed from: findText */
    public static java.lang.String m42196xd7842a86(android.view.View view) {
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
                if (childAt != null && (((childAt instanceof android.view.ViewGroup) || (childAt instanceof android.widget.TextView)) && (contentDescription = m42196xd7842a86(childAt)) != null)) {
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
    /* renamed from: findViewDepth */
    public static java.lang.String m42197xaf330965(android.view.View view, android.view.View view2, java.lang.String str) {
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
                    java.lang.String m42197xaf330965 = m42197xaf330965(viewGroup.getChildAt(i17), view2, str + "_" + i17);
                    if (m42197xaf330965 != null && !m42197xaf330965.equals("")) {
                        return m42197xaf330965.startsWith("_") ? m42197xaf330965.substring(1) : m42197xaf330965;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: findView */
    public java.util.List<android.view.View> m42198xd7851ffe(com.p314xaae8f345.mm.p606xf34bc14e.C4832x401dc805.Matcher matcher) {
        java.util.Iterator<android.view.View> it = m42195x18e96198().iterator();
        while (it.hasNext()) {
            java.util.List<android.view.View> m42194xb408cb78 = m42194xb408cb78(it.next(), matcher);
            if (m42194xb408cb78 != null && m42194xb408cb78.size() > 0) {
                return m42194xb408cb78;
            }
        }
        return null;
    }
}
