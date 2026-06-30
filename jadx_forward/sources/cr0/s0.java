package cr0;

/* loaded from: classes12.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f303276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f303279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f303280h;

    public s0(cr0.u0 u0Var, java.lang.String str, java.lang.String str2, long j17, long j18) {
        this.f303276d = u0Var;
        this.f303277e = str;
        this.f303278f = str2;
        this.f303279g = j17;
        this.f303280h = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f303276d.c().m40834x32c52b(new cr0.r0(this.f303276d, this.f303277e, this.f303278f, this.f303279g, this.f303280h));
    }
}
