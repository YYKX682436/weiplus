package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class j1 implements wd0.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f73943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.m1 f73944c;

    public j1(com.tencent.mm.plugin.account.ui.m1 m1Var, java.lang.String str, kotlinx.coroutines.y0 y0Var) {
        this.f73944c = m1Var;
        this.f73942a = str;
        this.f73943b = y0Var;
    }

    @Override // wd0.g2
    public void a(wd0.m2 m2Var) {
        wd0.e1 a17;
        com.tencent.mm.plugin.account.ui.m1 m1Var = this.f73944c;
        if (m1Var.f74030f) {
            return;
        }
        m1Var.f74030f = true;
        m1Var.f74029e.B();
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] requestAuthorizeAndSign(callback) onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(m2Var.f444752a), m2Var.f444753b);
        int i17 = m2Var.f444752a;
        if (i17 != 0) {
            wd0.d1[] d1VarArr = wd0.d1.f444702d;
            a17 = com.tencent.mm.plugin.account.ui.m1.a(m1Var, 5, m2Var.f444753b);
        } else if (i17 == 0 && m2Var.f444754c == null) {
            wd0.d1[] d1VarArr2 = wd0.d1.f444702d;
            a17 = com.tencent.mm.plugin.account.ui.m1.a(m1Var, 6, m2Var.f444753b);
        } else {
            m1Var.f74031g.b(true);
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String fingerprintId = m2Var.f444754c.f475621b;
            ((vd0.v1) j1Var).getClass();
            kotlin.jvm.internal.o.g(fingerprintId, "fingerprintId");
            java.lang.String username = this.f73942a;
            kotlin.jvm.internal.o.g(username, "username");
            java.lang.String concat = "Fingerprint_".concat(username);
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M(concat).getString("bind_fingerprint_fid", "");
            com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] judgeFingerprintIdIsBind uin is " + concat + ", localFingerprintId is " + string + ", fingerprintId is " + fingerprintId);
            if (!kotlin.jvm.internal.o.b(string, fingerprintId)) {
                wd0.d1[] d1VarArr3 = wd0.d1.f444702d;
                a17 = com.tencent.mm.plugin.account.ui.m1.a(m1Var, 7, "");
            } else {
                if (!m2Var.f444754c.f475630k.isEmpty()) {
                    wd0.j1 j1Var2 = (wd0.j1) i95.n0.c(wd0.j1.class);
                    kotlinx.coroutines.y0 y0Var = this.f73943b;
                    ((vd0.v1) j1Var2).bj(y0Var, m2Var, username, new com.tencent.mm.plugin.account.ui.k1(m1Var, y0Var, m2Var, username));
                    return;
                }
                wd0.d1[] d1VarArr4 = wd0.d1.f444702d;
                a17 = com.tencent.mm.plugin.account.ui.m1.a(m1Var, 10, "");
            }
        }
        m1Var.f74031g.a(a17);
    }
}
