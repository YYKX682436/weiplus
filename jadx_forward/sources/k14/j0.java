package k14;

/* loaded from: classes5.dex */
public abstract class j0 {
    public static final java.util.List a(java.util.List authItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authItems, "authItems");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = authItems.iterator();
        while (it.hasNext()) {
            r45.pv6 pv6Var = (r45.pv6) it.next();
            java.lang.String str = pv6Var.f464954e;
            if ((str == null || str.length() == 0) || hashSet.contains(pv6Var.f464954e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsAuthUtils", "filterAuthScopeList scope_desc exist and ignore: " + pv6Var.f464953d + ", " + pv6Var.f464954e);
            } else {
                hashSet.add(pv6Var.f464954e);
                arrayList.add(pv6Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthUtils", "filterAuthScopeList final size: " + arrayList.size() + ", origin size: " + authItems.size());
        return arrayList;
    }
}
