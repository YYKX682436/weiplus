package js;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f382952d = 0;

    public a0(js.b0 b0Var, js.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f382952d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f382952d;
        this.f382952d = i17 + 1;
        if (i17 == 0) {
            return l71.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
