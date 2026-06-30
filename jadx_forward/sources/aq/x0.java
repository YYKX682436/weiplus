package aq;

/* loaded from: classes4.dex */
public final class x0 {
    public final java.util.ArrayList a(java.lang.String str) {
        boolean z17 = true;
        java.util.ArrayList<android.util.Pair> i17 = aq.r0.f94473a.i(str, true);
        if (i17 != null && !i17.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Pair pair : i17) {
            java.lang.Object second = pair.second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
            if (b((java.util.ArrayList) second)) {
                java.lang.Object first = pair.first;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
                java.lang.Object second2 = pair.second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second2, "second");
                arrayList.add(new aq.v0((java.lang.String) first, (java.util.List) second2));
            }
        }
        return arrayList;
    }

    public final boolean b(java.util.ArrayList arrayList) {
        boolean z17;
        java.util.Iterator it = arrayList.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.e(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()), aq.o.f94454b).isEmpty()) {
                z17 = true;
            }
        } while (z17);
        return true;
    }
}
