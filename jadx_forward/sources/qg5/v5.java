package qg5;

/* loaded from: classes8.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f444759a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f444760b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f444761c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g3 f444762d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444763e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f444764f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f444765g;

    public v5(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f444759a = context;
        this.f444760b = aVar;
        this.f444761c = aVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("YuanBaoSummarizeTosDialog", "creating YuanBaoSummarizeTosDialog");
        qg5.s5 s5Var = new qg5.s5(this);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pht);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pdi, string));
        spannableStringBuilder.setSpan(s5Var, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new qg5.o5(this, g3Var));
        g3Var.D(new qg5.p5(g3Var));
        g3Var.F(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq));
        g3Var.G(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.omq));
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(0, textView.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        g3Var.l(new qg5.q5(this));
        g3Var.w(new qg5.r5(this));
        this.f444762d = g3Var;
        this.f444764f = jz5.h.b(qg5.u5.f444750d);
        this.f444765g = jz5.h.b(qg5.t5.f444726d);
    }

    public static final void a(qg5.v5 v5Var, int i17) {
        ((cy1.a) ((dy1.r) ((jz5.n) v5Var.f444765g).mo141623x754a37bb())).Hj("yuanbao_legal_popup", "view_clk", kz5.c1.m(((qg5.e3) ((ct.k3) ((jz5.n) v5Var.f444764f).mo141623x754a37bb())).nj("journey_summarize"), kz5.b1.e(new jz5.l("clk_popup_btn", java.lang.Integer.valueOf(i17)))), 35480);
    }
}
