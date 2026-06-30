package ju4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f383581d = 0;

    public f(ju4.g gVar, ju4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f383581d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f383581d;
        this.f383581d = i17 + 1;
        if (i17 == 0) {
            return ju4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
