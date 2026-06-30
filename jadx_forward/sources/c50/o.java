package c50;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120147d = 0;

    public o(c50.p pVar, c50.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120147d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120147d;
        this.f120147d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.j5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
