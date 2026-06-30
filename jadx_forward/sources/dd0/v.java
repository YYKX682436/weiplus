package dd0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f310477d = 0;

    public v(dd0.w wVar, dd0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f310477d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f310477d;
        this.f310477d = i17 + 1;
        if (i17 == 0) {
            return dd0.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
