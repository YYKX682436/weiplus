package v40;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514718d = 0;

    public n(v40.o oVar, v40.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514718d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514718d;
        this.f514718d = i17 + 1;
        if (i17 == 0) {
            return v40.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
