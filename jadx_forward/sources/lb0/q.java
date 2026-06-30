package lb0;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final lb0.q f399221a = new lb0.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f399222b = jz5.h.b(lb0.l.f399214d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f399223c = jz5.h.b(lb0.j.f399210d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f399224d = jz5.h.b(lb0.i.f399209d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f399225e = jz5.h.b(lb0.g.f399207d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f399226f = jz5.h.b(lb0.h.f399208d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f399227g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f399228h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f399229i;

    static {
        jz5.h.b(lb0.f.f399206d);
        f399227g = jz5.h.b(lb0.e.f399205d);
        f399228h = jz5.h.b(lb0.p.f399220d);
        f399229i = jz5.h.b(lb0.o.f399219d);
    }

    public final boolean a(android.widget.TextView textView, int i17, boolean z17, java.lang.Integer num) {
        int i18;
        int i19;
        java.lang.String string;
        if (textView == null) {
            return false;
        }
        if (!z17 && f399221a.b(i17)) {
            return false;
        }
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = (java.lang.String) ((jz5.n) f399224d).mo141623x754a37bb();
        switch (i17) {
            case 7:
                h0Var.f391656d = (java.lang.String) ((jz5.n) f399226f).mo141623x754a37bb();
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.olr;
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.olo;
                break;
            case 8:
                h0Var.f391656d = (java.lang.String) ((jz5.n) f399225e).mo141623x754a37bb();
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.o6p;
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.o6o;
                break;
            case 9:
                h0Var.f391656d = ((vh0.p3) ((vh0.o1) ((jz5.n) f399229i).mo141623x754a37bb())).bj(true).f149400f;
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ozw;
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.ozv;
                break;
            case 10:
                h0Var.f391656d = (java.lang.String) ((jz5.n) f399227g).mo141623x754a37bb();
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f575343p60;
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.p5y;
                break;
            default:
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.odi;
                i19 = com.p314xaae8f345.mm.R.C30867xcad56011.odb;
                break;
        }
        java.lang.String string2 = context.getString(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (i19 == com.p314xaae8f345.mm.R.C30867xcad56011.ozv) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
            objArr[1] = string2;
            string = context.getString(i19, objArr);
        } else {
            string = context.getString(i19, string2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new lb0.k(h0Var, context, i17), spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        return true;
    }

    public final boolean b(int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2558xb4b58865.C20607xdb05f59e()) == 1) {
            return false;
        }
        if (i17 != 7 && i17 != 8) {
            i17 = 0;
        }
        jz5.g gVar = f399223c;
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
        if (bool != null && bool.booleanValue()) {
            return bool.booleanValue();
        }
        boolean i18 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f399222b).mo141623x754a37bb()).i("ConfirmScene_" + i17, false);
        ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(i18));
        return i18;
    }

    public final void c(int i17) {
        if (i17 != 7 && i17 != 8) {
            i17 = 0;
        }
        ((java.util.HashMap) ((jz5.n) f399223c).mo141623x754a37bb()).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f399222b).mo141623x754a37bb()).G("ConfirmScene_" + i17, true);
    }

    public final void d(android.content.Context context, int i17, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (b(i17)) {
            block.mo152xb9724478();
            return;
        }
        db5.g3 g3Var = new db5.g3(context);
        g3Var.H(false);
        g3Var.S.setVisibility(8);
        g3Var.E(new lb0.m(g3Var, block, i17));
        g3Var.D(new lb0.n(g3Var));
        g3Var.G(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574341oe3));
        g3Var.F(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq));
        int color = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        android.widget.TextView textView = g3Var.M;
        textView.setTextColor(color);
        a(textView, i17, false, null);
        textView.setVisibility(0);
        textView.setGravity(8388611);
        textView.setTextSize(14.0f);
        g3Var.C();
    }
}
