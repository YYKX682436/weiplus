package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class z implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f99113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f99115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d0 f99116g;

    public z(com.tencent.mm.plugin.exdevice.model.d0 d0Var, long j17, java.lang.String str, int i17) {
        this.f99116g = d0Var;
        this.f99113d = j17;
        this.f99114e = str;
        this.f99115f = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        u32.w a17 = u32.h1.a();
        long j17 = this.f99113d;
        int c17 = a17.c(j17);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f99115f);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c17);
        java.lang.String str = this.f99114e;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to notify ui show the connect time out tips, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", str, valueOf, valueOf2, valueOf3);
        if (c17 != 2) {
            com.tencent.mm.plugin.exdevice.model.l3.Di().m(str, 2);
        }
        this.f99116g.f98867c.remove(java.lang.Long.valueOf(j17));
        return false;
    }
}
