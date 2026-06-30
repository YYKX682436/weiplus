package qu0;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu0.g f448256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f448260h;

    public f(qu0.g gVar, int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        this.f448256d = gVar;
        this.f448257e = i17;
        this.f448258f = str;
        this.f448259g = str2;
        this.f448260h = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f448256d.c(this.f448257e, this.f448258f, this.f448259g, this.f448260h);
    }
}
