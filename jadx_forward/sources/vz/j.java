package vz;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523080d = 0;

    public j(vz.k kVar, vz.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523080d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523080d;
        this.f523080d = i17 + 1;
        if (i17 == 0) {
            return uz.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
