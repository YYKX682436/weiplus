package qf2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f443910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.l f443911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f443913g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f443914h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, qf2.l lVar, int i17, int i18, int i19) {
        super(0);
        this.f443910d = j17;
        this.f443911e = lVar;
        this.f443912f = i17;
        this.f443913g = i18;
        this.f443914h = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qf2.l lVar = this.f443911e;
        long j17 = lVar.f443990o;
        long j18 = this.f443910d;
        int i17 = this.f443912f;
        if (j18 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "onBaseMicModeChange set mic setting success but seq outdated, drop. seq:" + j18 + " latest:" + lVar.f443990o + " newMode:" + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", "onBaseMicModeChange set mic setting success newMode:" + i17 + " micLayoutBaseMode:" + this.f443913g + " retryCount:" + this.f443914h + " seq:" + j18);
            lVar.f443989n = null;
        }
        return jz5.f0.f384359a;
    }
}
