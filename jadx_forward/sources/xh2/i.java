package xh2;

/* loaded from: classes3.dex */
public final class i extends hn5.b {

    /* renamed from: e, reason: collision with root package name */
    public int f536086e;

    /* renamed from: f, reason: collision with root package name */
    public final int f536087f;

    /* renamed from: g, reason: collision with root package name */
    public final int f536088g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f536089h;

    /* renamed from: i, reason: collision with root package name */
    public int f536090i;

    /* renamed from: j, reason: collision with root package name */
    public final int f536091j;

    /* renamed from: k, reason: collision with root package name */
    public final long f536092k;

    public /* synthetic */ i(float f17, float f18, float f19, float f27, int i17, int i18, int i19, boolean z17, int i27, int i28, long j17, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(f17, f18, f19, f27, (i29 & 16) != 0 ? 0 : i17, (i29 & 32) != 0 ? 0 : i18, (i29 & 64) != 0 ? 0 : i19, (i29 & 128) != 0 ? false : z17, (i29 & 256) != 0 ? 0 : i27, (i29 & 512) != 0 ? 0 : i28, (i29 & 1024) != 0 ? 0L : j17);
    }

    public final xh2.i a() {
        return new xh2.i(this.f364142a, this.f364143b, this.f364144c, this.f364145d, this.f536086e, this.f536087f, this.f536088g, this.f536089h, this.f536090i, this.f536091j, this.f536092k);
    }

    @Override // hn5.b
    /* renamed from: toString */
    public java.lang.String mo133838x9616526c() {
        return "x:" + this.f364142a + ", y:" + this.f364143b + ", w:" + this.f364144c + ", h:" + this.f364145d + " zOrder: " + this.f536087f + ", force: " + this.f536088g + " location: " + this.f536086e + " isGrabLayout: " + this.f536089h + " us: " + this.f536090i + " st: " + this.f536091j + " mt: " + this.f536092k;
    }

    public i(float f17, float f18, float f19, float f27, int i17, int i18, int i19, boolean z17, int i27, int i28, long j17) {
        super(f17, f18, f19, f27);
        this.f536086e = i17;
        this.f536087f = i18;
        this.f536088g = i19;
        this.f536089h = z17;
        this.f536090i = i27;
        this.f536091j = i28;
        this.f536092k = j17;
    }
}
