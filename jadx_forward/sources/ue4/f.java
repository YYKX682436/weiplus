package ue4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f508441d = 0;

    public f(ue4.g gVar, ue4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f508441d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f508441d;
        this.f508441d = i17 + 1;
        if (i17 == 0) {
            return ue4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
