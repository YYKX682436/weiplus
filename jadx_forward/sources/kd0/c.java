package kd0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388148d = 0;

    public c(kd0.d dVar, kd0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388148d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388148d;
        this.f388148d = i17 + 1;
        if (i17 == 0) {
            return jd0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
