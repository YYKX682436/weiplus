package hn2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f364052a;

    /* renamed from: b, reason: collision with root package name */
    public int f364053b;

    /* renamed from: c, reason: collision with root package name */
    public int f364054c;

    public e(boolean z17, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        this.f364052a = z17;
        this.f364053b = i17;
        this.f364054c = i18;
    }

    /* renamed from: equals */
    public boolean m133818xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn2.e)) {
            return false;
        }
        hn2.e eVar = (hn2.e) obj;
        return this.f364052a == eVar.f364052a && this.f364053b == eVar.f364053b && this.f364054c == eVar.f364054c;
    }

    /* renamed from: hashCode */
    public int m133819x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f364052a) * 31) + java.lang.Integer.hashCode(this.f364053b)) * 31) + java.lang.Integer.hashCode(this.f364054c);
    }

    /* renamed from: toString */
    public java.lang.String m133820x9616526c() {
        return "FinderLiveKtvSongSegment(hasSegment=" + this.f364052a + ", segmentStart=" + this.f364053b + ", segmentEnd=" + this.f364054c + ')';
    }
}
