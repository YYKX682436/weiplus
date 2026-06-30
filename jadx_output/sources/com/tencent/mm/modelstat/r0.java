package com.tencent.mm.modelstat;

/* loaded from: classes11.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f71550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71552f;

    public r0(com.tencent.mm.modelstat.s0 s0Var, int i17, int i18, int i19) {
        this.f71550d = i17;
        this.f71551e = i18;
        this.f71552f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f71550d;
        long j18 = this.f71551e;
        boolean[] zArr = com.tencent.mm.modelstat.b0.f71493a;
        boolean a17 = com.tencent.mm.network.y2.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = this.f71552f;
        if (a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetStatStorageLogic", "dknetflow wifi recv:%d send:%d type:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
            com.tencent.mm.modelstat.b0.b(j17, j18, i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetStatStorageLogic", "dknetflow mobile recv:%d send:%d type:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
            com.tencent.mm.modelstat.b0.a(j17, j18, i17);
        }
    }
}
