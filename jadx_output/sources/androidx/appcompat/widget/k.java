package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.n f9622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f9623e;

    public k(androidx.appcompat.widget.q qVar, androidx.appcompat.widget.n nVar) {
        this.f9623e = qVar;
        this.f9622d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o.p pVar;
        androidx.appcompat.widget.q qVar = this.f9623e;
        o.r rVar = qVar.f341692f;
        if (rVar != null && (pVar = rVar.f341784h) != null) {
            pVar.d(rVar);
        }
        android.view.View view = (android.view.View) qVar.f341697n;
        if (view != null && view.getWindowToken() != null) {
            androidx.appcompat.widget.n nVar = this.f9622d;
            boolean z17 = true;
            if (!nVar.b()) {
                if (nVar.f341707f == null) {
                    z17 = false;
                } else {
                    nVar.d(0, 0, false, false);
                }
            }
            if (z17) {
                qVar.A = nVar;
            }
        }
        qVar.C = null;
    }
}
