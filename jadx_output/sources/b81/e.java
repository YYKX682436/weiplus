package b81;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18301d = 0;

    public e(b81.f fVar, b81.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18301d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18301d;
        this.f18301d = i17 + 1;
        if (i17 == 0) {
            return b81.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
