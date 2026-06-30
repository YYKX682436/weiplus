package zy2;

/* loaded from: classes6.dex */
public class c4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f558899d = 0;

    public c4(zy2.d4 d4Var, zy2.b4 b4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558899d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f558899d;
        this.f558899d = i17 + 1;
        if (i17 == 0) {
            return du2.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
