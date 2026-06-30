package j00;

/* loaded from: classes9.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f378293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f378294h;

    public e1(j00.k1 k1Var, java.lang.String str, java.lang.String str2, boolean z17, java.lang.Long l17) {
        this.f378290d = k1Var;
        this.f378291e = str;
        this.f378292f = str2;
        this.f378293g = z17;
        this.f378294h = l17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f378290d.ij(this.f378291e, this.f378292f, this.f378293g, this.f378294h);
    }
}
