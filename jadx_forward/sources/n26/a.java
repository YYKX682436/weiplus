package n26;

/* loaded from: classes16.dex */
public abstract class a {
    public static final java.util.Collection a(java.util.Collection collection, java.util.Collection collection2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof java.util.LinkedHashSet) {
            ((java.util.LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final o26.q b(java.lang.Iterable scopes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopes, "scopes");
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : scopes) {
            y16.s sVar = (y16.s) obj;
            if ((sVar == null || sVar == y16.r.f540506b) ? false : true) {
                qVar.add(obj);
            }
        }
        return qVar;
    }
}
