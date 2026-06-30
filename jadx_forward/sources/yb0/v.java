package yb0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f542178d = 0;

    public v(yb0.w wVar, yb0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f542178d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f542178d;
        this.f542178d = i17 + 1;
        if (i17 == 0) {
            return yb0.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
