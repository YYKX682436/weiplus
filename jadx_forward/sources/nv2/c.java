package nv2;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421999d = 0;

    public c(nv2.d dVar, nv2.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421999d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421999d;
        this.f421999d = i17 + 1;
        if (i17 == 0) {
            return nv2.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
