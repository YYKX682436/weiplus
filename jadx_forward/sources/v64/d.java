package v64;

/* loaded from: classes4.dex */
public class d implements java.util.Map {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f515072d;

    public d() {
        this.f515072d = new android.util.ArrayMap();
    }

    public java.lang.Object a(java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        try {
            java.lang.Object obj2 = ((android.util.ArrayMap) this.f515072d).get(str);
            if (obj2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
                return obj2;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("opt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return obj;
    }

    public java.lang.Object b(java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (str == null || obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return null;
        }
        java.lang.Object put = ((android.util.ArrayMap) this.f515072d).put(str, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return put;
    }

    @Override // java.util.Map
    public void clear() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        ((android.util.ArrayMap) this.f515072d).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean z17 = false;
        if (!(obj instanceof java.lang.String)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return false;
        }
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (str != null) {
            z17 = ((android.util.ArrayMap) this.f515072d).containsKey(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("existKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("containsKey", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return z17;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("containsValue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean containsValue = ((android.util.ArrayMap) this.f515072d).containsValue(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("containsValue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return containsValue;
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("entrySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.util.Set entrySet = ((android.util.ArrayMap) this.f515072d).entrySet();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("entrySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return entrySet;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (!(obj instanceof java.lang.String)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
            return null;
        }
        java.lang.Object obj2 = ((android.util.ArrayMap) this.f515072d).get(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return obj2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEmpty", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        boolean isEmpty = ((android.util.ArrayMap) this.f515072d).isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEmpty", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return isEmpty;
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("keySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.util.Set keySet = ((android.util.ArrayMap) this.f515072d).keySet();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("keySet", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return keySet;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.lang.Object b17 = b((java.lang.String) obj, obj2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("put", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return b17;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putAll", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (a84.b0.f(map)) {
            ((android.util.ArrayMap) this.f515072d).putAll(map);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putAll", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("remove", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        if (obj instanceof java.lang.String) {
            ((android.util.ArrayMap) this.f515072d).remove(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("remove", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return null;
    }

    @Override // java.util.Map
    public int size() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("size", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        int size = ((android.util.ArrayMap) this.f515072d).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("size", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return size;
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        java.util.Collection values = ((android.util.ArrayMap) this.f515072d).values();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.plugin.sns.ad.timeline.clicker.ObjectMap");
        return values;
    }

    public d(java.lang.String str, java.lang.Object obj) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        this.f515072d = arrayMap;
        arrayMap.put(str, obj);
    }
}
