package he0;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362338d = 0;

    public t(he0.u uVar, he0.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362338d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362338d;
        this.f362338d = i17 + 1;
        if (i17 == 0) {
            return he0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
