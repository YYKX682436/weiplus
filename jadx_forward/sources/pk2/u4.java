package pk2;

/* loaded from: classes3.dex */
public final class u4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437815h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437816i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f437817j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437815h = helper.f437649w;
        this.f437816i = n() ? "anchorlive.more.anchorwish" : "startlive.more.anchorwish";
        this.f437817j = true;
        if (zl2.r4.f555483a.r()) {
            qk2.h.z(this, n() ? 24035 : 24002, 0, "live_more_anchor_wish", false, 2, null);
        }
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        if (ll2.e.f400666a.h(this.f437816i)) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "hasShowAnchorWishRedDot");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_WISH_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        boolean n17 = n();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        if (n17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.F1, null, null, null, null, null, false, 126, null);
            if (((mm2.c1) o9Var.c(mm2.c1.class)).m7() || ((mm2.c1) o9Var.c(mm2.c1.class)).Z5) {
                ((mm2.f7) o9Var.c(mm2.f7.class)).f410593h.mo7808x76db6cb1(new mm2.a7(true, qs5.s.f447998e));
            } else {
                db5.t7.h(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dk8));
            }
            pk2.f8.a(pk2.f8.f437280a, 3, 2, null, 4, null);
        } else {
            zl2.r4 r4Var2 = zl2.r4.f555483a;
            gk2.e eVar = o9Var.f437607b;
            if (r4Var2.U1(eVar) || ((mm2.c1) o9Var.c(mm2.c1.class)).Z5) {
                ((mm2.f7) eVar.a(mm2.f7.class)).f410593h.mo7808x76db6cb1(new mm2.a7(true, qs5.s.f447998e));
            } else {
                db5.t7.h(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dk8));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 2);
            jSONObject.put("type", 2);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (D()) {
            df2.dd ddVar = df2.od.f312485w;
            pk2.o9 o9Var2 = this.f445960a;
            gk2.e eVar2 = o9Var2.f437607b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar2, 2, 7, odVar != null ? odVar.f312491r : null, 38);
        }
    }

    public final boolean D() {
        df2.od odVar = (df2.od) this.f445960a.e(df2.od.class);
        return odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_LIVE_WISH_LIST);
    }

    public final boolean E(pk2.o9 o9Var) {
        ya2.b2 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        r45.jx0 jx0Var = ((mm2.c1) o9Var.f437607b.a(mm2.c1.class)).f410328e2;
        boolean m75933x41a8a7f2 = jx0Var != null ? jx0Var.m75933x41a8a7f2(0) : true;
        zl2.r4 r4Var = zl2.r4.f555483a;
        pk2.j9 j9Var = o9Var.f437617g;
        boolean z17 = pm0.v.z((int) ((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.f69326x798040b1), 16384);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "isWishEnable isBlueAccount " + m75933x41a8a7f2 + " isWishFlagEnable: " + z17);
        return z17 && m75933x41a8a7f2;
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437817j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437816i;
    }

    @Override // qk2.f
    public boolean o() {
        boolean n17 = n();
        pk2.o9 o9Var = this.f445960a;
        if (!n17 || !((mm2.c1) o9Var.c(mm2.c1.class)).f410369l3) {
            if (n() || !E(o9Var)) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
            if (r5Var != null ? r5Var.b7(9) : false) {
                return false;
            }
        }
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        boolean n17 = n();
        int i17 = this.f437815h;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        if (n17) {
            if (((mm2.c1) o9Var.c(mm2.c1.class)).f410369l3) {
                if (D()) {
                    int i18 = this.f437815h;
                    java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekt);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    java.lang.String string2 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpo);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    u(menu, i18, string, com.p314xaae8f345.mm.R.raw.f80364xebdc05ff, string2, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
                } else {
                    r(menu, i17, com.p314xaae8f345.mm.R.C30867xcad56011.ekt, com.p314xaae8f345.mm.R.raw.f80364xebdc05ff);
                }
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.B1, null, null, null, null, null, false, 126, null);
                pk2.f8.a(pk2.f8.f437280a, 3, 1, null, 4, null);
            }
        } else if (E(o9Var) && !zl2.r4.f555483a.X1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) o9Var.c(mm2.g1.class)).f410601f).mo144003x754a37bb())) {
            if (D()) {
                int i19 = this.f437815h;
                java.lang.String string3 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekt);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                java.lang.String string4 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpo);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                u(menu, i19, string3, com.p314xaae8f345.mm.R.raw.f80364xebdc05ff, string4, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
            } else {
                r(menu, i17, com.p314xaae8f345.mm.R.C30867xcad56011.ekt, com.p314xaae8f345.mm.R.raw.f80364xebdc05ff);
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 2);
            jSONObject.put("type", 1);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (D()) {
            df2.dd ddVar = df2.od.f312485w;
            pk2.o9 o9Var2 = this.f445960a;
            gk2.e eVar = o9Var2.f437607b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 1, 7, odVar != null ? odVar.f312491r : null, 38);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437815h;
    }
}
