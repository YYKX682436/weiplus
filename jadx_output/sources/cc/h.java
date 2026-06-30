package cc;

/* loaded from: classes14.dex */
public class h extends cc.f0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc.r f40379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cc.r rVar, java.util.Map map) {
        super(map);
        this.f40379e = rVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        java.util.Iterator it = iterator();
        while (true) {
            cc.g gVar = (cc.g) it;
            if (!gVar.hasNext()) {
                return;
            }
            gVar.next();
            gVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection collection) {
        return this.f40374d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        return this == obj || this.f40374d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f40374d.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new cc.g(this, this.f40374d.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        int i17;
        java.util.Collection collection = (java.util.Collection) this.f40374d.remove(obj);
        if (collection != null) {
            i17 = collection.size();
            collection.clear();
            this.f40379e.f40398h -= i17;
        } else {
            i17 = 0;
        }
        return i17 > 0;
    }
}
