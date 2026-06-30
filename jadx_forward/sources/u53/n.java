package u53;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506341d = 0;

    public n(u53.o oVar, u53.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506341d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506341d;
        this.f506341d = i17 + 1;
        if (i17 == 0) {
            return f63.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
