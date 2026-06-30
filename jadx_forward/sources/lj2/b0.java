package lj2;

/* loaded from: classes10.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f400359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lj2.c0 c0Var) {
        super(0);
        this.f400359d = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.u4 K;
        lj2.c0 c0Var = this.f400359d;
        lj2.t0 a07 = c0Var.f400364b.a0();
        if (a07 != null && (K = a07.K()) != null) {
            c0Var.c().b(0);
            c0Var.b().a(8);
            lj2.t c17 = c0Var.c();
            int i17 = K.f315693g;
            int i18 = K.f315694h;
            int i19 = K.f315699m;
            c17.f400484e = i17;
            c17.f400485f = i19;
            android.widget.TextView textView = c17.f400483d;
            android.widget.TextView textView2 = c17.f400482c;
            android.view.View view = c17.f400480a;
            if (i18 == 1) {
                textView2.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573010d70));
                c17.a();
                textView.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lje));
            } else {
                textView2.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573010d70));
                c17.a();
                textView.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljg));
            }
        }
        c0Var.c().f400480a.animate().translationX(0.0f).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(null).start();
        return jz5.f0.f384359a;
    }
}
