package qo3;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447142d = 0;

    public h(qo3.i iVar, qo3.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447142d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447142d;
        this.f447142d = i17 + 1;
        if (i17 == 0) {
            return qo3.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
