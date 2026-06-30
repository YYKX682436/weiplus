package u1;

/* loaded from: classes14.dex */
public final class k1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final u1.k1 f505148d = new u1.k1();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        u1.w a17 = (u1.w) obj;
        u1.w b17 = (u1.w) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "b");
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(b17.f505223n, a17.f505223n);
        return i17 != 0 ? i17 : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(a17.hashCode(), b17.hashCode());
    }
}
