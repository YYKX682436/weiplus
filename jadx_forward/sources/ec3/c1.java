package ec3;

/* loaded from: classes9.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ec3.g1 g1Var, yz5.a aVar) {
        super(0);
        this.f332525d = g1Var;
        this.f332526e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ec3.g1 g1Var = this.f332525d;
        android.widget.TextView W6 = g1Var.W6();
        if (W6 != null) {
            W6.setText(g1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573972o80));
        }
        android.widget.TextView W62 = g1Var.W6();
        if (W62 != null) {
            W62.postDelayed(new ec3.b1(g1Var, this.f332526e), 70L);
        }
        return jz5.f0.f384359a;
    }
}
