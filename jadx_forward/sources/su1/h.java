package su1;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f494261d = 0;

    public h(su1.i iVar, su1.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f494261d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f494261d;
        this.f494261d = i17 + 1;
        if (i17 == 0) {
            return su1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
