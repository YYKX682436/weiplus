package n83;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417172d = 0;

    public f(n83.g gVar, n83.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417172d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417172d;
        this.f417172d = i17 + 1;
        if (i17 == 0) {
            return n83.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
