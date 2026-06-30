package ys3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f546738d = 0;

    public f(ys3.g gVar, ys3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f546738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f546738d;
        this.f546738d = i17 + 1;
        if (i17 == 0) {
            return ys3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
