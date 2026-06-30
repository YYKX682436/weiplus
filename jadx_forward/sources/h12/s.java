package h12;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359640d = 0;

    public s(h12.t tVar, h12.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359640d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359640d;
        this.f359640d = i17 + 1;
        if (i17 == 0) {
            return h12.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
