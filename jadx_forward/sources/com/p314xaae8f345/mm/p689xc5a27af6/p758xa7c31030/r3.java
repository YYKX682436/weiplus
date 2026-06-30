package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f149186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f149187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f149188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f149189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149190h;

    public r3(long j17, long j18, long j19, android.content.Intent intent, java.lang.String str) {
        this.f149186d = j17;
        this.f149187e = j18;
        this.f149188f = j19;
        this.f149189g = intent;
        this.f149190h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.t tVar = dr0.t0.f324072j;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c i17 = dr0.t0.f324073k.i();
        long j17 = this.f149186d;
        i17.m46678x92acc81a(j17);
        boolean z17 = false;
        if (1 <= j17 && j17 < 60001) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        long j18 = j17 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("longPushNotifyDispatch costMs: ");
        sb6.append(this.f149187e);
        sb6.append(" - ");
        sb6.append(this.f149188f);
        sb6.append(" = ");
        sb6.append(j18);
        sb6.append("min, ");
        com.p314xaae8f345.mm.p642xad8b531f.u2 u2Var = com.p314xaae8f345.mm.p642xad8b531f.u2.f145111a;
        android.content.Intent intent = this.f149189g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        sb6.append(com.p314xaae8f345.mm.p642xad8b531f.v2.a(intent));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", sb6.toString());
        ap.a.a(1, "longPushNotifyDispatch", null, null, java.lang.String.valueOf(j18), java.lang.String.valueOf(intent.getLongExtra("notfiy_sync_num", 0L)), this.f149190h, intent.getStringExtra("notify_from"));
    }
}
