package ht1;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366337d = 0;

    public v(ht1.w wVar, ht1.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366337d;
        this.f366337d = i17 + 1;
        if (i17 == 0) {
            return ht1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
