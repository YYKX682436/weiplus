package tg3;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500722d = 0;

    public h(tg3.i iVar, tg3.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500722d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500722d;
        this.f500722d = i17 + 1;
        if (i17 == 0) {
            return sg3.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
