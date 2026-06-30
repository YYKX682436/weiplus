package q43;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f441621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f441622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f441623f;

    public e(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, long j17) {
        this.f441621d = mVar;
        this.f441622e = h0Var;
        this.f441623f = j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , tryDownload, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            return 0;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new q43.d(this.f441621d, this.f441622e, oVar, this.f441623f), "GameResourceDownloadRequest_callback");
        return 0;
    }
}
