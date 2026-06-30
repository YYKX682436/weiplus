package i14;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368857d = 0;

    public f(i14.g gVar, i14.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368857d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368857d;
        this.f368857d = i17 + 1;
        if (i17 == 0) {
            return i14.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
