package a12;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82045d = 0;

    public g(a12.h hVar, a12.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82045d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82045d;
        this.f82045d = i17 + 1;
        if (i17 == 0) {
            return a12.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
