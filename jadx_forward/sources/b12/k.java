package b12;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final b12.k f98593a = new b12.k();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f98594b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f98595c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f98596d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Long f98597e = null;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Integer f98598f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f98599g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f98600h = null;

    /* renamed from: i, reason: collision with root package name */
    public static int f98601i = 1;

    public final void a(long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: cardViewLoadFailed " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18916, f98597e, "", 24, java.lang.Long.valueOf(j17), "", "", "", "", f98599g, 0, 0, java.lang.Integer.valueOf(i17));
    }

    public final void b(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringEggRpt", "18914 eggRpt: " + str + ", " + i17 + ", " + f98601i + ", " + str2 + " sessionId: " + f98597e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18914, str, f98594b, f98595c, f98596d, f98597e, f98598f, java.lang.Integer.valueOf(i17), "", java.lang.Integer.valueOf(f98601i), str2, 0);
    }

    public final void c(int i17, java.lang.String str, java.lang.String str2, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringEggRpt", "18914 eggRpt: " + str + ", " + i17 + ", " + f98601i + ", " + str2 + " sessionId: " + j17 + ", keyWord: " + str + ", sender: " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
        objArr[2] = f98595c;
        objArr[3] = f98596d;
        objArr[4] = java.lang.Long.valueOf(j17);
        objArr[5] = f98598f;
        objArr[6] = java.lang.Integer.valueOf(i17);
        objArr[7] = "";
        objArr[8] = java.lang.Integer.valueOf(f98601i);
        objArr[9] = str2;
        objArr[10] = 0;
        g0Var.d(18914, objArr);
    }

    public final void d(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: " + f98600h + ", " + i17 + ", sessionId " + f98597e + ", materialId " + j17 + " , appId " + f98599g);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18916, f98597e, "", java.lang.Integer.valueOf(i17), "", "", "", "", "", f98599g, java.lang.Long.valueOf(j17), 0, 0);
    }
}
