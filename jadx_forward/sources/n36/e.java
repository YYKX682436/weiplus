package n36;

/* loaded from: classes16.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n36.k f416349d;

    public e(n36.k kVar) {
        this.f416349d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f416349d) {
            n36.k kVar = this.f416349d;
            if ((!kVar.f416381t) || kVar.f416382u) {
                return;
            }
            try {
                kVar.x();
            } catch (java.io.IOException unused) {
                this.f416349d.f416383v = true;
            }
            try {
                if (this.f416349d.j()) {
                    this.f416349d.v();
                    this.f416349d.f416379r = 0;
                }
            } catch (java.io.IOException unused2) {
                n36.k kVar2 = this.f416349d;
                kVar2.f416384w = true;
                kVar2.f416377p = x36.v.a(new x36.h());
            }
        }
    }
}
