package r10;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450128d = 0;

    public t(r10.u uVar, r10.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450128d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450128d;
        this.f450128d = i17 + 1;
        if (i17 == 0) {
            return r10.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
