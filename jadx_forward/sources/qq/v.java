package qq;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447420d = 0;

    public v(qq.w wVar, qq.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447420d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447420d;
        this.f447420d = i17 + 1;
        if (i17 == 0) {
            return qq.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
