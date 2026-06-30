package a02;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f81909d = 0;

    public c(a02.d dVar, a02.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81909d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f81909d;
        this.f81909d = i17 + 1;
        if (i17 == 0) {
            return a02.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
