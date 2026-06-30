package i53;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f370054d = 0;

    public b(i53.c cVar, i53.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f370054d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f370054d;
        this.f370054d = i17 + 1;
        if (i17 == 0) {
            return i53.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
