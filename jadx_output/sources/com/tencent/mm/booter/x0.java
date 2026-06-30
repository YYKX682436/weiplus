package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class x0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f63589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f63590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.NotifyReceiver.NotifyService f63591f;

    public x0(com.tencent.mm.booter.NotifyReceiver.NotifyService notifyService, long j17, android.content.Intent intent) {
        this.f63591f = notifyService;
        this.f63589d = j17;
        this.f63590e = intent;
    }

    @Override // hm0.t
    public void b() {
        this.f63591f.f63288n = null;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f63589d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "summerboot startupDone[%b] take[%d]ms tid[%d] post last notify task", java.lang.Boolean.valueOf(gm0.j1.i().f273208a.f273299d), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(11098, 3600, java.lang.Long.valueOf(currentTimeMillis));
        fVar.idkeyStat(99L, 214L, 1L, false);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.booter.w0(this), 500L);
    }
}
