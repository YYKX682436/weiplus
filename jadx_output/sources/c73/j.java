package c73;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39612d = 0;

    public j(c73.k kVar, c73.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39612d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39612d;
        this.f39612d = i17 + 1;
        if (i17 == 0) {
            return c73.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
