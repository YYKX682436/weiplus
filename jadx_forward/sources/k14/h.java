package k14;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.k f384871d;

    public h(k14.k kVar) {
        this.f384871d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        k14.k kVar = this.f384871d;
        kVar.f384883n.set(true);
        kVar.a();
        k14.u uVar = kVar.f384876d;
        if (uVar != null) {
            uVar.a(kVar.f384877e, false, null);
        }
    }
}
