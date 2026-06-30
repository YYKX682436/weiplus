package bt;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105611d = 0;

    public g(bt.h hVar, bt.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105611d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105611d;
        this.f105611d = i17 + 1;
        if (i17 == 0) {
            return bt.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
