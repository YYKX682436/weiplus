package fe0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342922d = 0;

    public g(fe0.h hVar, fe0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342922d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342922d;
        this.f342922d = i17 + 1;
        if (i17 == 0) {
            return ee0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
