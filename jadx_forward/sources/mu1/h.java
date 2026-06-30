package mu1;

/* loaded from: classes15.dex */
public class h extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f412904g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f412905h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f412906i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f412907j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f412908k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f412909l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f412910m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f412911n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f412912o;

    @Override // mu1.a, mu1.j
    public void a(android.graphics.drawable.ShapeDrawable shapeDrawable) {
        if (!android.text.TextUtils.isEmpty(this.f412867a.i0().A)) {
            this.f412911n.setBackgroundDrawable(null);
            this.f412912o.setVisibility(0);
            j();
        } else if (this.f412869c != null) {
            this.f412911n.setBackgroundDrawable(shapeDrawable);
            this.f412912o.setVisibility(8);
        }
    }

    @Override // mu1.a, mu1.j
    public void b(boolean z17) {
        if (android.text.TextUtils.isEmpty(this.f412867a.i0().f466722o) || !z17 || this.f412867a.i0().f466723p == 0 || this.f412867a.s0().f470084l1) {
            this.f412908k.setVisibility(8);
            android.view.View view = this.f412907j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f412908k.setVisibility(0);
        android.view.View view2 = this.f412907j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // mu1.a, mu1.j
    public void c(boolean z17) {
        if (android.text.TextUtils.isEmpty(this.f412867a.i0().A)) {
            this.f412910m.setVisibility(0);
            this.f412909l.setVisibility(0);
        } else {
            this.f412910m.setVisibility(8);
            this.f412909l.setVisibility(8);
        }
    }

    @Override // mu1.a, mu1.j
    public void d(boolean z17, boolean z18) {
    }

    @Override // mu1.a, mu1.j
    public void e(int i17) {
        if (!android.text.TextUtils.isEmpty(this.f412867a.i0().A)) {
            this.f412911n.setBackgroundDrawable(null);
            this.f412912o.setVisibility(0);
            j();
        } else if (this.f412869c != null) {
            this.f412911n.setBackgroundResource(i17);
            this.f412912o.setVisibility(8);
        }
    }

    @Override // mu1.a
    public void g() {
        this.f412904g = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bcg);
        this.f412905h = (android.widget.RelativeLayout) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bax);
        this.f412906i = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.c0u);
        this.f412907j = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b8x);
        this.f412908k = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b8y);
        this.f412909l = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.f567423jg0);
        this.f412910m = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.jfz);
        this.f412911n = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bau);
        this.f412912o = (android.widget.ImageView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.baw);
    }

    @Override // mu1.a
    public void h() {
        android.widget.TextView textView = this.f412871e;
        if (textView != null) {
            textView.setText(this.f412867a.s0().f470085m);
        }
        if (this.f412867a.s0().f470093s != null && this.f412867a.s0().f470093s.size() > 0) {
            r45.w50 w50Var = (r45.w50) this.f412867a.s0().f470093s.get(0);
            if (android.text.TextUtils.isEmpty(w50Var.f470411d)) {
                this.f412904g.setText("");
            } else {
                this.f412904g.setText(w50Var.f470411d);
            }
        }
        if (this.f412867a.F()) {
            b(true);
            this.f412911n.setAlpha(255);
            if (this.f412911n.getBackground() != null) {
                this.f412911n.getBackground().setAlpha(255);
            }
            java.lang.String str = this.f412867a.i0().f466722o;
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardWidgetMembership", "don't updateCodeLayout, code is empty!");
                b(false);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0) ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f412868b).m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0.class)).O6(false);
            } else {
                this.f412907j.setOnClickListener(this.f412872f);
                this.f412908k.setOnClickListener(this.f412872f);
                this.f412906i.setOnClickListener(this.f412872f);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0) ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f412868b).m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0.class)).O6(true);
                int i17 = this.f412867a.i0().f466723p;
                if (i17 != 0) {
                    if (i17 == 1 || i17 == 2) {
                        if (str.length() > 40) {
                            this.f412906i.setText("");
                        } else if (this.f412867a.m()) {
                            this.f412906i.setText(lu1.g0.a(4, str, true));
                        } else {
                            this.f412906i.setText("");
                        }
                    }
                } else if (str.length() <= 40) {
                    this.f412906i.setText(lu1.g0.a(4, str, true));
                } else {
                    this.f412906i.setText("");
                }
            }
        } else {
            this.f412906i.setText("");
            this.f412908k.setVisibility(8);
            android.view.View view = this.f412907j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f412911n.setAlpha(90);
            if (this.f412911n.getBackground() != null) {
                this.f412911n.getBackground().setAlpha(90);
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f412905h.getLayoutParams();
        layoutParams.height = ((this.f412868b.getResources().getDisplayMetrics().widthPixels - (this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi) * 2)) * 3) / 5;
        this.f412905h.setLayoutParams(layoutParams);
    }

    public final void j() {
        o11.f fVar = new o11.f();
        fVar.f423616g = lp0.b.D();
        fVar.f423615f = xt1.q.m(this.f412867a.i0().A);
        fVar.f423611b = true;
        fVar.f423629t = true;
        fVar.f423630u = this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561722qv);
        fVar.f423631v = true;
        fVar.f423610a = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f562671lm;
        fVar.f423620k = i65.a.h(this.f412868b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561725qy);
        fVar.f423619j = i65.a.B(this.f412868b);
        n11.a.b().h(this.f412867a.i0().A, this.f412911n, fVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetMembership", "the member back ground url is " + this.f412867a.i0().A);
    }
}
