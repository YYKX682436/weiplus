package ry3;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f483049d = 0;

    public c(ry3.d dVar, ry3.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f483049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f483049d;
        this.f483049d = i17 + 1;
        if (i17 == 0) {
            return yz3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
