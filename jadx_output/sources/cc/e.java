package cc;

/* loaded from: classes14.dex */
public class e extends cc.e0 {

    /* renamed from: f, reason: collision with root package name */
    public final transient java.util.Map f40365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cc.r f40366g;

    public e(cc.r rVar, java.util.Map map) {
        this.f40366g = rVar;
        this.f40365f = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        cc.r rVar = this.f40366g;
        if (this.f40365f == rVar.f40397g) {
            rVar.b();
            return;
        }
        cc.d dVar = new cc.d(this);
        while (dVar.hasNext()) {
            dVar.next();
            dVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        int i17 = cc.h0.f40380a;
        java.util.Map map = this.f40365f;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        return this == obj || this.f40365f.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        int i17 = cc.h0.f40380a;
        java.util.Map map = this.f40365f;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f40366g.c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return this.f40365f.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        cc.r rVar = this.f40366g;
        java.util.Set set = rVar.f40400d;
        if (set != null) {
            return set;
        }
        java.util.Map map = rVar.f40397g;
        java.util.Set kVar = map instanceof java.util.SortedMap ? new cc.k(rVar, (java.util.SortedMap) map) : new cc.h(rVar, map);
        rVar.f40400d = kVar;
        return kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.f40365f.remove(obj);
        if (collection == null) {
            return null;
        }
        cc.r rVar = this.f40366g;
        cc.v vVar = (cc.v) rVar;
        vVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(vVar.f40403i);
        arrayList.addAll(collection);
        rVar.f40398h -= collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f40365f.size();
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
        return this.f40365f.toString();
    }
}
