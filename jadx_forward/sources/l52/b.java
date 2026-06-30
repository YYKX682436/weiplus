package l52;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f398106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l52.f f398109g;

    public b(l52.f fVar, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f398109g = fVar;
        this.f398106d = z17;
        this.f398107e = str;
        this.f398108f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.ref.WeakReference weakReference;
        android.view.ViewGroup viewGroup;
        l52.f fVar = this.f398109g;
        l52.f.f(fVar);
        int i17 = fVar.f398116c;
        if (i17 == 0) {
            e62.q a17 = e62.q.a();
            a17.getClass();
            java.lang.String str = fVar.f398130q;
            if ("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI".equals(str) || "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI".equals(str)) {
                java.lang.String str2 = "123_" + java.lang.System.currentTimeMillis();
                a17.f331343h = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "curTimeSessionId update %s", str2);
            }
        }
        if (this.f398106d) {
            fVar.m(this.f398107e, this.f398108f);
            if (i17 != 0 || (weakReference = fVar.f398137x) == null || (viewGroup = (android.view.ViewGroup) weakReference.get()) == null) {
                return;
            }
            fVar.d(viewGroup, fVar.f398138y, fVar.f398139z);
        }
    }
}
