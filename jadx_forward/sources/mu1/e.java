package mu1;

/* loaded from: classes15.dex */
public class e extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f412878g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f412879h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f412880i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f412881j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.LinearLayout f412882k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f412883l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f412884m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f412885n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f412886o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f412887p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f412888q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f412889r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f412890s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f412891t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f412892u;

    @Override // mu1.a, mu1.j
    public void c(boolean z17) {
    }

    @Override // mu1.a, mu1.j
    public void d(boolean z17, boolean z18) {
        if (this.f412881j != null) {
            r45.w50 w50Var = this.f412867a.i0().f466732y;
            if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f470411d) && w50Var.f470415h != 0 && this.f412867a.F()) {
                this.f412881j.setClickable(false);
                this.f412881j.setVisibility(0);
                this.f412884m.setVisibility(8);
                return;
            }
            if (this.f412867a.i0().f466731x != null && !android.text.TextUtils.isEmpty(this.f412867a.i0().f466731x.f470411d) && !android.text.TextUtils.isEmpty(this.f412867a.i0().f466731x.f470414g) && this.f412867a.F()) {
                this.f412881j.setVisibility(0);
                this.f412881j.setEnabled(true);
                if (android.text.TextUtils.isEmpty(this.f412867a.i0().f466722o) || this.f412867a.i0().f466723p == 0) {
                    this.f412884m.setVisibility(8);
                    return;
                } else {
                    this.f412884m.setVisibility(0);
                    return;
                }
            }
            if (z17 && !android.text.TextUtils.isEmpty(this.f412867a.i0().f466722o) && this.f412867a.F()) {
                this.f412881j.setVisibility(0);
                this.f412881j.setEnabled(z18);
                this.f412884m.setVisibility(8);
            } else if (!z17 || this.f412867a.F()) {
                this.f412881j.setVisibility(8);
                this.f412884m.setVisibility(8);
            } else {
                this.f412881j.setVisibility(0);
                this.f412881j.setEnabled(false);
                this.f412884m.setVisibility(8);
            }
        }
    }

    @Override // mu1.a, mu1.j
    public void e(int i17) {
    }

    @Override // mu1.a
    public void g() {
        this.f412878g = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bcg);
        this.f412879h = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bc8);
        this.f412880i = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b7u);
        this.f412881j = (android.widget.Button) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b96);
        this.f412882k = (android.widget.LinearLayout) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.pm9);
        this.f412892u = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.cka);
        this.f412884m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b8y);
        this.f412883l = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bb6);
        this.f412885n = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.f564703yk);
        this.f412888q = (android.view.ViewGroup) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.ckb);
        this.f412889r = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.f568211m40);
        this.f412890s = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.f568212m41);
        this.f412891t = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.m3z);
        this.f412886o = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.f565491ck4);
        this.f412887p = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.f565492ck5);
        com.p314xaae8f345.mm.ui.bk.s0(this.f412871e.getPaint());
        com.p314xaae8f345.mm.ui.bk.s0(this.f412878g.getPaint());
    }

    @Override // mu1.a
    public void h() {
        if (this.f412867a.s0().f470093s != null && this.f412867a.s0().f470093s.size() > 0) {
            r45.w50 w50Var = (r45.w50) this.f412867a.s0().f470093s.get(0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470411d)) {
                this.f412878g.setText(w50Var.f470411d);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470412e)) {
                this.f412879h.setVisibility(8);
            } else {
                this.f412879h.setText(w50Var.f470412e);
                this.f412879h.setVisibility(0);
            }
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f412879h.getLayoutParams();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470413f)) {
                this.f412880i.setVisibility(8);
                layoutParams.bottomMargin = this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi);
            } else {
                this.f412880i.setText(w50Var.f470413f);
                this.f412880i.setVisibility(0);
                layoutParams.bottomMargin = 0;
            }
            this.f412879h.setLayoutParams(layoutParams);
            this.f412879h.invalidate();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f412867a.s0().A1)) {
            this.f412885n.setVisibility(8);
        } else {
            lu1.a0.I(this.f412885n, this.f412867a.s0().A1);
            this.f412885n.setVisibility(0);
        }
        if (this.f412867a.i0() != null) {
            if (this.f412867a.i0().G != null) {
                r45.w50 w50Var2 = this.f412867a.i0().G;
                this.f412888q.setVisibility(0);
                this.f412888q.setForeground(this.f412868b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.auq));
                lu1.a0.I(this.f412889r, w50Var2.f470422r);
                this.f412890s.setText(w50Var2.f470411d);
                lu1.a0.I(this.f412891t, w50Var2.f470423s);
                this.f412888q.setOnClickListener(new mu1.b(this, w50Var2));
            } else {
                this.f412888q.setVisibility(8);
            }
            if (this.f412867a.i0().H != null) {
                r45.w50 w50Var3 = this.f412867a.i0().H;
                this.f412886o.setVisibility(0);
                android.view.View view = this.f412892u;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j(w50Var3.f470425u, this.f412886o, i65.a.b(this.f412868b, 1));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var3.f470426v)) {
                    this.f412887p.setVisibility(8);
                } else {
                    j(w50Var3.f470426v, this.f412887p, 0);
                    this.f412887p.setVisibility(0);
                }
                this.f412886o.setOnClickListener(new mu1.c(this, w50Var3));
            } else {
                this.f412886o.setVisibility(8);
                this.f412887p.setVisibility(8);
                android.view.View view2 = this.f412892u;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0) ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f412868b).m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0.class);
            android.widget.ImageView imageView = (android.widget.ImageView) a0Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565492ck5);
            if (imageView == null || !imageView.isShown()) {
                a0Var.m42293x373aa5(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569823p8, com.p314xaae8f345.mm.R.id.f565491ck4).m42335x2efe91(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.z(a0Var)).m42368x368f3a(com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21345x77471352);
            } else {
                a0Var.m42293x373aa5(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569823p8, com.p314xaae8f345.mm.R.id.f565491ck4).m42335x2efe91(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.y(a0Var)).m42368x368f3a(com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21345x77471352);
            }
        }
        if (this.f412881j == null || this.f412884m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardWidgetCommon", "consumeBtn == null || mCardCodeImg == null");
        } else if (this.f412867a.i0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo() == null");
            this.f412881j.setVisibility(8);
            this.f412884m.setVisibility(8);
        } else {
            if (this.f412867a.i0().f466731x != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "operate_field.title is " + this.f412867a.i0().f466731x.f470411d);
                java.lang.String str = this.f412867a.i0().f466731x.f470414g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "operate_field.aux_title is " + this.f412867a.i0().f466731x.f470413f);
            }
            r45.w50 w50Var4 = this.f412867a.i0().f466732y;
            if (w50Var4 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "limit_field.title is " + w50Var4.f470411d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "limit_field.show_flag is " + w50Var4.f470415h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "limit_field.aux_title is " + w50Var4.f470413f);
            }
            r45.jv6 jv6Var = this.f412867a.s0().N;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f412882k.findViewById(com.p314xaae8f345.mm.R.id.b9k);
            if (jv6Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(jv6Var.f459674g)) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                linearLayout.removeAllViews();
                java.util.Iterator it = jv6Var.f459674g.iterator();
                while (it.hasNext()) {
                    r45.w50 w50Var5 = (r45.w50) it.next();
                    android.view.View inflate = android.view.LayoutInflater.from(this.f412868b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.p_, (android.view.ViewGroup) linearLayout, false);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b9n);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b9j);
                    textView.setText(w50Var5.f470411d);
                    textView2.setText(w50Var5.f470412e);
                    linearLayout.addView(inflate);
                }
            }
            if (w50Var4 != null && !android.text.TextUtils.isEmpty(w50Var4.f470411d) && w50Var4.f470415h != 0 && this.f412867a.F()) {
                this.f412881j.setClickable(false);
                this.f412881j.setVisibility(0);
                this.f412881j.setTextColor(this.f412868b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                this.f412881j.setText(w50Var4.f470411d);
                if (android.text.TextUtils.isEmpty(w50Var4.f470412e)) {
                    this.f412883l.setVisibility(8);
                } else {
                    this.f412883l.setText(w50Var4.f470412e);
                    this.f412883l.setVisibility(0);
                }
                this.f412884m.setVisibility(8);
                long j17 = w50Var4.f470415h;
                if ((2 & j17) > 0) {
                    this.f412881j.setBackgroundDrawable(lu1.a0.m(this.f412868b, lu1.a0.e(this.f412867a.s0().f470088p, 150)));
                } else if ((j17 & 4) > 0) {
                    android.widget.Button button = this.f412881j;
                    android.content.Context context = this.f412868b;
                    button.setBackgroundDrawable(lu1.a0.m(context, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560836vj)));
                    this.f412881j.setTextColor(this.f412868b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
                } else {
                    this.f412881j.setBackgroundDrawable(lu1.a0.m(this.f412868b, lu1.a0.d(this.f412867a.s0().f470088p)));
                }
            } else if (this.f412867a.i0().f466731x != null && !android.text.TextUtils.isEmpty(this.f412867a.i0().f466731x.f470411d) && !android.text.TextUtils.isEmpty(this.f412867a.i0().f466731x.f470414g) && this.f412867a.F()) {
                this.f412881j.setClickable(true);
                this.f412881j.setForeground(this.f412868b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562633kq));
                this.f412881j.setVisibility(0);
                this.f412881j.setBackgroundDrawable(lu1.a0.m(this.f412868b, lu1.a0.d(this.f412867a.s0().f470088p)));
                this.f412881j.setTextColor(this.f412868b.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                this.f412881j.setText(this.f412867a.i0().f466731x.f470411d);
                if (this.f412867a.i0().f466731x == null || android.text.TextUtils.isEmpty(this.f412867a.i0().f466731x.f470413f)) {
                    this.f412883l.setVisibility(8);
                } else {
                    this.f412883l.setText(this.f412867a.i0().f466731x.f470413f);
                    this.f412883l.setVisibility(0);
                }
                if (android.text.TextUtils.isEmpty(this.f412867a.i0().f466722o)) {
                    this.f412884m.setVisibility(8);
                } else {
                    this.f412884m.setVisibility(0);
                }
            } else if (!android.text.TextUtils.isEmpty(this.f412867a.i0().f466722o) && this.f412867a.F()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().code is valid");
                this.f412884m.setVisibility(8);
                this.f412883l.setVisibility(8);
                this.f412881j.setClickable(true);
                this.f412881j.setForeground(this.f412868b.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562633kq));
                this.f412881j.setVisibility(0);
                this.f412881j.setBackgroundDrawable(lu1.a0.m(this.f412868b, lu1.a0.d(this.f412867a.s0().f470088p)));
                this.f412881j.setTextColor(this.f412868b.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                this.f412881j.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avs);
            } else if (this.f412867a.F()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "operate_field and code is empty!");
                this.f412881j.setVisibility(8);
                this.f412883l.setVisibility(8);
                this.f412884m.setVisibility(8);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().status is " + this.f412867a.i0().f466714d);
                this.f412884m.setVisibility(8);
                this.f412883l.setVisibility(8);
                this.f412881j.setClickable(true);
                this.f412881j.setVisibility(0);
                this.f412881j.setTextColor(this.f412868b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
                android.widget.Button button2 = this.f412881j;
                android.content.Context context2 = this.f412868b;
                button2.setBackgroundDrawable(lu1.a0.m(context2, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560310gx)));
                if (android.text.TextUtils.isEmpty(this.f412867a.s0().T)) {
                    lu1.g0.e(this.f412881j, this.f412867a.i0().f466714d);
                } else {
                    this.f412881j.setText(this.f412867a.s0().T);
                }
            }
        }
        this.f412869c.post(new mu1.d(this));
        this.f412869c.invalidate();
    }

    public final void j(java.lang.String str, android.widget.ImageView imageView, int i17) {
        o11.f fVar = new o11.f();
        fVar.f423616g = lp0.b.D();
        fVar.f423615f = xt1.q.m(str);
        fVar.f423611b = true;
        if (i17 > 0) {
            fVar.f423630u = i17;
            fVar.f423629t = true;
        } else {
            fVar.f423629t = false;
        }
        fVar.f423610a = true;
        n11.a.b().h(str, imageView, fVar.a());
    }

    @Override // mu1.a, mu1.j
    /* renamed from: setOnClickListener */
    public void mo148379xa0ca35fb(android.view.View.OnClickListener onClickListener) {
        this.f412872f = onClickListener;
        android.widget.Button button = this.f412881j;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f412884m;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(onClickListener);
        }
    }
}
