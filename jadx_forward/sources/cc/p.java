package cc;

/* loaded from: classes14.dex */
public final class p extends cc.m implements java.util.Set {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cc.r f121928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cc.r rVar, java.lang.Object obj, java.util.Set set) {
        super(rVar, obj, set, null);
        this.f121928i = rVar;
    }

    @Override // cc.m, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a17 = bc.b.a((java.util.Set) this.f121922e, collection);
        if (a17) {
            this.f121928i.f121931h += this.f121922e.size() - size;
            g();
        }
        return a17;
    }
}
