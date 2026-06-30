package a2;

/* loaded from: classes13.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.y f821d = new a2.y();

    public y() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = list.get(i17);
            a2.c cVar = (kotlin.jvm.internal.o.b(obj, java.lang.Boolean.FALSE) || obj == null) ? null : (a2.c) ((w0.a0) a2.f1.f698c).a(obj);
            kotlin.jvm.internal.o.d(cVar);
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
