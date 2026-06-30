package bi4;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f102539d = 0;

    public a0(bi4.b0 b0Var, bi4.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102539d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f102539d;
        this.f102539d = i17 + 1;
        if (i17 == 0) {
            return qj4.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
