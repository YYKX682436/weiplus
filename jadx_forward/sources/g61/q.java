package g61;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350598d = 0;

    public q(g61.r rVar, g61.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350598d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350598d;
        this.f350598d = i17 + 1;
        if (i17 == 0) {
            return g61.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
