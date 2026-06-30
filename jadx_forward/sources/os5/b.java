package os5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f429813d = 0;

    public b(os5.c cVar, os5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f429813d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f429813d;
        this.f429813d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.c5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
