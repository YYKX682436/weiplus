package rz;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f483316d = 0;

    public j(rz.k kVar, rz.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f483316d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f483316d;
        this.f483316d = i17 + 1;
        if (i17 == 0) {
            return qz.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
