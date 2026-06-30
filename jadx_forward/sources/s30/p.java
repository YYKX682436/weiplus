package s30;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f483942d = 0;

    public p(s30.q qVar, s30.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f483942d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f483942d;
        this.f483942d = i17 + 1;
        if (i17 == 0) {
            return s30.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
