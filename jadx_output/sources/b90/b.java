package b90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18357d = 0;

    public b(b90.c cVar, b90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18357d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18357d;
        this.f18357d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.c2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
