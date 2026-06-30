package vk;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f519265d = 0;

    public b(vk.c cVar, vk.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f519265d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f519265d;
        this.f519265d = i17 + 1;
        if (i17 == 0) {
            return vk.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
