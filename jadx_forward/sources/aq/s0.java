package aq;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f94493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94494b;

    public s0(boolean z17, int i17) {
        this.f94493a = z17;
        this.f94494b = i17;
    }

    /* renamed from: equals */
    public boolean m8800xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.s0)) {
            return false;
        }
        aq.s0 s0Var = (aq.s0) obj;
        return this.f94493a == s0Var.f94493a && this.f94494b == s0Var.f94494b;
    }

    /* renamed from: hashCode */
    public int m8801x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f94493a) * 31) + java.lang.Integer.hashCode(this.f94494b);
    }

    /* renamed from: toString */
    public java.lang.String m8802x9616526c() {
        return "rsp: " + this.f94493a + "errCode: " + this.f94494b;
    }
}
