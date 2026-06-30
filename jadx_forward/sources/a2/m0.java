package a2;

/* loaded from: classes14.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.m0 f82313d = new a2.m0();

    public m0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, java.lang.Boolean.FALSE)) {
            return new d1.e(d1.e.f307158d);
        }
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        java.lang.Float f17 = obj != null ? (java.lang.Float) obj : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        float floatValue = f17.floatValue();
        java.lang.Object obj2 = list.get(1);
        java.lang.Float f18 = obj2 != null ? (java.lang.Float) obj2 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
        return new d1.e(d1.f.a(floatValue, f18.floatValue()));
    }
}
