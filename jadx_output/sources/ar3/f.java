package ar3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13387d = 0;

    public f(ar3.g gVar, ar3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13387d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13387d;
        this.f13387d = i17 + 1;
        if (i17 == 0) {
            return ar3.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
