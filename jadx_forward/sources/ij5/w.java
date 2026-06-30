package ij5;

/* loaded from: classes.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f373346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ij5.d0 d0Var) {
        super(0);
        this.f373346d = d0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ij5.d0 d0Var = this.f373346d;
        java.lang.String stringExtra = d0Var.m158359x1e885992().getStringExtra("key_chatroomSessionWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return d0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ifz);
    }
}
