package c35;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119787d = 0;

    public j(c35.k kVar, c35.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119787d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119787d;
        this.f119787d = i17 + 1;
        if (i17 == 0) {
            return vf0.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
