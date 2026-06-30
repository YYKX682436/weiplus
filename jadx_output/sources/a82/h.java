package a82;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f2001d = 0;

    public h(a82.i iVar, a82.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2001d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f2001d;
        this.f2001d = i17 + 1;
        if (i17 == 0) {
            return a82.a2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
