package ao5;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f12570d = 0;

    public n(ao5.o oVar, ao5.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f12570d;
        this.f12570d = i17 + 1;
        if (i17 == 0) {
            return ao5.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
