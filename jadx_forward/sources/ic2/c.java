package ic2;

/* loaded from: classes.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371854d = 0;

    public c(ic2.d dVar, ic2.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371854d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371854d;
        this.f371854d = i17 + 1;
        if (i17 == 0) {
            return ic2.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
