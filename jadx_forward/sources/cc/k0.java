package cc;

/* loaded from: classes14.dex */
public abstract class k0 extends java.util.AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        return bc.b.a(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
