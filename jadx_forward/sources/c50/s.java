package c50;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120150d = 0;

    public s(c50.t tVar, c50.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120150d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120150d;
        this.f120150d = i17 + 1;
        if (i17 == 0) {
            return pg2.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
