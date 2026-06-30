package go2;

/* loaded from: classes2.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f355503g;

    public e0(go2.a1 a1Var, android.content.Context context, java.lang.String str, boolean z17) {
        this.f355500d = a1Var;
        this.f355501e = context;
        this.f355502f = str;
        this.f355503g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355500d.P6(this.f355501e, this.f355502f, this.f355503g, false);
    }
}
