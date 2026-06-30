package cc;

/* loaded from: classes14.dex */
public final class k extends cc.h implements java.util.SortedSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cc.r f40383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cc.r rVar, java.util.SortedMap sortedMap) {
        super(rVar, sortedMap);
        this.f40383f = rVar;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return ((java.util.SortedMap) this.f40374d).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return ((java.util.SortedMap) this.f40374d).firstKey();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return new cc.k(this.f40383f, ((java.util.SortedMap) this.f40374d).headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return ((java.util.SortedMap) this.f40374d).lastKey();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new cc.k(this.f40383f, ((java.util.SortedMap) this.f40374d).subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return new cc.k(this.f40383f, ((java.util.SortedMap) this.f40374d).tailMap(obj));
    }
}
