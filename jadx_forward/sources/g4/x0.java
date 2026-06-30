package g4;

/* loaded from: classes5.dex */
public final class x0 extends g4.y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g4.x0 f350137b = new g4.x0(true);

    /* renamed from: c, reason: collision with root package name */
    public static final g4.x0 f350138c = new g4.x0(false);

    public x0(boolean z17) {
        super(z17, null);
    }

    /* renamed from: equals */
    public boolean m130859xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof g4.x0) {
            if (this.f350160a == ((g4.x0) obj).f350160a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m130860x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f350160a);
    }

    /* renamed from: toString */
    public java.lang.String m130861x9616526c() {
        return "NotLoading(endOfPaginationReached=" + this.f350160a + ')';
    }
}
