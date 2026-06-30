package rr;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f480651a;

    /* renamed from: b, reason: collision with root package name */
    public final long f480652b;

    /* renamed from: c, reason: collision with root package name */
    public final long f480653c;

    /* renamed from: d, reason: collision with root package name */
    public final int f480654d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f480655e;

    public a(java.lang.String text, long j17, long j18, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f480651a = text;
        this.f480652b = j17;
        this.f480653c = j18;
        this.f480654d = i17;
        this.f480655e = z17;
    }

    /* renamed from: equals */
    public boolean m162937xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr.a)) {
            return false;
        }
        rr.a aVar = (rr.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f480651a, aVar.f480651a) && this.f480652b == aVar.f480652b && this.f480653c == aVar.f480653c && this.f480654d == aVar.f480654d && this.f480655e == aVar.f480655e;
    }

    /* renamed from: hashCode */
    public int m162938x8cdac1b() {
        return (((((((this.f480651a.hashCode() * 31) + java.lang.Long.hashCode(this.f480652b)) * 31) + java.lang.Long.hashCode(this.f480653c)) * 31) + java.lang.Integer.hashCode(this.f480654d)) * 31) + java.lang.Boolean.hashCode(this.f480655e);
    }

    /* renamed from: toString */
    public java.lang.String m162939x9616526c() {
        return "CustomEmojiWeTypeConfig(text=" + this.f480651a + ", showInterval=" + this.f480652b + ", maxShowDuration=" + this.f480653c + ", maxShowCount=" + this.f480654d + ", dismissAfterClicked=" + this.f480655e + ')';
    }
}
