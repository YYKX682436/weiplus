package bm2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final bm2.v f103926a;

    /* renamed from: b, reason: collision with root package name */
    public final dk2.vg f103927b;

    public w(bm2.v type, dk2.vg vgVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f103926a = type;
        this.f103927b = vgVar;
    }

    /* renamed from: equals */
    public boolean m10784xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.w)) {
            return false;
        }
        bm2.w wVar = (bm2.w) obj;
        return this.f103926a == wVar.f103926a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103927b, wVar.f103927b);
    }

    /* renamed from: hashCode */
    public int m10785x8cdac1b() {
        int hashCode = this.f103926a.hashCode() * 31;
        dk2.vg vgVar = this.f103927b;
        return hashCode + (vgVar == null ? 0 : vgVar.m124676x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m10786x9616526c() {
        return "MusicListItem(type=" + this.f103926a + ", music=" + this.f103927b + ')';
    }
}
