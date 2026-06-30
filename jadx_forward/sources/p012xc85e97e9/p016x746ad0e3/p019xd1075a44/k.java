package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n f91155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q f91156e;

    public k(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n nVar) {
        this.f91156e = qVar;
        this.f91155d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o.p pVar;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f91156e;
        o.r rVar = qVar.f423225f;
        if (rVar != null && (pVar = rVar.f423317h) != null) {
            pVar.d(rVar);
        }
        android.view.View view = (android.view.View) qVar.f423230n;
        if (view != null && view.getWindowToken() != null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n nVar = this.f91155d;
            boolean z17 = true;
            if (!nVar.b()) {
                if (nVar.f423240f == null) {
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
