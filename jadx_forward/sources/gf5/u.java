package gf5;

/* loaded from: classes11.dex */
public final class u implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f352987a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f352988b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352989c;

    public u(java.util.Set operators, gf5.z tokenType, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        tokenType = (i18 & 2) != 0 ? gf5.z.f353009m : tokenType;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operators, "operators");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        this.f352987a = operators;
        this.f352988b = tokenType;
        this.f352989c = i17;
    }

    /* renamed from: equals */
    public boolean m131496xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.u)) {
            return false;
        }
        gf5.u uVar = (gf5.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352987a, uVar.f352987a) && this.f352988b == uVar.f352988b && this.f352989c == uVar.f352989c;
    }

    /* renamed from: hashCode */
    public int m131497x8cdac1b() {
        return (((this.f352987a.hashCode() * 31) + this.f352988b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f352989c);
    }

    /* renamed from: toString */
    public java.lang.String m131498x9616526c() {
        return "OperatorSetSyntaxRule(operators=" + this.f352987a + ", tokenType=" + this.f352988b + ", priority=" + this.f352989c + ')';
    }
}
