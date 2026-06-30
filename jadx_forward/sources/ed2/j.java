package ed2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f332804a;

    /* renamed from: b, reason: collision with root package name */
    public final long f332805b;

    /* renamed from: c, reason: collision with root package name */
    public final int f332806c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f332807d;

    public j(java.lang.String id6, long j17, int i17, java.lang.String scopeKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopeKey, "scopeKey");
        this.f332804a = id6;
        this.f332805b = j17;
        this.f332806c = i17;
        this.f332807d = scopeKey;
    }

    /* renamed from: equals */
    public boolean m127329xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed2.j)) {
            return false;
        }
        ed2.j jVar = (ed2.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332804a, jVar.f332804a) && this.f332805b == jVar.f332805b && this.f332806c == jVar.f332806c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332807d, jVar.f332807d);
    }

    /* renamed from: hashCode */
    public int m127330x8cdac1b() {
        return (((((this.f332804a.hashCode() * 31) + java.lang.Long.hashCode(this.f332805b)) * 31) + java.lang.Integer.hashCode(this.f332806c)) * 31) + this.f332807d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127331x9616526c() {
        return "FinderTips(id=" + this.f332804a + ", feature=" + this.f332805b + ", position=" + this.f332806c + ", scopeKey=" + this.f332807d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String id6, long j17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this(id6, j17, i17, abstractC14490x69736cb5 != null ? pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()) : "global_scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
    }
}
