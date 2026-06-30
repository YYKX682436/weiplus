package o53;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.e f424640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f424641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f424642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f424643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f424644h;

    public a(o53.e eVar, int i17, int i18, int i19, boolean z17) {
        this.f424640d = eVar;
        this.f424641e = i17;
        this.f424642f = i18;
        this.f424643g = i19;
        this.f424644h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o53.e.c(this.f424640d, this.f424641e, this.f424642f, this.f424643g, this.f424644h);
    }
}
