package sn1;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f f491564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f491565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f491566c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f491567d;

    public j(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f491564a = fVar;
        this.f491565b = i17;
        this.f491566c = i18;
        this.f491567d = errMsg;
    }

    /* renamed from: equals */
    public boolean m164806xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn1.j)) {
            return false;
        }
        sn1.j jVar = (sn1.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491564a, jVar.f491564a) && this.f491565b == jVar.f491565b && this.f491566c == jVar.f491566c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491567d, jVar.f491567d);
    }

    /* renamed from: hashCode */
    public int m164807x8cdac1b() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f491564a;
        return ((((((fVar == null ? 0 : fVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f491565b)) * 31) + java.lang.Integer.hashCode(this.f491566c)) * 31) + this.f491567d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164808x9616526c() {
        return "CgiBack(resp=" + this.f491564a + ", errType=" + this.f491565b + ", errCode=" + this.f491566c + ", errMsg=" + this.f491567d + ')';
    }
}
