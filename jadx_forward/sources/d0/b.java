package d0;

/* loaded from: classes14.dex */
public final class b implements d0.e {

    /* renamed from: a, reason: collision with root package name */
    public final float f306607a = 0;

    @Override // d0.d, d0.l
    public float a() {
        return this.f306607a;
    }

    @Override // d0.l
    public void b(p2.f fVar, int i17, int[] sizes, int[] outPositions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizes, "sizes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPositions, "outPositions");
        d0.p.f306716a.a(i17, sizes, outPositions, false);
    }

    @Override // d0.d
    public void c(p2.f fVar, int i17, int[] sizes, p2.s layoutDirection, int[] outPositions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizes, "sizes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPositions, "outPositions");
        if (layoutDirection == p2.s.Ltr) {
            d0.p.f306716a.a(i17, sizes, outPositions, false);
        } else {
            d0.p.f306716a.a(i17, sizes, outPositions, true);
        }
    }

    /* renamed from: toString */
    public java.lang.String m123187x9616526c() {
        return "Arrangement#Center";
    }
}
