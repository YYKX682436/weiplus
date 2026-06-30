package to3;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.a0 f502521d;

    public z(to3.a0 a0Var, to3.w wVar) {
        this.f502521d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "mUpdateTokenRunnable, do doNetSceneToken");
        if (gm0.j1.b().m()) {
            this.f502521d.b(6, 6);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OfflineTokensMgr", "account not init.");
        }
    }
}
