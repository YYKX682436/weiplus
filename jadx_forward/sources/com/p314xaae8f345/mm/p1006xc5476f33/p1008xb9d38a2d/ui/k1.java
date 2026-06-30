package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class k1 implements wd0.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f155501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd0.m2 f155502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 f155504d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, wd0.m2 m2Var, java.lang.String str) {
        this.f155504d = m1Var;
        this.f155501a = y0Var;
        this.f155502b = m2Var;
        this.f155503c = str;
    }

    @Override // wd0.c1
    public void a(wd0.e1 e1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] verifyFingerprintLoginCGI(callback) errCode: %d, errMsg: %s", java.lang.Integer.valueOf(e1Var.f526236a), e1Var.m173484x9616526c());
        int i17 = e1Var.f526236a;
        wd0.d1[] d1VarArr = wd0.d1.f526235d;
        wd0.m2 m2Var = this.f155502b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var = this.f155504d;
        if (i17 == 12) {
            if (m1Var.f155566i > 0) {
                r45.vt4 vt4Var = e1Var.f526241f;
                c01.f9.d(vt4Var.f470052f, vt4Var.f470051e, vt4Var.f470050d, true, e1Var.f526242g);
                wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f155501a;
                java.lang.String str = this.f155503c;
                ((vd0.v1) j1Var).bj(y0Var, m2Var, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k1(m1Var, y0Var, m2Var, str));
                m1Var.f155566i--;
                return;
            }
            e1Var.f526236a = 8;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m2Var, "<set-?>");
        e1Var.f526243h = m2Var;
        m1Var.f155564g.a(e1Var);
    }

    @Override // wd0.c1
    public void b(boolean z17) {
    }
}
