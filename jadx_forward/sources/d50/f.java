package d50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308044d = 0;

    public f(d50.g gVar, d50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308044d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308044d;
        this.f308044d = i17 + 1;
        if (i17 == 0) {
            return d50.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
