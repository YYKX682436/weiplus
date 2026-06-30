package zs3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556794d = 0;

    public b(zs3.c cVar, zs3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556794d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556794d;
        this.f556794d = i17 + 1;
        if (i17 == 0) {
            return ys3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
