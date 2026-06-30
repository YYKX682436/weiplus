package ng0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418430d = 0;

    public f(ng0.g gVar, ng0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418430d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418430d;
        this.f418430d = i17 + 1;
        if (i17 == 0) {
            return ng0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
