package z7;

/* loaded from: classes16.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f551999d;

    public b(z7.c cVar, java.util.Iterator it) {
        this.f551999d = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551999d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (z7.l) this.f551999d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
