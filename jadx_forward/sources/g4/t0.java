package g4;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f350095a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.b5 f350096b;

    public t0(int i17, g4.b5 hint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hint, "hint");
        this.f350095a = i17;
        this.f350096b = hint;
    }

    public final int a(g4.a1 loadType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            throw new java.lang.IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        g4.b5 b5Var = this.f350096b;
        if (ordinal == 1) {
            return b5Var.f349748a;
        }
        if (ordinal == 2) {
            return b5Var.f349749b;
        }
        throw new jz5.j();
    }

    /* renamed from: equals */
    public boolean m130848xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.t0)) {
            return false;
        }
        g4.t0 t0Var = (g4.t0) obj;
        return this.f350095a == t0Var.f350095a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350096b, t0Var.f350096b);
    }

    /* renamed from: hashCode */
    public int m130849x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f350095a) * 31;
        g4.b5 b5Var = this.f350096b;
        return hashCode + (b5Var != null ? b5Var.mo130826x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130850x9616526c() {
        return "GenerationalViewportHint(generationId=" + this.f350095a + ", hint=" + this.f350096b + ")";
    }
}
