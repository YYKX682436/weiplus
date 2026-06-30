package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI */
/* loaded from: classes9.dex */
public class ActivityC16099xbf243344 extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {
    public static final /* synthetic */ int Y = 0;
    public android.view.View A;
    public android.view.View B;
    public android.widget.TextView C;
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d D;
    public v73.q E;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c G;
    public r45.n75 H;
    public r45.n75 I;
    public java.lang.String M;
    public long N;
    public long P;
    public int Q;
    public r45.an6 R;
    public boolean S;
    public at4.y1 T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public java.lang.String X;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f223820f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f223821g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f223822h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f223823i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f223824m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f223825n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f223826o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f223827p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f223828q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f223829r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f223830s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f223831t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f223832u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f223833v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f223834w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f223835x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f223836y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f223837z;
    public java.util.List F = new java.util.ArrayList();

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f223819J = "";
    public java.lang.String K = "";
    public java.lang.String L = "";

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "do qry detail");
        r73.l lVar = new r73.l(this.M);
        lVar.K(this);
        m83099x5406100e(lVar, true);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c W6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c e17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().e(str);
        return (e17 == null && (c19091x9511676c = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95537m) != null && c19091x9511676c.f69225xed6d60f6.equals(str)) ? c19091x9511676c : e17;
    }

    public final void X6(r45.rg5 rg5Var) {
        this.f223819J = rg5Var.f466386r;
        this.L = rg5Var.f466387s;
        this.R = rg5Var.f466383o;
        this.K = rg5Var.f466388t;
        this.F.clear();
        this.E.notifyDataSetChanged();
        r45.kp4 kp4Var = rg5Var.f466389u;
        if (kp4Var != null) {
            this.U = kp4Var.f460426d;
            this.V = kp4Var.f460428f;
            this.W = kp4Var.f460429g;
            this.X = kp4Var.f460427e;
        }
        r45.bx3 bx3Var = rg5Var.f466377f;
        if (bx3Var != null) {
            mo54450xbf7c1df6(bx3Var.f452664s);
            this.N = rg5Var.f466380i;
            this.P = rg5Var.f466379h;
            r45.n75 n75Var = rg5Var.f466377f.f452658m;
            if (n75Var != null) {
                this.G = W6(n75Var.f462670g);
                this.H = rg5Var.f466377f.f452658m;
            }
            r45.bx3 bx3Var2 = rg5Var.f466377f;
            java.lang.String str = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h(bx3Var2.f452653e, 6) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.fx_);
            android.widget.TextView textView = this.f223830s;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = this.f223830s.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f223825n, bx3Var2.f452653e, 0.06f);
            this.f223826o.setText(u73.h.a(bx3Var2.f452654f));
            this.f223828q.m81392x52cfa5c6(bx3Var2.f452657i != 0);
            Y6();
            this.D.m83148xdedf72f8(rg5Var.f466385q);
            int i17 = rg5Var.f466377f.f452655g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "detail state: %s", java.lang.Integer.valueOf(i17));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rg5Var.f466377f.f452663r)) {
                this.f223832u.setVisibility(8);
            } else {
                this.f223832u.setText(rg5Var.f466377f.f452663r);
                this.f223832u.setVisibility(0);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rg5Var.f466377f.f452656h)) {
                this.f223833v.setVisibility(8);
            } else {
                this.f223833v.setText(rg5Var.f466377f.f452656h);
                this.f223833v.setVisibility(0);
            }
            if (i17 == 1) {
                this.f223832u.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
                this.f223826o.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.h2z);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f223820f.removeFooterView(this.f223822h);
                this.f223822h.setVisibility(8);
                android.view.View view = this.A;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.S) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bjj, (android.view.ViewGroup) null);
                    this.f223824m = viewGroup;
                    ((android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566794h30)).setOnClickListener(new v73.k(this));
                    this.f223820f.addFooterView(this.f223824m);
                    m78600x5843c740(false);
                    m78499x92e71989(false);
                    mo54450xbf7c1df6("");
                }
            } else if (i17 == 2) {
                java.util.LinkedList linkedList = rg5Var.f466378g;
                if (linkedList != null && !linkedList.isEmpty()) {
                    this.F = rg5Var.f466378g;
                    this.E.notifyDataSetChanged();
                    this.f223820f.removeFooterView(this.f223822h);
                    this.f223822h.setVisibility(8);
                    r45.fq4 fq4Var = rg5Var.f466384p;
                    if (fq4Var != null) {
                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.bjl, null);
                        this.f223823i = viewGroup2;
                        ((android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.h2v)).setText(fq4Var.f456083d);
                        this.f223823i.setOnClickListener(new v73.l(this, fq4Var));
                        this.f223820f.addFooterView(this.f223823i);
                    }
                    findViewById(com.p314xaae8f345.mm.R.id.h3c).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560767tm);
                }
                this.f223827p.setVisibility(0);
                this.f223826o.setVisibility(0);
                android.view.View view2 = this.A;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.h2z);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i17 == 3) {
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.h2z);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f223834w.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fwu);
                this.f223836y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fxm);
                this.f223835x.setText(u73.h.b(rg5Var.f466377f.f452659n));
                this.f223837z.setText(u73.h.b(rg5Var.f466377f.f452660o));
                this.f223820f.removeFooterView(this.f223822h);
                this.f223822h.setVisibility(8);
                android.view.View view3 = this.A;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.h3g);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i17 == 4) {
                this.f223827p.setVisibility(8);
                android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.h2z);
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f223834w.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fxl);
                this.f223835x.setText(u73.h.b(rg5Var.f466377f.f452661p));
                android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.h3d);
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f223820f.removeFooterView(this.f223822h);
                this.f223822h.setVisibility(8);
                android.view.View view4 = this.A;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.h3g);
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(findViewById7, arrayList11.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(findViewById7, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById(com.p314xaae8f345.mm.R.id.h3c).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            }
        }
        android.view.View view5 = this.B;
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
        arrayList12.add(8);
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(view5, arrayList12.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u73.h.h(this, rg5Var.f466381m, this.M, 2, this.R);
        v73.n nVar = (v73.n) m80391xac8f1cfd(v73.n.class);
        nVar.getClass();
        ku5.u0 u0Var = ku5.t0.f394148d;
        v73.p pVar = new v73.p(nVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(pVar, 300L, false);
    }

    public final void Y6() {
        r45.n75 n75Var = this.H;
        if (n75Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "reset payway view for null");
            this.f223831t.setText("");
            this.f223831t.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.C.setVisibility(8);
            return;
        }
        this.f223831t.setText(n75Var.f462667d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H.f462668e)) {
            this.f223831t.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        } else {
            this.f223831t.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(this.H.f462668e, true));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H.f462673m)) {
            this.C.setVisibility(8);
        } else {
            this.C.setText(this.H.f462673m);
            this.C.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjo;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bjm, (android.view.ViewGroup) null);
        this.f223821g = viewGroup;
        this.f223828q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.h37);
        this.f223829r = (android.widget.LinearLayout) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h38);
        this.f223831t = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h3a);
        this.f223825n = (android.widget.ImageView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h2w);
        this.f223826o = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h3b);
        this.f223830s = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h3k);
        this.f223827p = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.f566800h36);
        this.f223832u = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h3i);
        this.f223833v = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h3h);
        this.f223834w = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.f566796h32);
        this.f223835x = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.f566797h33);
        this.f223836y = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h3e);
        this.f223837z = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h3f);
        this.A = this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h2y);
        this.C = (android.widget.TextView) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.h39);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) this.f223821g.findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.D = c22905xef04d72d;
        c22905xef04d72d.a();
        this.f223826o.b();
        this.f223828q.m81396xb3e0a10a(new v73.d(this));
        this.f223829r.setOnClickListener(new v73.e(this));
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fx_);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.append((java.lang.CharSequence) getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxb));
        spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(1, new v73.f(this)), string.length(), spannableStringBuilder.length(), 18);
        this.f223827p.setClickable(true);
        this.f223827p.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        this.f223827p.setText(spannableStringBuilder);
        this.f223822h = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bjk, (android.view.ViewGroup) null);
        this.B = findViewById(com.p314xaae8f345.mm.R.id.h2x);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f566799h35);
        this.f223820f = listView;
        listView.addHeaderView(this.f223821g);
        this.f223820f.addFooterView(this.f223822h, null, false);
        v73.q qVar = new v73.q(this, null);
        this.E = qVar;
        this.f223820f.setAdapter((android.widget.ListAdapter) qVar);
        this.f223820f.setOnItemClickListener(new v73.m(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            if (i18 == -1 && intent.getBooleanExtra("key_modify_create_line_succ", false)) {
                this.f223826o.setText(u73.h.a(intent.getLongExtra("key_credit_line", 0L)));
                setResult(-1);
            }
        } else if (i17 == 2) {
            if (i18 == -1) {
                m78548x39037dd1();
                setResult(-1);
                finish();
            }
        } else if (i17 == 3 && i18 == -1) {
            V6();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(2876);
        m83090x14f40144(2742);
        m83090x14f40144(2941);
        this.M = getIntent().getStringExtra("key_card_no");
        this.Q = getIntent().getIntExtra("key_scene", 0);
        this.S = getIntent().getBooleanExtra("key_is_create", false);
        getIntent().getStringExtra("key_card_type");
        mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f573821fx5);
        if (this.Q != 1) {
            V6();
            return;
        }
        r45.rg5 rg5Var = new r45.rg5();
        try {
            rg5Var.mo11468x92b714fd(getIntent().getByteArrayExtra("key_qry_response"));
            X6(rg5Var);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f223793d, e17, "", new java.lang.Object[0]);
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2876);
        m83121xf6ff5b27(2742);
        m83121xf6ff5b27(2941);
        at4.y1 y1Var = this.T;
        if (y1Var != null) {
            at4.c2.f95349d.d(y1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof r73.l) {
            r73.l lVar = (r73.l) m1Var;
            if (!lVar.f295564i && !lVar.f295565m) {
                X6(lVar.f474710r);
            }
        } else if (m1Var instanceof r73.i) {
            r73.i iVar = (r73.i) m1Var;
            boolean z17 = iVar.f295564i;
            boolean z18 = iVar.f295565m;
            int i19 = iVar.f474707s;
            if (z18) {
                this.f223828q.m81392x52cfa5c6(i19 != 1);
            }
            if (iVar.f295564i) {
                this.f223828q.m81392x52cfa5c6(i19 != 1);
            }
        } else if (m1Var instanceof r73.j) {
            r73.j jVar = (r73.j) m1Var;
            if (!jVar.f295564i && !jVar.f295565m) {
                r45.n75 n75Var = jVar.f474708r.f467431f;
                this.H = n75Var;
                if (n75Var != null) {
                    this.G = W6(n75Var.f462670g);
                }
                Y6();
            }
            if (jVar.f295565m) {
                r45.n75 n75Var2 = this.I;
                this.H = n75Var2;
                if (n75Var2 != null) {
                    this.G = W6(n75Var2.f462670g);
                }
                Y6();
            }
            if (jVar.f295564i) {
                r45.n75 n75Var3 = this.I;
                this.H = n75Var3;
                if (n75Var3 != null) {
                    this.G = W6(n75Var3.f462670g);
                }
                Y6();
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v73.n.class);
    }
}
