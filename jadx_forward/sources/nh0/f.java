package nh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418607d = 0;

    public f(nh0.g gVar, nh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418607d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418607d;
        this.f418607d = i17 + 1;
        if (i17 == 0) {
            return nh0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
