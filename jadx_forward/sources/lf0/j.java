package lf0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399758d = 0;

    public j(lf0.k kVar, lf0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399758d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399758d;
        this.f399758d = i17 + 1;
        if (i17 == 0) {
            return lf0.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
