package g4;

/* loaded from: classes5.dex */
public final class z4 extends g4.b5 {

    /* renamed from: e, reason: collision with root package name */
    public final int f350191e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350192f;

    public z4(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i19, i27, i28, i29, null);
        this.f350191e = i17;
        this.f350192f = i18;
    }

    @Override // g4.b5
    /* renamed from: equals */
    public boolean mo130825xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.z4)) {
            return false;
        }
        g4.z4 z4Var = (g4.z4) obj;
        if (this.f350191e == z4Var.f350191e && this.f350192f == z4Var.f350192f) {
            if (this.f349748a == z4Var.f349748a) {
                if (this.f349749b == z4Var.f349749b) {
                    if (this.f349750c == z4Var.f349750c) {
                        if (this.f349751d == z4Var.f349751d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // g4.b5
    /* renamed from: hashCode */
    public int mo130826x8cdac1b() {
        return super.mo130826x8cdac1b() + java.lang.Integer.hashCode(this.f350191e) + java.lang.Integer.hashCode(this.f350192f);
    }

    /* renamed from: toString */
    public java.lang.String m130877x9616526c() {
        return r26.b0.c("ViewportHint.Access(\n            |    pageOffset=" + this.f350191e + ",\n            |    indexInPage=" + this.f350192f + ",\n            |    presentedItemsBefore=" + this.f349748a + ",\n            |    presentedItemsAfter=" + this.f349749b + ",\n            |    originalPageOffsetFirst=" + this.f349750c + ",\n            |    originalPageOffsetLast=" + this.f349751d + ",\n            |)", null, 1, null);
    }
}
