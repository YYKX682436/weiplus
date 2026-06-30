package b30;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f17584d = 0;

    public v(b30.w wVar, b30.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17584d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f17584d;
        this.f17584d = i17 + 1;
        if (i17 == 0) {
            return b30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
