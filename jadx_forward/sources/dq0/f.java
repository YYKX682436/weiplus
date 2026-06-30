package dq0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323843d = 0;

    public f(dq0.g gVar, dq0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323843d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323843d;
        this.f323843d = i17 + 1;
        if (i17 == 0) {
            return dq0.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
