package a2;

/* loaded from: classes14.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.z f82356d = new a2.z();

    public z() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        a2.c it = (a2.c) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Saver, "$this$Saver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object obj3 = it.f82208a;
        a2.f fVar = obj3 instanceof a2.p ? a2.f.Paragraph : obj3 instanceof a2.g1 ? a2.f.Span : obj3 instanceof a2.r1 ? a2.f.VerbatimTts : a2.f.String;
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            obj3 = a2.f1.a((a2.p) obj3, a2.f1.f82233e, Saver);
        } else if (ordinal == 1) {
            obj3 = a2.f1.a((a2.g1) obj3, a2.f1.f82234f, Saver);
        } else if (ordinal == 2) {
            obj3 = a2.f1.a((a2.r1) obj3, a2.f1.f82232d, Saver);
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            w0.x xVar = a2.f1.f82229a;
        }
        return kz5.c0.d(fVar, obj3, java.lang.Integer.valueOf(it.f82209b), java.lang.Integer.valueOf(it.f82210c), it.f82211d);
    }
}
