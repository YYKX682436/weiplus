package d5;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final d5.k f308029d;

    public j(d5.k kVar) {
        this.f308029d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        d5.k kVar = this.f308029d;
        kVar.getClass();
        a5.a0 c17 = a5.a0.c();
        java.lang.String str = d5.k.f308030q;
        c17.a(str, "Checking if commands are complete.", new java.lang.Throwable[0]);
        kVar.b();
        synchronized (kVar.f308038n) {
            boolean z18 = true;
            if (kVar.f308039o != null) {
                a5.a0.c().a(str, java.lang.String.format("Removing command %s", kVar.f308039o), new java.lang.Throwable[0]);
                if (!((android.content.Intent) ((java.util.ArrayList) kVar.f308038n).remove(0)).equals(kVar.f308039o)) {
                    throw new java.lang.IllegalStateException("Dequeue-d command is not the first.");
                }
                kVar.f308039o = null;
            }
            k5.l lVar = ((m5.c) kVar.f308032e).f405003a;
            d5.b bVar = kVar.f308036i;
            synchronized (bVar.f308006f) {
                z17 = !((java.util.HashMap) bVar.f308005e).isEmpty();
            }
            if (!z17 && ((java.util.ArrayList) kVar.f308038n).isEmpty()) {
                synchronized (lVar.f385671f) {
                    if (lVar.f385669d.isEmpty()) {
                        z18 = false;
                    }
                }
                if (!z18) {
                    a5.a0.c().a(str, "No more commands & intents.", new java.lang.Throwable[0]);
                    d5.i iVar = kVar.f308040p;
                    if (iVar != null) {
                        ((p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13) iVar).b();
                    }
                }
            }
            if (!((java.util.ArrayList) kVar.f308038n).isEmpty()) {
                kVar.f();
            }
        }
    }
}
