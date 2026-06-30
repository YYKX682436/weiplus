package t70;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f497559d = 0;

    public b(t70.c cVar, t70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f497559d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f497559d;
        this.f497559d = i17 + 1;
        if (i17 == 0) {
            return t70.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
