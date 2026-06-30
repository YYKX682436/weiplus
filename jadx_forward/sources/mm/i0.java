package mm;

/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mm.i0 f410027a = new mm.i0();

    public final void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Bi();
        java.lang.String[] b17 = Bi.b();
        if (b17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (r26.i0.y(str, "voip-start-", false)) {
                    arrayList.add(str);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Bi.remove((java.lang.String) it.next());
                arrayList2.add(Bi);
            }
        }
    }
}
