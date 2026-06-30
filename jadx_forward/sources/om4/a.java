package om4;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om4.e f427944d;

    public a(om4.e eVar) {
        this.f427944d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        om4.e eVar = this.f427944d;
        eVar.f427954n.set(true);
        eVar.c();
        eVar.b(false, null);
    }
}
