package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag */
/* loaded from: classes14.dex */
public class C12701xfb956a00 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {

    /* renamed from: d, reason: collision with root package name */
    public wj1.m0 f171049d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f171050e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f171051f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.j f171052g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f171053h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f171054i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f171055m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f171056n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f171057o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.CheckBox f171058p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f171059q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f171060r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f171061s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f171062t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f171063u;

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: dealContentView */
    public void mo26076x2105eeb2(android.view.View view) {
        wj1.m0 m0Var = this.f171049d;
        if (m0Var == null || ((wj1.c0) m0Var).f528109a.f171072o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardShowFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
            return;
        }
        this.f171050e = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f564678xs);
        this.f171053h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564675xp);
        this.f171054i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564674xo);
        this.f171055m = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.f564680xu);
        this.f171056n = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564671xl);
        this.f171057o = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.f564673xn);
        this.f171058p = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.f564672xm);
        this.f171059q = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a0_);
        this.f171060r = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f564670xk);
        this.f171061s = view.findViewById(com.p314xaae8f345.mm.R.id.f564683xx);
        this.f171062t = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564681xv);
        this.f171063u = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564682xw);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_, (android.view.ViewGroup) null);
        this.f171051f = inflate;
        inflate.setBackgroundColor(m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        this.f171052g = new com.p314xaae8f345.mm.ui.j(this.f171051f);
        this.f171050e.addView(this.f171051f, 0, new android.widget.LinearLayout.LayoutParams(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b.a(mo7430x19263085())));
        r45.o56 o56Var = ((wj1.c0) this.f171049d).f528109a.f171072o;
        this.f171052g.g(o56Var.f463485g);
        this.f171052g.c(new wj1.a(this));
        l01.d0.f396294a.b(this.f171053h, o56Var.f463486h, l01.a.h(), l01.q0.f396320d);
        this.f171054i.setText(o56Var.f463487i + " " + o56Var.f463488m);
        java.util.LinkedList linkedList = o56Var.f463489n;
        if (linkedList != null) {
            this.f171055m.setVisibility(0);
            this.f171055m.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7438x76847179()));
            this.f171055m.mo7960x6cab2c8d(new wj1.i(linkedList));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.user_id_list is null");
            this.f171055m.setVisibility(8);
        }
        this.f171056n.setText(o56Var.f463490o);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o56Var.f463491p)) {
            this.f171057o.setText(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571693ml));
        } else {
            this.f171057o.setText(o56Var.f463491p);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.auth_checked:%b", java.lang.Boolean.valueOf(o56Var.f463496u));
        this.f171058p.setChecked(o56Var.f463496u);
        this.f171057o.setEnabled(o56Var.f463496u);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o56Var.f463497v)) {
            this.f171058p.setText(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571694mm));
        } else {
            this.f171058p.setText(o56Var.f463497v);
        }
        this.f171058p.setOnCheckedChangeListener(new wj1.b(this));
        this.f171057o.setOnClickListener(new wj1.c(this));
        r45.ic icVar = o56Var.f463492q;
        if (icVar != null) {
            this.f171059q.setText(icVar.f458454d);
            this.f171059q.setOnClickListener(new wj1.d(this, o56Var));
        }
        java.util.LinkedList linkedList2 = o56Var.f463493r;
        if (linkedList2 != null) {
            linkedList2.size();
            if (linkedList2.size() == 0) {
                this.f171060r.setVisibility(8);
                return;
            }
            if (linkedList2.size() == 1) {
                this.f171060r.setVisibility(0);
                android.view.View view2 = this.f171061s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f171063u.setVisibility(8);
                if (linkedList2.get(0) != null) {
                    this.f171062t.setText(((r45.ic) linkedList2.get(0)).f458454d);
                    this.f171062t.setOnClickListener(new wj1.e(this, o56Var));
                    return;
                }
                return;
            }
            this.f171060r.setVisibility(0);
            android.view.View view3 = this.f171061s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f171063u.setVisibility(0);
            if (linkedList2.get(0) != null) {
                this.f171062t.setText(((r45.ic) linkedList2.get(0)).f458454d);
                this.f171062t.setOnClickListener(new wj1.f(this, o56Var));
            }
            if (linkedList2.get(1) != null) {
                this.f171063u.setText(((r45.ic) linkedList2.get(1)).f458454d);
                this.f171063u.setOnClickListener(new wj1.g(this, o56Var));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569579fc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: noActionBar */
    public boolean mo48374x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onSwipeBack */
    public void mo25467x59cfc822() {
        wj1.m0 m0Var = this.f171049d;
        if (m0Var != null) {
            ((wj1.c0) m0Var).f528109a.mo2295x59cfc822();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }
}
