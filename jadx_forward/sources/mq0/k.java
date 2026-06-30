package mq0;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412105d = 0;

    public k(mq0.l lVar, mq0.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412105d;
        this.f412105d = i17 + 1;
        if (i17 == 0) {
            return mq0.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
