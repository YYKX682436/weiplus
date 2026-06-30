package gc0;

/* loaded from: classes5.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f351722a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.b90 f351723b;

    public i3(boolean z17, r45.b90 b90Var) {
        this.f351722a = z17;
        this.f351723b = b90Var;
    }

    public final boolean a() {
        r45.b90 b90Var;
        if (this.f351722a || (b90Var = this.f351723b) == null || b90Var.m75939xb282bd08(2) == 1 || b90Var.m75939xb282bd08(2) == 2) {
            return false;
        }
        boolean z17 = b90Var.m75939xb282bd08(1) >= j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20636x403d87ce());
        if (z17) {
            b90Var.set(2, 2);
        }
        return !z17;
    }

    /* renamed from: toString */
    public java.lang.String m131228x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shownResult[");
        sb6.append(this.f351722a);
        sb6.append(' ');
        r45.b90 b90Var = this.f351723b;
        sb6.append(b90Var != null ? java.lang.Integer.valueOf(b90Var.m75939xb282bd08(1)) : null);
        sb6.append(' ');
        sb6.append(b90Var != null ? java.lang.Integer.valueOf(b90Var.m75939xb282bd08(2)) : null);
        sb6.append(']');
        return sb6.toString();
    }
}
