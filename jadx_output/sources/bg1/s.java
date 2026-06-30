package bg1;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19903d = 0;

    public s(bg1.t tVar, bg1.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19903d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19903d;
        this.f19903d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.utils.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
