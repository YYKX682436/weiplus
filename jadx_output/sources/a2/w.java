package a2;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.w f817d = new a2.w();

    public w() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        java.util.List list2 = null;
        java.lang.String str = obj != null ? (java.lang.String) obj : null;
        kotlin.jvm.internal.o.d(str);
        java.lang.Object obj2 = list.get(1);
        w0.x xVar = a2.f1.f697b;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.util.List list3 = (kotlin.jvm.internal.o.b(obj2, bool) || obj2 == null) ? null : (java.util.List) ((w0.a0) xVar).a(obj2);
        kotlin.jvm.internal.o.d(list3);
        java.lang.Object obj3 = list.get(2);
        java.util.List list4 = (kotlin.jvm.internal.o.b(obj3, bool) || obj3 == null) ? null : (java.util.List) ((w0.a0) xVar).a(obj3);
        kotlin.jvm.internal.o.d(list4);
        java.lang.Object obj4 = list.get(3);
        if (!kotlin.jvm.internal.o.b(obj4, bool) && obj4 != null) {
            list2 = (java.util.List) ((w0.a0) xVar).a(obj4);
        }
        kotlin.jvm.internal.o.d(list2);
        return new a2.d(str, list3, list4, list2);
    }
}
