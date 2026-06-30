package dh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f313942d = 0;

    public f(dh0.g gVar, dh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f313942d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f313942d;
        this.f313942d = i17 + 1;
        if (i17 == 0) {
            return dh0.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
