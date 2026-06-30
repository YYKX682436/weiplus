package kf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388696d = 0;

    public b(kf0.c cVar, kf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388696d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388696d;
        this.f388696d = i17 + 1;
        if (i17 == 0) {
            return jf0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
