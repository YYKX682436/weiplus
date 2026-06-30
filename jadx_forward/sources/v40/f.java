package v40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514712d = 0;

    public f(v40.g gVar, v40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514712d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514712d;
        this.f514712d = i17 + 1;
        if (i17 == 0) {
            return v40.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
