package a2;

/* loaded from: classes14.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.a0 f82199d = new a2.a0();

    public a0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        a2.f fVar = obj != null ? (a2.f) obj : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        java.lang.Object obj2 = list.get(2);
        java.lang.Integer num = obj2 != null ? (java.lang.Integer) obj2 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        java.lang.Object obj3 = list.get(3);
        java.lang.Integer num2 = obj3 != null ? (java.lang.Integer) obj3 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
        int intValue2 = num2.intValue();
        java.lang.Object obj4 = list.get(4);
        java.lang.String str = obj4 != null ? (java.lang.String) obj4 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            java.lang.Object obj5 = list.get(1);
            w0.x xVar = a2.f1.f82233e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj5, java.lang.Boolean.FALSE) && obj5 != null) {
                r1 = (a2.p) ((w0.a0) xVar).a(obj5);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
            return new a2.c(r1, intValue, intValue2, str);
        }
        if (ordinal == 1) {
            java.lang.Object obj6 = list.get(1);
            w0.x xVar2 = a2.f1.f82234f;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj6, java.lang.Boolean.FALSE) && obj6 != null) {
                r1 = (a2.g1) ((w0.a0) xVar2).a(obj6);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
            return new a2.c(r1, intValue, intValue2, str);
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            java.lang.Object obj7 = list.get(1);
            r1 = obj7 != null ? (java.lang.String) obj7 : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
            return new a2.c(r1, intValue, intValue2, str);
        }
        java.lang.Object obj8 = list.get(1);
        w0.x xVar3 = a2.f1.f82232d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj8, java.lang.Boolean.FALSE) && obj8 != null) {
            r1 = (a2.r1) ((w0.a0) xVar3).a(obj8);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        return new a2.c(r1, intValue, intValue2, str);
    }
}
