package ib3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371718d = 0;

    public f(ib3.g gVar, ib3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371718d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371718d;
        this.f371718d = i17 + 1;
        if (i17 == 0) {
            return ib3.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
