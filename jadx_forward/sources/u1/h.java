package u1;

/* loaded from: classes14.dex */
public final class h implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        u1.w l17 = (u1.w) obj;
        u1.w l27 = (u1.w) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l27, "l2");
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(l17.f505223n, l27.f505223n);
        return i17 != 0 ? i17 : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(l17.hashCode(), l27.hashCode());
    }
}
