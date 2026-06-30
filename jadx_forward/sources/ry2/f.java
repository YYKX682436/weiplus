package ry2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f482917a;

    /* renamed from: b, reason: collision with root package name */
    public final int f482918b;

    /* renamed from: c, reason: collision with root package name */
    public final int f482919c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f482920d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f482921e;

    public f(int i17, int i18, int i19, yz5.a aVar, yz5.q qVar, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        aVar = (i27 & 8) != 0 ? null : aVar;
        qVar = (i27 & 16) != 0 ? null : qVar;
        this.f482917a = i17;
        this.f482918b = i18;
        this.f482919c = i19;
        this.f482920d = aVar;
        this.f482921e = qVar;
    }

    /* renamed from: equals */
    public boolean m163449xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry2.f)) {
            return false;
        }
        ry2.f fVar = (ry2.f) obj;
        return this.f482917a == fVar.f482917a && this.f482918b == fVar.f482918b && this.f482919c == fVar.f482919c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482920d, fVar.f482920d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482921e, fVar.f482921e);
    }

    /* renamed from: hashCode */
    public int m163450x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f482917a) * 31) + java.lang.Integer.hashCode(this.f482918b)) * 31) + java.lang.Integer.hashCode(this.f482919c)) * 31;
        yz5.a aVar = this.f482920d;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        yz5.q qVar = this.f482921e;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m163451x9616526c() {
        return "MenuData(menuId=" + this.f482917a + ", colorResId=" + this.f482918b + ", titleResId=" + this.f482919c + ", onClick=" + this.f482920d + ", onMenuGetView=" + this.f482921e + ')';
    }
}
