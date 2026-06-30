package ki4;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389678d = 0;

    public n(ki4.o oVar, ki4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389678d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389678d;
        this.f389678d = i17 + 1;
        if (i17 == 0) {
            return ki4.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
