package fm3;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345566a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345567b;

    public c0(java.lang.String lyric, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyric, "lyric");
        this.f345566a = lyric;
        this.f345567b = j17;
    }

    /* renamed from: equals */
    public boolean m129759xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.c0)) {
            return false;
        }
        fm3.c0 c0Var = (fm3.c0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345566a, c0Var.f345566a) && this.f345567b == c0Var.f345567b;
    }

    /* renamed from: hashCode */
    public int m129760x8cdac1b() {
        return (this.f345566a.hashCode() * 31) + java.lang.Long.hashCode(this.f345567b);
    }

    /* renamed from: toString */
    public java.lang.String m129761x9616526c() {
        return "MusicTingLyricCache(lyric=" + this.f345566a + ", timestamp=" + this.f345567b + ')';
    }
}
