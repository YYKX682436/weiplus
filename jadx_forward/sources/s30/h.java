package s30;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f483926d = 0;

    public h(s30.i iVar, s30.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f483926d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f483926d;
        this.f483926d = i17 + 1;
        if (i17 == 0) {
            return s30.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
