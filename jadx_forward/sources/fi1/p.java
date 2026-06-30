package fi1;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi1.q f344326d;

    public p(fi1.q qVar) {
        this.f344326d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fi1.t tVar = this.f344326d.f344327d.f167812m;
        if (tVar != null) {
            fi1.e eVar = (fi1.e) tVar;
            eVar.getClass();
            try {
                super/*android.app.Dialog*/.dismiss();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HybridOpenMaterialDialog", "super#dismiss, fail since " + e17);
            }
        }
    }
}
