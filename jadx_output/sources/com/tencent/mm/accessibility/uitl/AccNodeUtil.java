package com.tencent.mm.accessibility.uitl;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/AccNodeUtil;", "", "Landroid/view/accessibility/AccessibilityNodeInfo;", "originNode", "target", "Ljz5/f0;", "copy", "Landroid/view/View;", "view", "checkDelegate", "doDelegateTouch", "Landroid/view/View$AccessibilityDelegate;", "getOriginDelegate", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AccNodeUtil {
    public static final int $stable = 0;
    public static final com.tencent.mm.accessibility.uitl.AccNodeUtil INSTANCE = new com.tencent.mm.accessibility.uitl.AccNodeUtil();
    private static final java.lang.String TAG = "MicroMsg.Acc.AccNodeUtil";

    private AccNodeUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkDelegate(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (com.tencent.mm.accessibility.base.MapExpandKt.canDelegate(view)) {
            int i17 = 1;
            android.view.View.AccessibilityDelegate accessibilityDelegate = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            try {
                try {
                    if (view.getAccessibilityDelegate() == null) {
                        view.setAccessibilityDelegate(new com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap(accessibilityDelegate, i17, objArr3 == true ? 1 : 0));
                    } else {
                        android.view.View.AccessibilityDelegate originDelegate = getOriginDelegate(view);
                        if (originDelegate != null && !(originDelegate instanceof com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap)) {
                            view.setAccessibilityDelegate(new com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap(originDelegate));
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
            } catch (java.lang.Throwable unused2) {
                java.lang.Object obj = android.view.View.class.getDeclaredField("mAccessibilityDelegate").get(view);
                if ((obj instanceof android.view.View.AccessibilityDelegate ? (android.view.View.AccessibilityDelegate) obj : null) == null) {
                    view.setAccessibilityDelegate(new com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap(objArr2 == true ? 1 : 0, i17, objArr == true ? 1 : 0));
                    return;
                }
                android.view.View.AccessibilityDelegate originDelegate2 = getOriginDelegate(view);
                if (originDelegate2 == null || (originDelegate2 instanceof com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap)) {
                    return;
                }
                view.setAccessibilityDelegate(new com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap(originDelegate2));
            }
        }
    }

    public final void copy(android.view.accessibility.AccessibilityNodeInfo originNode, android.view.accessibility.AccessibilityNodeInfo target) {
        kotlin.jvm.internal.o.g(originNode, "originNode");
        kotlin.jvm.internal.o.g(target, "target");
        target.setContentDescription(originNode.getContentDescription());
        target.setClassName(originNode.getClassName());
        target.setCheckable(originNode.isCheckable());
        target.setChecked(originNode.isChecked());
        target.setClickable(originNode.isClickable());
        target.setLongClickable(originNode.isLongClickable());
        target.setFocusable(originNode.isFocusable());
        java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> actionList = originNode.getActionList();
        kotlin.jvm.internal.o.f(actionList, "getActionList(...)");
        java.util.Iterator<T> it = actionList.iterator();
        while (it.hasNext()) {
            target.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void doDelegateTouch(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getListenerInfo", new java.lang.Class[0]);
            kotlin.jvm.internal.o.f(declaredMethod, "getDeclaredMethod(...)");
            int i17 = 1;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            kotlin.jvm.internal.o.f(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(declaredMethod.invoke(view, new java.lang.Object[0]));
            android.view.View.OnTouchListener onTouchListener = null;
            java.lang.Object[] objArr = 0;
            android.view.View.OnTouchListener onTouchListener2 = obj instanceof android.view.View.OnTouchListener ? (android.view.View.OnTouchListener) obj : null;
            if (onTouchListener2 == null) {
                view.setOnTouchListener(new com.tencent.mm.accessibility.core.MMAccTouchListenerWrap(onTouchListener, i17, objArr == true ? 1 : 0));
            } else {
                if (onTouchListener2 instanceof com.tencent.mm.accessibility.core.MMAccTouchListenerWrap) {
                    return;
                }
                view.setOnTouchListener(new com.tencent.mm.accessibility.core.MMAccTouchListenerWrap(onTouchListener2));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "throw in view(%s)", com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId()));
        }
    }

    public final android.view.View.AccessibilityDelegate getOriginDelegate(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        n3.c e17 = n3.l1.e(view);
        if (e17 == null) {
            return null;
        }
        if (e17 instanceof androidx.recyclerview.widget.l3) {
            java.lang.reflect.Field declaredField = androidx.recyclerview.widget.l3.class.getDeclaredField("mOriginalItemDelegates");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(e17);
            java.util.WeakHashMap weakHashMap = obj instanceof java.util.WeakHashMap ? (java.util.WeakHashMap) obj : null;
            java.lang.Object obj2 = weakHashMap != null ? weakHashMap.get(view) : null;
            n3.c cVar = obj2 instanceof n3.c ? (n3.c) obj2 : null;
            if (cVar != null) {
                e17 = cVar;
            }
        }
        java.lang.reflect.Field declaredField2 = n3.c.class.getDeclaredField("mOriginalDelegate");
        declaredField2.setAccessible(true);
        java.lang.Object obj3 = declaredField2.get(e17);
        if (obj3 instanceof android.view.View.AccessibilityDelegate) {
            return (android.view.View.AccessibilityDelegate) obj3;
        }
        return null;
    }
}
