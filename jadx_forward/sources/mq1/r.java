package mq1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412217d = 0;

    public r(mq1.s sVar, mq1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412217d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412217d;
        this.f412217d = i17 + 1;
        if (i17 == 0) {
            return mq1.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
