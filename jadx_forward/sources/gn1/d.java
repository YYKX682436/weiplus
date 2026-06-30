package gn1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f355111d = 0;

    public d(gn1.e eVar, gn1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f355111d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f355111d;
        this.f355111d = i17 + 1;
        if (i17 == 0) {
            return gn1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
