package og0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426650d = 0;

    public j(og0.k kVar, og0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426650d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426650d;
        this.f426650d = i17 + 1;
        if (i17 == 0) {
            return ng0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
