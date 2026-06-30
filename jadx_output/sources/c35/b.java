package c35;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38248d = 0;

    public b(c35.c cVar, c35.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38248d;
        this.f38248d = i17 + 1;
        if (i17 == 0) {
            return vf0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
