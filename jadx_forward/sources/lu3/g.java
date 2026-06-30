package lu3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f402934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu3.m f402935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lu3.a f402936f;

    public g(boolean z17, lu3.m mVar, lu3.a aVar) {
        this.f402934d = z17;
        this.f402935e = mVar;
        this.f402936f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initProvider reCreate:");
        boolean z17 = this.f402934d;
        sb6.append(z17);
        sb6.append(" mediaRecorder:");
        lu3.m mVar = this.f402935e;
        sb6.append(mVar.f402952o);
        sb6.append(" initRecorderJobFinished:");
        sb6.append(mVar.f402961x);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", sb6.toString());
        lu3.a aVar = this.f402936f;
        if (!z17 && mVar.f402952o != null) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        ht0.s sVar = mVar.f402952o;
        if (sVar != null) {
            sVar.mo127742xae7a2e7a();
        }
        ht0.s sVar2 = mVar.f402952o;
        if (sVar2 != null) {
            sVar2.mo127743x5a5b64d();
        }
        mVar.e(z17, aVar);
    }
}
