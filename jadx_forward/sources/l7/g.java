package l7;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f398322a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f398323b = new java.util.HashMap();

    public final synchronized java.util.List a(java.lang.String str) {
        java.util.List list;
        if (!((java.util.ArrayList) this.f398322a).contains(str)) {
            ((java.util.ArrayList) this.f398322a).add(str);
        }
        list = (java.util.List) ((java.util.HashMap) this.f398323b).get(str);
        if (list == null) {
            list = new java.util.ArrayList();
            ((java.util.HashMap) this.f398323b).put(str, list);
        }
        return list;
    }

    public synchronized java.util.List b(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f398322a).iterator();
        while (it.hasNext()) {
            java.util.List<l7.f> list = (java.util.List) ((java.util.HashMap) this.f398323b).get((java.lang.String) it.next());
            if (list != null) {
                for (l7.f fVar : list) {
                    if ((fVar.f398319a.isAssignableFrom(cls) && cls2.isAssignableFrom(fVar.f398320b)) && !arrayList.contains(fVar.f398320b)) {
                        arrayList.add(fVar.f398320b);
                    }
                }
            }
        }
        return arrayList;
    }
}
