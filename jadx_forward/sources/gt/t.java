package gt;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356846d = 0;

    public t(gt.u uVar, gt.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356846d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356846d;
        this.f356846d = i17 + 1;
        if (i17 == 0) {
            return gt.p3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
