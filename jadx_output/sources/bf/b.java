package bf;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19566d = 0;

    public b(bf.c cVar, bf.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19566d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19566d;
        this.f19566d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
