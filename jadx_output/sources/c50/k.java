package c50;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38607d = 0;

    public k(c50.l lVar, c50.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38607d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38607d;
        this.f38607d = i17 + 1;
        if (i17 == 0) {
            return v40.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
