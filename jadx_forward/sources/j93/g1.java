package j93;

/* loaded from: classes.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f379925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(j93.j1 j1Var) {
        super(0);
        this.f379925d = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        j93.j1 j1Var = this.f379925d;
        java.lang.String stringExtra = j1Var.m158359x1e885992().getStringExtra("key_rightButtonWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return j1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573846mb3);
    }
}
