package cc;

/* loaded from: classes14.dex */
public abstract class r extends cc.u implements java.io.Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final transient java.util.Map f40397g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f40398h;

    public r(java.util.Map map) {
        if (!map.isEmpty()) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f40397g = map;
    }

    public void b() {
        java.util.Map map = this.f40397g;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        map.clear();
        this.f40398h = 0;
    }

    public final java.util.Collection c(java.lang.Object obj, java.util.Collection collection) {
        if (collection instanceof java.util.SortedSet) {
            return new cc.q(this, obj, (java.util.SortedSet) collection, null);
        }
        if (collection instanceof java.util.Set) {
            return new cc.p(this, obj, (java.util.Set) collection);
        }
        if (!(collection instanceof java.util.List)) {
            return new cc.m(this, obj, collection, null);
        }
        java.util.List list = (java.util.List) collection;
        return list instanceof java.util.RandomAccess ? new cc.i(this, obj, list, null) : new cc.o(this, obj, list, null);
    }
}
