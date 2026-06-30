package y30;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f540666d = 0;

    public f(y30.g gVar, y30.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f540666d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f540666d;
        this.f540666d = i17 + 1;
        if (i17 == 0) {
            return y30.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
