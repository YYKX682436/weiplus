package wi5;

/* loaded from: classes.dex */
public final class o0 {
    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.util.List selectUserSet, java.util.Set alwaysSelectUserSet, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectUserSet, "selectUserSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alwaysSelectUserSet, "alwaysSelectUserSet");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (z17) {
            linkedHashSet.addAll(selectUserSet);
            linkedHashSet.addAll(alwaysSelectUserSet);
        } else {
            java.util.Iterator it = selectUserSet.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (c01.e2.M(str)) {
                    linkedHashSet.addAll(c01.v1.n(str));
                } else {
                    linkedHashSet.add(str);
                }
            }
            java.util.Iterator it6 = alwaysSelectUserSet.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (c01.e2.M(str2)) {
                    linkedHashSet.addAll(c01.v1.n(str2));
                } else {
                    linkedHashSet.add(str2);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedHashSet, 10));
        java.util.Iterator it7 = linkedHashSet.iterator();
        while (it7.hasNext()) {
            arrayList.add((java.lang.String) it7.next());
        }
        return arrayList;
    }

    public final java.util.List b(java.util.List selectUserSet, java.util.Set alwaysSelectUserSet, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectUserSet, "selectUserSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alwaysSelectUserSet, "alwaysSelectUserSet");
        java.lang.String r17 = c01.z1.r();
        java.util.List a17 = a(selectUserSet, alwaysSelectUserSet, z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : a17) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, r17)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
