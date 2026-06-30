package vr4;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f521305d = 0;

    public l(vr4.m mVar, vr4.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f521305d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f521305d;
        this.f521305d = i17 + 1;
        if (i17 == 0) {
            return vr4.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
