package vw;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f522267d = 0;

    public u(vw.v vVar, vw.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f522267d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f522267d;
        this.f522267d = i17 + 1;
        if (i17 == 0) {
            return vw.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
