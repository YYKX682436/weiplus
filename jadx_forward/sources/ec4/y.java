package ec4;

/* loaded from: classes10.dex */
public final class y implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f332724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f332725e;

    public y(ec4.d0 d0Var, com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var) {
        this.f332724d = d0Var;
        this.f332725e = s4Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1");
        ec4.d0 d0Var = this.f332724d;
        ec4.d0.R6(d0Var).getViewTreeObserver().removeOnPreDrawListener(this);
        android.view.View R6 = ec4.d0.R6(d0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) d0Var.f332655e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        ec4.x xVar = new ec4.x(d0Var);
        this.f332725e.c(R6, (android.view.View) mo141623x754a37bb, xVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1");
        return true;
    }
}
