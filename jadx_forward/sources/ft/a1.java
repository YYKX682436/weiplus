package ft;

/* loaded from: classes6.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347899d = 0;

    public a1(ft.b1 b1Var, ft.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347899d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347899d;
        this.f347899d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
