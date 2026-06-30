package cc;

/* loaded from: classes14.dex */
public abstract class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f40387d;

    public l0(java.util.Iterator it) {
        it.getClass();
        this.f40387d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40387d.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return ((cc.z) this).f40407e.apply(this.f40387d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40387d.remove();
    }
}
