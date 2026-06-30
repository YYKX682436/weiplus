package ft;

/* loaded from: classes6.dex */
public class u1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347969d = 0;

    public u1(ft.v1 v1Var, ft.t1 t1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347969d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347969d;
        this.f347969d = i17 + 1;
        if (i17 == 0) {
            return et.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
