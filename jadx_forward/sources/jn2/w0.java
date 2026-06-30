package jn2;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ay1 f382273a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.cy1 f382274b;

    public w0(r45.ay1 basicInfo, r45.cy1 cy1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basicInfo, "basicInfo");
        this.f382273a = basicInfo;
        this.f382274b = cy1Var;
    }

    /* renamed from: equals */
    public boolean m141180xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn2.w0)) {
            return false;
        }
        jn2.w0 w0Var = (jn2.w0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382273a, w0Var.f382273a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382274b, w0Var.f382274b);
    }

    /* renamed from: hashCode */
    public int m141181x8cdac1b() {
        int hashCode = this.f382273a.hashCode() * 31;
        r45.cy1 cy1Var = this.f382274b;
        return hashCode + (cy1Var == null ? 0 : cy1Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m141182x9616526c() {
        return "SongItemData(basicInfo=" + this.f382273a + ", resourceInfo=" + this.f382274b + ')';
    }
}
