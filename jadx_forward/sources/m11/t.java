package m11;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404309d = 0;

    public t(m11.u uVar, m11.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404309d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404309d;
        this.f404309d = i17 + 1;
        if (i17 == 0) {
            return m11.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
