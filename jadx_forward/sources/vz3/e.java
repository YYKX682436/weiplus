package vz3;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f523209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f523210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz3.q f523211f;

    public e(int i17, long j17, vz3.q qVar) {
        this.f523209d = i17;
        this.f523210e = j17;
        this.f523211f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInitFFE callback2 ret: ");
        sb6.append(this.f523209d);
        sb6.append(", init cost: ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f523210e);
        sb6.append(", tryStartSessionWhenInited: ");
        vz3.q qVar = this.f523211f;
        sb6.append(qVar.f523234f);
        sb6.append(", sessionId: ");
        sb6.append(qVar.f523236h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", sb6.toString());
        qVar.f523232d = vz3.b.f523204f;
        if (qVar.f523234f) {
            long j17 = qVar.f523236h;
            if (j17 > 0) {
                qVar.g(j17);
            }
        }
    }
}
