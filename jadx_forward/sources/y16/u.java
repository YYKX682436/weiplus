package y16;

/* loaded from: classes14.dex */
public abstract class u {
    public static final java.util.Set a(java.lang.Iterable iterable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterable, "<this>");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Set d17 = ((y16.s) it.next()).d();
            if (d17 == null) {
                return null;
            }
            kz5.h0.u(hashSet, d17);
        }
        return hashSet;
    }
}
