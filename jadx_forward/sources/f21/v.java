package f21;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340489d = 0;

    public v(f21.w wVar, f21.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340489d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340489d;
        this.f340489d = i17 + 1;
        if (i17 == 0) {
            return f21.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
