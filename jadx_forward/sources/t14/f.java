package t14;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496111d = 0;

    public f(t14.g gVar, t14.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496111d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496111d;
        this.f496111d = i17 + 1;
        if (i17 == 0) {
            return t14.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
