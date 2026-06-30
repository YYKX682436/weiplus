package fm3;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345575a;

    public d0(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f345575a = key;
    }

    /* renamed from: equals */
    public boolean m129763xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm3.d0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345575a, ((fm3.d0) obj).f345575a);
    }

    /* renamed from: hashCode */
    public int m129764x8cdac1b() {
        return this.f345575a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129765x9616526c() {
        return "MusicTingLyricCacheKey(key=" + this.f345575a + ')';
    }
}
