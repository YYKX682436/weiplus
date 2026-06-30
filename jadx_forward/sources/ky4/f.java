package ky4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f395155d = 0;

    public f(ky4.g gVar, ky4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395155d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395155d;
        this.f395155d = i17 + 1;
        if (i17 == 0) {
            return ky4.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
