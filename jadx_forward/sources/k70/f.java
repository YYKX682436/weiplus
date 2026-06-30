package k70;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386155d = 0;

    public f(k70.g gVar, k70.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386155d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386155d;
        this.f386155d = i17 + 1;
        if (i17 == 0) {
            return j70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
