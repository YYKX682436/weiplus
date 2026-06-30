package be1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19459d = 0;

    public d(be1.e eVar, be1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19459d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19459d;
        this.f19459d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.luggage.customize.v.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.luggage.customize.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
