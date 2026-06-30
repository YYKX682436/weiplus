package p62;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433967d = 0;

    public s(p62.t tVar, p62.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433967d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433967d;
        this.f433967d = i17 + 1;
        if (i17 == 0) {
            return p62.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
