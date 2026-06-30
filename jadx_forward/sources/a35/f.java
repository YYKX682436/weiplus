package a35;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82605d = 0;

    public f(a35.g gVar, a35.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82605d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82605d;
        this.f82605d = i17 + 1;
        if (i17 == 0) {
            return a35.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
