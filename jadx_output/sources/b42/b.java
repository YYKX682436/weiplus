package b42;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f17791d = 0;

    public b(b42.c cVar, b42.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17791d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f17791d;
        this.f17791d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.expansions.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
