package ir2;

/* loaded from: classes2.dex */
public final class v implements ir2.x {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f375761a;

    /* renamed from: b, reason: collision with root package name */
    public final ir2.z f375762b;

    public v(ir2.e1 data, ir2.z zVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        zVar = (i17 & 2) != 0 ? null : zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f375761a = data;
        this.f375762b = zVar;
    }

    /* renamed from: equals */
    public boolean m139748xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir2.v)) {
            return false;
        }
        ir2.v vVar = (ir2.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375761a, vVar.f375761a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375762b, vVar.f375762b);
    }

    /* renamed from: hashCode */
    public int m139749x8cdac1b() {
        int hashCode = this.f375761a.hashCode() * 31;
        ir2.z zVar = this.f375762b;
        return hashCode + (zVar == null ? 0 : zVar.m139752x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m139750x9616526c() {
        return "RefreshEvent(data=" + this.f375761a + ", key=" + this.f375762b + ')';
    }
}
