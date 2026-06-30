package a2;

/* loaded from: classes14.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.c1 f82213d = new a2.c1();

    public c1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        java.lang.Float f17 = obj != null ? (java.lang.Float) obj : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        float floatValue = f17.floatValue();
        java.lang.Object obj2 = list.get(1);
        p2.v vVar = obj2 != null ? (p2.v) obj2 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar);
        return new p2.t(p2.u.d(vVar.f432936a, floatValue));
    }
}
