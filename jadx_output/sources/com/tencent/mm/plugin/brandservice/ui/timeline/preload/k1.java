package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes5.dex */
public final class k1 extends java.util.HashMap {
    public k1() {
        put(1, "100463");
        put(3, "100486");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return super.containsKey((java.lang.Integer) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsValue((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (java.lang.String) super.get((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.Integer) ? obj2 : (java.lang.String) super.getOrDefault((java.lang.Integer) obj, (java.lang.String) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (java.lang.String) super.remove((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.Integer) && (obj2 instanceof java.lang.String)) {
            return super.remove((java.lang.Integer) obj, (java.lang.String) obj2);
        }
        return false;
    }
}
