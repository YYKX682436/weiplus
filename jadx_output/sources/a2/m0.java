package a2;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.m0 f780d = new a2.m0();

    public m0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (kotlin.jvm.internal.o.b(it, java.lang.Boolean.FALSE)) {
            return new d1.e(d1.e.f225625d);
        }
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        java.lang.Float f17 = obj != null ? (java.lang.Float) obj : null;
        kotlin.jvm.internal.o.d(f17);
        float floatValue = f17.floatValue();
        java.lang.Object obj2 = list.get(1);
        java.lang.Float f18 = obj2 != null ? (java.lang.Float) obj2 : null;
        kotlin.jvm.internal.o.d(f18);
        return new d1.e(d1.f.a(floatValue, f18.floatValue()));
    }
}
