package zg0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554326d = 0;

    public v(zg0.w wVar, zg0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554326d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554326d;
        this.f554326d = i17 + 1;
        if (i17 == 0) {
            return zx4.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
