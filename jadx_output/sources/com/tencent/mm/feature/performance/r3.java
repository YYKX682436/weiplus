package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f67653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f67654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f67655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f67656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67657h;

    public r3(long j17, long j18, long j19, android.content.Intent intent, java.lang.String str) {
        this.f67653d = j17;
        this.f67654e = j18;
        this.f67655f = j19;
        this.f67656g = intent;
        this.f67657h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.t tVar = dr0.t0.f242539j;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats i17 = dr0.t0.f242540k.i();
        long j17 = this.f67653d;
        i17.collectNotifyDispatchCost(j17);
        boolean z17 = false;
        if (1 <= j17 && j17 < 60001) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        long j18 = j17 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("longPushNotifyDispatch costMs: ");
        sb6.append(this.f67654e);
        sb6.append(" - ");
        sb6.append(this.f67655f);
        sb6.append(" = ");
        sb6.append(j18);
        sb6.append("min, ");
        com.tencent.mm.booter.u2 u2Var = com.tencent.mm.booter.u2.f63578a;
        android.content.Intent intent = this.f67656g;
        kotlin.jvm.internal.o.g(intent, "intent");
        sb6.append(com.tencent.mm.booter.v2.a(intent));
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", sb6.toString());
        ap.a.a(1, "longPushNotifyDispatch", null, null, java.lang.String.valueOf(j18), java.lang.String.valueOf(intent.getLongExtra("notfiy_sync_num", 0L)), this.f67657h, intent.getStringExtra("notify_from"));
    }
}
