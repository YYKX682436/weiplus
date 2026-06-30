package a46;

/* loaded from: classes13.dex */
public final /* synthetic */ class c$$a implements java.security.PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        a46.c cVar = a46.c.f1355b;
        java.util.Iterator it = ((java.util.HashSet) cVar.c()).iterator();
        while (it.hasNext()) {
            treeMap.put(((java.lang.String) it.next()).toUpperCase(java.util.Locale.ROOT), cVar);
        }
        r46.j jVar = new r46.j(a46.d.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (jVar.hasNext()) {
            arrayList.add(jVar.next());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            a46.c cVar2 = (a46.c) ((a46.d) it6.next());
            java.util.Iterator it7 = ((java.util.HashSet) cVar2.c()).iterator();
            while (it7.hasNext()) {
                treeMap.put(((java.lang.String) it7.next()).toUpperCase(java.util.Locale.ROOT), cVar2);
            }
        }
        return treeMap;
    }
}
