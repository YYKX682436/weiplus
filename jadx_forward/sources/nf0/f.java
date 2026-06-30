package nf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418153d = 0;

    public f(nf0.g gVar, nf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418153d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418153d;
        this.f418153d = i17 + 1;
        if (i17 == 0) {
            return nf0.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
