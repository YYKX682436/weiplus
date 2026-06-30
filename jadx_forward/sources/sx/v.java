package sx;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495043d = 0;

    public v(sx.w wVar, sx.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495043d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495043d;
        this.f495043d = i17 + 1;
        if (i17 == 0) {
            return rx.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
