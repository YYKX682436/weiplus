package v61;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515007d = 0;

    public t(v61.u uVar, v61.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515007d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515007d;
        this.f515007d = i17 + 1;
        if (i17 == 0) {
            return v61.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
