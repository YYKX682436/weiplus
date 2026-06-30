package cc;

/* loaded from: classes14.dex */
public final class q extends cc.m implements java.util.SortedSet {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cc.r f40396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cc.r rVar, java.lang.Object obj, java.util.SortedSet sortedSet, cc.m mVar) {
        super(rVar, obj, sortedSet, mVar);
        this.f40396i = rVar;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return ((java.util.SortedSet) this.f40389e).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        e();
        return ((java.util.SortedSet) this.f40389e).first();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        e();
        java.util.SortedSet headSet = ((java.util.SortedSet) this.f40389e).headSet(obj);
        cc.m mVar = this.f40390f;
        if (mVar == null) {
            mVar = this;
        }
        return new cc.q(this.f40396i, this.f40388d, headSet, mVar);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        e();
        return ((java.util.SortedSet) this.f40389e).last();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        e();
        java.util.SortedSet subSet = ((java.util.SortedSet) this.f40389e).subSet(obj, obj2);
        cc.m mVar = this.f40390f;
        if (mVar == null) {
            mVar = this;
        }
        return new cc.q(this.f40396i, this.f40388d, subSet, mVar);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        e();
        java.util.SortedSet tailSet = ((java.util.SortedSet) this.f40389e).tailSet(obj);
        cc.m mVar = this.f40390f;
        if (mVar == null) {
            mVar = this;
        }
        return new cc.q(this.f40396i, this.f40388d, tailSet, mVar);
    }
}
