package tp1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f502576d = 0;

    public f(tp1.g gVar, tp1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f502576d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f502576d;
        this.f502576d = i17 + 1;
        if (i17 == 0) {
            return tp1.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
