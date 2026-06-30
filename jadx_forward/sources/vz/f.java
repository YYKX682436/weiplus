package vz;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523074d = 0;

    public f(vz.g gVar, vz.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523074d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523074d;
        this.f523074d = i17 + 1;
        if (i17 == 0) {
            return uz.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
