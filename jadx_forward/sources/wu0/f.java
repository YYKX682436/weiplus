package wu0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f531193a = new java.util.concurrent.ConcurrentHashMap();

    public final java.util.List a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        r45.ne4 ne4Var;
        java.util.Collection values = this.f531193a.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        jz5.l lVar = new jz5.l(java.lang.Boolean.TRUE, new java.util.ArrayList());
        java.util.Iterator it = values.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj = lVar.f384367e;
            obj2 = lVar.f384366d;
            if (!hasNext) {
                break;
            }
            wu0.e eVar = (wu0.e) it.next();
            java.util.List list = (java.util.List) obj;
            boolean z17 = ((java.lang.Boolean) obj2).booleanValue() && eVar.f531192c;
            if (eVar.f531192c && (ne4Var = eVar.f531191b) != null) {
                list.add(ne4Var);
            }
            lVar = new jz5.l(java.lang.Boolean.valueOf(z17), list);
        }
        if (((java.lang.Boolean) obj2).booleanValue()) {
            return (java.util.List) obj;
        }
        return null;
    }

    public final void b(java.lang.String groupID, r45.ne4 ne4Var, boolean z17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupID, "groupID");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f531193a;
        wu0.e eVar = (wu0.e) concurrentHashMap.get(groupID);
        if (eVar != null) {
            ru0.h uniqueHexKey = eVar.f531190a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueHexKey, "uniqueHexKey");
            wu0.e eVar2 = new wu0.e(uniqueHexKey, ne4Var, z17);
            concurrentHashMap.put(groupID, eVar2);
            if (lVar != null) {
                lVar.mo146xb9724478(eVar2.f531190a);
            }
        }
    }
}
