package lb;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lb.c f399183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lb.e f399185f;

    public b(lb.e eVar, lb.c cVar, java.lang.String str) {
        this.f399185f = eVar;
        this.f399183d = cVar;
        this.f399184e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        lb.e eVar;
        synchronized (this.f399185f.f399187a) {
            lb.e eVar2 = this.f399185f;
            eVar2.f399190d = this.f399183d;
            lb.e.a(eVar2);
            lb.i iVar = this.f399185f.f399189c;
            if (iVar != null) {
                try {
                    try {
                        boolean d17 = ((lb.g) iVar).d(this.f399184e);
                        "supportCapacity result is ".concat(java.lang.String.valueOf(d17));
                        lb.c cVar = this.f399183d;
                        if (cVar != null) {
                            ((com.p3263xee53b379.i) cVar).a(d17 ? 1 : 0, new android.os.Bundle());
                        }
                        eVar = this.f399185f;
                    } catch (java.lang.Exception unused) {
                        ((com.p3263xee53b379.i) this.f399183d).a(0, new android.os.Bundle());
                        eVar = this.f399185f;
                    }
                    eVar.b();
                } catch (java.lang.Throwable th6) {
                    this.f399185f.b();
                    throw th6;
                }
            }
        }
    }
}
