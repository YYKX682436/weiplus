package ib0;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f371563b;

    /* renamed from: a, reason: collision with root package name */
    public static final ib0.e f371562a = new ib0.e();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f371564c = jz5.h.b(ib0.a.f371557d);

    public final void a(android.content.Context context, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (f371563b) {
            block.mo152xb9724478();
            return;
        }
        jz5.g gVar = f371564c;
        if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).getBoolean("key_show_tips", false)) {
            f371563b = true;
            block.mo152xb9724478();
            return;
        }
        f371563b = true;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putBoolean("key_show_tips", true);
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new ib0.b(g3Var, block));
        g3Var.D(new ib0.c(g3Var));
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mje);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        g3Var.G(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.omq));
        g3Var.F(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574203ob4, string));
        spannableStringBuilder.setSpan(new ib0.d(context), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        android.widget.TextView textView = g3Var.M;
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setTextSize(14.0f);
        g3Var.C();
    }
}
