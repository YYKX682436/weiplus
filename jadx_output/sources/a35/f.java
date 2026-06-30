package a35;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f1072d = 0;

    public f(a35.g gVar, a35.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f1072d;
        this.f1072d = i17 + 1;
        if (i17 == 0) {
            return a35.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
