package wf0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f527059d = 0;

    public r(wf0.s sVar, wf0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f527059d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f527059d;
        this.f527059d = i17 + 1;
        if (i17 == 0) {
            return t21.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
