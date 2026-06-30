package b00;

/* loaded from: classes9.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b00.r f16712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f16713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.x8 f16715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f16717i;

    public m(b00.r rVar, bw5.x7 x7Var, android.content.Context context, bw5.x8 x8Var, boolean z17, long j17) {
        this.f16712d = rVar;
        this.f16713e = x7Var;
        this.f16714f = context;
        this.f16715g = x8Var;
        this.f16716h = z17;
        this.f16717i = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16712d.rj(this.f16713e, this.f16714f, this.f16715g, this.f16716h, this.f16717i);
    }
}
