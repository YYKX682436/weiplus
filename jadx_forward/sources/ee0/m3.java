package ee0;

/* loaded from: classes6.dex */
public class m3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333025d = 0;

    public m3(ee0.n3 n3Var, ee0.l3 l3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333025d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333025d;
        this.f333025d = i17 + 1;
        if (i17 == 0) {
            return ee0.a5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
