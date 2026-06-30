package hy4;

/* loaded from: classes8.dex */
public enum b {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public int f367619d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f367620e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f367621f = "";

    b() {
    }

    public void a(java.lang.String str, long j17, int i17, int i18, int i19, int i27, int i28) {
        if (j17 <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (currentTimeMillis < 0 || currentTimeMillis > 3600000) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthReport", str + "," + i18 + "," + i17 + "," + i19 + "," + currentTimeMillis + "," + i27 + "," + i28);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16488, str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i27), 0, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f367619d), this.f367621f);
    }

    public void b(int i17, int i18, int i19) {
        int h17 = ot0.g0.h();
        if (h17 == 100) {
            h17 = 0;
        }
        if (i18 < 0 || i18 > 3600000) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17614, java.lang.Integer.valueOf(this.f367619d), java.lang.Integer.valueOf(this.f367620e), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public void d(int i17, java.lang.String str) {
        this.f367619d = (int) (java.lang.System.currentTimeMillis() / 1000);
        this.f367620e = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        this.f367621f = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(str);
    }
}
