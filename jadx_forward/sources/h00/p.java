package h00;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359361d = 0;

    public p(h00.q qVar, h00.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359361d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359361d;
        this.f359361d = i17 + 1;
        if (i17 == 0) {
            return h00.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
