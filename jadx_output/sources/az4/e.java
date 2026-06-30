package az4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f16176d = 0;

    public e(az4.f fVar, az4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16176d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f16176d;
        this.f16176d = i17 + 1;
        if (i17 == 0) {
            return az4.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
