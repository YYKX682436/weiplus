package r61;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474500d = 0;

    public v(r61.w wVar, r61.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474500d;
        this.f474500d = i17 + 1;
        if (i17 == 0) {
            return r61.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
