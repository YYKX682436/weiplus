package vo3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f520111d = 0;

    public j(vo3.k kVar, vo3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f520111d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f520111d;
        this.f520111d = i17 + 1;
        if (i17 == 0) {
            return vo3.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
