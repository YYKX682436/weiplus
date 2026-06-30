package qg5;

/* loaded from: classes8.dex */
public final class w4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f444778a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f444779b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f444780c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g3 f444781d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444782e;

    public w4(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f444778a = context;
        this.f444779b = aVar;
        this.f444780c = aVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "Creating yuanbao forward chat records TOS dialog");
        qg5.v4 v4Var = new qg5.v4(this);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pdj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pdi, string));
        spannableStringBuilder.setSpan(v4Var, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new qg5.r4(this, g3Var));
        g3Var.D(new qg5.s4(g3Var));
        g3Var.F(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq));
        g3Var.G(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.omq));
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(0, textView.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        g3Var.l(new qg5.t4(this));
        g3Var.w(new qg5.u4(this));
        this.f444781d = g3Var;
    }

    public static final void a(qg5.w4 w4Var, int i17) {
        w4Var.getClass();
        java.util.Map m17 = kz5.c1.m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290833g, kz5.c1.k(new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b), new jz5.l("clk_popup_btn", java.lang.Integer.valueOf(i17)), new jz5.l("share_type", 13)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "reportTosDialogClk: buttonId=" + i17 + ", " + m17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_legal_popup", "view_clk", m17, 32337);
    }
}
