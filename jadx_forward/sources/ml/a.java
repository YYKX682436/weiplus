package ml;

/* loaded from: classes13.dex */
public class a implements ml.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml.b f408699a;

    public a(ml.b bVar) {
        this.f408699a = bVar;
    }

    public void a(n01.b bVar) {
        java.lang.String str = "";
        synchronized (this.f408699a.f408703d) {
            if (bVar != null) {
                this.f408699a.f408700a.remove(bVar.f415370b);
                str = bVar.f415370b;
            }
        }
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioDownloadMgr", "download fail, src:%s", str);
    }
}
