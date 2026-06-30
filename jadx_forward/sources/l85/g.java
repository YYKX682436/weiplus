package l85;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398704d = 0;

    public g(l85.h hVar, l85.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398704d;
        this.f398704d = i17 + 1;
        if (i17 == 0) {
            return l85.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
