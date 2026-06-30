package c40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38356d = 0;

    public f(c40.g gVar, c40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38356d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38356d;
        this.f38356d = i17 + 1;
        if (i17 == 0) {
            return c40.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
