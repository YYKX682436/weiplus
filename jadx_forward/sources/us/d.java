package us;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f511974d = 0;

    public d(us.e eVar, us.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f511974d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f511974d;
        this.f511974d = i17 + 1;
        if (i17 == 0) {
            return us.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
