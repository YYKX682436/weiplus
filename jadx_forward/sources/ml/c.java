package ml;

/* loaded from: classes13.dex */
public class c implements ml.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f408705a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f408706b = true;

    /* renamed from: c, reason: collision with root package name */
    public ml.f f408707c;

    /* renamed from: d, reason: collision with root package name */
    public n01.b f408708d;

    public c(ml.f fVar) {
        this.f408707c = fVar;
    }

    public void a(ml.d dVar) {
        android.os.Handler handler;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.f408705a)};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadProcess", "download process end, download finish:%b", objArr);
        if (ml.e.f408712e == null) {
            synchronized (ml.e.class) {
                if (ml.e.f408712e == null) {
                    ml.e.f408712e = new ml.e();
                }
            }
        }
        ml.e eVar = ml.e.f408712e;
        synchronized (eVar.f408713a) {
            eVar.f408715c.remove(dVar);
            if (eVar.f408715c.size() <= 4) {
                eVar.f408716d = 4;
                eVar.a(4);
            }
        }
        eVar.f408714b.remove(dVar);
        if (this.f408705a) {
            ml.f fVar = this.f408707c;
            if (fVar != null) {
                n01.b bVar = this.f408708d;
                ml.a aVar = (ml.a) fVar;
                java.lang.String str = "";
                synchronized (aVar.f408699a.f408703d) {
                    if (bVar != null) {
                        aVar.f408699a.f408700a.remove(bVar.f415370b);
                        str = bVar.f415370b;
                        aVar.f408699a.f408702c.add(bVar.f415370b);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioDownloadMgr", "download finish, src:%s", str);
                ml.g gVar = aVar.f408699a.f408704e;
                if (gVar != null) {
                    dl3.s sVar = (dl3.s) gVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "loadCache audio:%s", bVar.f415369a);
                    java.lang.String str2 = bVar.f415369a;
                    dl3.i iVar = sVar.f316878a;
                    n01.b n17 = iVar.n(str2);
                    boolean z17 = (n17 == null || android.text.TextUtils.isEmpty(n17.f415371c) || !iVar.B.e(n17.f415371c)) ? false : true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "cached:%b", java.lang.Boolean.valueOf(z17));
                    if (!z17 && (handler = iVar.f316840J) != null) {
                        handler.post(new dl3.r(sVar, bVar));
                    }
                }
            }
        } else {
            ml.f fVar2 = this.f408707c;
            if (fVar2 != null) {
                ((ml.a) fVar2).a(this.f408708d);
            }
        }
        this.f408706b = true;
        dVar.f408711i = null;
        this.f408707c = null;
    }
}
