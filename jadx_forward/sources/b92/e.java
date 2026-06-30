package b92;

/* loaded from: classes.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99948d = 0;

    public e(b92.f fVar, b92.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99948d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99948d;
        this.f99948d = i17 + 1;
        if (i17 == 0) {
            return b92.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
