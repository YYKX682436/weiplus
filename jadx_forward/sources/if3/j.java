package if3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f372715d = 0;

    public j(if3.k kVar, if3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f372715d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f372715d;
        this.f372715d = i17 + 1;
        if (i17 == 0) {
            return if3.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
