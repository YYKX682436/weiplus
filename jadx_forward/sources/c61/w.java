package c61;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120898d = 0;

    public w(c61.x xVar, c61.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120898d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120898d;
        this.f120898d = i17 + 1;
        if (i17 == 0) {
            return c61.e8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
