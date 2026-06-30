package j0;

/* loaded from: classes14.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.x3 f378170d = new j0.x3();

    public x3() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        k0.p0 deleteIfSelectedOr = (k0.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        int c17 = a2.m1.c(deleteIfSelectedOr.f384464f);
        java.lang.String str = deleteIfSelectedOr.f384465g.f82214d;
        int c18 = a2.m1.c(deleteIfSelectedOr.f384464f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return new g2.b(c17 - characterInstance.preceding(c18), 0);
    }
}
