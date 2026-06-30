package kl3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f390362d = 0;

    public b(kl3.c cVar, kl3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f390362d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f390362d;
        this.f390362d = i17 + 1;
        if (i17 == 0) {
            return kl3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
