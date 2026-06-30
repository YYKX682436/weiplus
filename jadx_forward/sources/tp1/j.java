package tp1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f502591d = 0;

    public j(tp1.k kVar, tp1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f502591d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f502591d;
        this.f502591d = i17 + 1;
        if (i17 == 0) {
            return tp1.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
