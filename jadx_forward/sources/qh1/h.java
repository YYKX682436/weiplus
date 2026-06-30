package qh1;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444957d = 0;

    public h(qh1.i iVar, qh1.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444957d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444957d;
        this.f444957d = i17 + 1;
        if (i17 == 0) {
            return qh1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
