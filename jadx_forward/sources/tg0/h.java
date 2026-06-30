package tg0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500612d = 0;

    public h(tg0.i iVar, tg0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500612d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500612d;
        this.f500612d = i17 + 1;
        if (i17 == 0) {
            return s50.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
