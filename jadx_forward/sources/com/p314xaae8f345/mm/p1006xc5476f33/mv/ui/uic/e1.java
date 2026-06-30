package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class e1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 f232639d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c2 f232640e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h2 f232641f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e4 f232642g;

    /* renamed from: h, reason: collision with root package name */
    public final pk4.u f232643h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f232644i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232641f = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h2(m80379x76847179());
        this.f232642g = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e4(activity, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d1(activity));
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z0.f233093d);
        this.f232643h = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c1(this, activity);
        this.f232644i = new java.util.HashMap();
    }

    public final void O6(java.lang.String username, boolean z17) {
        java.lang.Integer valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (z17) {
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(m80379x76847179(), 7, r45.bt4.class);
            valueOf = bt4Var != null ? java.lang.Integer.valueOf(bt4Var.f452585w + 1) : null;
            r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(m80379x76847179(), 7, r45.bt4.class);
            if (bt4Var2 != null) {
                bt4Var2.f452585w = valueOf.intValue();
            }
        } else {
            r45.bt4 bt4Var3 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(m80379x76847179(), 7, r45.bt4.class);
            valueOf = bt4Var3 != null ? java.lang.Integer.valueOf(bt4Var3.f452586x + 1) : null;
            r45.bt4 bt4Var4 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(m80379x76847179(), 7, r45.bt4.class);
            if (bt4Var4 != null) {
                bt4Var4.f452586x = valueOf.intValue();
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("report_scene", 19);
        intent.putExtra("key_enter_profile_type", 1);
        intent.putExtra("key_not_request_focus", true);
        intent.putExtra("key_hide_float_ball", true);
        intent.putExtra("key_from_comment_scene", 91);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(7, 2, 32, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(m158354x19263085(), intent);
    }

    public final void P6() {
        if (this.f232639d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.f213597i;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            android.view.View decorView = m158354x19263085().getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            this.f232639d = d5Var.b((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, decorView, 2, false, 70);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(fm3.u r24, long r25, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback r27) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.Q6(fm3.u, long, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 f5Var = this.f232639d;
        if (!(f5Var != null && f5Var.b())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 f5Var2 = this.f232639d;
        if (f5Var2 != null) {
            f5Var2.a();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        P6();
        if (this.f232640e == null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c2.f211746a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
            android.view.View decorView = m158354x19263085().getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            abstractActivityC21394xb3d2c0cf.getWindow().setSoftInputMode(50);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c2(2, false, null, 4, null);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540.R;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3(abstractActivityC21394xb3d2c0cf));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 c15148xe5368540 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540(abstractActivityC21394xb3d2c0cf);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i19 = b17.x;
            int i27 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z17) {
                if (i27 >= i19) {
                    i19 = i27;
                }
                i27 = i19;
            }
            c15148xe5368540.m82810x46bc3006((int) (i27 * 0.25d));
            android.content.Context context = c15148xe5368540.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            a5Var.f211731q = context;
            c15148xe5368540.setId(com.p314xaae8f345.mm.R.id.ean);
            a5Var.f211725h = c15148xe5368540;
            c15148xe5368540.m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563074w3);
            c15148xe5368540.m82805x59f38d7d(true);
            c15148xe5368540.h(a5Var);
            a5Var.h().m61103x53aed94a(2);
            a5Var.h().m61105xf54f7efb(a5Var.h().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2 g2Var = a5Var.f211721d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = g2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) g2Var : null;
            if (q3Var != null) {
                q3Var.f211901e = 70;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) g2Var).f211915v = false;
            decorView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.e2(abstractActivityC21394xb3d2c0cf, decorView, c15148xe5368540, new android.widget.FrameLayout.LayoutParams(-1, -1), a5Var, false));
            this.f232640e = c2Var;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 f5Var = this.f232639d;
        if (f5Var != null) {
            f5Var.a();
        }
    }
}
