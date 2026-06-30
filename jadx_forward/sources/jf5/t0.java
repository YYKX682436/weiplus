package jf5;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f381043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381044b;

    public t0(int i17, int i18) {
        this.f381043a = i17;
        this.f381044b = i18;
    }

    /* renamed from: equals */
    public boolean m140866xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.t0)) {
            return false;
        }
        jf5.t0 t0Var = (jf5.t0) obj;
        return this.f381043a == t0Var.f381043a && this.f381044b == t0Var.f381044b;
    }

    /* renamed from: hashCode */
    public int m140867x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f381043a) * 31) + java.lang.Integer.hashCode(this.f381044b);
    }

    /* renamed from: toString */
    public java.lang.String m140868x9616526c() {
        return "SelectionSourceRange(start=" + this.f381043a + ", end=" + this.f381044b + ')';
    }
}
