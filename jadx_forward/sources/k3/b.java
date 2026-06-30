package k3;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k3.o f385308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f385309e;

    public b(k3.c cVar, k3.o oVar, int i17) {
        this.f385308d = oVar;
        this.f385309e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        d3.p pVar = ((e3.g) this.f385308d).f328583a;
        if (pVar != null) {
            pVar.c(this.f385309e);
        }
    }
}
