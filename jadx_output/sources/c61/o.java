package c61;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39192d = 0;

    public o(c61.p pVar, c61.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39192d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39192d;
        this.f39192d = i17 + 1;
        if (i17 == 0) {
            return c61.o7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
