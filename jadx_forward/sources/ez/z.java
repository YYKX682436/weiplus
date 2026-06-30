package ez;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339318d = 0;

    public z(ez.a0 a0Var, ez.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339318d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339318d;
        this.f339318d = i17 + 1;
        if (i17 == 0) {
            return ez.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
