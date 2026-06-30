package ak5;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f87219d = 0;

    public n(ak5.o oVar, ak5.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87219d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f87219d;
        this.f87219d = i17 + 1;
        if (i17 == 0) {
            return ak5.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
