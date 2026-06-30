package sv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f494922a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f494923b;

    public b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        c16997xb0aa383a = (i18 & 2) != 0 ? null : c16997xb0aa383a;
        this.f494922a = i17;
        this.f494923b = c16997xb0aa383a;
    }

    /* renamed from: equals */
    public boolean m165385xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv3.b)) {
            return false;
        }
        sv3.b bVar = (sv3.b) obj;
        return this.f494922a == bVar.f494922a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494923b, bVar.f494923b);
    }

    /* renamed from: hashCode */
    public int m165386x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f494922a) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f494923b;
        return hashCode + (c16997xb0aa383a == null ? 0 : c16997xb0aa383a.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m165387x9616526c() {
        return "MusicPickerLoadingSelectData(sourceType=" + this.f494922a + ", selectedAudio=" + this.f494923b + ')';
    }
}
