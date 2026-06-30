package ic5;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ic5.a f371960d = new ic5.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedHashMap map = (java.util.LinkedHashMap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        ic5.h hVar = ic5.h.f371974a;
        java.util.Collection values = map.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        wg3.k d17 = hVar.d(kz5.n0.S0(values));
        cl0.g h17 = new cl0.g().h(dm.i4.f66865x76d1ec5a, d17.f527263a);
        h17.o("pic", d17.f527264b);
        h17.o("live", d17.f527266d);
        h17.o("vd", d17.f527265c);
        java.lang.String gVar = h17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return gVar;
    }
}
