package xh4;

/* loaded from: classes14.dex */
public final class g extends x51.i0 {

    /* renamed from: e, reason: collision with root package name */
    public static long f536135e;

    /* renamed from: a, reason: collision with root package name */
    public static final xh4.g f536131a = new xh4.g();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f536132b = "MicroMsg.TeenModeReporter";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f536133c = "teenmode_enable_daily_check";

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f536134d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("TeenModeEnableReporter");

    /* renamed from: f, reason: collision with root package name */
    public static int f536136f = 20917;

    static {
        long j17 = 60;
        f536135e = 12 * j17 * 1000 * j17;
    }

    @Override // x51.i0
    /* renamed from: getEventId */
    public java.lang.String mo42415xebc1791f() {
        return f536133c;
    }

    @Override // x51.i0
    /* renamed from: getMmkv */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mo42416xfb829b81() {
        return f536134d;
    }

    @Override // x51.i0
    /* renamed from: getReportIntervalTimeMs */
    public long mo42424x9e39f942() {
        return f536135e;
    }

    @Override // x51.i0
    /* renamed from: getRouteRule */
    public int mo42417x96ae22f() {
        return f536136f;
    }

    @Override // x51.i0
    /* renamed from: getTAG */
    public java.lang.String mo42418xb5886c64() {
        return f536132b;
    }

    @Override // x51.i0
    /* renamed from: realReport */
    public void mo42427x86d86c72() {
        uh4.c0.m168057xb411027f().T(33);
    }

    @Override // x51.i0
    /* renamed from: setEventId */
    public void mo42419x5f32c693(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        f536133c = str;
    }

    @Override // x51.i0
    /* renamed from: setMmkv */
    public void mo42420x764d628d(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        f536134d = o4Var;
    }

    @Override // x51.i0
    /* renamed from: setReportIntervalTimeMs */
    public void mo42425x188d284e(long j17) {
        f536135e = j17;
    }

    @Override // x51.i0
    /* renamed from: setRouteRule */
    public void mo42421x65bea2a3(int i17) {
        f536136f = i17;
    }

    @Override // x51.i0
    /* renamed from: setTAG */
    public void mo42422xca0293d8(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        f536132b = str;
    }
}
