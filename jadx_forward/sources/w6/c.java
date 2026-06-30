package w6;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w6.e f524607d;

    public c(w6.e eVar) {
        this.f524607d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w6.e eVar = this.f524607d;
        eVar.getClass();
        while (true) {
            try {
                eVar.b((w6.d) eVar.f524624d.remove());
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }
}
