package j60;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379388d = 0;

    public n(j60.o oVar, j60.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379388d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379388d;
        this.f379388d = i17 + 1;
        if (i17 == 0) {
            return j60.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
