package qb5;

/* loaded from: classes3.dex */
public class f implements fk4.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f442865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo.n f442866e;

    public f(qb5.g gVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, lo.n nVar) {
        this.f442865d = f9Var;
        this.f442866e = nVar;
    }

    @Override // fk4.t
    public void a(java.lang.Long l17, long j17, long j18, boolean z17) {
        lo.n nVar;
        if (l17 == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onDownloadProgress, it's not origin video task, return");
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.a(l17.longValue()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
        } else if (l17.longValue() == this.f442865d.m124847x74d37ac6() && j18 > 0 && (nVar = this.f442866e) != null) {
            ((vv1.l) nVar).f521955a.b((int) j17, (int) j18);
        }
    }

    @Override // fk4.t
    public void b(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (l17 == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onDataAvailable, it's not origin video task, return");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onDataAvailable msgId:%d", l17);
        }
    }

    @Override // fk4.t
    public void c(java.lang.Long l17, int i17, boolean z17) {
        if (l17 == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, it's not origin video task, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload msgId:%d", l17);
        fk4.k d17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.d(l17.longValue());
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
            return;
        }
        d17.f345157l = null;
        lo.n nVar = this.f442866e;
        if (nVar != null) {
            ((vv1.l) nVar).a(i17, "", d17.n());
        }
    }

    @Override // fk4.t
    public void d(java.lang.Long l17, boolean z17) {
        if (l17 == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onStopDownload, it's not origin video task, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onStopDownload msgId:%d", l17);
        fk4.k d17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.d(l17.longValue());
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
        } else {
            d17.f345157l = null;
        }
    }

    @Override // fk4.t
    public void e(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (l17 == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onMoovReady, it's not origin video task, return");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onMoovReady msgId:%d", l17);
        }
    }

    @Override // fk4.t
    public void g(java.lang.Long l17, boolean z17) {
        if (l17 == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onStartDownload, it's not origin video task, return");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "onStartDownload msgId:%d", l17);
        }
    }
}
