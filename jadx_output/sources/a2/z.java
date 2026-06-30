package a2;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.z f823d = new a2.z();

    public z() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        a2.c it = (a2.c) obj2;
        kotlin.jvm.internal.o.g(Saver, "$this$Saver");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object obj3 = it.f675a;
        a2.f fVar = obj3 instanceof a2.p ? a2.f.Paragraph : obj3 instanceof a2.g1 ? a2.f.Span : obj3 instanceof a2.r1 ? a2.f.VerbatimTts : a2.f.String;
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            obj3 = a2.f1.a((a2.p) obj3, a2.f1.f700e, Saver);
        } else if (ordinal == 1) {
            obj3 = a2.f1.a((a2.g1) obj3, a2.f1.f701f, Saver);
        } else if (ordinal == 2) {
            obj3 = a2.f1.a((a2.r1) obj3, a2.f1.f699d, Saver);
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            w0.x xVar = a2.f1.f696a;
        }
        return kz5.c0.d(fVar, obj3, java.lang.Integer.valueOf(it.f676b), java.lang.Integer.valueOf(it.f677c), it.f678d);
    }
}
