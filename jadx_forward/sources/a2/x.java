package a2;

/* loaded from: classes13.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.x f82352d = new a2.x();

    public x() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        java.util.List it = (java.util.List) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Saver, "$this$Saver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList(it.size());
        int size = it.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(a2.f1.a((a2.c) it.get(i17), a2.f1.f82231c, Saver));
        }
        return arrayList;
    }
}
