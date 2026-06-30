package d70;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308398d = 0;

    public f(d70.g gVar, d70.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308398d;
        this.f308398d = i17 + 1;
        if (i17 == 0) {
            return zh4.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
