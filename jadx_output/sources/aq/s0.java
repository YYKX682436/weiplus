package aq;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12961b;

    public s0(boolean z17, int i17) {
        this.f12960a = z17;
        this.f12961b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.s0)) {
            return false;
        }
        aq.s0 s0Var = (aq.s0) obj;
        return this.f12960a == s0Var.f12960a && this.f12961b == s0Var.f12961b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f12960a) * 31) + java.lang.Integer.hashCode(this.f12961b);
    }

    public java.lang.String toString() {
        return "rsp: " + this.f12960a + "errCode: " + this.f12961b;
    }
}
