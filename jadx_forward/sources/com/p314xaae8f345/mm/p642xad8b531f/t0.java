package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes9.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.u0 f145103d;

    public t0(com.p314xaae8f345.mm.p642xad8b531f.u0 u0Var) {
        this.f145103d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.b().m()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyReceiver", "not init finish , do not post sync task");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = com.p314xaae8f345.mm.p642xad8b531f.u0.f145109d;
            if (currentTimeMillis - j17 <= 0 || currentTimeMillis - j17 >= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                com.p314xaae8f345.mm.p642xad8b531f.u0.f145109d = currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiver", "begin post sync task");
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5846xa44f96da().e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiver", "end post sync task, cost=%d, Idle done", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                this.f145103d.a(3000L);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m43434x9616526c() {
        return super.toString() + "|doPostSyncTask";
    }
}
