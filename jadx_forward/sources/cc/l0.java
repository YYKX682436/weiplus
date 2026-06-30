package cc;

/* loaded from: classes14.dex */
public abstract class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f121920d;

    public l0(java.util.Iterator it) {
        it.getClass();
        this.f121920d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f121920d.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return ((cc.z) this).f121940e.mo10153x58b836e(this.f121920d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f121920d.remove();
    }
}
