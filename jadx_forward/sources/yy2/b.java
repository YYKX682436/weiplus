package yy2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f549973d = 0;

    public b(yy2.c cVar, yy2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f549973d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f549973d;
        this.f549973d = i17 + 1;
        if (i17 == 0) {
            return c92.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
