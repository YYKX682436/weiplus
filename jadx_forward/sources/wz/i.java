package wz;

/* loaded from: classes.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532221d = 0;

    public i(wz.j jVar, wz.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532221d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532221d;
        this.f532221d = i17 + 1;
        if (i17 == 0) {
            return wz.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
