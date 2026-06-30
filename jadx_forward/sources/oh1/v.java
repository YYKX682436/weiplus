package oh1;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426838d = 0;

    public v(oh1.w wVar, oh1.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426838d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426838d;
        this.f426838d = i17 + 1;
        if (i17 == 0) {
            return oh1.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
