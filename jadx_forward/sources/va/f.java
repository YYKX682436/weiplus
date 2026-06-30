package va;

/* loaded from: classes16.dex */
public final class f extends va.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va.z f515716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(va.z zVar) {
        super(null);
        this.f515716d = zVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f515716d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        va.z zVar;
        java.lang.Object obj2;
        return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && (obj2 = (zVar = this.f515716d).get(key)) != null && zVar.f515749i.c().h().c(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f515716d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new va.e(this.f515716d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && this.f515716d.remove(key, entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f515716d.size();
    }
}
