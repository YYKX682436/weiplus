package h60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360669d = 0;

    public f(h60.g gVar, h60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360669d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360669d;
        this.f360669d = i17 + 1;
        if (i17 == 0) {
            return l60.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
