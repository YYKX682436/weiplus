package ja0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380132d = 0;

    public v(ja0.w wVar, ja0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380132d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380132d;
        this.f380132d = i17 + 1;
        if (i17 == 0) {
            return ja0.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
