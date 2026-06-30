package j14;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f378713d = 0;

    public b(j14.c cVar, j14.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f378713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f378713d;
        this.f378713d = i17 + 1;
        if (i17 == 0) {
            return j14.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
