package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/DisableFocusModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "", "needDisFocus", "needDisFocusByCondition", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableFocusModifier */
/* loaded from: classes14.dex */
public final class C4912x60719de7 extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: $stable */
    public static final int f21184x3b2de05f = 0;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4912x60719de7 f21185x4fbc8495;
    public static final java.lang.String TAG = "MicroMsg.Acc.DisableFocusModifier";

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.DisableFocusModifier$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

        /* renamed from: INSTANCE */
        public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4912x60719de7.AnonymousClass1 f21186x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4912x60719de7.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final java.util.List<java.lang.Integer> mo149xb9724478(android.view.View view, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf config) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            return config.m42261xf51b884a().get(java.lang.Integer.valueOf(view.getId()));
        }
    }

    static {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4912x60719de7 c4912x60719de7 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4912x60719de7();
        f21185x4fbc8495 = c4912x60719de7;
        c4912x60719de7.m42650x1eec7440(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4912x60719de7.AnonymousClass1.f21186x4fbc8495);
    }

    private C4912x60719de7() {
    }

    /* renamed from: needDisFocus */
    private final boolean m42633x6ace7fa0(android.view.View view) {
        return m42652x1456a638(view, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4913x2c46b074(view));
    }

    /* renamed from: needDisFocusByCondition */
    private final boolean m42634x764b96c4(android.view.View view) {
        return m42652x1456a638(view, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4914xb95a776a(view));
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealNodeInfo */
    public void mo42598x2317ea5c(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodeInfo, "nodeInfo");
        if (m42633x6ace7fa0(view)) {
            m42654xbe97959d(TAG, view, "default disable success");
            view.setImportantForAccessibility(2);
        } else if (m42634x764b96c4(view)) {
            m42654xbe97959d(TAG, view, "disable by condition success ");
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42319x639e22e8(nodeInfo);
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d() ? 1 : 0;
    }
}
