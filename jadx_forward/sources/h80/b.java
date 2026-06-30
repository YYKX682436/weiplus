package h80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361046d = 0;

    public b(h80.c cVar, h80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361046d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361046d;
        this.f361046d = i17 + 1;
        if (i17 == 0) {
            return h80.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
