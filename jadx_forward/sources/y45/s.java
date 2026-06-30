package y45;

/* loaded from: classes11.dex */
public class s extends sc0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc0.a f540921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y45.t f540922e;

    public s(y45.t tVar, sc0.a aVar) {
        this.f540922e = tVar;
        this.f540921d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f540922e.f540924b) {
            y45.t tVar = this.f540922e;
            if (tVar.f540924b[0] == null) {
                return;
            }
            try {
                d55.u.b("MicroMsg.RecoveryWatchDog", "[+] %s: bark action triggered.", tVar.f540923a);
                this.f540921d.run();
            } catch (java.lang.Throwable th6) {
                d55.u.c("MicroMsg.RecoveryWatchDog", "[-] %s: bark action throws exception.", th6, this.f540922e.f540923a);
            }
        }
    }
}
