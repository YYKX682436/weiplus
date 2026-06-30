package hn1;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364028d = 0;

    public w(hn1.x xVar, hn1.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364028d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364028d;
        this.f364028d = i17 + 1;
        if (i17 == 0) {
            return hn1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
