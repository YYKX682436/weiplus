package jt;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f383112d = 0;

    public j(jt.k kVar, jt.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f383112d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f383112d;
        this.f383112d = i17 + 1;
        if (i17 == 0) {
            return ht.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
