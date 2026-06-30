package v80;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515583d = 0;

    public f(v80.g gVar, v80.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515583d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515583d;
        this.f515583d = i17 + 1;
        if (i17 == 0) {
            return v80.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
