package aq5;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13220d = 0;

    public c(aq5.d dVar, aq5.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13220d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13220d;
        this.f13220d = i17 + 1;
        if (i17 == 0) {
            return aq5.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
