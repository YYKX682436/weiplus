package dk2;

/* loaded from: classes.dex */
public final class x9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f315872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f315875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f315876h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(dk2.t9 t9Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
        super(0);
        this.f315872d = t9Var;
        this.f315873e = str;
        this.f315874f = str2;
        this.f315875g = i17;
        this.f315876h = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oa oaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oa) this.f315872d;
        oaVar.getClass();
        java.lang.String filePath = this.f315873e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.String micReplayUrl = this.f315874f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayUrl, "micReplayUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", "onVideoDownloaded: filePath=".concat(filePath));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 activityC14003xac416256 = oaVar.f191903a;
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC14003xac416256), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.na(activityC14003xac416256, filePath, micReplayUrl, null), 3, null);
        int i17 = this.f315875g + 1;
        oaVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress: ");
        sb6.append(i17);
        sb6.append('/');
        int i18 = this.f315876h;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayUI", sb6.toString());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.la(oaVar.f191903a, i17, i18));
        return jz5.f0.f384359a;
    }
}
