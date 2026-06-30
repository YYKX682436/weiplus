package dl;

/* loaded from: classes10.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl.d0 f316625e;

    public e0(dl.d0 d0Var, java.lang.String str) {
        this.f316625e = d0Var;
        this.f316624d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        dl.d0 d0Var = this.f316625e;
        if (d0Var.l() != null && (str = this.f316624d) != null) {
            hk0.w0 e17 = d0Var.l().f363351i.e(str);
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MosaicArtist", "undoMosaicWithEraser edit data error");
                return;
            }
            hk0.z0 z0Var = hk0.z0.f363398g;
            xk0.k kVar = e17.f363370d;
            if (e17.f363369c == z0Var) {
                xk0.i iVar = xk0.i.TWO;
                if (kVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicArtist", "undoEraser single");
                    kVar.f536523h = false;
                    if (kVar.f536519d == iVar) {
                        kVar.f536524i = true;
                    }
                    d0Var.d().add(kVar);
                    d0Var.E(false);
                } else {
                    java.util.ArrayList arrayList = e17.f363371e;
                    if (arrayList != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicArtist", "undoEraser list");
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            xk0.k kVar2 = (xk0.k) it.next();
                            if (kVar2.f536519d == iVar) {
                                kVar2.f536524i = true;
                            }
                            kVar2.f536523h = false;
                            d0Var.d().add(kVar2);
                        }
                        d0Var.E(true);
                    }
                }
            } else {
                if (kVar != null) {
                    d0Var.d().b(kVar);
                }
                d0Var.E(true);
            }
        }
        d0Var.r();
        d0Var.f316581j = null;
    }
}
