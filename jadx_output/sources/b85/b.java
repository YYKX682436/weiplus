package b85;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18344d = 0;

    public b(b85.c cVar, b85.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18344d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18344d;
        this.f18344d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.accessibility.feature.AccExptServiceProvider.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
