package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class l1 implements i35.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f292073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qk.o f292074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f292075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f292076g;

    public l1(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, qk.o oVar, java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f292073d = z3Var;
        this.f292074e = oVar;
        this.f292075f = weakReference;
        this.f292076g = z17;
    }

    @Override // i35.e
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c17;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f292073d;
        if (!str.equals(z3Var.d1())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizContactDeleteUtil", "not current contact %s,%s", z3Var.d1(), str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactDeleteUtil", "dealDelContactEvent callBack %s, ret=%d", str, java.lang.Integer.valueOf(i17));
        ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(this);
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.ui.p2740x696c9db.n1.f292123b;
        if (weakReference != null && weakReference.get() != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) com.p314xaae8f345.mm.ui.p2740x696c9db.n1.f292123b.get()).dismiss();
        }
        java.lang.ref.WeakReference weakReference2 = this.f292075f;
        if (i17 != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g25Var.f456374d)) {
                db5.e1.s((android.content.Context) weakReference2.get(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571901t1), "");
                return;
            } else {
                db5.e1.s((android.content.Context) weakReference2.get(), g25Var.f456374d, g25Var.f456375e);
                return;
            }
        }
        android.app.Activity activity = (android.app.Activity) weakReference2.get();
        qk.o oVar = this.f292074e;
        if (oVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(oVar == null);
            objArr[1] = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b", objArr);
            return;
        }
        java.lang.String d17 = z3Var.d1();
        if (c01.e2.M(d17)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k(d17);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).y0(d17);
        } else {
            com.p314xaae8f345.mm.ui.p2740x696c9db.m1 m1Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.m1(oVar, d17);
            r01.q3.Ai().getClass();
            r01.d.f449574a = d17;
            r01.d.f449575b = java.lang.System.currentTimeMillis();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(d17, z3Var);
            if (oVar.I0()) {
                r01.z.a(oVar.f66748xdec927b);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k(d17);
            } else {
                c01.w9.h(d17, m1Var);
                ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                com.p314xaae8f345.mm.p957x53236a1b.g1.I(d17, 15);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(d17);
            }
            if (activity != null && this.f292076g) {
                activity.setResult(-1, activity.getIntent().putExtra("_delete_ok_", true));
            }
        }
        if (com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.a(oVar)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5382x4233411a c5382x4233411a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5382x4233411a();
            c5382x4233411a.f135718g.f89521a = d17;
            c5382x4233411a.e();
        }
        r01.q3.hj().y0(d17);
        if (z3Var.l2()) {
            r01.q3.ij().z0(d17);
        } else {
            r01.q3.nj().D0(d17);
            r01.q3.oj().z0(d17);
        }
        vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
        m2Var.getClass();
        if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
            if (((y40.i0) z40.e.get()).Ni() && (a17 = a50.e1.f83004a.a()) != null) {
                a17.c(d17 == null ? "" : d17, y40.d.f540816a);
            }
        } else if (m2Var.aj() && (c17 = yw.q3.f547970a.c()) != null) {
            c17.c(d17 == null ? "" : d17, vw.e1.f522160a);
        }
        if (z3Var.m2()) {
            ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).getClass();
            if (zv.q.f557612a.g()) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v b17 = yw.a3.f547799a.b();
                if (b17 != null) {
                    b17.d(d17 != null ? d17 : "", zv.n0.f557591a);
                }
                if (d17 != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5203x7b2818cd c5203x7b2818cd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5203x7b2818cd();
                    c5203x7b2818cd.f135544g.f87737a = d17;
                    c5203x7b2818cd.e();
                }
            }
        }
        if (gm0.j1.s(qk.s6.class) == null || gm0.j1.s(zq1.a0.class) == null || !((qk.s6) gm0.j1.s(qk.s6.class)).mo13794x74219ae7()) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175976i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175971d.a();
    }
}
