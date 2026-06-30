package bw1;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f106337d = 0;

    public h(bw1.i iVar, bw1.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f106337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f106337d;
        this.f106337d = i17 + 1;
        if (i17 == 0) {
            return bw1.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
