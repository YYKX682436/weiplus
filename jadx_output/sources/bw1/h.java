package bw1;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24804d = 0;

    public h(bw1.i iVar, bw1.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24804d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24804d;
        this.f24804d = i17 + 1;
        if (i17 == 0) {
            return bw1.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
