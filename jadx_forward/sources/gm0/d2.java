package gm0;

/* loaded from: classes12.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs.q f354712d;

    public d2(gm0.g2 g2Var, fs.q qVar) {
        this.f354712d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.e2 e2Var = (gm0.e2) this.f354712d.get();
        if (e2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StorageManager", "Fail to get impl class of extendable itf: %s", gm0.e2.class.getName());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageManager", "Invoke extension: %s", e2Var.getClass().getName());
            gm0.j1.u().b(gm0.j1.u().f354686f, e2Var.U5(), false);
        }
    }
}
