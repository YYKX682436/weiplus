package fm3;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345565a;

    public b0(java.lang.String songInfoBase64) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfoBase64, "songInfoBase64");
        this.f345565a = songInfoBase64;
    }

    /* renamed from: equals */
    public boolean m129756xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm3.b0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345565a, ((fm3.b0) obj).f345565a);
    }

    /* renamed from: hashCode */
    public int m129757x8cdac1b() {
        return this.f345565a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129758x9616526c() {
        return "MusicMvRecommendListCacheKey(songInfoBase64=" + this.f345565a + ')';
    }
}
