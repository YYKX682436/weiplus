package vz;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523098d = 0;

    public v(vz.w wVar, vz.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523098d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523098d;
        this.f523098d = i17 + 1;
        if (i17 == 0) {
            return uz.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
