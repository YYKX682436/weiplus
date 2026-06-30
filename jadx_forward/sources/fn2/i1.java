package fn2;

/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f345817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345819c;

    public i1(boolean z17, int i17, int i18) {
        this.f345817a = z17;
        this.f345818b = i17;
        this.f345819c = i18;
    }

    /* renamed from: equals */
    public boolean m129818xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2.i1)) {
            return false;
        }
        fn2.i1 i1Var = (fn2.i1) obj;
        return this.f345817a == i1Var.f345817a && this.f345818b == i1Var.f345818b && this.f345819c == i1Var.f345819c;
    }

    /* renamed from: hashCode */
    public int m129819x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f345817a) * 31) + java.lang.Integer.hashCode(this.f345818b)) * 31) + java.lang.Integer.hashCode(this.f345819c);
    }

    /* renamed from: toString */
    public java.lang.String m129820x9616526c() {
        return "TargetSongLocateResult(isInSungList=" + this.f345817a + ", targetTab=" + this.f345818b + ", songPosition=" + this.f345819c + ')';
    }
}
