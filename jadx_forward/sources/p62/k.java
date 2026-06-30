package p62;

/* loaded from: classes.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433961d = 0;

    public k(p62.l lVar, p62.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433961d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433961d;
        this.f433961d = i17 + 1;
        if (i17 == 0) {
            return p62.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
