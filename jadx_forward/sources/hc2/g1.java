package hc2;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f361858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f361859b;

    public g1(int i17, int i18) {
        this.f361858a = i17;
        this.f361859b = i18;
    }

    /* renamed from: equals */
    public boolean m133189xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc2.g1)) {
            return false;
        }
        hc2.g1 g1Var = (hc2.g1) obj;
        return this.f361858a == g1Var.f361858a && this.f361859b == g1Var.f361859b;
    }

    /* renamed from: hashCode */
    public int m133190x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f361858a) * 31) + java.lang.Integer.hashCode(this.f361859b);
    }

    /* renamed from: toString */
    public java.lang.String m133191x9616526c() {
        return "SmileySpanInfo(start=" + this.f361858a + ", count=" + this.f361859b + ')';
    }
}
