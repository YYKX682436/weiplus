package ft;

/* loaded from: classes6.dex */
public class e3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347917d = 0;

    public e3(ft.f3 f3Var, ft.d3 d3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347917d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347917d;
        this.f347917d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p874xaefb6cc9.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
