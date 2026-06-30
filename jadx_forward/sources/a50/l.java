package a50;

/* loaded from: classes9.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f83037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f83038g;

    public l(a50.a0 a0Var, int i17, boolean z17, boolean z18) {
        this.f83035d = a0Var;
        this.f83036e = i17;
        this.f83037f = z17;
        this.f83038g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = this.f83035d.f82984a;
        if (cVar != null) {
            cVar.w0(this.f83036e, a50.o.a(this.f83037f, this.f83038g));
        }
    }
}
