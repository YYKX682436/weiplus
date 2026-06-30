package ux;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513306d = 0;

    public d(ux.e eVar, ux.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513306d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513306d;
        this.f513306d = i17 + 1;
        if (i17 == 0) {
            return ux.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
