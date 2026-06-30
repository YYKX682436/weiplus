package kt;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393429d = 0;

    public v(kt.w wVar, kt.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393429d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393429d;
        this.f393429d = i17 + 1;
        if (i17 == 0) {
            return kt.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
