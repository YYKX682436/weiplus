package w21;

/* loaded from: classes.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523902d = 0;

    public g(w21.h hVar, w21.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523902d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523902d;
        this.f523902d = i17 + 1;
        if (i17 == 0) {
            return w21.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
