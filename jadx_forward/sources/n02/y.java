package n02;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415438d = 0;

    public y(n02.z zVar, n02.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415438d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415438d;
        this.f415438d = i17 + 1;
        if (i17 == 0) {
            return n02.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
