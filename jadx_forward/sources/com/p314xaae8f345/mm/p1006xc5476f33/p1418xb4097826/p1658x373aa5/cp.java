package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class cp extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dp f213326e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f213327f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f213328g;

    /* renamed from: h, reason: collision with root package name */
    public int f213329h;

    public cp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dp callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f213326e = callback;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ajz, (android.view.ViewGroup) null, false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565317c14);
        if (c22621x7603e017 != null) {
            c22621x7603e017.setInputType(2);
            c22621x7603e017.setKeyListener(android.text.method.DigitsKeyListener.getInstance("0123456789"));
            c22621x7603e017.setImeOptions(6);
            c22621x7603e017.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.to(inflate, this, c22621x7603e017));
            c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uo(inflate, c22621x7603e017, this, context));
            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.b2z);
            button.setEnabled(false);
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vo(c22621x7603e017, this));
        }
        inflate.findViewById(com.p314xaae8f345.mm.R.id.enx).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xo(inflate, this));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f4n)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zo(inflate, this));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jda)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572934cz5, java.lang.Integer.valueOf(this.f213329h)));
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
        f5Var.f291933e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ap(this);
        this.f213328g = f5Var;
        this.f213327f = (android.view.ViewGroup) inflate;
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void f() {
        android.view.Window b17;
        android.view.View decorView;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f213328g;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f293331d;
        if (y1Var == null || (b17 = y1Var.b()) == null || (decorView = b17.getDecorView()) == null) {
            return;
        }
        decorView.setPadding(0, 0, 0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void g() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        android.view.Window b17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f293331d;
        if (y1Var != null && (b17 = y1Var.b()) != null) {
            b17.setSoftInputMode(48);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f213328g;
        if (f5Var != null) {
            f5Var.f();
        }
        android.view.ViewGroup viewGroup = this.f213327f;
        if (viewGroup == null || (c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565317c14)) == null) {
            return;
        }
        c22621x7603e017.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bp(c22621x7603e017, this), 300L);
    }
}
