package qf2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f443890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.l f443891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f443893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f443895i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f443896m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f443897n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, qf2.l lVar, int i17, int i18, java.lang.String str, int i19, int i27, int i28) {
        super(0);
        this.f443890d = j17;
        this.f443891e = lVar;
        this.f443892f = i17;
        this.f443893g = i18;
        this.f443894h = str;
        this.f443895i = i19;
        this.f443896m = i27;
        this.f443897n = i28;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qf2.l lVar = this.f443891e;
        long j17 = lVar.f443990o;
        long j18 = this.f443890d;
        int i17 = this.f443893g;
        int i18 = this.f443892f;
        if (j18 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "onBaseMicModeChange set mic setting fail but seq outdated, drop. seq:" + j18 + " latest:" + lVar.f443990o + " errType:" + i18 + " errCode:" + i17);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBaseMicModeChange set mic setting fail, errType:");
            sb6.append(i18);
            sb6.append(" errCode:");
            sb6.append(i17);
            sb6.append(" errMsg:");
            sb6.append(this.f443894h);
            sb6.append(" retryCount:");
            int i19 = this.f443895i;
            sb6.append(i19);
            sb6.append(" seq:");
            sb6.append(j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AnchorMicCloudController", sb6.toString());
            long j19 = this.f443890d;
            int i27 = this.f443896m;
            int i28 = this.f443897n;
            if (i19 >= 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AnchorMicCloudController", "onBaseMicModeChange set mic setting reach max retry, give up. newMode:" + i27 + " micLayoutBaseMode:" + i28 + " seq:" + j19);
                if (j19 == lVar.f443990o) {
                    lVar.f443989n = null;
                }
            } else {
                int i29 = i19 + 1;
                long j27 = 1000 << i19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "onBaseMicModeChange schedule retry, nextRetryCount:" + i29 + " delayMs:" + j27 + " newMode:" + i27 + " micLayoutBaseMode:" + i28 + " seq:" + j19);
                lVar.f443989n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(lVar, null, null, new qf2.k(j27, lVar, j19, i27, i28, i29, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
