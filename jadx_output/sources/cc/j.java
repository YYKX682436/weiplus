package cc;

/* loaded from: classes14.dex */
public final class j extends cc.e implements java.util.SortedMap {

    /* renamed from: h, reason: collision with root package name */
    public java.util.SortedSet f40381h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cc.r f40382i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cc.r rVar, java.util.SortedMap sortedMap) {
        super(rVar, sortedMap);
        this.f40382i = rVar;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return ((java.util.SortedMap) this.f40365f).comparator();
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return ((java.util.SortedMap) this.f40365f).firstKey();
    }

    @Override // java.util.SortedMap
    public final java.util.SortedMap headMap(java.lang.Object obj) {
        return new cc.j(this.f40382i, ((java.util.SortedMap) this.f40365f).headMap(obj));
    }

    @Override // cc.e, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.SortedSet sortedSet = this.f40381h;
        if (sortedSet != null) {
            return sortedSet;
        }
        cc.k kVar = new cc.k(this.f40382i, (java.util.SortedMap) this.f40365f);
        this.f40381h = kVar;
        return kVar;
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return ((java.util.SortedMap) this.f40365f).lastKey();
    }

    @Override // java.util.SortedMap
    public final java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new cc.j(this.f40382i, ((java.util.SortedMap) this.f40365f).subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final java.util.SortedMap tailMap(java.lang.Object obj) {
        return new cc.j(this.f40382i, ((java.util.SortedMap) this.f40365f).tailMap(obj));
    }
}
