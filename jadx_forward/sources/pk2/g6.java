package pk2;

/* loaded from: classes3.dex */
public final class g6 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437309h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437310i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f437311j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437309h = helper.f437604J;
        this.f437310i = "assistant.more.commentmanage";
        this.f437311j = kz5.c0.k(new pk2.h5(helper, i17), new pk2.v5(helper, i17), new pk2.z4(helper, i17));
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_COMMENT_SETTING_BOOLEAN_SYNC, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowAnchorMoreCommentSettingRedDot:");
        boolean z17 = !o17;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        if (z17) {
            qk2.h.z(this, 24071, 0, null, false, 14, null);
        }
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        int i17 = abstractActivityC21394xb3d2c0cf.getResources().getDisplayMetrics().heightPixels;
        int i18 = (int) (i17 * 0.6d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(abstractActivityC21394xb3d2c0cf);
        android.view.View inflate = android.view.LayoutInflater.from(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ant, (android.view.ViewGroup) null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "showAnchorMoreCommentSettingPanel peekHeight:" + i18);
        if (o9Var.h()) {
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(i17, i17));
        } else {
            if (i18 <= 0) {
                i18 = -2;
            }
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, i18));
        }
        e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.jrn).setOnClickListener(new pk2.e6(e3Var));
        e3Var.c(true);
        e3Var.b();
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var != null && (g8Var = d9Var.f437191a) != null) {
            ((pk2.k9) g8Var).c();
        }
        for (qk2.f fVar : this.f437311j) {
            qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
            if (dVar != null) {
                qk2.d.s(dVar, e3Var, null, 2, null);
            }
        }
        e3Var.f213501r = new pk2.f6(this);
        e3Var.i();
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f437311j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437310i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "hasClickAnchorMoreCommentSettingRedDot");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_COMMENT_SETTING_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        int i17 = this.f437309h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80151x88e27e60, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437309h;
    }
}
