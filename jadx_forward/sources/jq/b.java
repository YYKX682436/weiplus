package jq;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f382573d = 0;

    public b(jq.c cVar, jq.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f382573d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f382573d;
        this.f382573d = i17 + 1;
        if (i17 == 0) {
            return jq.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
