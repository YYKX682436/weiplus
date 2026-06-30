package bc;

/* loaded from: classes13.dex */
public abstract class b {
    public static boolean a(java.util.Set set, java.util.Collection collection) {
        boolean z17;
        collection.getClass();
        if (collection instanceof cc.j0) {
            collection = ((cc.j0) collection).C();
        }
        boolean z18 = false;
        if (!(collection instanceof java.util.Set) || collection.size() <= set.size()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                z18 |= set.remove(it.next());
            }
            return z18;
        }
        java.util.Iterator it6 = set.iterator();
        java.util.Collection collection2 = collection;
        boolean z19 = false;
        while (it6.hasNext()) {
            try {
                z17 = collection2.contains(it6.next());
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                z17 = false;
            }
            if (z17) {
                it6.remove();
                z19 = true;
            }
        }
        return z19;
    }
}
