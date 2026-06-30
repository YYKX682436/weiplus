package xv;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f538899d = 0;

    public v(xv.w wVar, xv.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f538899d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f538899d;
        this.f538899d = i17 + 1;
        if (i17 == 0) {
            return wv.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
