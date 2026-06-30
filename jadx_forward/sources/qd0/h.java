package qd0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443071d = 0;

    public h(qd0.i iVar, qd0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443071d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443071d;
        this.f443071d = i17 + 1;
        if (i17 == 0) {
            return qd0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
