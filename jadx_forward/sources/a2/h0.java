package a2;

/* loaded from: classes13.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.h0 f82272d = new a2.h0();

    public h0() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        h2.d it = (h2.d) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Saver, "$this$Saver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = it.f359792d;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(a2.f1.a((h2.b) list.get(i17), a2.f1.f82246r, Saver));
        }
        return arrayList;
    }
}
