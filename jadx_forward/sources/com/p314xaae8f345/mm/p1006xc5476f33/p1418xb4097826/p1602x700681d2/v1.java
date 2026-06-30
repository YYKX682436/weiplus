package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 f204012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var) {
        super(0);
        this.f204012d = w1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var = this.f204012d;
        w1Var.f204015d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69.G;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = w1Var.m158354x19263085();
        android.view.View decorView = w1Var.m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListDrawer", "createDrawerToAttachWindow");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b69 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69(context);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y9).mo141623x754a37bb()).r()).intValue() == 1) {
            c14604x9e435b69.m82804xbcf4cbbe(false);
            c14604x9e435b69.m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        float a17 = 1 - kx2.a.f394811a.a(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        c14604x9e435b69.m82810x46bc3006((int) (i18 * a17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1(context));
        android.content.Context context2 = c14604x9e435b69.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        l0Var.D = context2;
        c14604x9e435b69.setId(com.p314xaae8f345.mm.R.id.f566036eg0);
        l0Var.f203872e = c14604x9e435b69;
        c14604x9e435b69.m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563132xo);
        c14604x9e435b69.m82805x59f38d7d(true);
        c14604x9e435b69.h(l0Var);
        c14604x9e435b69.m58552x602892bd(l0Var.f203871d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = c14604x9e435b69.m82792x510df255().m82555x4905e9fa();
        m82555x4905e9fa.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.f(c14604x9e435b69));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.mo8163xed962dec(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.g(c14604x9e435b69));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 mPresenter = c14604x9e435b69.getMPresenter();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.o0(context, mPresenter != null && mPresenter.f203976w, null, 0, 12, null);
        o0Var.m58571xa2b9091a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.i(c14604x9e435b69));
        c14604x9e435b69.C = o0Var;
        android.view.View m58570xa2e4c0db = o0Var.m58570xa2e4c0db();
        if (m58570xa2e4c0db != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = es.h.a(context, 66);
            ((com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583) c14604x9e435b69.m82799xc8ac06c0().findViewById(com.p314xaae8f345.mm.R.id.vgo)).addView(m58570xa2e4c0db, layoutParams);
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.h(context, new android.widget.FrameLayout.LayoutParams(-1, -1), decorView, c14604x9e435b69, l0Var).mo152xb9724478();
        return c14604x9e435b69;
    }
}
