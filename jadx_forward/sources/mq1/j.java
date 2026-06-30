package mq1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412200d = 0;

    public j(mq1.k kVar, mq1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412200d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412200d;
        this.f412200d = i17 + 1;
        if (i17 == 0) {
            return mq1.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
