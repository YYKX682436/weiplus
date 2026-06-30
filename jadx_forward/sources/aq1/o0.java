package aq1;

/* loaded from: classes9.dex */
public final class o0 extends java.util.LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return super.containsKey((java.lang.Long) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof jz5.l) {
            return super.containsValue((jz5.l) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (jz5.l) super.get((java.lang.Long) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.Long) ? obj2 : (jz5.l) super.getOrDefault((java.lang.Long) obj, (jz5.l) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (jz5.l) super.remove((java.lang.Long) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        return super.size() > 3;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.Long) && (obj2 instanceof jz5.l)) {
            return super.remove((java.lang.Long) obj, (jz5.l) obj2);
        }
        return false;
    }
}
