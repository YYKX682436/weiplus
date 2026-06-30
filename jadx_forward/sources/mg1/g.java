package mg1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407742d = 0;

    public g(mg1.h hVar, mg1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407742d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407742d;
        this.f407742d = i17 + 1;
        if (i17 == 0) {
            return mg1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
