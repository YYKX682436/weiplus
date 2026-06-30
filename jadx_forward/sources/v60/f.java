package v60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514930d = 0;

    public f(v60.g gVar, v60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514930d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514930d;
        this.f514930d = i17 + 1;
        if (i17 == 0) {
            return v60.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
