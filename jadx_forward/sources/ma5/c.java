package ma5;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma5.e f406768d;

    public c(ma5.e eVar) {
        this.f406768d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ma5.e eVar = this.f406768d;
        if (eVar.f406765e == null) {
            eVar.f406765e = eVar.e();
        }
        p012xc85e97e9.p016x746ad0e3.app.b bVar = eVar.f406765e;
        o.r rVar = new o.r(bVar != null ? bVar.m() : eVar.f406764d);
        rVar.f423317h = eVar;
        ma5.d dVar = eVar.f406772n;
        if (dVar != null && dVar.mo82211xfb331c08(0, rVar) && dVar.mo82212xfb83a4bc(0, null, rVar)) {
            if (rVar != eVar.f406769h) {
                eVar.f406769h = rVar;
                p012xc85e97e9.p016x746ad0e3.app.b bVar2 = eVar.f406765e;
                if (bVar2 != null) {
                    ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) ((ma5.k) bVar2).f406790e).f(rVar, eVar);
                }
            }
        } else if (eVar.f406769h != null) {
            eVar.f406769h = null;
            p012xc85e97e9.p016x746ad0e3.app.b bVar3 = eVar.f406765e;
            if (bVar3 != null) {
                ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) ((ma5.k) bVar3).f406790e).f(null, eVar);
            }
        }
        rVar.p(true);
        eVar.f406773o = false;
    }
}
