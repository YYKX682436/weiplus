package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class y implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f180638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f180640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 f180641g;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var, long j17, java.lang.String str, int i17) {
        this.f180641g = d0Var;
        this.f180638d = j17;
        this.f180639e = str;
        this.f180640f = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        u32.w a17 = u32.h1.a();
        long j17 = this.f180638d;
        int c17 = a17.c(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to check the sync connect state, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", this.f180639e, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f180640f), java.lang.Integer.valueOf(c17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var = this.f180641g;
        d0Var.b(j17);
        d0Var.f180401d.remove(java.lang.Long.valueOf(j17));
        return false;
    }
}
