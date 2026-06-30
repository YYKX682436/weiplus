package it2;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f376041d = 0;

    public h(it2.i iVar, it2.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f376041d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f376041d;
        this.f376041d = i17 + 1;
        if (i17 == 0) {
            return it2.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
