package a71;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f1919d = 0;

    public h(a71.i iVar, a71.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1919d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f1919d;
        this.f1919d = i17 + 1;
        if (i17 == 0) {
            return a71.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
