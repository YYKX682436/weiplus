package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public abstract class t1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final java.lang.String H;
    public final az2.f I;

    /* renamed from: J, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f201391J;
    public boolean K;
    public r45.ze2 L;
    public final jz5.g M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(android.content.Context context) {
        super(context, false, null, 0.0f, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = "BaseLbsBottomPanelSheet";
        this.I = az2.c.a(az2.f.f97658d, context, null, 0L, null, 14, null);
        this.f201391J = p3325xe03a0797.p3326xc267989b.z0.b();
        this.K = true;
        this.M = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s1(this));
    }

    public static final void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var, float f17, float f18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t1Var.i0(), "getPoiCityInfo: longitude:" + f17 + ", latitude:" + f18 + " isNeedLoadingToast: " + z17);
        r45.d64 d64Var = new r45.d64();
        d64Var.f453707d = f17;
        d64Var.f453708e = f18;
        d64Var.f453712i = 0;
        d64Var.f453709f = 1;
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1(t1Var, z17, f17, f18));
    }

    public static final void f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t1Var.i0(), "getPoiInfoError isNeedLoadingToast: " + z17);
        if (z17) {
            android.content.Context context = t1Var.f199716e;
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dle));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            r0Var.getClass();
            ml2.r0.hj(r0Var, ml2.b4.f408787o3, null, 0L, null, null, null, null, null, 252, null);
            t1Var.I.b();
        }
    }

    public static final void g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t1Var.i0(), "handlePoiNoPermission");
        android.content.Context context = t1Var.f199716e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            if (!activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q1(activity), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r1(t1Var));
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.a(activity, "android.permission.ACCESS_FINE_LOCATION", 79, null, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        super.S();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0(), "onDismiss isNeedRemove: " + this.K);
        if (this.K) {
            android.content.Context context = this.f199716e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) == null) {
                return;
            }
            mo273xed6858b4.c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14389x6e51d7f) ((jz5.n) this.M).mo141623x754a37bb());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42;
        super.V(e0Var, z17, i17);
        this.K = true;
        android.content.Context context = this.f199716e;
        boolean z18 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = z18 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        jz5.g gVar = this.M;
        if (abstractActivityC21394xb3d2c0cf != null && (mo273xed6858b42 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) != null) {
            mo273xed6858b42.c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14389x6e51d7f) ((jz5.n) gVar).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = z18 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf2 == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf2.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14389x6e51d7f) ((jz5.n) gVar).mo141623x754a37bb());
    }

    public void h0(boolean z17) {
        r45.ze2 ze2Var = this.L;
        if (ze2Var != null) {
            m0(ze2Var);
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308697o, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i1(this))) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n1(this, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o1(this, z17);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            j1Var.mo152xb9724478();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            o1Var.mo152xb9724478();
        } else {
            n1Var.mo152xb9724478();
        }
    }

    public java.lang.String i0() {
        return this.H;
    }

    public final boolean j0() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((sb0.f) jVar2).getClass();
            if (!j35.u.d(context2, "android.permission.ACCESS_COARSE_LOCATION", false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k0() {
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308697o);
        boolean j07 = j0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0(), "hadTotalPermission businessPermission: " + Ri + " sysPermission: " + j07);
        return Ri && j07;
    }

    public abstract void l0(boolean z17);

    public abstract void m0(r45.ze2 ze2Var);

    public abstract void n0(boolean z17);
}
