package cc;

/* loaded from: classes14.dex */
public abstract class d0 extends cc.k0 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        ((cc.c) this).f121893d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(java.lang.Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return ((cc.c) this).f121893d.isEmpty();
    }

    @Override // cc.k0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return bc.b.a(this, collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.Iterator it = collection.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                z17 |= ((cc.c) this).remove(it.next());
            }
            return z17;
        }
    }

    @Override // cc.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        int i17;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            int size = collection.size();
            int i18 = cc.h0.f121913a;
            if (size >= 3) {
                i17 = size < 1073741824 ? size + (size / 3) : Integer.MAX_VALUE;
            } else {
                if (size < 0) {
                    throw new java.lang.IllegalArgumentException("expectedSize cannot be negative but was: " + size);
                }
                i17 = size + 1;
            }
            java.util.HashSet hashSet = new java.util.HashSet(i17);
            for (java.lang.Object obj : collection) {
                if (contains(obj)) {
                    hashSet.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return ((cc.c) this).f121893d.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return ((cc.c) this).f121893d.size();
    }
}
