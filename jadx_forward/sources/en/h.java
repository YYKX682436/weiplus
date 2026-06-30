package en;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336772d = 0;

    public h(en.i iVar, en.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336772d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336772d;
        this.f336772d = i17 + 1;
        if (i17 == 0) {
            return en.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
