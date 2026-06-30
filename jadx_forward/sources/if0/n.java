package if0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f372568d = 0;

    public n(if0.o oVar, if0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f372568d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f372568d;
        this.f372568d = i17 + 1;
        if (i17 == 0) {
            return if0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
