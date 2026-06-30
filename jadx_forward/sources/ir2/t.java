package ir2;

/* loaded from: classes2.dex */
public final class t implements ir2.x {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f375751a;

    /* renamed from: b, reason: collision with root package name */
    public final ir2.z f375752b;

    public t(ir2.e1 data, ir2.z zVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        zVar = (i17 & 2) != 0 ? null : zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f375751a = data;
        this.f375752b = zVar;
    }

    /* renamed from: equals */
    public boolean m139739xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir2.t)) {
            return false;
        }
        ir2.t tVar = (ir2.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375751a, tVar.f375751a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375752b, tVar.f375752b);
    }

    /* renamed from: hashCode */
    public int m139740x8cdac1b() {
        int hashCode = this.f375751a.hashCode() * 31;
        ir2.z zVar = this.f375752b;
        return hashCode + (zVar == null ? 0 : zVar.m139752x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m139741x9616526c() {
        return "LoadMoreEvent(data=" + this.f375751a + ", key=" + this.f375752b + ')';
    }
}
