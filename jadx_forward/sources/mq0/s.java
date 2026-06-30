package mq0;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412145d = 0;

    public s(mq0.t tVar, mq0.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412145d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412145d;
        this.f412145d = i17 + 1;
        if (i17 == 0) {
            return mq0.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
