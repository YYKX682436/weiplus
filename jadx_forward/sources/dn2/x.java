package dn2;

/* loaded from: classes3.dex */
public final class x implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323524a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323525b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.content.Context context = rootView.getContext();
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323524a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f323525b = textView;
        textView.setGravity(3);
        jz5.f0 f0Var = null;
        dk2.a8 a8Var = liveMsg instanceof dk2.a8 ? (dk2.a8) liveMsg : null;
        if (a8Var != null) {
            java.lang.Object D = a8Var.D();
            r45.ej1 ej1Var = D instanceof r45.ej1 ? (r45.ej1) D : null;
            if (ej1Var != null) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                android.widget.TextView textView2 = this.f323525b;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                    throw null;
                }
                android.text.TextPaint paint = textView2.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                java.lang.String k17 = liveMsg.k();
                if (k17 == null) {
                    k17 = "";
                }
                java.lang.String obj = c61.yb.nf(ybVar, context, paint, k17, 0, 8, null).toString();
                android.widget.TextView textView3 = this.f323525b;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                    throw null;
                }
                textView3.setText(obj + ' ' + ej1Var.m75945x2fec8307(1));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show LiveInteractiveBulletItem, tips:");
                sb6.append(ej1Var.m75945x2fec8307(1));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveInteractiveBulletItem", sb6.toString());
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveInteractiveBulletItem", "invalid livemsg:" + liveMsg);
        }
        return rootView;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570400dj3;
    }
}
