package ed0;

/* loaded from: classes9.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f332759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332760b;

    public s0(java.util.List list, int i17) {
        this.f332759a = list;
        this.f332760b = i17;
    }

    /* renamed from: equals */
    public boolean m127313xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed0.s0)) {
            return false;
        }
        ed0.s0 s0Var = (ed0.s0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332759a, s0Var.f332759a) && this.f332760b == s0Var.f332760b;
    }

    /* renamed from: hashCode */
    public int m127314x8cdac1b() {
        java.util.List list = this.f332759a;
        return ((list == null ? 0 : list.hashCode()) * 31) + java.lang.Integer.hashCode(this.f332760b);
    }

    /* renamed from: toString */
    public java.lang.String m127315x9616526c() {
        return "RingtoneUiState(ringtones=" + this.f332759a + ", uiState=" + this.f332760b + ')';
    }
}
