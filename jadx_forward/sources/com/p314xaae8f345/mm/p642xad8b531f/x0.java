package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class x0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f145122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f145123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyService f145124f;

    public x0(com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyService notifyService, long j17, android.content.Intent intent) {
        this.f145124f = notifyService;
        this.f145122d = j17;
        this.f145123e = intent;
    }

    @Override // hm0.t
    public void b() {
        this.f145124f.f144821n = null;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f145122d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiver", "summerboot startupDone[%b] take[%d]ms tid[%d] post last notify task", java.lang.Boolean.valueOf(gm0.j1.i().f354741a.f354832d), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(11098, 3600, java.lang.Long.valueOf(currentTimeMillis));
        fVar.mo68477x336bdfd8(99L, 214L, 1L, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p642xad8b531f.w0(this), 500L);
    }
}
