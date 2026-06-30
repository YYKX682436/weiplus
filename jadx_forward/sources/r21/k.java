package r21;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450324d = 0;

    public k(r21.l lVar, r21.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450324d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450324d;
        this.f450324d = i17 + 1;
        if (i17 == 0) {
            return r21.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
