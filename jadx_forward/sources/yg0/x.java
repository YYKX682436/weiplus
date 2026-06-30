package yg0;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543826d = 0;

    public x(yg0.y yVar, yg0.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543826d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543826d;
        this.f543826d = i17 + 1;
        if (i17 == 0) {
            return yg0.b3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
