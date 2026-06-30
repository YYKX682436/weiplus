package l26;

/* loaded from: classes14.dex */
public final class c0 extends l26.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f396751d;

    /* renamed from: e, reason: collision with root package name */
    public final int f396752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.Object value, int i17) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f396751d = value;
        this.f396752e = i17;
    }

    @Override // l26.d
    public int d() {
        return 1;
    }

    @Override // l26.d
    public void e(int i17, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        throw new java.lang.IllegalStateException();
    }

    @Override // l26.d
    public java.lang.Object get(int i17) {
        if (i17 == this.f396752e) {
            return this.f396751d;
        }
        return null;
    }

    @Override // l26.d, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new l26.b0(this);
    }
}
