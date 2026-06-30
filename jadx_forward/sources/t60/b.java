package t60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f497510d = 0;

    public b(t60.c cVar, t60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f497510d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f497510d;
        this.f497510d = i17 + 1;
        if (i17 == 0) {
            return t60.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
