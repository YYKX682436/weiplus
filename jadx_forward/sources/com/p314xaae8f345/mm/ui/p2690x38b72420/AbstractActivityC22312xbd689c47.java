package com.p314xaae8f345.mm.ui.p2690x38b72420;

@gm0.a2
@java.lang.Deprecated
/* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC22312xbd689c47 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b2, android.widget.AdapterView.OnItemClickListener, db5.o9, com.p314xaae8f345.mm.ui.p2740x696c9db.b9, com.p314xaae8f345.mm.p2470x93e71c27.ui.c2, com.p314xaae8f345.mm.ui.p2690x38b72420.l4, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2 {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f287979d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 f287980e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 f287981f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 f287982g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 f287983h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f287984i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f287985m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f287986n;

    /* renamed from: o, reason: collision with root package name */
    public db5.d5 f287987o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f287988p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f287989q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f287990r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f287991s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f287992t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f287993u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 f287994v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f287995w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f287996x = true;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f287997y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f287998z = new java.util.HashSet();

    public static void V6(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47) {
        android.widget.TextView textView;
        abstractActivityC22312xbd689c47.s7();
        android.view.View view = abstractActivityC22312xbd689c47.f287991s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setNoResultStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setNoResultStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC22312xbd689c47.c7())) {
            return;
        }
        android.widget.TextView textView2 = abstractActivityC22312xbd689c47.f287992t;
        if (textView2 != null) {
            ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
            java.lang.String string = abstractActivityC22312xbd689c47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icq);
            java.lang.String string2 = abstractActivityC22312xbd689c47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icp);
            java.lang.String c76 = abstractActivityC22312xbd689c47.c7();
            textView2.setText(o13.q.d(string, string2, p13.i.a(c76, c76, false, false)).f432638a);
            java.lang.String stringExtra = abstractActivityC22312xbd689c47.getIntent().getStringExtra("no_result_tip");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (textView = abstractActivityC22312xbd689c47.f287993u) != null) {
                textView.setVisibility(0);
                abstractActivityC22312xbd689c47.f287993u.setText(stringExtra);
            }
        }
        android.widget.TextView textView3 = abstractActivityC22312xbd689c47.f287992t;
        textView3.announceForAccessibility(textView3.getText().toString());
        abstractActivityC22312xbd689c47.f287979d.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "setInitStatus");
        r7(this.f287979d, 0);
        com.p314xaae8f345.mm.ui.p2690x38b72420.a5 a5Var = this.f287981f;
        if (a5Var != null) {
            this.f287979d.setAdapter((android.widget.ListAdapter) a5Var);
            this.f287981f.notifyDataSetChanged();
        } else {
            if (a5Var == null) {
                this.f287981f = Z6();
            }
            this.f287979d.setAdapter((android.widget.ListAdapter) this.f287981f);
        }
        if (m7() && (c21465x84498b3 = this.f287980e) != null) {
            c21465x84498b3.setVisibility(0);
        }
        android.view.View view = this.f287991s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f287979d.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c2
    public void J3(boolean z17) {
        if (n7()) {
            v7();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b2
    public void L(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "onSearchTextChange: text=%s", str);
        if (n7()) {
            v7();
        }
        if (this.f287982g != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f287982g.s(str, d7(), o7());
                return;
            }
            this.f287982g.r();
            this.f287982g.notifyDataSetChanged();
            s7();
        }
    }

    public void M3(int i17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public android.widget.ListView O3() {
        return this.f287979d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "onSearchChange: searchText=%s", str);
        if (n7()) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f287984i;
            if (c9Var != null && (o3Var = c9Var.f291856h) != null) {
                o3Var.d();
            }
            v7();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f287982g.s(str, d7(), o7());
            return;
        }
        this.f287982g.r();
        this.f287982g.notifyDataSetChanged();
        s7();
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        int t17;
        android.widget.ListAdapter adapter = this.f287979d.getAdapter();
        if (adapter instanceof android.widget.HeaderViewListAdapter) {
            adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.a5 a5Var = this.f287981f;
        if (adapter != a5Var || a5Var == null) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var = this.f287982g;
            t17 = adapter == o4Var ? o4Var.t(str) : 0;
        } else {
            t17 = a5Var.r(str);
        }
        if (t17 == 0) {
            this.f287979d.setSelection(0);
            return;
        }
        if (t17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "Select unkown head selectPosition=%d | header=%s", java.lang.Integer.valueOf(t17), str);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 == null) {
            this.f287979d.setSelection(t17);
        } else {
            this.f287979d.setSelectionFromTop(t17, c19642xb279030.getMeasuredHeight());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "Select head selectPosition=%d | header=%s | y=%d", java.lang.Integer.valueOf(t17), str, java.lang.Integer.valueOf(this.f287983h.getMeasuredHeight()));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return null;
    }

    public void W6() {
    }

    public void X6() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f287984i;
        if (c9Var != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = c9Var.f291856h;
            if (o3Var != null ? o3Var.a() : false) {
                this.f287984i.a();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 == null || !c19642xb279030.hasFocus()) {
            return;
        }
        this.f287983h.clearFocus();
    }

    public void Y6() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var;
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f287984i;
        if (c9Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c9Var.g()) && (o3Var = this.f287984i.f291856h) != null) {
            o3Var.g(true);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19642xb279030.m75363x448ef5fb())) {
            return;
        }
        this.f287983h.c();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        s7();
        if (n7()) {
            v7();
        }
        if (l7()) {
            android.view.View view = this.f287985m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f287989q.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
            android.view.View view2 = this.f287986n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f287989q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f287979d.setVisibility(0);
        }
    }

    public abstract com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6();

    public abstract com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7();

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b7() {
        if (this.f287979d.getHeaderViewsCount() <= 0) {
            if (this.f287979d.getAdapter() instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p4) {
                return (com.p314xaae8f345.mm.ui.p2690x38b72420.p4) this.f287979d.getAdapter();
            }
            return null;
        }
        if (this.f287979d.getAdapter() instanceof android.widget.HeaderViewListAdapter) {
            android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) this.f287979d.getAdapter();
            if (headerViewListAdapter.getWrappedAdapter() instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p4) {
                return (com.p314xaae8f345.mm.ui.p2690x38b72420.p4) headerViewListAdapter.getWrappedAdapter();
            }
        }
        return null;
    }

    public final java.lang.String c7() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f287984i;
        if (c9Var != null) {
            return c9Var.g();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        return c19642xb279030 != null ? c19642xb279030.m75363x448ef5fb() : "";
    }

    public int[] d7() {
        return new int[]{131072, 131075, 131081};
    }

    public java.lang.String e7() {
        return "";
    }

    public float f7() {
        return -1.0f;
    }

    public abstract java.lang.String g7();

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c1d;
    }

    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
    }

    public void i7() {
        android.view.View view = this.f287985m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "hideTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "hideTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f287989q.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(g7());
        java.lang.String e76 = e7();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e76)) {
            mo54449x3f86539a(e76);
            if (f7() > 0.0f) {
                m78575xa6c64abb(f7());
            }
        }
        this.f287985m = findViewById(com.p314xaae8f345.mm.R.id.og6);
        this.f287986n = findViewById(com.p314xaae8f345.mm.R.id.f568903og0);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mil);
        this.f287979d = listView;
        listView.setVisibility(0);
        if (this.f287981f == null) {
            this.f287981f = Z6();
        }
        this.f287979d.setAdapter((android.widget.ListAdapter) this.f287981f);
        this.f287982g = a7();
        this.f287988p = findViewById(com.p314xaae8f345.mm.R.id.mqg);
        if (k7()) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kcl);
            this.f287991s = findViewById;
            findViewById.setTag(com.p314xaae8f345.mm.R.id.nwy, java.lang.Boolean.FALSE);
            this.f287992t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kcj);
            this.f287993u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kck);
            this.f287991s.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.q4(this));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030) findViewById(com.p314xaae8f345.mm.R.id.cek);
            this.f287983h = c19642xb279030;
            c19642xb279030.measure(android.view.View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            this.f287983h.m75368x62bf99da(this);
            this.f287983h.m75369x50775ebc(this);
            this.f287983h.m75367x3935f5b0(this);
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0c, (android.view.ViewGroup) null);
            this.f287990r = inflate;
            this.f287989q = inflate.findViewById(com.p314xaae8f345.mm.R.id.gxy);
            this.f287979d.addHeaderView(this.f287990r);
            if (l7()) {
                mo78530x8b45058f();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb2790302 = this.f287983h;
                if (c19642xb2790302 != null) {
                    c19642xb2790302.setVisibility(8);
                }
                android.view.View view = this.f287985m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f287989q.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
                android.view.View view2 = this.f287986n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
                this.f287984i = c9Var;
                c9Var.f291857i = this;
                c9Var.f291862n = true;
                this.f287985m.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.r4(this));
                this.f287986n.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.s4(this));
                m78489xd6d59aa8(true, this.f287984i);
            } else {
                android.view.View view3 = this.f287985m;
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f287989q.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                }
                android.view.View view4 = this.f287986n;
                if (view4 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f287983h.setVisibility(0);
            }
        }
        r7(this.f287979d, 0);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.t4(this));
        com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var = this.f287982g;
        if (o4Var != null) {
            o4Var.u(new com.p314xaae8f345.mm.ui.p2690x38b72420.u4(this));
        }
        this.f287979d.setOnScrollListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.v4(this));
        this.f287979d.setOnItemClickListener(this);
        if (m7()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3) findViewById(com.p314xaae8f345.mm.R.id.mio);
            this.f287980e = c21465x84498b3;
            c21465x84498b3.setVisibility(0);
            this.f287980e.m79298x40d747ee(this);
        }
        if (n7()) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 c22311xa7822c52 = (com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52) findViewById(com.p314xaae8f345.mm.R.id.mik);
            this.f287994v = c22311xa7822c52;
            ((android.widget.TextView) c22311xa7822c52.findViewById(android.R.id.title)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.ies);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a) this.f287994v.findViewById(com.p314xaae8f345.mm.R.id.cee);
            this.f287995w = c21516xe823d84a;
            c21516xe823d84a.m79140x4a0e4618(com.p314xaae8f345.mm.R.C30861xcebc809e.f563683b51);
            this.f287995w.m79141x9bf884bd(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            this.f287994v.m80407x96033f02(new com.p314xaae8f345.mm.ui.p2690x38b72420.w4(this));
            this.f287995w.m79124x6c4032e7(new com.p314xaae8f345.mm.ui.p2690x38b72420.x4(this));
        }
    }

    public void j7() {
        this.A = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
    }

    public boolean k7() {
        return this.f287982g != null;
    }

    public abstract boolean l7();

    public abstract boolean m7();

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    public boolean n7() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16489x8d6e80bc;
    }

    public boolean o7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "onCreate!");
        j7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "initData done!");
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "initView done!");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3 = this.f287980e;
        if (c21465x84498b3 != null) {
            c21465x84498b3.f279247q = null;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.a5 a5Var = this.f287981f;
        if (a5Var != null) {
            a5Var.k();
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var = this.f287982g;
        if (o4Var != null) {
            o4Var.k();
        }
        db5.d5 d5Var = this.f287987o;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00b9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00bc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemClick(android.widget.AdapterView r17, android.view.View r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            p7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.d5 d5Var = this.f287987o;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (n7() && this.f287996x) {
            this.f287996x = false;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2690x38b72420.z4(this));
        }
    }

    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    public void p7() {
        mo48674x36654fab();
        finish();
        W6();
    }

    public void q7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "select label=%s", str);
    }

    public void r7(android.widget.ListView listView, int i17) {
    }

    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    public void t7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 == null || (c22621x7603e017 = c19642xb279030.f271330t) == null) {
            return;
        }
        c22621x7603e017.setHintTextColor(c19642xb279030.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        c19642xb279030.f271330t.setTextColor(c19642xb279030.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
    }

    public void u7(int i17) {
        if (this.f287989q != null) {
            int e17 = i17 == 0 ? com.p314xaae8f345.mm.ui.zk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj) : com.p314xaae8f345.mm.ui.zk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
            if (this.f287989q.getHeight() != e17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f287989q.getLayoutParams();
                layoutParams.height = e17;
                this.f287989q.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
        android.view.View view = this.f287986n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onClickClearText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onClickClearText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void v7() {
        boolean hasFocus;
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f287984i;
        if (c9Var != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = c9Var.f291856h;
            if (o3Var != null) {
                hasFocus = o3Var.a();
            }
            hasFocus = false;
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
            if (c19642xb279030 != null) {
                hasFocus = c19642xb279030.hasFocus();
            }
            hasFocus = false;
        }
        if (!hasFocus || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c7())) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 c22311xa7822c52 = this.f287994v;
            if (c22311xa7822c52 != null) {
                c22311xa7822c52.setVisibility(8);
                return;
            }
            return;
        }
        java.util.List list = this.f287997y;
        if (list == null || list.size() <= 0) {
            this.f287994v.setVisibility(8);
        } else {
            this.f287994v.setVisibility(0);
            this.f287995w.r(null, this.f287997y);
        }
    }
}
