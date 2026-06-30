package h55;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360636d = 0;

    public j(h55.k kVar, h55.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360636d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360636d;
        this.f360636d = i17 + 1;
        if (i17 == 0) {
            return h55.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
