package i95;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371335d = 0;

    public j(i95.k kVar, i95.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371335d < 4;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371335d;
        this.f371335d = i17 + 1;
        if (i17 == 0) {
            return c61.o7.INSTANCE;
        }
        if (i17 == 1) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.x4.INSTANCE;
        }
        if (i17 == 2) {
            return wo2.m.INSTANCE;
        }
        if (i17 == 3) {
            return q92.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 4");
    }
}
