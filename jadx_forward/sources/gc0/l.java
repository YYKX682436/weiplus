package gc0;

/* loaded from: classes.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351737d = 0;

    public l(gc0.m mVar, gc0.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351737d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351737d;
        this.f351737d = i17 + 1;
        if (i17 == 0) {
            return gc0.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
