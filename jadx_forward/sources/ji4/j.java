package ji4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381471d = 0;

    public j(ji4.k kVar, ji4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381471d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381471d;
        this.f381471d = i17 + 1;
        if (i17 == 0) {
            return ji4.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
