package j3;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f378866a;

    /* renamed from: b, reason: collision with root package name */
    public j3.g f378867b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f378868c;

    public void a() {
        synchronized (this) {
            if (this.f378866a) {
                return;
            }
            this.f378866a = true;
            this.f378868c = true;
            j3.g gVar = this.f378867b;
            if (gVar != null) {
                try {
                    gVar.mo7740x3d6f0539();
                } catch (java.lang.Throwable th6) {
                    synchronized (this) {
                        this.f378868c = false;
                        notifyAll();
                        throw th6;
                    }
                }
            }
            synchronized (this) {
                this.f378868c = false;
                notifyAll();
            }
        }
    }

    public void b(j3.g gVar) {
        synchronized (this) {
            while (this.f378868c) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            if (this.f378867b == gVar) {
                return;
            }
            this.f378867b = gVar;
            if (this.f378866a && gVar != null) {
                gVar.mo7740x3d6f0539();
            }
        }
    }
}
