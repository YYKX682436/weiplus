package c35;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38254d = 0;

    public j(c35.k kVar, c35.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38254d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38254d;
        this.f38254d = i17 + 1;
        if (i17 == 0) {
            return vf0.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
