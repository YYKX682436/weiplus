package n23;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415845d = 0;

    public h(n23.i iVar, n23.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415845d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415845d;
        this.f415845d = i17 + 1;
        if (i17 == 0) {
            return kr2.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
