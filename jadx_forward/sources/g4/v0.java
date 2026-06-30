package g4;

/* loaded from: classes5.dex */
public final class v0 extends g4.y0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Throwable f350121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.lang.Throwable error) {
        super(false, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        this.f350121b = error;
    }

    /* renamed from: equals */
    public boolean m130851xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof g4.v0) {
            g4.v0 v0Var = (g4.v0) obj;
            if (this.f350160a == v0Var.f350160a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350121b, v0Var.f350121b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m130852x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f350160a) + this.f350121b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130853x9616526c() {
        return "Error(endOfPaginationReached=" + this.f350160a + ", error=" + this.f350121b + ')';
    }
}
