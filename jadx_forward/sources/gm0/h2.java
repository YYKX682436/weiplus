package gm0;

/* loaded from: classes12.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs.q f354733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354734e;

    public h2(gm0.j2 j2Var, fs.q qVar, int i17) {
        this.f354733d = qVar;
        this.f354734e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.i2 i2Var = (gm0.i2) this.f354733d.get();
        if (i2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpgradeManager", "Fail to get impl class of extendable itf: %s", gm0.i2.class.getName());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpgradeManager", "Invoke extension: %s", i2Var.getClass().getName());
            i2Var.kh(this.f354734e);
        }
    }
}
