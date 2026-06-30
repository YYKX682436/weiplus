package yd5;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f542621a;

    /* renamed from: b, reason: collision with root package name */
    public final long f542622b;

    /* renamed from: c, reason: collision with root package name */
    public final long f542623c;

    /* renamed from: d, reason: collision with root package name */
    public final long f542624d;

    /* renamed from: e, reason: collision with root package name */
    public final long f542625e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f542626f;

    public c(long j17, long j18, long j19, long j27, long j28, java.lang.String contentMd5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentMd5, "contentMd5");
        this.f542621a = j17;
        this.f542622b = j18;
        this.f542623c = j19;
        this.f542624d = j27;
        this.f542625e = j28;
        this.f542626f = contentMd5;
    }

    /* renamed from: equals */
    public boolean m176852xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd5.c)) {
            return false;
        }
        yd5.c cVar = (yd5.c) obj;
        return this.f542621a == cVar.f542621a && this.f542622b == cVar.f542622b && this.f542623c == cVar.f542623c && this.f542624d == cVar.f542624d && this.f542625e == cVar.f542625e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542626f, cVar.f542626f);
    }

    /* renamed from: hashCode */
    public int m176853x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f542621a) * 31) + java.lang.Long.hashCode(this.f542622b)) * 31) + java.lang.Long.hashCode(this.f542623c)) * 31) + java.lang.Long.hashCode(this.f542624d)) * 31) + java.lang.Long.hashCode(this.f542625e)) * 31) + this.f542626f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176854x9616526c() {
        return "UrlParseData(biz=" + this.f542621a + ", msgId=" + this.f542622b + ", idx=" + this.f542623c + ", beginOffset=" + this.f542624d + ", endOffset=" + this.f542625e + ", contentMd5=" + this.f542626f + ')';
    }
}
