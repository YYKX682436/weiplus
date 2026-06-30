package ee0;

/* loaded from: classes6.dex */
public class i3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333000d = 0;

    public i3(ee0.j3 j3Var, ee0.h3 h3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333000d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333000d;
        this.f333000d = i17 + 1;
        if (i17 == 0) {
            return ee0.y4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
