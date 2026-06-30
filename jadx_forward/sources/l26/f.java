package l26;

/* loaded from: classes14.dex */
public final class f extends l26.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f396757d;

    /* renamed from: e, reason: collision with root package name */
    public int f396758e;

    public f() {
        super(null);
        this.f396757d = new java.lang.Object[20];
        this.f396758e = 0;
    }

    @Override // l26.d
    public int d() {
        return this.f396758e;
    }

    @Override // l26.d
    public void e(int i17, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.lang.Object[] objArr = this.f396757d;
        if (objArr.length <= i17) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i17);
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.f396757d, length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
            this.f396757d = copyOf;
        }
        java.lang.Object[] objArr2 = this.f396757d;
        if (objArr2[i17] == null) {
            this.f396758e++;
        }
        objArr2[i17] = value;
    }

    @Override // l26.d
    public java.lang.Object get(int i17) {
        return kz5.z.U(this.f396757d, i17);
    }

    @Override // l26.d, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new l26.e(this);
    }
}
