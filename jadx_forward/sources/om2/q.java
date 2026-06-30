package om2;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f427905a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427906b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427907c;

    public q(boolean z17, java.lang.String accompanyLocalPath, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accompanyLocalPath, "accompanyLocalPath");
        this.f427905a = z17;
        this.f427906b = accompanyLocalPath;
        this.f427907c = str;
    }

    /* renamed from: equals */
    public boolean m151673xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.q)) {
            return false;
        }
        om2.q qVar = (om2.q) obj;
        return this.f427905a == qVar.f427905a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427906b, qVar.f427906b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427907c, qVar.f427907c);
    }

    /* renamed from: hashCode */
    public int m151674x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f427905a) * 31) + this.f427906b.hashCode()) * 31;
        java.lang.String str = this.f427907c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m151675x9616526c() {
        return "LiveSongMusicResourceInfo(hasOriginal=" + this.f427905a + ", accompanyLocalPath=" + this.f427906b + ", originalLocalPath=" + this.f427907c + ')';
    }
}
