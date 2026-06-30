package lm;

/* loaded from: classes9.dex */
public final class o extends java.util.LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.lang.Float) {
            return super.containsValue((java.lang.Float) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.Float) super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : (java.lang.Float) super.getOrDefault((java.lang.String) obj, (java.lang.Float) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Float f17 = (java.lang.Float) super.put(key, java.lang.Float.valueOf(floatValue));
        while (super.size() > 512) {
            java.util.Set keySet = super.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
            java.lang.String str = (java.lang.String) kz5.n0.Y(keySet);
            if (str != null) {
                remove(str);
            }
        }
        return f17;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.Float) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.Float)) {
            return super.remove((java.lang.String) obj, (java.lang.Float) obj2);
        }
        return false;
    }
}
