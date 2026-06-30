package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class j1 implements wd0.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f155476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 f155477c;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var, java.lang.String str, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f155477c = m1Var;
        this.f155475a = str;
        this.f155476b = y0Var;
    }

    @Override // wd0.g2
    public void a(wd0.m2 m2Var) {
        wd0.e1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var = this.f155477c;
        if (m1Var.f155563f) {
            return;
        }
        m1Var.f155563f = true;
        m1Var.f155562e.B();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] requestAuthorizeAndSign(callback) onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(m2Var.f526285a), m2Var.f526286b);
        int i17 = m2Var.f526285a;
        if (i17 != 0) {
            wd0.d1[] d1VarArr = wd0.d1.f526235d;
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1.a(m1Var, 5, m2Var.f526286b);
        } else if (i17 == 0 && m2Var.f526287c == null) {
            wd0.d1[] d1VarArr2 = wd0.d1.f526235d;
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1.a(m1Var, 6, m2Var.f526286b);
        } else {
            m1Var.f155564g.b(true);
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String fingerprintId = m2Var.f526287c.f557154b;
            ((vd0.v1) j1Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fingerprintId, "fingerprintId");
            java.lang.String username = this.f155475a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            java.lang.String concat = "Fingerprint_".concat(username);
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(concat).getString("bind_fingerprint_fid", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] judgeFingerprintIdIsBind uin is " + concat + ", localFingerprintId is " + string + ", fingerprintId is " + fingerprintId);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, fingerprintId)) {
                wd0.d1[] d1VarArr3 = wd0.d1.f526235d;
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1.a(m1Var, 7, "");
            } else {
                if (!m2Var.f526287c.f557163k.isEmpty()) {
                    wd0.j1 j1Var2 = (wd0.j1) i95.n0.c(wd0.j1.class);
                    p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f155476b;
                    ((vd0.v1) j1Var2).bj(y0Var, m2Var, username, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k1(m1Var, y0Var, m2Var, username));
                    return;
                }
                wd0.d1[] d1VarArr4 = wd0.d1.f526235d;
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1.a(m1Var, 10, "");
            }
        }
        m1Var.f155564g.a(a17);
    }
}
