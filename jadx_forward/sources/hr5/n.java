package hr5;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f365947a;

    /* renamed from: b, reason: collision with root package name */
    public final long f365948b;

    /* renamed from: c, reason: collision with root package name */
    public final long f365949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f365950d;

    /* renamed from: e, reason: collision with root package name */
    public final gr5.n f365951e;

    /* renamed from: f, reason: collision with root package name */
    public final gr5.b f365952f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f365953g;

    /* renamed from: h, reason: collision with root package name */
    public final gr5.e0 f365954h;

    /* renamed from: i, reason: collision with root package name */
    public final gr5.h0 f365955i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f365956j;

    /* renamed from: k, reason: collision with root package name */
    public final float f365957k;

    /* renamed from: l, reason: collision with root package name */
    public final gr5.f f365958l;

    public n(long j17, long j18, long j19, int i17, gr5.n contentScale, gr5.b alignment, boolean z17, gr5.e0 e0Var, gr5.h0 scalesCalculator, boolean z18, float f17, gr5.f containerWhitespace, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentScale, "contentScale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scalesCalculator, "scalesCalculator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerWhitespace, "containerWhitespace");
        this.f365947a = j17;
        this.f365948b = j18;
        this.f365949c = j19;
        this.f365950d = i17;
        this.f365951e = contentScale;
        this.f365952f = alignment;
        this.f365953g = z17;
        this.f365954h = e0Var;
        this.f365955i = scalesCalculator;
        this.f365956j = z18;
        this.f365957k = f17;
        this.f365958l = containerWhitespace;
    }

    /* renamed from: equals */
    public boolean m134013xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr5.n)) {
            return false;
        }
        hr5.n nVar = (hr5.n) obj;
        return zq5.g.a(this.f365947a, nVar.f365947a) && zq5.g.a(this.f365948b, nVar.f365948b) && zq5.g.a(this.f365949c, nVar.f365949c) && this.f365950d == nVar.f365950d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365951e, nVar.f365951e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365952f, nVar.f365952f) && this.f365953g == nVar.f365953g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365954h, nVar.f365954h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365955i, nVar.f365955i) && this.f365956j == nVar.f365956j && java.lang.Float.compare(this.f365957k, nVar.f365957k) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365958l, nVar.f365958l);
    }

    /* renamed from: hashCode */
    public int m134014x8cdac1b() {
        int i17 = zq5.g.f556599c;
        int hashCode = ((((((((((((java.lang.Long.hashCode(this.f365947a) * 31) + java.lang.Long.hashCode(this.f365948b)) * 31) + java.lang.Long.hashCode(this.f365949c)) * 31) + java.lang.Integer.hashCode(this.f365950d)) * 31) + this.f365951e.hashCode()) * 31) + this.f365952f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f365953g)) * 31;
        gr5.e0 e0Var = this.f365954h;
        return ((((((((hashCode + (e0Var == null ? 0 : e0Var.m132100x8cdac1b())) * 31) + this.f365955i.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f365956j)) * 31) + java.lang.Float.hashCode(this.f365957k)) * 31) + this.f365958l.m132104x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m134015x9616526c() {
        return "ResetParams(containerSize=" + ((java.lang.Object) zq5.g.c(this.f365947a)) + ", contentSize=" + ((java.lang.Object) zq5.g.c(this.f365948b)) + ", contentOriginSize=" + ((java.lang.Object) zq5.g.c(this.f365949c)) + ", rotation=" + this.f365950d + ", contentScale=" + this.f365951e + ", alignment=" + this.f365952f + ", rtlLayoutDirection=" + this.f365953g + ", readMode=" + this.f365954h + ", scalesCalculator=" + this.f365955i + ", limitOffsetWithinBaseVisibleRect=" + this.f365956j + ", containerWhitespaceMultiple=" + this.f365957k + ", containerWhitespace=" + this.f365958l + ')';
    }
}
