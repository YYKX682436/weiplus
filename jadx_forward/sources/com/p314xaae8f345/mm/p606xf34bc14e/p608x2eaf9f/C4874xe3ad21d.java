package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001$B\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/tencent/mm/accessibility/core/MMAccessibilityDelegateWrap;", "Landroid/view/View$AccessibilityDelegate;", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "Ljz5/f0;", "saveCache", "getCache", "Landroid/view/View;", "host", "onInitializeAccessibilityNodeInfo", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityNodeProvider;", "getAccessibilityNodeProvider", "", "action", "Landroid/os/Bundle;", "args", "", "performAccessibilityAction", "eventType", "sendAccessibilityEvent", "sendAccessibilityEventUnchecked", "onPopulateAccessibilityEvent", ya.b.f77495x8b74a326, "Landroid/view/View$AccessibilityDelegate;", "getOrigin", "()Landroid/view/View$AccessibilityDelegate;", "", "nodeCacheTime", "J", "nodeCache", "Landroid/view/accessibility/AccessibilityNodeInfo;", "<init>", "(Landroid/view/View$AccessibilityDelegate;)V", "Companion", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap */
/* loaded from: classes14.dex */
public class C4874xe3ad21d extends android.view.View.AccessibilityDelegate {

    /* renamed from: CACHE_TIME */
    public static final long f21067x2068998a = 100;
    public static final java.lang.String TAG = "MicroMsg.Acc.MMAccessibilityDelegateWrap";
    private android.view.accessibility.AccessibilityNodeInfo nodeCache;
    private long nodeCacheTime;
    private final android.view.View.AccessibilityDelegate origin;

    /* renamed from: $stable */
    public static final int f21066x3b2de05f = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public C4874xe3ad21d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: getCache */
    private final android.view.accessibility.AccessibilityNodeInfo m42479x743e55cc() {
        if (java.lang.System.currentTimeMillis() - this.nodeCacheTime >= 100 || !com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42847x58db4945()) {
            return null;
        }
        return this.nodeCache;
    }

    /* renamed from: saveCache */
    private final void m42480x9666405(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42847x58db4945()) {
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = this.nodeCache;
            if (accessibilityNodeInfo2 != null && accessibilityNodeInfo2 != null) {
                accessibilityNodeInfo2.recycle();
            }
            this.nodeCache = android.view.accessibility.AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            this.nodeCacheTime = java.lang.System.currentTimeMillis();
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View host) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null && (accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(host)) != null) {
            return accessibilityNodeProvider;
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03 c4966x1d004c03 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495;
        if (!c4966x1d004c03.m42838x9940c7bf() || !c4966x1d004c03.m42840x2061f65d()) {
            return null;
        }
        if (host.isClickable() || host.isLongClickable()) {
            return com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4879x99d8b1be.f21091x4fbc8495.m42526xc7c67791(host);
        }
        return null;
    }

    public final android.view.View.AccessibilityDelegate getOrigin() {
        return this.origin;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.onInitializeAccessibilityEvent(host, event);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.onInitializeAccessibilityEvent(host, event);
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03 c4966x1d004c03 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495;
        if (c4966x1d004c03.m42840x2061f65d() || c4966x1d004c03.m42844xf1b90650()) {
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.f21124x4fbc8495.m42573x603ac133(host, event);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View host, android.view.accessibility.AccessibilityNodeInfo info) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        try {
            if (((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42700x9c47fe47()) {
                ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42742x49fa179e();
                return;
            }
            android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(host, info);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                super.onInitializeAccessibilityNodeInfo(host, info);
            }
            android.view.accessibility.AccessibilityNodeInfo m42479x743e55cc = m42479x743e55cc();
            if (m42479x743e55cc != null) {
                com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4965xe3bab4a5.f21351x4fbc8495.m42832x2eaf75(m42479x743e55cc, info);
                return;
            }
            com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03 c4966x1d004c03 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495;
            if (c4966x1d004c03.m42840x2061f65d() || c4966x1d004c03.m42844xf1b90650()) {
                ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42745x3f4bfa7f();
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.f21124x4fbc8495.m42574x24d8446a(host, info);
                m42480x9666405(info);
            }
            android.content.Context context = host.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42326x2bcd951e(info, context);
            if (((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42703xaee2b5d4()) {
                info.getViewIdResourceName();
                java.util.Objects.toString(info.getText());
                java.util.Objects.toString(info.getContentDescription());
                android.content.Context context2 = host.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42327x2a0ac53e(info, context2);
                ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42744xd12a57c4();
                info.getViewIdResourceName();
                java.util.Objects.toString(info.getText());
                java.util.Objects.toString(info.getContentDescription());
            } else {
                info.getViewIdResourceName();
                java.util.Objects.toString(info.getText());
                java.util.Objects.toString(info.getContentDescription());
            }
            if (((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42700x9c47fe47()) {
                com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42318xb43aa09b(info);
                ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42742x49fa179e();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.onPopulateAccessibilityEvent(host, event);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.onPopulateAccessibilityEvent(host, event);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View host, int action, android.os.Bundle args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        if (!com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d() && action == 16) {
            ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42747xd49267b5();
        }
        if (((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42701x4a6402ab()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "performAccessibilityAction skip");
            ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42740x4a6402ab();
            return true;
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.f21124x4fbc8495.m42575x1c10e38f(host, action, args);
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate instanceof com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.InterfaceC4872x19968869 ? accessibilityDelegate.performAccessibilityAction(host, action, args) : super.performAccessibilityAction(host, action, args);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View host, int i17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.sendAccessibilityEvent(host, i17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.sendAccessibilityEvent(host, i17);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.sendAccessibilityEventUnchecked(host, event);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.sendAccessibilityEventUnchecked(host, event);
        }
    }

    public /* synthetic */ C4874xe3ad21d(android.view.View.AccessibilityDelegate accessibilityDelegate, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : accessibilityDelegate);
    }

    public C4874xe3ad21d(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.origin = accessibilityDelegate;
    }
}
