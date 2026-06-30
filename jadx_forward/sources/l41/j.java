package l41;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f397373d = 0;

    public j(l41.k kVar, l41.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f397373d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f397373d;
        this.f397373d = i17 + 1;
        if (i17 == 0) {
            return l41.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
