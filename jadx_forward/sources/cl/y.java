package cl;

/* loaded from: classes7.dex */
public class y extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.z f124358a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cl.z zVar, android.os.Looper looper) {
        super(looper);
        this.f124358a = zVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
        try {
            super.dispatchMessage(message);
        } catch (com.p159x477cd522.p160x333422.AbstractC1482xef2ea8c2 e17) {
            cl.q qVar = this.f124358a.f124365a;
            if (qVar != null) {
                cl.a aVar = ((cl.f) qVar).f124158a.f124150e;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cl.a.f124098x;
                aVar.f(e17);
            }
        }
        if (this.f124358a.f124368d.f124240a) {
            ((java.util.concurrent.LinkedBlockingDeque) this.f124358a.f124368d.f124241b).pollFirst();
        }
    }
}
