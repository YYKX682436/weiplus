package ee3;

/* loaded from: classes7.dex */
public class f extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.j f333136e;

    public f(ee3.j jVar) {
        this.f333136e = jVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MagicBrushDownloadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        ee3.j jVar = this.f333136e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", jVar.f333157t, java.lang.Integer.valueOf(jVar.f333154q), this.f333136e.f333150m);
        if (this.f333136e.f333148h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "call cronet time out already callback");
        } else {
            this.f333136e.f333148h = true;
            ee3.j jVar2 = this.f333136e;
            jVar2.f333146f.d(jVar2.f333151n, jVar2.f333150m, "fail:time out", 5);
        }
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37563x47001cd3.name(), 1, null, 0.01f);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f333136e.f333158u)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f333136e.f333158u);
    }
}
