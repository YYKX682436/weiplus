package gf5;

/* loaded from: classes11.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f352913a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f352914b;

    public b0(gf5.z tokenType, java.util.Set words) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(words, "words");
        this.f352913a = tokenType;
        this.f352914b = words;
    }

    /* renamed from: equals */
    public boolean m131454xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.b0)) {
            return false;
        }
        gf5.b0 b0Var = (gf5.b0) obj;
        return this.f352913a == b0Var.f352913a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352914b, b0Var.f352914b);
    }

    /* renamed from: hashCode */
    public int m131455x8cdac1b() {
        return (this.f352913a.hashCode() * 31) + this.f352914b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131456x9616526c() {
        return "WordTokenRule(tokenType=" + this.f352913a + ", words=" + this.f352914b + ')';
    }
}
