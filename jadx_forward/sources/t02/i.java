package t02;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495957d = 0;

    public i(t02.j jVar, t02.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495957d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495957d;
        this.f495957d = i17 + 1;
        if (i17 == 0) {
            return t02.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
