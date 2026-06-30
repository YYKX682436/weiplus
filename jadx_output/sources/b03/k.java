package b03;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.l f16837d;

    public k(b03.l lVar) {
        this.f16837d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b03.a0 a0Var = this.f16837d.f16841d;
        if (a0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EngineGroupMemReporter", "recordAvgMem");
            ((ku5.t0) ku5.t0.f312615d).h(new b03.z(a0Var), "EngineGroupMemReporter_serial");
        }
    }
}
