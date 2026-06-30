package com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/AccNodeUtil;", "", "Landroid/view/accessibility/AccessibilityNodeInfo;", "originNode", "target", "Ljz5/f0;", "copy", "Landroid/view/View;", "view", "checkDelegate", "doDelegateTouch", "Landroid/view/View$AccessibilityDelegate;", "getOriginDelegate", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.uitl.AccNodeUtil */
/* loaded from: classes14.dex */
public final class C4965xe3bab4a5 {

    /* renamed from: $stable */
    public static final int f21350x3b2de05f = 0;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4965xe3bab4a5 f21351x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4965xe3bab4a5();
    private static final java.lang.String TAG = "MicroMsg.Acc.AccNodeUtil";

    private C4965xe3bab4a5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: checkDelegate */
    public final void m42831xc0c29ead(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42316xe5cf175(view)) {
            int i17 = 1;
            android.view.View.AccessibilityDelegate accessibilityDelegate = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            try {
                try {
                    if (view.getAccessibilityDelegate() == null) {
                        view.setAccessibilityDelegate(new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4874xe3ad21d(accessibilityDelegate, i17, objArr3 == true ? 1 : 0));
                    } else {
                        android.view.View.AccessibilityDelegate m42834x403337c1 = m42834x403337c1(view);
                        if (m42834x403337c1 != null && !(m42834x403337c1 instanceof com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4874xe3ad21d)) {
                            view.setAccessibilityDelegate(new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4874xe3ad21d(m42834x403337c1));
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
            } catch (java.lang.Throwable unused2) {
                java.lang.Object obj = android.view.View.class.getDeclaredField("mAccessibilityDelegate").get(view);
                if ((obj instanceof android.view.View.AccessibilityDelegate ? (android.view.View.AccessibilityDelegate) obj : null) == null) {
                    view.setAccessibilityDelegate(new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4874xe3ad21d(objArr2 == true ? 1 : 0, i17, objArr == true ? 1 : 0));
                    return;
                }
                android.view.View.AccessibilityDelegate m42834x403337c12 = m42834x403337c1(view);
                if (m42834x403337c12 == null || (m42834x403337c12 instanceof com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4874xe3ad21d)) {
                    return;
                }
                view.setAccessibilityDelegate(new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4874xe3ad21d(m42834x403337c12));
            }
        }
    }

    /* renamed from: copy */
    public final void m42832x2eaf75(android.view.accessibility.AccessibilityNodeInfo originNode, android.view.accessibility.AccessibilityNodeInfo target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originNode, "originNode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        target.setContentDescription(originNode.getContentDescription());
        target.setClassName(originNode.getClassName());
        target.setCheckable(originNode.isCheckable());
        target.setChecked(originNode.isChecked());
        target.setClickable(originNode.isClickable());
        target.setLongClickable(originNode.isLongClickable());
        target.setFocusable(originNode.isFocusable());
        java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> actionList = originNode.getActionList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(actionList, "getActionList(...)");
        java.util.Iterator<T> it = actionList.iterator();
        while (it.hasNext()) {
            target.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: doDelegateTouch */
    public final void m42833x4b93d9ef(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getListenerInfo", new java.lang.Class[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethod, "getDeclaredMethod(...)");
            int i17 = 1;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(declaredMethod.invoke(view, new java.lang.Object[0]));
            android.view.View.OnTouchListener onTouchListener = null;
            java.lang.Object[] objArr = 0;
            android.view.View.OnTouchListener onTouchListener2 = obj instanceof android.view.View.OnTouchListener ? (android.view.View.OnTouchListener) obj : null;
            if (onTouchListener2 == null) {
                view.setOnTouchListener(new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.ViewOnTouchListenerC4873xe2fbc33c(onTouchListener, i17, objArr == true ? 1 : 0));
            } else {
                if (onTouchListener2 instanceof com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.ViewOnTouchListenerC4873xe2fbc33c) {
                    return;
                }
                view.setOnTouchListener(new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.ViewOnTouchListenerC4873xe2fbc33c(onTouchListener2));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "throw in view(%s)", com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495.m42859xfb82e301(view.getId()));
        }
    }

    /* renamed from: getOriginDelegate */
    public final android.view.View.AccessibilityDelegate m42834x403337c1(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        n3.c e17 = n3.l1.e(view);
        if (e17 == null) {
            return null;
        }
        if (e17 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.l3) {
            java.lang.reflect.Field declaredField = p012xc85e97e9.p103xe821e364.p104xd1075a44.l3.class.getDeclaredField("mOriginalItemDelegates");
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
