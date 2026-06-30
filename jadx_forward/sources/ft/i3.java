package ft;

/* loaded from: classes6.dex */
public class i3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347929d = 0;

    public i3(ft.j3 j3Var, ft.h3 h3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347929d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347929d;
        this.f347929d = i17 + 1;
        if (i17 == 0) {
            return et.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
