package lh;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400171d = 0;

    public w(lh.x xVar, lh.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400171d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400171d;
        this.f400171d = i17 + 1;
        if (i17 == 0) {
            return dr0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
