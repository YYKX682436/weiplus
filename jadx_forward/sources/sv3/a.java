package sv3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f494920a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f494921b;

    public a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        c16997xb0aa383a = (i18 & 2) != 0 ? null : c16997xb0aa383a;
        this.f494920a = i17;
        this.f494921b = c16997xb0aa383a;
    }

    /* renamed from: equals */
    public boolean m165382xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv3.a)) {
            return false;
        }
        sv3.a aVar = (sv3.a) obj;
        return this.f494920a == aVar.f494920a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494921b, aVar.f494921b);
    }

    /* renamed from: hashCode */
    public int m165383x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f494920a) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f494921b;
        return hashCode + (c16997xb0aa383a == null ? 0 : c16997xb0aa383a.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m165384x9616526c() {
        return "MusicPickerCurrentSelectData(sourceType=" + this.f494920a + ", selectedAudio=" + this.f494921b + ')';
    }
}
