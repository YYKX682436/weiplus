package qf2;

/* loaded from: classes3.dex */
public final class h implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f443922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qf2.l f443923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f443924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443926e;

    public h(long j17, qf2.l lVar, int i17, int i18, int i19) {
        this.f443922a = j17;
        this.f443923b = lVar;
        this.f443924c = i17;
        this.f443925d = i18;
        this.f443926e = i19;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        pm0.v.X(new qf2.f(this.f443922a, this.f443923b, i17, i18, str, this.f443926e, this.f443924c, this.f443925d));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pm0.v.X(new qf2.g(this.f443922a, this.f443923b, this.f443924c, this.f443925d, this.f443926e));
    }
}
