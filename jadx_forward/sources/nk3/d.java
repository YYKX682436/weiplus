package nk3;

/* loaded from: classes8.dex */
public final class d extends x51.i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final nk3.d f419563a = new nk3.d();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Map f419564b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f419565c = "MicroMsg.MultiTaskDailyReporter";

    /* renamed from: d, reason: collision with root package name */
    public static int f419566d = 34575;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f419567e = "MultiTaskEntranceExpose";

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f419568f;

    /* renamed from: g, reason: collision with root package name */
    public static long f419569g;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_report_storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        f419568f = M;
        long j17 = 60;
        f419569g = 6 * j17 * 1000 * j17;
    }

    @Override // x51.i0
    /* renamed from: getEventId */
    public java.lang.String mo42415xebc1791f() {
        return f419567e;
    }

    @Override // x51.i0
    /* renamed from: getMmkv */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mo42416xfb829b81() {
        return f419568f;
    }

    @Override // x51.i0
    /* renamed from: getReportIntervalTimeMs */
    public long mo42424x9e39f942() {
        return f419569g;
    }

    @Override // x51.i0
    /* renamed from: getRouteRule */
    public int mo42417x96ae22f() {
        return f419566d;
    }

    @Override // x51.i0
    /* renamed from: getTAG */
    public java.lang.String mo42418xb5886c64() {
        return f419565c;
    }

    @Override // x51.i0
    /* renamed from: realReport */
    public void mo42427x86d86c72() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f419565c, "realReport");
        pm0.v.O("MultiTask_Thread", new nk3.c(f419564b));
    }

    @Override // x51.i0
    /* renamed from: setEventId */
    public void mo42419x5f32c693(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        f419567e = str;
    }

    @Override // x51.i0
    /* renamed from: setMmkv */
    public void mo42420x764d628d(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o4Var, "<set-?>");
        f419568f = o4Var;
    }

    @Override // x51.i0
    /* renamed from: setReportIntervalTimeMs */
    public void mo42425x188d284e(long j17) {
        f419569g = j17;
    }

    @Override // x51.i0
    /* renamed from: setRouteRule */
    public void mo42421x65bea2a3(int i17) {
        f419566d = i17;
    }

    @Override // x51.i0
    /* renamed from: setTAG */
    public void mo42422xca0293d8(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        f419565c = str;
    }
}
