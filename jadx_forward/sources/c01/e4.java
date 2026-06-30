package c01;

/* loaded from: classes6.dex */
public class e4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118668d = 0;

    public e4(c01.f4 f4Var, c01.d4 d4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118668d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118668d;
        this.f118668d = i17 + 1;
        if (i17 == 0) {
            return gm0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
