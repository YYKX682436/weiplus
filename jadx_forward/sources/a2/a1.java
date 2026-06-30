package a2;

/* loaded from: classes14.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.a1 f82200d = new a2.a1();

    public a1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        java.lang.Integer num = obj != null ? (java.lang.Integer) obj : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        java.lang.Object obj2 = list.get(1);
        java.lang.Integer num2 = obj2 != null ? (java.lang.Integer) obj2 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
        return new a2.m1(a2.n1.a(intValue, num2.intValue()));
    }
}
