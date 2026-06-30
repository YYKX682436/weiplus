package s74;

/* loaded from: classes4.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.l f485787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s74.o2 o2Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, w64.l lVar) {
        super(1);
        this.f485785d = o2Var;
        this.f485786e = c17933xe8d1b226;
        this.f485787f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        android.view.View v17 = (android.view.View) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        int i17 = w64.x.f524871a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        java.lang.Object tag = v17.getTag(com.p314xaae8f345.mm.R.id.ptl);
        w64.x xVar = tag instanceof w64.x ? (w64.x) tag : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        s74.o2 o2Var = this.f485785d;
        android.content.Context E = o2Var.E();
        int H = o2Var.H();
        i64.b1 G = o2Var.G();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMClickStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        w64.k kVar = o2Var.f485998J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMClickStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f485786e;
        w64.n nVar = new w64.n(E, H, G, kVar, new s74.d1(xVar, o2Var, c17933xe8d1b226, this.f485787f));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo U = o2Var.U();
        if (U != null && (c17702x544f64e9 = U.f38287xf7a0a3ac) != null) {
            nVar.n(c17702x544f64e9, c17933xe8d1b226);
        }
        nVar.x(xVar);
        nVar.k(v17);
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
            if ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(c17933xe8d1b226) && m70371x485d7.f39014x86965dde.f451370e == 15) || m70371x485d7.f39014x86965dde.f451370e == 5) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6038x5a6f40a8 c6038x5a6f40a8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6038x5a6f40a8();
                c6038x5a6f40a8.f136327g.f87938a = ca4.z0.T(c17933xe8d1b226);
                c6038x5a6f40a8.e();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$createActionButtonClick$clickAction$1");
        return f0Var;
    }
}
