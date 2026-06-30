package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ya extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196702p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f196703q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f196704r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.Button f196705s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.Button f196706t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f196707u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f196708v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f196709w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196702p = statusMonitor;
        this.f196703q = "FinderLiveBottomTipPlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.eqq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f196709w = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.eqr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) findViewById2;
        this.f196704r = c22613xe7040d9c;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.eqn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.eqo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f196705s = (android.widget.Button) findViewById4;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.eqp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f196706t = (android.widget.Button) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.eqt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f196707u = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.eqs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f196708v = (android.widget.TextView) findViewById7;
        c22613xe7040d9c.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y);
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.RelativeLayout) findViewById3).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).bottomMargin += com.p314xaae8f345.mm.ui.bl.c(root.getContext());
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.va(this));
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wa(this));
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(this.f196704r, null, 1, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            super.K0(i17);
        } else {
            this.f446856d.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f196703q, "setVisible return for isTeenMode");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.widget.Button button) {
        button.setBackground(button.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
        button.setTextColor(button.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
    }

    public final void u1(android.widget.Button button) {
        button.setBackground(button.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy));
        button.setTextColor(button.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
    }

    public final void v1(int i17, android.view.View.OnClickListener onClickListener, android.view.View.OnClickListener onClickListener2) {
        K0(0);
        android.view.ViewGroup viewGroup = this.f446856d;
        java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573333ea0);
        android.widget.TextView textView = this.f196707u;
        textView.setText(string);
        java.lang.String string2 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_z);
        android.widget.TextView textView2 = this.f196708v;
        textView2.setText(string2);
        java.lang.String string3 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_y);
        android.widget.Button button = this.f196705s;
        button.setText(string3);
        java.lang.String string4 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573334ea1);
        android.widget.Button button2 = this.f196706t;
        button2.setText(string4);
        button.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563232a10));
        button2.setBackground(viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0r));
        if (i17 == 0) {
            textView.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnk));
            textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnj));
            button.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnr));
            button2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dna));
            t1(button);
            u1(button2);
        } else if (i17 == 1) {
            textView.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573333ea0));
            textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_z));
            button.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_y));
            button2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573334ea1));
            u1(button);
            t1(button2);
        } else if (i17 == 2) {
            textView.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_x));
            textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_w));
            button.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_y));
            button2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573334ea1));
            u1(button);
            t1(button2);
        }
        if (this.f196702p.mo11219xd0598cf8() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            ml2.d5[] d5VarArr = ml2.d5.f408900d;
            jz5.l lVar = new jz5.l("red_packet_err_type", 3);
            ml2.e5 e5Var = ml2.e5.f408922e;
            ((cy1.a) rVar).Cj("finder_live_red_packet_hold_up", viewGroup, kz5.c1.k(lVar, new jz5.l("cur_red_packet_source", -1)), 25561);
        }
        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener2);
        this.f196704r.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xa(this));
    }
}
