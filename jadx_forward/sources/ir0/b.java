package ir0;

/* loaded from: classes12.dex */
public final class b extends ku5.f {
    public b(java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue, ku5.d dVar) {
        super("matrix_x", 0, 20, linkedBlockingQueue, dVar);
    }

    @Override // ku5.f, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        ir0.e eVar;
        if (runnable != null) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q qVar = ir0.f.f375460a;
            eVar = new ir0.e(runnable);
        } else {
            eVar = null;
        }
        super.execute(eVar);
    }
}
