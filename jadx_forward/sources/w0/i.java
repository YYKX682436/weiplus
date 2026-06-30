package w0;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final w0.i f523372d = new w0.i();

    public i() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        w0.p it = (w0.p) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Saver, "$this$Saver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map t17 = kz5.c1.t(it.f523389a);
        for (w0.l lVar : ((java.util.LinkedHashMap) it.f523390b).values()) {
            lVar.getClass();
            if (lVar.f523376b) {
                t17.put(lVar.f523375a, ((w0.u) lVar.f523377c).a());
            }
        }
        return t17;
    }
}
