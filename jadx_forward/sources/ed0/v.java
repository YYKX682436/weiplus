package ed0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332763d = 0;

    public v(ed0.w wVar, ed0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332763d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332763d;
        this.f332763d = i17 + 1;
        if (i17 == 0) {
            return dd0.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
