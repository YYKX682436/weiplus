package c60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38866d = 0;

    public b(c60.c cVar, c60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38866d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38866d;
        this.f38866d = i17 + 1;
        if (i17 == 0) {
            return a60.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
