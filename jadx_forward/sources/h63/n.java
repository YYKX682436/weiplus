package h63;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360797d = 0;

    public n(h63.o oVar, h63.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360797d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360797d;
        this.f360797d = i17 + 1;
        if (i17 == 0) {
            return h63.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
