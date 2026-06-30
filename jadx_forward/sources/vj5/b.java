package vj5;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vj5.h f519223d;

    public b(vj5.h hVar) {
        this.f519223d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vj5.h hVar = this.f519223d;
        if (!hVar.f519242o) {
            hVar.v();
            return;
        }
        vj5.n nVar = hVar.f519235e;
        if (nVar != null) {
            nVar.f(hVar);
            hVar.f519235e = null;
        }
        hVar.f519236f = null;
        hVar.f519243p = true;
    }
}
