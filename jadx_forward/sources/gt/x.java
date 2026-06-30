package gt;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356873d = 0;

    public x(gt.y yVar, gt.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356873d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356873d;
        this.f356873d = i17 + 1;
        if (i17 == 0) {
            return gt.s3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
