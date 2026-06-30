package at4;

/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f95571a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f95572b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f95573c;

    /* renamed from: d, reason: collision with root package name */
    public final at4.v1 f95574d;

    /* renamed from: e, reason: collision with root package name */
    public final ss4.e0 f95575e;

    /* renamed from: f, reason: collision with root package name */
    public final at4.a2 f95576f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95577g;

    public z1(java.util.ArrayList bankcardList, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2, at4.v1 userInfo, ss4.e0 e0Var, at4.a2 resultType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bankcardList, "bankcardList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInfo, "userInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultType, "resultType");
        this.f95571a = bankcardList;
        this.f95572b = c19091x9511676c;
        this.f95573c = c19091x9511676c2;
        this.f95574d = userInfo;
        this.f95575e = e0Var;
        this.f95576f = resultType;
        this.f95577g = z17;
    }

    /* renamed from: equals */
    public boolean m9041xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at4.z1)) {
            return false;
        }
        at4.z1 z1Var = (at4.z1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95571a, z1Var.f95571a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95572b, z1Var.f95572b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95573c, z1Var.f95573c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95574d, z1Var.f95574d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95575e, z1Var.f95575e) && this.f95576f == z1Var.f95576f && this.f95577g == z1Var.f95577g;
    }

    /* renamed from: hashCode */
    public int m9042x8cdac1b() {
        int hashCode = this.f95571a.hashCode() * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f95572b;
        int hashCode2 = (hashCode + (c19091x9511676c == null ? 0 : c19091x9511676c.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = this.f95573c;
        int hashCode3 = (((hashCode2 + (c19091x9511676c2 == null ? 0 : c19091x9511676c2.hashCode())) * 31) + this.f95574d.hashCode()) * 31;
        ss4.e0 e0Var = this.f95575e;
        return ((((hashCode3 + (e0Var != null ? e0Var.hashCode() : 0)) * 31) + this.f95576f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f95577g);
    }

    /* renamed from: toString */
    public java.lang.String m9043x9616526c() {
        return "Result(bankcardList=" + this.f95571a + ", balance=" + this.f95572b + ", lqtInfo=" + this.f95573c + ", userInfo=" + this.f95574d + ", netScene=" + this.f95575e + ", resultType=" + this.f95576f + ", isOk=" + this.f95577g + ')';
    }
}
