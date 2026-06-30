package c00;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118559d = 0;

    public v(c00.w wVar, c00.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118559d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118559d;
        this.f118559d = i17 + 1;
        if (i17 == 0) {
            return j00.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
