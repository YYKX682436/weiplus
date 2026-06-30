package pk2;

/* loaded from: classes3.dex */
public final class z0 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f437940h;

    /* renamed from: i, reason: collision with root package name */
    public final int f437941i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f437942j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437940h = n() ? "anchorlive.more.fansgroup" : "startlive.more.fansgroup";
        this.f437941i = helper.f437647v;
        this.f437942j = true;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        boolean z17 = false;
        if (n()) {
            qo0.b bVar = qo0.b.O4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY", true);
            o9Var.j(bVar, bundle);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.M, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 1);
            jSONObject.put("type", 2);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            zy2.zb.T8((zy2.zb) c19, ml2.t1.M, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
            pk2.j9 j9Var = o9Var.f437617g;
            if (j9Var != null) {
                if (j9Var.f437419b == null) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
                    android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(android.R.id.content);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5(abstractActivityC21394xb3d2c0cf, (android.view.ViewGroup) findViewById, null);
                    j9Var.f437419b = e5Var;
                    p3325xe03a0797.p3326xc267989b.y0 scope = j9Var.f437418a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
                    e5Var.f199759a.m58109x53aeff12(scope);
                }
                r45.eq1 eq1Var = ((mm2.n2) o9Var.f437607b.a(mm2.n2.class)).f410812g;
                if (eq1Var != null && eq1Var.m75933x41a8a7f2(1)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var2 = j9Var.f437419b;
                    if (e5Var2 != null) {
                        e5Var2.f199759a.h(null, true);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e5 e5Var3 = j9Var.f437419b;
                    if (e5Var3 != null && (cfVar = e5Var3.f199760b) != null) {
                        cfVar.f0();
                    }
                }
            }
        }
        pk2.o9 o9Var2 = this.f445960a;
        df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_OPEN_FANS_CLUB)) {
            z17 = true;
        }
        if (z17) {
            df2.dd ddVar = df2.od.f312485w;
            gk2.e eVar = o9Var2.f437607b;
            df2.od odVar2 = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 2, 7, odVar2 != null ? odVar2.f312491r : null, 40);
        }
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437942j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437940h;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        r45.eq1 eq1Var = ((mm2.n2) o9Var.c(mm2.n2.class)).f410812g;
        boolean z17 = eq1Var != null && eq1Var.m75933x41a8a7f2(4);
        if (this.f445961b != 1) {
            return z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        return ((r5Var != null ? r5Var.b7(8) : false) ^ true) && z17;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        pk2.o9 o9Var2 = this.f445960a;
        df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_OPEN_FANS_CLUB)) {
            df2.dd ddVar = df2.od.f312485w;
            gk2.e eVar = o9Var2.f437607b;
            df2.od odVar2 = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 1, 7, odVar2 != null ? odVar2.f312491r : null, 40);
            int i17 = this.f437941i;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
            java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxb);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            u(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80108xebd42d18, string2, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
        } else {
            r(menu, this.f437941i, com.p314xaae8f345.mm.R.C30867xcad56011.dxb, com.p314xaae8f345.mm.R.raw.f80108xebd42d18);
        }
        if (n()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.Q, "1", null, 4, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.N, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            return;
        }
        i95.m c19 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c19;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 27L, "1", null, 4, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 1);
        i95.m c27 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        zy2.zb.j5((zy2.zb) c27, 37L, jSONObject.toString(), null, 4, null);
        i95.m c28 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
        zy2.zb.I8((zy2.zb) c28, ml2.u1.N, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437941i;
    }
}
