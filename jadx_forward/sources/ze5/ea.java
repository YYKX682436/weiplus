package ze5;

/* loaded from: classes9.dex */
public class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.fa f553444d;

    public ea(ze5.fa faVar) {
        this.f553444d = faVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ze5.fa faVar = this.f553444d;
        if (faVar.f553462a.get() == null || ((yb5.d) faVar.f553462a.get()).g() == null || ((yb5.d) faVar.f553462a.get()).g().isFinishing()) {
            return;
        }
        ((yb5.d) faVar.f553462a.get()).J();
    }
}
