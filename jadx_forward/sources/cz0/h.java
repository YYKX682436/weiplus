package cz0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306478d = 0;

    public h(cz0.i iVar, cz0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306478d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306478d;
        this.f306478d = i17 + 1;
        if (i17 == 0) {
            return cz0.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
