package ss3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493530d = 0;

    public b(ss3.c cVar, ss3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493530d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493530d;
        this.f493530d = i17 + 1;
        if (i17 == 0) {
            return ss3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
