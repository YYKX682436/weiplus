package b12;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final b12.k f17060a = new b12.k();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f17061b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f17062c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f17063d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Long f17064e = null;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Integer f17065f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f17066g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f17067h = null;

    /* renamed from: i, reason: collision with root package name */
    public static int f17068i = 1;

    public final void a(long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: cardViewLoadFailed " + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18916, f17064e, "", 24, java.lang.Long.valueOf(j17), "", "", "", "", f17066g, 0, 0, java.lang.Integer.valueOf(i17));
    }

    public final void b(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringEggRpt", "18914 eggRpt: " + str + ", " + i17 + ", " + f17068i + ", " + str2 + " sessionId: " + f17064e);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18914, str, f17061b, f17062c, f17063d, f17064e, f17065f, java.lang.Integer.valueOf(i17), "", java.lang.Integer.valueOf(f17068i), str2, 0);
    }

    public final void c(int i17, java.lang.String str, java.lang.String str2, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringEggRpt", "18914 eggRpt: " + str + ", " + i17 + ", " + f17068i + ", " + str2 + " sessionId: " + j17 + ", keyWord: " + str + ", sender: " + z17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
        objArr[2] = f17062c;
        objArr[3] = f17063d;
        objArr[4] = java.lang.Long.valueOf(j17);
        objArr[5] = f17065f;
        objArr[6] = java.lang.Integer.valueOf(i17);
        objArr[7] = "";
        objArr[8] = java.lang.Integer.valueOf(f17068i);
        objArr[9] = str2;
        objArr[10] = 0;
        g0Var.d(18914, objArr);
    }

    public final void d(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringEggRpt", "18916 eggRpt: " + f17067h + ", " + i17 + ", sessionId " + f17064e + ", materialId " + j17 + " , appId " + f17066g);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18916, f17064e, "", java.lang.Integer.valueOf(i17), "", "", "", "", "", f17066g, java.lang.Long.valueOf(j17), 0, 0);
    }
}
