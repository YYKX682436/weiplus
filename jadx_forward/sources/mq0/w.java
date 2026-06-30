package mq0;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412156d = 0;

    public w(mq0.x xVar, mq0.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412156d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412156d;
        this.f412156d = i17 + 1;
        if (i17 == 0) {
            return mq0.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
