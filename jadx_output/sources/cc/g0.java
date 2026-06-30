package cc;

/* loaded from: classes14.dex */
public final class g0 extends java.util.AbstractCollection {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f40378d;

    public g0(java.util.Map map) {
        map.getClass();
        this.f40378d = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f40378d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f40378d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f40378d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.f40378d.entrySet().iterator();
        int i17 = cc.h0.f40380a;
        return new cc.z(it, cc.c0.f40361d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        boolean z17;
        java.util.Map.Entry entry;
        try {
            return super.remove(obj);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.Map map = this.f40378d;
            java.util.Iterator it = map.entrySet().iterator();
            do {
                z17 = false;
                if (!it.hasNext()) {
                    return false;
                }
                entry = (java.util.Map.Entry) it.next();
                java.lang.Object value = entry.getValue();
                if (obj == value || (obj != null && obj.equals(value))) {
                    z17 = true;
                }
            } while (!z17);
            map.remove(entry.getKey());
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Map map = this.f40378d;
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Map map = this.f40378d;
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f40378d.size();
    }
}
