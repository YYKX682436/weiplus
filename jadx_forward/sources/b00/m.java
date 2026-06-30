package b00;

/* loaded from: classes9.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b00.r f98245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f98246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f98247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.x8 f98248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f98249h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f98250i;

    public m(b00.r rVar, bw5.x7 x7Var, android.content.Context context, bw5.x8 x8Var, boolean z17, long j17) {
        this.f98245d = rVar;
        this.f98246e = x7Var;
        this.f98247f = context;
        this.f98248g = x8Var;
        this.f98249h = z17;
        this.f98250i = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f98245d.rj(this.f98246e, this.f98247f, this.f98248g, this.f98249h, this.f98250i);
    }
}
