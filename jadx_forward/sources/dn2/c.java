package dn2;

/* loaded from: classes3.dex */
public final class c implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323427a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323428b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323427a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323428b = (android.widget.TextView) findViewById2;
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.widget.TextView textView = this.f323428b;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f323428b;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        android.text.TextPaint paint = textView2.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        r45.xn1 C = liveMsg.C();
        if (C == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) C.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
            str = "";
        }
        java.lang.CharSequence nf6 = c61.yb.nf(ybVar, context, paint, new android.text.SpannableString(str), 0, 8, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show FinderLiveAppMsgGameLivePurchaseTeamUpInfo ");
        java.lang.Object D = liveMsg.D();
        sb6.append(pm0.b0.g(D != null ? D : ""));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin_BulletNew_View", sb6.toString());
        java.lang.Object D2 = liveMsg.D();
        r45.li1 li1Var = D2 instanceof r45.li1 ? (r45.li1) D2 : null;
        if (li1Var != null) {
            android.view.View view = this.f323427a;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
                throw null;
            }
            java.lang.String string = view.getContext().getString(li1Var.m75939xb282bd08(0) == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.mqe : com.p314xaae8f345.mm.R.C30867xcad56011.mqd, nf6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.widget.TextView textView3 = this.f323428b;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            android.view.ViewParent parent = textView3.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                int i17 = cn2.d0.f125022b;
                viewGroup.setPadding(cn2.d0.f125023c, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
            android.widget.TextView textView4 = this.f323428b;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView4.setText(string);
        }
        android.widget.TextView textView5 = this.f323428b;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
            throw null;
        }
        textView5.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        android.view.View view2 = this.f323427a;
        if (view2 != null) {
            view2.setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
            return rootView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContent");
        throw null;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570400dj3;
    }
}
