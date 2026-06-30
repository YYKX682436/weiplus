package ot0;

/* loaded from: classes8.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430141a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430142b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430143c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f430144d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f430145e;

    public n1(java.lang.String field, java.lang.String operator, int i17, boolean z17, java.lang.Integer num, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 8) != 0 ? false : z17;
        num = (i18 & 16) != 0 ? null : num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(field, "field");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operator, "operator");
        this.f430141a = field;
        this.f430142b = operator;
        this.f430143c = i17;
        this.f430144d = z17;
        this.f430145e = num;
    }

    /* renamed from: equals */
    public boolean m157065xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot0.n1)) {
            return false;
        }
        ot0.n1 n1Var = (ot0.n1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430141a, n1Var.f430141a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430142b, n1Var.f430142b) && this.f430143c == n1Var.f430143c && this.f430144d == n1Var.f430144d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430145e, n1Var.f430145e);
    }

    /* renamed from: hashCode */
    public int m157066x8cdac1b() {
        int hashCode = ((((((this.f430141a.hashCode() * 31) + this.f430142b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430143c)) * 31) + java.lang.Boolean.hashCode(this.f430144d)) * 31;
        java.lang.Integer num = this.f430145e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m157067x9616526c() {
        return "FilterCondition(field=" + this.f430141a + ", operator=" + this.f430142b + ", value=" + this.f430143c + ", isNegated=" + this.f430144d + ", bitMask=" + this.f430145e + ')';
    }
}
