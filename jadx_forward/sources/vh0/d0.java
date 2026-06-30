package vh0;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518381d = 0;

    public d0(vh0.e0 e0Var, vh0.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518381d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518381d;
        this.f518381d = i17 + 1;
        if (i17 == 0) {
            return vh0.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
