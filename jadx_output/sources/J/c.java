package j;

/* loaded from: classes16.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296199d = 0;

    public c(j.d dVar, j.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296199d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296199d;
        this.f296199d = i17 + 1;
        if (i17 == 0) {
            return j.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
