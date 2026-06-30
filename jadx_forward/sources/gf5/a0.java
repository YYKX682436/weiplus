package gf5;

/* loaded from: classes11.dex */
public final class a0 implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f352906a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f352907b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352908c;

    public a0(gf5.z tokenType, java.util.Set words, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 4) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(words, "words");
        this.f352906a = tokenType;
        this.f352907b = words;
        this.f352908c = i17;
    }

    /* renamed from: equals */
    public boolean m131448xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.a0)) {
            return false;
        }
        gf5.a0 a0Var = (gf5.a0) obj;
        return this.f352906a == a0Var.f352906a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352907b, a0Var.f352907b) && this.f352908c == a0Var.f352908c;
    }

    /* renamed from: hashCode */
    public int m131449x8cdac1b() {
        return (((this.f352906a.hashCode() * 31) + this.f352907b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f352908c);
    }

    /* renamed from: toString */
    public java.lang.String m131450x9616526c() {
        return "WordSetSyntaxRule(tokenType=" + this.f352906a + ", words=" + this.f352907b + ", priority=" + this.f352908c + ')';
    }
}
