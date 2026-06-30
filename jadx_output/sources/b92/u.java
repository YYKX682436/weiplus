package b92;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18516d = 0;

    public u(b92.v vVar, b92.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18516d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18516d;
        this.f18516d = i17 + 1;
        if (i17 == 0) {
            return b92.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
