package qg5;

/* loaded from: classes8.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f444440a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f444441b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f444442c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g3 f444443d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444444e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f444445f;

    public a4(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f444440a = context;
        this.f444441b = aVar;
        this.f444442c = aVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "Creating yuanbao copy chat records TOS dialog");
        qg5.y3 y3Var = new qg5.y3(this);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pdj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pdi, string));
        spannableStringBuilder.setSpan(y3Var, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new qg5.v3(this, g3Var));
        g3Var.D(new qg5.w3(g3Var));
        g3Var.F(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq));
        g3Var.G(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.omq));
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(0, textView.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        g3Var.l(new qg5.x3(this));
        this.f444443d = g3Var;
        this.f444445f = jz5.h.b(qg5.z3.f444812d);
    }

    public final ct.k3 a() {
        return (ct.k3) ((jz5.n) this.f444445f).mo141623x754a37bb();
    }
}
