package ez3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339439d = 0;

    public f(ez3.g gVar, ez3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339439d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339439d;
        this.f339439d = i17 + 1;
        if (i17 == 0) {
            return ez3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
