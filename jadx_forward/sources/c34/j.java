package c34;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119737d = 0;

    public j(c34.k kVar, c34.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119737d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119737d;
        this.f119737d = i17 + 1;
        if (i17 == 0) {
            return c34.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
