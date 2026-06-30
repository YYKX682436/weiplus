package uv4;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f512959d = 0;

    public d(uv4.e eVar, uv4.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f512959d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f512959d;
        this.f512959d = i17 + 1;
        if (i17 == 0) {
            return uv4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
