package rt1;

/* loaded from: classes16.dex */
public final class y {
    public y(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final rt1.k0 a(int i17) {
        if (!(i17 >= 0 && i17 < 8)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (i17 == 0) {
            return rt1.k0.f480967e;
        }
        if (i17 == 1) {
            return rt1.k0.f480968f;
        }
        if (2 <= i17 && i17 < 5) {
            return rt1.k0.f480969g;
        }
        if (i17 == 5) {
            return rt1.k0.f480970h;
        }
        if (6 <= i17 && i17 < 8) {
            return rt1.k0.f480971i;
        }
        throw new java.lang.IllegalStateException("Invalid index".toString());
    }
}
