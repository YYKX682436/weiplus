package uy0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513431d = 0;

    public c(uy0.d dVar, uy0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513431d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513431d;
        this.f513431d = i17 + 1;
        if (i17 == 0) {
            return ez0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
