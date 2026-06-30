package bf3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101156d = 0;

    public f(bf3.g gVar, bf3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101156d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101156d;
        this.f101156d = i17 + 1;
        if (i17 == 0) {
            return bf3.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
