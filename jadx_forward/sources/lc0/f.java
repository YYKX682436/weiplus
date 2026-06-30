package lc0;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399381d = 0;

    public f(lc0.g gVar, lc0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399381d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399381d;
        this.f399381d = i17 + 1;
        if (i17 == 0) {
            return lc0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
