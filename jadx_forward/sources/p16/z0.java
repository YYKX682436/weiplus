package p16;

/* loaded from: classes14.dex */
public class z0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f432905d;

    public z0(p16.a1 a1Var) {
        this.f432905d = a1Var.f432802d.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432905d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (java.lang.String) this.f432905d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
