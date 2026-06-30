package ef0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333816d = 0;

    public n(ef0.o oVar, ef0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333816d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333816d;
        this.f333816d = i17 + 1;
        if (i17 == 0) {
            return ef0.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
