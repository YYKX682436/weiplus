package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiMineListFragment;", "Lcom/tencent/mm/ui/MMFragment;", "Ll75/q0;", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment */
/* loaded from: classes12.dex */
public final class C13306x6efad547 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 f179321d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f179322e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f179323f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f179324g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 f179325h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13306x6efad547(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 dataSource, java.lang.String str) {
        super(true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        this.f179321d = dataSource;
        this.f179322e = str;
        this.f179323f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o2(this));
        this.f179324g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.l2(this));
        this.f179325h = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().f276712q.y0(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a6t;
    }

    public final m22.f l0() {
        return (m22.f) ((jz5.n) this.f179324g).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().add(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "event_update_group")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 e0Var = this.f179321d;
            e0Var.mo54784x6761d4f();
            l0().f404578e.clear();
            l0().f404578e.addAll(e0Var.c());
            l0().m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        l0().f404578e.addAll(this.f179321d.c());
        jz5.g gVar = this.f179323f;
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) gVar).mo141623x754a37bb()).mo7960x6cab2c8d(l0());
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) gVar).mo141623x754a37bb()).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m7550xf0c4608a()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) gVar).mo141623x754a37bb();
        android.content.Context m7550xf0c4608a = m7550xf0c4608a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7550xf0c4608a, "requireContext(...)");
        c1163xf1deaba4.N(new m22.h(m7550xf0c4608a, 0));
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 c21052x34cf13a3 = this.f179325h;
        mo78695xbf7c1df6(c21052x34cf13a3 != null ? c21052x34cf13a3.f68545x29dd02d3 : null);
        mo78682x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.m2(this));
        m78633xd9193382(0, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572639by1), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n2(this));
    }
}
