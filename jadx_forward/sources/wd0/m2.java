package wd0;

/* loaded from: classes8.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public int f526285a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f526286b;

    /* renamed from: c, reason: collision with root package name */
    public zt5.s f526287c;

    public m2(int i17, java.lang.String errMsg, zt5.s sVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        errMsg = (i18 & 2) != 0 ? "" : errMsg;
        sVar = (i18 & 4) != 0 ? null : sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f526285a = i17;
        this.f526286b = errMsg;
        this.f526287c = sVar;
    }

    /* renamed from: equals */
    public boolean m173506xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.m2)) {
            return false;
        }
        wd0.m2 m2Var = (wd0.m2) obj;
        return this.f526285a == m2Var.f526285a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526286b, m2Var.f526286b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526287c, m2Var.f526287c);
    }

    /* renamed from: hashCode */
    public int m173507x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f526285a) * 31) + this.f526286b.hashCode()) * 31;
        zt5.s sVar = this.f526287c;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m173508x9616526c() {
        return "SoterSignatureResultParam(errCode=" + this.f526285a + ", errMsg=" + this.f526286b + ", resultInfo=" + this.f526287c + ')';
    }
}
