package cc;

/* loaded from: classes14.dex */
public abstract class f0 extends cc.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f40374d;

    public f0(java.util.Map map) {
        map.getClass();
        this.f40374d = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f40374d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f40374d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f40374d.size();
    }
}
