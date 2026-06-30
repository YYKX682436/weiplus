package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class y implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f99105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f99107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d0 f99108g;

    public y(com.tencent.mm.plugin.exdevice.model.d0 d0Var, long j17, java.lang.String str, int i17) {
        this.f99108g = d0Var;
        this.f99105d = j17;
        this.f99106e = str;
        this.f99107f = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        u32.w a17 = u32.h1.a();
        long j17 = this.f99105d;
        int c17 = a17.c(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now it is time to check the sync connect state, brand name = %s, deviceid = %d, bluetooth version = %d, connect state = %d", this.f99106e, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f99107f), java.lang.Integer.valueOf(c17));
        com.tencent.mm.plugin.exdevice.model.d0 d0Var = this.f99108g;
        d0Var.b(j17);
        d0Var.f98868d.remove(java.lang.Long.valueOf(j17));
        return false;
    }
}
