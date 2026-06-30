package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/DisableChildModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "root", "Lkotlin/Function1;", "Ljz5/f0;", "visitor", "visitChild", "view", "callback", "needDisFocusChild", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "dealNodeInfo", "dealOnViewInflateAsync", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier */
/* loaded from: classes14.dex */
public final class C4909x95d1ba2b extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: $stable */
    public static final int f21177x3b2de05f = 0;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b f21178x4fbc8495;
    public static final java.lang.String TAG = "MicroMsg.Acc.DisableChildModifier";

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

        /* renamed from: INSTANCE */
        public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b.AnonymousClass1 f21179x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final java.util.List<java.lang.Integer> mo149xb9724478(android.view.View view, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf config) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            return config.m42262x71ee3074().get(java.lang.Integer.valueOf(view.getId()));
        }
    }

    static {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b c4909x95d1ba2b = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b();
        f21178x4fbc8495 = c4909x95d1ba2b;
        c4909x95d1ba2b.m42650x1eec7440(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4909x95d1ba2b.AnonymousClass1.f21179x4fbc8495);
    }

    private C4909x95d1ba2b() {
    }

    /* renamed from: needDisFocusChild */
    private final void m42625xf251495c(android.view.View view, yz5.l lVar) {
        m42652x1456a638(view, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4911xf94882f0(view, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: visitChild */
    public final void m42626x90544e91(android.view.View view, yz5.l lVar) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                lVar.mo146xb9724478(childAt);
                m42626x90544e91(childAt, lVar);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealNodeInfo */
    public void mo42598x2317ea5c(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodeInfo, "nodeInfo");
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(view);
        if (m42517xe172022e != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m42517xe172022e.getDisableFocusFlag(), java.lang.Boolean.TRUE) : false) {
            nodeInfo.setVisibleToUser(false);
            view.setImportantForAccessibility(4);
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealOnViewInflateAsync */
    public void mo42527xf0a5585(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        m42625xf251495c(view, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4910x29ca5d2b(view));
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d() ? 1 : 0) | 2;
    }
}
