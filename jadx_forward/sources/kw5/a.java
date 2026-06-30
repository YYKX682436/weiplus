package kw5;

/* loaded from: classes8.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final synchronized kw5.b a(java.lang.String bizName, java.lang.String instanceKey) {
        kw5.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceKey, "instanceKey");
        java.lang.String concat = bizName.concat(instanceKey);
        java.util.Map map = kw5.b.f394748c;
        bVar = (kw5.b) ((java.util.LinkedHashMap) map).get(concat);
        if (bVar == null) {
            bVar = new kw5.b(bizName, instanceKey, null);
            map.put(concat, bVar);
        }
        return bVar;
    }
}
