package cl;

/* loaded from: classes7.dex */
public class y extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.z f42825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cl.z zVar, android.os.Looper looper) {
        super(looper);
        this.f42825a = zVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
        try {
            super.dispatchMessage(message);
        } catch (com.eclipsesource.mmv8.V8ScriptException e17) {
            cl.q qVar = this.f42825a.f42832a;
            if (qVar != null) {
                cl.a aVar = ((cl.f) qVar).f42625a.f42617e;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cl.a.f42565x;
                aVar.f(e17);
            }
        }
        if (this.f42825a.f42835d.f42707a) {
            ((java.util.concurrent.LinkedBlockingDeque) this.f42825a.f42835d.f42708b).pollFirst();
        }
    }
}
