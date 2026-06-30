package vc;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f516406d = 0;

    public f(vc.g gVar, vc.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f516406d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f516406d;
        this.f516406d = i17 + 1;
        if (i17 == 0) {
            return vc.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
