package cc;

/* loaded from: classes14.dex */
public final class p extends cc.m implements java.util.Set {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cc.r f40395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cc.r rVar, java.lang.Object obj, java.util.Set set) {
        super(rVar, obj, set, null);
        this.f40395i = rVar;
    }

    @Override // cc.m, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a17 = bc.b.a((java.util.Set) this.f40389e, collection);
        if (a17) {
            this.f40395i.f40398h += this.f40389e.size() - size;
            g();
        }
        return a17;
    }
}
