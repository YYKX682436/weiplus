package t65;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f497551d = 0;

    public b(t65.c cVar, t65.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f497551d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f497551d;
        this.f497551d = i17 + 1;
        if (i17 == 0) {
            return k04.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
