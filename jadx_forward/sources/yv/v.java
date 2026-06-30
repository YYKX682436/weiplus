package yv;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f547483d = 0;

    public v(yv.w wVar, yv.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f547483d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f547483d;
        this.f547483d = i17 + 1;
        if (i17 == 0) {
            return yv.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
