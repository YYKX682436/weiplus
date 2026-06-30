package g4;

/* loaded from: classes5.dex */
public final class w0 extends g4.y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g4.w0 f350128b = new g4.w0();

    public w0() {
        super(false, null);
    }

    /* renamed from: equals */
    public boolean m130855xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof g4.w0) {
            if (this.f350160a == ((g4.w0) obj).f350160a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m130856x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f350160a);
    }

    /* renamed from: toString */
    public java.lang.String m130857x9616526c() {
        return "Loading(endOfPaginationReached=" + this.f350160a + ')';
    }
}
