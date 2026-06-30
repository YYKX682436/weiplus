package uh0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f509262d = 0;

    public j(uh0.k kVar, uh0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f509262d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f509262d;
        this.f509262d = i17 + 1;
        if (i17 == 0) {
            return th0.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
