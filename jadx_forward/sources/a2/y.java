package a2;

/* loaded from: classes13.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.y f82354d = new a2.y();

    public y() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = list.get(i17);
            a2.c cVar = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, java.lang.Boolean.FALSE) || obj == null) ? null : (a2.c) ((w0.a0) a2.f1.f82231c).a(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
