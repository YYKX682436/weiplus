package je0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380722d = 0;

    public f(je0.g gVar, je0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380722d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380722d;
        this.f380722d = i17 + 1;
        if (i17 == 0) {
            return ie0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
