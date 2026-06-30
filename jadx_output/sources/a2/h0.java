package a2;

/* loaded from: classes13.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.h0 f739d = new a2.h0();

    public h0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        h2.d it = (h2.d) obj2;
        kotlin.jvm.internal.o.g(Saver, "$this$Saver");
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = it.f278259d;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(a2.f1.a((h2.b) list.get(i17), a2.f1.f713r, Saver));
        }
        return arrayList;
    }
}
