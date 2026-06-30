package nv;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421923d = 0;

    public t(nv.u uVar, nv.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421923d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421923d;
        this.f421923d = i17 + 1;
        if (i17 == 0) {
            return nv.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
