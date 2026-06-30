package ef3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333939d = 0;

    public f(ef3.g gVar, ef3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333939d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333939d;
        this.f333939d = i17 + 1;
        if (i17 == 0) {
            return ef3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
