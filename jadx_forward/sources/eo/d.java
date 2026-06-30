package eo;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f337074d = 0;

    public d(eo.e eVar, eo.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f337074d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f337074d;
        this.f337074d = i17 + 1;
        if (i17 == 0) {
            return eo.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
