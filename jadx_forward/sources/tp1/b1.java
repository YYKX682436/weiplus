package tp1;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f502564d = 0;

    public b1(tp1.c1 c1Var, tp1.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f502564d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f502564d;
        this.f502564d = i17 + 1;
        if (i17 == 0) {
            return tp1.j2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
