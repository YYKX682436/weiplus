package ft;

/* loaded from: classes6.dex */
public class g2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347921d = 0;

    public g2(ft.h2 h2Var, ft.f2 f2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347921d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347921d;
        this.f347921d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2818xd0d82df3.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
