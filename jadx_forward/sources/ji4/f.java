package ji4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381462d = 0;

    public f(ji4.g gVar, ji4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381462d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381462d;
        this.f381462d = i17 + 1;
        if (i17 == 0) {
            return ji4.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
