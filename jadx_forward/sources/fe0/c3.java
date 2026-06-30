package fe0;

/* loaded from: classes6.dex */
public class c3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342913d = 0;

    public c3(fe0.d3 d3Var, fe0.b3 b3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342913d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342913d;
        this.f342913d = i17 + 1;
        if (i17 == 0) {
            return ee0.y4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
