package ee0;

/* loaded from: classes6.dex */
public class c2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332962d = 0;

    public c2(ee0.d2 d2Var, ee0.b2 b2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332962d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332962d;
        this.f332962d = i17 + 1;
        if (i17 == 0) {
            return ee0.i4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
