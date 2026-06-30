package e42;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330882d = 0;

    public v(e42.w wVar, e42.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330882d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330882d;
        this.f330882d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
