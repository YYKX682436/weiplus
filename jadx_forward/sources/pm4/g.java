package pm4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f438414d = 0;

    public g(pm4.h hVar, pm4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f438414d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f438414d;
        this.f438414d = i17 + 1;
        if (i17 == 0) {
            return lf0.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
