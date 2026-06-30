package r35;

/* loaded from: classes6.dex */
public class j3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450681d = 0;

    public j3(r35.k3 k3Var, r35.i3 i3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450681d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450681d;
        this.f450681d = i17 + 1;
        if (i17 == 0) {
            return r35.h4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
