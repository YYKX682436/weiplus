package c25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38078d = 0;

    public b(c25.c cVar, c25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38078d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38078d;
        this.f38078d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.zero.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
