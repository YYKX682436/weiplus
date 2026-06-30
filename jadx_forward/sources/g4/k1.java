package g4;

/* loaded from: classes5.dex */
public final class k1 extends g4.l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final g4.j1 f349934d = new g4.j1(null);

    /* renamed from: a, reason: collision with root package name */
    public final g4.a1 f349935a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f349936b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.y0 f349937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(g4.a1 loadType, boolean z17, g4.y0 loadState) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadState, "loadState");
        this.f349935a = loadType;
        this.f349936b = z17;
        this.f349937c = loadState;
        if (!((loadType == g4.a1.REFRESH && !z17 && (loadState instanceof g4.x0) && loadState.f350160a) ? false : true)) {
            throw new java.lang.IllegalArgumentException("LoadStateUpdate for local REFRESH may not set endOfPaginationReached = true".toString());
        }
        if (!f349934d.a(loadState, z17)) {
            throw new java.lang.IllegalArgumentException("LoadStateUpdates cannot be used to dispatch NotLoading unless it is from remote mediator and remote mediator reached end of pagination.".toString());
        }
    }

    /* renamed from: equals */
    public boolean m130844xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.k1)) {
            return false;
        }
        g4.k1 k1Var = (g4.k1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349935a, k1Var.f349935a) && this.f349936b == k1Var.f349936b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349937c, k1Var.f349937c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m130845x8cdac1b() {
        g4.a1 a1Var = this.f349935a;
        int hashCode = (a1Var != null ? a1Var.hashCode() : 0) * 31;
        boolean z17 = this.f349936b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        g4.y0 y0Var = this.f349937c;
        return i18 + (y0Var != null ? y0Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130846x9616526c() {
        return "LoadStateUpdate(loadType=" + this.f349935a + ", fromMediator=" + this.f349936b + ", loadState=" + this.f349937c + ")";
    }
}
