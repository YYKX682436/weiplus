package kc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387797d = 0;

    public b(kc0.c cVar, kc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387797d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387797d;
        this.f387797d = i17 + 1;
        if (i17 == 0) {
            return jc0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
