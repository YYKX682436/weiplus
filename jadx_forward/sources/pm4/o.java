package pm4;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f438420d = 0;

    public o(pm4.p pVar, pm4.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f438420d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f438420d;
        this.f438420d = i17 + 1;
        if (i17 == 0) {
            return wm4.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
