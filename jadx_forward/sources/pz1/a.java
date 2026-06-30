package pz1;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f440709a;

    /* renamed from: b, reason: collision with root package name */
    public static int f440710b;

    /* renamed from: c, reason: collision with root package name */
    public static int f440711c;

    /* renamed from: d, reason: collision with root package name */
    public static int f440712d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f440713e = new java.util.ArrayList();

    public static boolean a() {
        if (f440709a == null) {
            f440709a = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_data_report_is_open_performance_report, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.DataReportPerformanceReport", "[isOpenPerformanceReport] mIsOpenPerformanceReport : " + f440709a);
        }
        if (sz1.a.j()) {
            f440709a = java.lang.Boolean.TRUE;
        }
        return f440709a.booleanValue();
    }

    public static void b(java.lang.String str) {
        if (a() && !u46.l.e(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("2");
            arrayList.add(str.replace(",", "`"));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(24504, arrayList);
        }
    }
}
