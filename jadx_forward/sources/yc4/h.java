package yc4;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f542386d = 0;

    public h(yc4.i iVar, yc4.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f542386d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f542386d;
        this.f542386d = i17 + 1;
        if (i17 == 0) {
            return yc4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
