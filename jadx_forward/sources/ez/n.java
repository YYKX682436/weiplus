package ez;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339292d = 0;

    public n(ez.o oVar, ez.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339292d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339292d;
        this.f339292d = i17 + 1;
        if (i17 == 0) {
            return ez.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
