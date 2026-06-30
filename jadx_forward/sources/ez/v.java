package ez;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339309d = 0;

    public v(ez.w wVar, ez.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339309d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339309d;
        this.f339309d = i17 + 1;
        if (i17 == 0) {
            return ez.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
