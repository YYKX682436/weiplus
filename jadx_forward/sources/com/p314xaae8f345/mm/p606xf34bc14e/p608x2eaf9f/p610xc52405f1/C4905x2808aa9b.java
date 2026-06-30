package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/accessibility/core/provider/ContentDescProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Ljz5/f0;", "dealNodeInfo", "", "getContentDesc", "", "outRootView", "", "findDescList", "(Landroid/view/View;[Landroid/view/View;)Ljava/lang/Object;", "", "getAuthority", "TAG", "Ljava/lang/String;", "curConfigName", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider */
/* loaded from: classes14.dex */
public final class C4905x2808aa9b extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: $stable */
    public static final int f21165x3b2de05f;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b f21166x4fbc8495;
    public static final java.lang.String TAG = "MicroMsg.Acc.ContentDescProvider";
    private static java.lang.String curConfigName;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "view", "Landroid/view/View;", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

        /* renamed from: INSTANCE */
        public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b.AnonymousClass1 f21168x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b.AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // yz5.p
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final java.util.List<java.lang.Integer> mo149xb9724478(android.view.View view, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf config) {
            java.util.Set<java.lang.Integer> keySet;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            java.util.Map<java.lang.Integer, java.lang.Object> map = config.m42280x880f8ff1().get(java.lang.Integer.valueOf(view.getId()));
            if (map == null || (keySet = map.keySet()) == null) {
                return null;
            }
            return kz5.n0.S0(keySet);
        }
    }

    static {
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b c4905x2808aa9b = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b();
        f21166x4fbc8495 = c4905x2808aa9b;
        curConfigName = "";
        c4905x2808aa9b.m42650x1eec7440(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b.AnonymousClass1.f21168x4fbc8495);
        f21165x3b2de05f = 8;
    }

    private C4905x2808aa9b() {
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealNodeInfo */
    public void mo42598x2317ea5c(android.view.View view, android.view.accessibility.AccessibilityNodeInfo nodeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodeInfo, "nodeInfo");
        java.lang.String m42617xc29d0974 = m42617xc29d0974(view);
        if (m42617xc29d0974 != null) {
            nodeInfo.setContentDescription(m42617xc29d0974);
        }
    }

    /* renamed from: findDescList */
    public final java.lang.Object m42616x455903a8(android.view.View view, android.view.View[] outRootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRootView, "outRootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        m42652x1456a638(view, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4906x2da11b5e(view, outRootView, h0Var));
        return h0Var.f391656d;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x024b, code lost:
    
        if (r0 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        if (r3 != null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getContentDesc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m42617xc29d0974(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4905x2808aa9b.m42617xc29d0974(android.view.View):java.lang.String");
    }
}
