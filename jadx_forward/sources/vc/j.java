package vc;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f516409d = 0;

    public j(vc.k kVar, vc.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f516409d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f516409d;
        this.f516409d = i17 + 1;
        if (i17 == 0) {
            return vc.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
