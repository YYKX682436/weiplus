package t53;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f497281d = 0;

    public f(t53.g gVar, t53.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f497281d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f497281d;
        this.f497281d = i17 + 1;
        if (i17 == 0) {
            return t53.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
