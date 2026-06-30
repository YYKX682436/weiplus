package a2;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.w f82350d = new a2.w();

    public w() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        java.util.List list2 = null;
        java.lang.String str = obj != null ? (java.lang.String) obj : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.Object obj2 = list.get(1);
        w0.x xVar = a2.f1.f82230b;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.util.List list3 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, bool) || obj2 == null) ? null : (java.util.List) ((w0.a0) xVar).a(obj2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
        java.lang.Object obj3 = list.get(2);
        java.util.List list4 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, bool) || obj3 == null) ? null : (java.util.List) ((w0.a0) xVar).a(obj3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list4);
        java.lang.Object obj4 = list.get(3);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj4, bool) && obj4 != null) {
            list2 = (java.util.List) ((w0.a0) xVar).a(obj4);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
        return new a2.d(str, list3, list4, list2);
    }
}
