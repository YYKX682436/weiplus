package ak5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f87205d = 0;

    public f(ak5.g gVar, ak5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87205d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f87205d;
        this.f87205d = i17 + 1;
        if (i17 == 0) {
            return ak5.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
