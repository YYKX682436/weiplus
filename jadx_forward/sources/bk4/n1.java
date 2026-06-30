package bk4;

/* loaded from: classes9.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f103049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103050b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f103051c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f103052d;

    public n1(int i17, int i18, java.lang.Integer num, android.view.View.OnClickListener onClickListener) {
        this.f103049a = i17;
        this.f103050b = i18;
        this.f103051c = num;
        this.f103052d = onClickListener;
    }

    /* renamed from: equals */
    public boolean m10697xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk4.n1)) {
            return false;
        }
        bk4.n1 n1Var = (bk4.n1) obj;
        return this.f103049a == n1Var.f103049a && this.f103050b == n1Var.f103050b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103051c, n1Var.f103051c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103052d, n1Var.f103052d);
    }

    /* renamed from: hashCode */
    public int m10698x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f103049a) * 31) + java.lang.Integer.hashCode(this.f103050b)) * 31;
        java.lang.Integer num = this.f103051c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        android.view.View.OnClickListener onClickListener = this.f103052d;
        return hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m10699x9616526c() {
        return "SuffixColor(fromIndex=" + this.f103049a + ", toIndex=" + this.f103050b + ", color=" + this.f103051c + ", listener=" + this.f103052d + ')';
    }
}
