package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class z implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f180646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f180648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 f180649g;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var, long j17, java.lang.String str, int i17) {
        this.f180649g = d0Var;
        this.f180646d = j17;
        this.f180647e = str;
        this.f180648f = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        u32.w a17 = u32.h1.a();
        long j17 = this.f180646d;
        int c17 = a17.c(j17);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f180648f);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c17);
        java.lang.String str = this.f180647e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to notify ui show the connect time out tips, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", str, valueOf, valueOf2, valueOf3);
        if (c17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().m(str, 2);
        }
        this.f180649g.f180400c.remove(java.lang.Long.valueOf(j17));
        return false;
    }
}
