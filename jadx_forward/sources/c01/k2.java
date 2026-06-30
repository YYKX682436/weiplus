package c01;

/* loaded from: classes7.dex */
public class k2 extends java.util.concurrent.ConcurrentHashMap {
    public k2(c01.j2 j2Var) {
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return super.get(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return null;
        }
        return obj2 == null ? super.remove(obj) : super.put(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return super.remove(obj);
    }
}
