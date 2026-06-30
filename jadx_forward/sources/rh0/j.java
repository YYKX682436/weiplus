package rh0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477135d = 0;

    public j(rh0.k kVar, rh0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477135d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477135d;
        this.f477135d = i17 + 1;
        if (i17 == 0) {
            return qh0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
