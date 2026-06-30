package bk4;

/* loaded from: classes9.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21517b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f21518c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f21519d;

    public n1(int i17, int i18, java.lang.Integer num, android.view.View.OnClickListener onClickListener) {
        this.f21516a = i17;
        this.f21517b = i18;
        this.f21518c = num;
        this.f21519d = onClickListener;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk4.n1)) {
            return false;
        }
        bk4.n1 n1Var = (bk4.n1) obj;
        return this.f21516a == n1Var.f21516a && this.f21517b == n1Var.f21517b && kotlin.jvm.internal.o.b(this.f21518c, n1Var.f21518c) && kotlin.jvm.internal.o.b(this.f21519d, n1Var.f21519d);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f21516a) * 31) + java.lang.Integer.hashCode(this.f21517b)) * 31;
        java.lang.Integer num = this.f21518c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        android.view.View.OnClickListener onClickListener = this.f21519d;
        return hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SuffixColor(fromIndex=" + this.f21516a + ", toIndex=" + this.f21517b + ", color=" + this.f21518c + ", listener=" + this.f21519d + ')';
    }
}
