package yg0;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543799d = 0;

    public t(yg0.u uVar, yg0.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543799d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543799d;
        this.f543799d = i17 + 1;
        if (i17 == 0) {
            return yg0.y2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
