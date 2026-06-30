package oe0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426204d = 0;

    public f(oe0.g gVar, oe0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426204d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426204d;
        this.f426204d = i17 + 1;
        if (i17 == 0) {
            return ne0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
