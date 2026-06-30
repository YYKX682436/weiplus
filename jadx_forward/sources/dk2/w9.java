package dk2;

/* loaded from: classes.dex */
public final class w9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f315814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f315815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(dk2.t9 t9Var, java.util.List list) {
        super(0);
        this.f315814d = t9Var;
        this.f315815e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oa oaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oa) this.f315814d;
        oaVar.getClass();
        java.util.List downloadedFiles = this.f315815e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadedFiles, "downloadedFiles");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", "onSuccess: downloadedCount=" + downloadedFiles.size());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ma(oaVar.f191903a, downloadedFiles));
        return jz5.f0.f384359a;
    }
}
