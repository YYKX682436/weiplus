package yy;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f549523d = 0;

    public h(yy.i iVar, yy.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f549523d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f549523d;
        this.f549523d = i17 + 1;
        if (i17 == 0) {
            return yy.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
