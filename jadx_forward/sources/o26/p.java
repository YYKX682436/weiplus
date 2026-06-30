package o26;

/* loaded from: classes16.dex */
public abstract class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f424141d;

    public p(o26.m mVar) {
    }

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f424141d;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f424141d) {
            throw new java.util.NoSuchElementException();
        }
        this.f424141d = true;
        a();
        return ((o26.o) this).f424140f.f424143e;
    }
}
