package b03;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.l f98370d;

    public k(b03.l lVar) {
        this.f98370d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b03.a0 a0Var = this.f98370d.f98374d;
        if (a0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EngineGroupMemReporter", "recordAvgMem");
            ((ku5.t0) ku5.t0.f394148d).h(new b03.z(a0Var), "EngineGroupMemReporter_serial");
        }
    }
}
