package dk2;

/* loaded from: classes3.dex */
public final class a6 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f314710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f314711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f314712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.s f314713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314714e;

    public a6(gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, yz5.s sVar, int i17) {
        this.f314710a = eVar;
        this.f314711b = xfVar;
        this.f314712c = k6Var;
        this.f314713d = sVar;
        this.f314714e = i17;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", "share live fail!");
        pm0.v.X(new dk2.y5(this.f314711b, this.f314713d, i18, i17, str));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", "share live success!");
        pm0.v.X(new dk2.z5(this.f314710a, this.f314711b, this.f314712c, this.f314713d, this.f314714e));
    }
}
