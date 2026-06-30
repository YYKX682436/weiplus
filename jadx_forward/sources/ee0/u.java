package ee0;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333066d = 0;

    public u(ee0.v vVar, ee0.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333066d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333066d;
        this.f333066d = i17 + 1;
        if (i17 == 0) {
            return ee0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
