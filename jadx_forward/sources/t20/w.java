package t20;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496226d = 0;

    public w(t20.x xVar, t20.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496226d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496226d;
        this.f496226d = i17 + 1;
        if (i17 == 0) {
            return t20.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
