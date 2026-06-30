package vw1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f522356d = 0;

    public d(vw1.e eVar, vw1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f522356d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f522356d;
        this.f522356d = i17 + 1;
        if (i17 == 0) {
            return vw1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
