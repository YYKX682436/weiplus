package ey2;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.sx2 f339021a;

    /* renamed from: b, reason: collision with root package name */
    public final ey2.o0 f339022b;

    public r0(r45.sx2 tab, ey2.o0 cache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        this.f339021a = tab;
        this.f339022b = cache;
    }

    /* renamed from: equals */
    public boolean m128375xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.r0)) {
            return false;
        }
        ey2.r0 r0Var = (ey2.r0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f339021a, r0Var.f339021a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f339022b, r0Var.f339022b);
    }

    /* renamed from: hashCode */
    public int m128376x8cdac1b() {
        return (this.f339021a.hashCode() * 31) + this.f339022b.m128360x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m128377x9616526c() {
        return "SubTabInfo(tab=" + this.f339021a + ", cache=" + this.f339022b + ')';
    }
}
