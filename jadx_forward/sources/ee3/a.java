package ee3;

/* loaded from: classes7.dex */
public class a extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.d f333117e;

    public a(ee3.d dVar) {
        this.f333117e = dVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MagicBrushDownloadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        ee3.d dVar = this.f333117e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "call cdndownload time out taskid:%s,timeout:%d,uri:%s", dVar.f333133s, java.lang.Integer.valueOf(dVar.f333131q), this.f333117e.f333125h);
        if (this.f333117e.f333123f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushCDNDownloadWorker", "call cdndownload time out already callback");
        } else {
            this.f333117e.f333123f = true;
            ee3.d dVar2 = this.f333117e;
            dVar2.f333121d.d(dVar2.f333128n, dVar2.f333125h, "fail:time out", 5);
        }
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37552xd4638248.name(), 1, null, 0.01f);
        c(true);
    }
}
