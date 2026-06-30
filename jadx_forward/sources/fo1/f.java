package fo1;

/* loaded from: classes5.dex */
public abstract class f {
    public static final java.lang.Object a(java.util.Collection collection, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) predicate.mo146xb9724478(next)).booleanValue()) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static final boolean b(java.util.Collection collection, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        java.util.Iterator it = collection.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (((java.lang.Boolean) predicate.mo146xb9724478(it.next())).booleanValue()) {
                it.remove();
                z17 = true;
            }
        }
        return z17;
    }

    public static final java.util.Map.Entry c(java.util.Map map, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((java.lang.Boolean) predicate.mo146xb9724478(entry)).booleanValue()) {
                return entry;
            }
        }
        return null;
    }
}
