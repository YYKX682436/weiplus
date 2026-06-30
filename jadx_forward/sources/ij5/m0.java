package ij5;

/* loaded from: classes.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.n0 f373318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ij5.n0 n0Var) {
        super(0);
        this.f373318d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ij5.n0 n0Var = this.f373318d;
        java.lang.String stringExtra = n0Var.m158359x1e885992().getStringExtra("key_rightButtonWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return n0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
    }
}
