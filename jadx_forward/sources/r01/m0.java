package r01;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f449686a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f449687b;

    public m0(java.lang.String curBiz, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        curBiz = (i17 & 1) != 0 ? "" : curBiz;
        bVar = (i17 & 2) != 0 ? null : bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curBiz, "curBiz");
        this.f449686a = curBiz;
        this.f449687b = bVar;
    }

    /* renamed from: equals */
    public boolean m161208xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.m0)) {
            return false;
        }
        r01.m0 m0Var = (r01.m0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449686a, m0Var.f449686a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f449687b, m0Var.f449687b);
    }

    /* renamed from: hashCode */
    public int m161209x8cdac1b() {
        int hashCode = this.f449686a.hashCode() * 31;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = this.f449687b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m161210x9616526c() {
        return "AccountCache(curBiz=" + this.f449686a + ", acctResp=" + this.f449687b + ')';
    }
}
