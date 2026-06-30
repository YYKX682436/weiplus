package qz;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f449337d = 0;

    public f(qz.g gVar, qz.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f449337d;
        this.f449337d = i17 + 1;
        if (i17 == 0) {
            return qz.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
