package o05;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423453d = 0;

    public b(o05.c cVar, o05.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423453d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423453d;
        this.f423453d = i17 + 1;
        if (i17 == 0) {
            return kw3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
