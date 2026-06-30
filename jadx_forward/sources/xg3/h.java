package xg3;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f535932d = 0;

    public h(xg3.i iVar, xg3.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f535932d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f535932d;
        this.f535932d = i17 + 1;
        if (i17 == 0) {
            return h13.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
