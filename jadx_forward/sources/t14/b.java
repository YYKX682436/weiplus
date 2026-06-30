package t14;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496108d = 0;

    public b(t14.c cVar, t14.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496108d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496108d;
        this.f496108d = i17 + 1;
        if (i17 == 0) {
            return t14.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
