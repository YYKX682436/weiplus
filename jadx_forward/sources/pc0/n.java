package pc0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434820d = 0;

    public n(pc0.o oVar, pc0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434820d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434820d;
        this.f434820d = i17 + 1;
        if (i17 == 0) {
            return pc0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
