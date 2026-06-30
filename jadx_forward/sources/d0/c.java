package d0;

/* loaded from: classes14.dex */
public final class c implements d0.d {
    @Override // d0.d, d0.l
    public float a() {
        return 0;
    }

    @Override // d0.d
    public void c(p2.f fVar, int i17, int[] sizes, p2.s layoutDirection, int[] outPositions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizes, "sizes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPositions, "outPositions");
        if (layoutDirection == p2.s.Ltr) {
            d0.p.f306716a.c(i17, sizes, outPositions, false);
        } else {
            d0.p.f306716a.b(sizes, outPositions, true);
        }
    }

    /* renamed from: toString */
    public java.lang.String m123192x9616526c() {
        return "Arrangement#End";
    }
}
