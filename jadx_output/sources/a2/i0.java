package a2;

/* loaded from: classes13.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.i0 f742d = new a2.i0();

    public i0() {
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
            h2.b bVar = (kotlin.jvm.internal.o.b(obj, java.lang.Boolean.FALSE) || obj == null) ? null : (h2.b) ((w0.a0) a2.f1.f713r).a(obj);
            kotlin.jvm.internal.o.d(bVar);
            arrayList.add(bVar);
        }
        return new h2.d(arrayList);
    }
}
