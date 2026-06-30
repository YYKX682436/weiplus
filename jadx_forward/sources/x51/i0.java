package x51;

/* loaded from: classes8.dex */
public abstract class i0 {

    /* renamed from: ReportIntervalTimeMs */
    private long f77384xfc3370ec;

    /* renamed from: lastTryTime */
    private long f77386x31fa43b2;

    /* renamed from: TryIntervalTimeMs */
    private long f77385xe5aff0f3 = 5 * 1000;

    /* renamed from: MMKVKey_LastReportTimeMs */
    private final java.lang.String f77383x56de3b08 = "MMKVKey_LastReportTimeMs";

    public i0() {
        long j17 = 60;
        this.f77384xfc3370ec = 23 * j17 * 1000 * j17;
    }

    /* renamed from: getEventId */
    public abstract java.lang.String mo42415xebc1791f();

    /* renamed from: getMmkv */
    public abstract com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mo42416xfb829b81();

    /* renamed from: getReportIntervalTimeMs */
    public long mo42424x9e39f942() {
        return this.f77384xfc3370ec;
    }

    /* renamed from: getRouteRule */
    public abstract int mo42417x96ae22f();

    /* renamed from: getTAG */
    public abstract java.lang.String mo42418xb5886c64();

    /* renamed from: getTryIntervalTimeMs */
    public long mo144865x4e20385d() {
        return this.f77385xe5aff0f3;
    }

    /* renamed from: isFreezeNow */
    public final boolean m175018x2ddc9eb5() {
        long c17 = c01.id.c();
        if (c17 - this.f77386x31fa43b2 < mo144865x4e20385d()) {
            return true;
        }
        return c17 - mo42416xfb829b81().getLong(this.f77383x56de3b08, 0L) <= mo42424x9e39f942() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c;
    }

    /* renamed from: onReportParams */
    public java.util.Map<java.lang.String, ?> m175019x930f0f59() {
        return kz5.q0.f395534d;
    }

    /* renamed from: realReport */
    public abstract void mo42427x86d86c72();

    /* renamed from: setEventId */
    public abstract void mo42419x5f32c693(java.lang.String str);

    /* renamed from: setMmkv */
    public abstract void mo42420x764d628d(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var);

    /* renamed from: setReportIntervalTimeMs */
    public void mo42425x188d284e(long j17) {
        this.f77384xfc3370ec = j17;
    }

    /* renamed from: setRouteRule */
    public abstract void mo42421x65bea2a3(int i17);

    /* renamed from: setTAG */
    public abstract void mo42422xca0293d8(java.lang.String str);

    /* renamed from: setTryIntervalTimeMs */
    public void mo144866x29b644d1(long j17) {
        this.f77385xe5aff0f3 = j17;
    }

    /* renamed from: tryReport */
    public final void m175020x3cb8acf() {
        long c17 = c01.id.c();
        if (c17 - this.f77386x31fa43b2 < mo144865x4e20385d()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo42418xb5886c64(), "tryReportFakeInfo");
        this.f77386x31fa43b2 = c17;
        if (c17 - mo42416xfb829b81().getLong(this.f77383x56de3b08, 0L) > mo42424x9e39f942() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            mo42427x86d86c72();
            mo42416xfb829b81().putLong(this.f77383x56de3b08, c17);
        }
    }
}
