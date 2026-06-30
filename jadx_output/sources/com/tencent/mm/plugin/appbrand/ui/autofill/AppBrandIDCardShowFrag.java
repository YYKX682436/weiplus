package com.tencent.mm.plugin.appbrand.ui.autofill;

/* loaded from: classes14.dex */
public class AppBrandIDCardShowFrag extends com.tencent.mm.ui.MMFragment {

    /* renamed from: d, reason: collision with root package name */
    public wj1.m0 f89516d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f89517e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f89518f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.j f89519g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f89520h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f89521i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f89522m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f89523n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f89524o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.CheckBox f89525p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f89526q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f89527r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f89528s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f89529t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f89530u;

    @Override // com.tencent.mm.ui.MMFragment
    public void dealContentView(android.view.View view) {
        wj1.m0 m0Var = this.f89516d;
        if (m0Var == null || ((wj1.c0) m0Var).f446576a.f89539o == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardShowFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
            return;
        }
        this.f89517e = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483145xs);
        this.f89520h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483142xp);
        this.f89521i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483141xo);
        this.f89522m = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.f483147xu);
        this.f89523n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483138xl);
        this.f89524o = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.f483140xn);
        this.f89525p = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.f483139xm);
        this.f89526q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a0_);
        this.f89527r = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483137xk);
        this.f89528s = view.findViewById(com.tencent.mm.R.id.f483150xx);
        this.f89529t = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483148xv);
        this.f89530u = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483149xw);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b_, (android.view.ViewGroup) null);
        this.f89518f = inflate;
        inflate.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a07));
        this.f89519g = new com.tencent.mm.ui.j(this.f89518f);
        this.f89517e.addView(this.f89518f, 0, new android.widget.LinearLayout.LayoutParams(-1, com.tencent.mm.plugin.appbrand.widget.b.a(getActivity())));
        r45.o56 o56Var = ((wj1.c0) this.f89516d).f446576a.f89539o;
        this.f89519g.g(o56Var.f381952g);
        this.f89519g.c(new wj1.a(this));
        l01.d0.f314761a.b(this.f89520h, o56Var.f381953h, l01.a.h(), l01.q0.f314787d);
        this.f89521i.setText(o56Var.f381954i + " " + o56Var.f381955m);
        java.util.LinkedList linkedList = o56Var.f381956n;
        if (linkedList != null) {
            this.f89522m.setVisibility(0);
            this.f89522m.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
            this.f89522m.setAdapter(new wj1.i(linkedList));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.user_id_list is null");
            this.f89522m.setVisibility(8);
        }
        this.f89523n.setText(o56Var.f381957o);
        if (com.tencent.mm.sdk.platformtools.t8.K0(o56Var.f381958p)) {
            this.f89524o.setText(getString(com.tencent.mm.R.string.f490160ml));
        } else {
            this.f89524o.setText(o56Var.f381958p);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.auth_checked:%b", java.lang.Boolean.valueOf(o56Var.f381963u));
        this.f89525p.setChecked(o56Var.f381963u);
        this.f89524o.setEnabled(o56Var.f381963u);
        if (com.tencent.mm.sdk.platformtools.t8.K0(o56Var.f381964v)) {
            this.f89525p.setText(getString(com.tencent.mm.R.string.f490161mm));
        } else {
            this.f89525p.setText(o56Var.f381964v);
        }
        this.f89525p.setOnCheckedChangeListener(new wj1.b(this));
        this.f89524o.setOnClickListener(new wj1.c(this));
        r45.ic icVar = o56Var.f381959q;
        if (icVar != null) {
            this.f89526q.setText(icVar.f376921d);
            this.f89526q.setOnClickListener(new wj1.d(this, o56Var));
        }
        java.util.LinkedList linkedList2 = o56Var.f381960r;
        if (linkedList2 != null) {
            linkedList2.size();
            if (linkedList2.size() == 0) {
                this.f89527r.setVisibility(8);
                return;
            }
            if (linkedList2.size() == 1) {
                this.f89527r.setVisibility(0);
                android.view.View view2 = this.f89528s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f89530u.setVisibility(8);
                if (linkedList2.get(0) != null) {
                    this.f89529t.setText(((r45.ic) linkedList2.get(0)).f376921d);
                    this.f89529t.setOnClickListener(new wj1.e(this, o56Var));
                    return;
                }
                return;
            }
            this.f89527r.setVisibility(0);
            android.view.View view3 = this.f89528s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f89530u.setVisibility(0);
            if (linkedList2.get(0) != null) {
                this.f89529t.setText(((r45.ic) linkedList2.get(0)).f376921d);
                this.f89529t.setOnClickListener(new wj1.f(this, o56Var));
            }
            if (linkedList2.get(1) != null) {
                this.f89530u.setText(((r45.ic) linkedList2.get(1)).f376921d);
                this.f89530u.setOnClickListener(new wj1.g(this, o56Var));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.f488046fc;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onSwipeBack() {
        wj1.m0 m0Var = this.f89516d;
        if (m0Var != null) {
            ((wj1.c0) m0Var).f446576a.onSwipeBack();
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
