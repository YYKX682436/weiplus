package ec4;

/* loaded from: classes10.dex */
public final class x implements com.p314xaae8f345.mm.ui.p2740x696c9db.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f332723a;

    public x(ec4.d0 d0Var) {
        this.f332723a = d0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        jz5.k kVar = new jz5.k("An operation is not implemented: Not yet implemented");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        throw kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationEnd */
    public void mo54453xbb3aa236() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoAniUIC", "ani end");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setEnterAniEnd$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        ec4.d0 d0Var = this.f332723a;
        d0Var.f332666s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setEnterAniEnd$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = d0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed c18192x8040c0ed = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed.class);
        c18192x8040c0ed.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFirstFrameFinish", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        boolean z17 = c18192x8040c0ed.f249865o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFirstFrameFinish", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoAniUIC", "ani end but video is finish first frame");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = d0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed c18192x8040c0ed2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed.class);
            c18192x8040c0ed2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePlay", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "resume play");
            c18192x8040c0ed2.P6().setAlpha(1.0f);
            c18192x8040c0ed2.P6().h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlay", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            android.widget.ImageView T6 = d0Var.T6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            T6.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationStart */
    public void mo54454xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoAniUIC", "ani start");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f332723a.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed c18192x8040c0ed = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2183x2fd755.C18192x8040c0ed.class);
        c18192x8040c0ed.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playVideo", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        c18192x8040c0ed.P6().m82516xd24ee348(c18192x8040c0ed.f249868r);
        c18192x8040c0ed.f249859f = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ec4.f0(c18192x8040c0ed, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playVideo", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
    }
}
