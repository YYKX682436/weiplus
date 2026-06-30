package bt;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105664d = 0;

    public w(bt.x xVar, bt.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105664d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105664d;
        this.f105664d = i17 + 1;
        if (i17 == 0) {
            return bt.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
