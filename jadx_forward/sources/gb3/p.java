package gb3;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final gb3.p f351575a = new gb3.p();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f351576b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f351577c;

    /* renamed from: d, reason: collision with root package name */
    public static int f351578d;

    /* renamed from: e, reason: collision with root package name */
    public static int f351579e;

    public final void a(int i17) {
        java.lang.String str = f351576b;
        if (str == null || str.length() == 0) {
            f351576b = java.util.UUID.randomUUID().toString();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareActionReport", "reportData：uuid %s, source_way:%s target_type:%s hb_mode :%s action：%s", f351576b, java.lang.Integer.valueOf(f351577c), java.lang.Integer.valueOf(f351578d), java.lang.Integer.valueOf(f351579e), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28838, f351576b, java.lang.Integer.valueOf(f351577c), java.lang.Integer.valueOf(f351578d), java.lang.Integer.valueOf(f351579e), java.lang.Integer.valueOf(i17));
    }
}
