package el4;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335558d = 0;

    public q(el4.r rVar, el4.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335558d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335558d;
        this.f335558d = i17 + 1;
        if (i17 == 0) {
            return el4.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
