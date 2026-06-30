package i90;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371221d = 0;

    public d(i90.e eVar, i90.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371221d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371221d;
        this.f371221d = i17 + 1;
        if (i17 == 0) {
            return i90.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
