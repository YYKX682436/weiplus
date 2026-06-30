package va;

/* loaded from: classes16.dex */
public final class k extends va.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va.z f515725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(va.z zVar) {
        super(null);
        this.f515725d = zVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f515725d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f515725d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f515725d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new va.j(this.f515725d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        return this.f515725d.remove(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f515725d.size();
    }
}
