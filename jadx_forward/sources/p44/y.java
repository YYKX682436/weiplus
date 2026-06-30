package p44;

/* loaded from: classes4.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p44.z f433393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758 f433394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p44.z zVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758 c6032xa3513758) {
        super(0);
        this.f433393d = zVar;
        this.f433394e = c6032xa3513758;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        p44.z zVar = this.f433393d;
        zVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758 c6032xa3513758 = this.f433394e;
        int i17 = c6032xa3513758.f136322g.f89934a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = zVar.f433399e;
        java.lang.String str = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38237xb58e0027;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEvent, eventType=");
        sb6.append(i17);
        sb6.append(", event.pageId=");
        am.xu xuVar = c6032xa3513758.f136322g;
        sb6.append(xuVar.f89935b);
        sb6.append(", adPageId=");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineRandomPickLayoutCtrl", sb6.toString());
        if (zVar.f433401g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimelineRandomPickLayoutCtrl", "onEvent RandomPickCardAdInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, xuVar.f89935b)) {
                p44.o0 o0Var = zVar.f433406l;
                if (i17 == 1) {
                    o0Var.l();
                    o0Var.m();
                    zVar.f433402h = true;
                } else if (i17 == 2) {
                    o0Var.i();
                    o0Var.d();
                    o0Var.l();
                    zVar.f433402h = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$handleEvent", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$startListenEggCanvasEvent$1$1$callback$1");
        return f0Var;
    }
}
