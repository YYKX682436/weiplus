package wv1;

/* loaded from: classes12.dex */
public class k extends wv1.a {

    /* renamed from: f, reason: collision with root package name */
    public ot0.q f531479f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f531480g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f531481h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f531482i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Integer f531483j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f531484k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f531485l;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w wVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        super(wVar, f9Var);
        this.f531480g = str;
    }

    @Override // wv1.a
    public java.lang.String c() {
        return m() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(m().f430223o, "") : "";
    }

    @Override // wv1.a
    public java.lang.String d() {
        if (m() == null) {
            return "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f531480g, true);
        if (n17 != null) {
            this.f531482i = n17.f2();
        }
        return m().n();
    }

    @Override // wv1.a
    public long e() {
        if (m() != null) {
            return m().f430215m;
        }
        return 0L;
    }

    @Override // wv1.a
    public int h() {
        return 1;
    }

    @Override // wv1.a
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, wv1.a aVar) {
        java.lang.String n17;
        boolean containsKey;
        wv1.r rVar = (wv1.r) k3Var;
        rVar.f531506d.setTag(this);
        rVar.f531511i.setTag(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(rVar.f531507e, p(), null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context mo54478x76847179 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) this.f531462a).f177056d.mo54478x76847179();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n())) {
            n17 = n();
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o())) {
            if (this.f531482i == null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f531480g, true);
                if (n18 != null) {
                    this.f531482i = n18.f2();
                } else {
                    this.f531482i = "";
                }
            }
            n17 = this.f531482i;
        } else {
            n17 = o();
        }
        android.widget.TextView textView = rVar.f531508f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo54478x76847179, n17, textSize));
        rVar.f531509g.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.c(b(), g()));
        if (this.f531483j == null) {
            n82.e eVar = (n82.e) i95.n0.c(n82.e.class);
            java.lang.String c17 = c();
            ((a40.k) eVar).getClass();
            kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
            this.f531483j = java.lang.Integer.valueOf(o25.y.a(c17));
        }
        rVar.f531513n.setImageResource(this.f531483j.intValue());
        rVar.f531514o.setText(d());
        long e17 = e();
        android.widget.TextView textView2 = rVar.f531515p;
        if (e17 == 0) {
            textView2.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(e()));
        } else {
            textView2.setText(c().toUpperCase() + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(e()));
        }
        if (aVar == null || aVar.h() != 1) {
            android.view.View view = rVar.f531518s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = rVar.f531518s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.CheckBox checkBox = rVar.f531510h;
        checkBox.setVisibility(0);
        android.view.View view3 = rVar.f531511i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rVar.f531516q.setVisibility(8);
        rVar.f531517r.setVisibility(8);
        rVar.f531512m.setVisibility(8);
        boolean i18 = i();
        android.widget.LinearLayout linearLayout = rVar.f531506d;
        if (i18) {
            linearLayout.setAlpha(1.0f);
        } else {
            linearLayout.setAlpha(0.6f);
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            q(rVar);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new wv1.j(this, rVar));
        }
        xv1.b a17 = a();
        long f17 = f();
        java.util.Map map = a17.f538921b;
        if (map == null) {
            containsKey = false;
        } else {
            containsKey = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Long.valueOf(f17));
        }
        if (containsKey) {
            checkBox.setChecked(true);
        } else {
            checkBox.setChecked(false);
        }
    }

    @Override // wv1.a
    public void k(android.view.View view, wv1.a aVar) {
        boolean z17;
        boolean z18;
        xv1.b a17 = a();
        long f17 = f();
        synchronized (a17) {
            java.util.Set set = a17.f538923d;
            z17 = true;
            if (set != null) {
                if (((java.util.HashSet) set).contains(java.lang.Long.valueOf(f17))) {
                    z18 = true;
                }
            }
            z18 = false;
        }
        if (z18) {
            return;
        }
        int i17 = this.f531466e;
        if (i17 != 4 && i17 != 5) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        if (i()) {
            xv1.d.c(b(), f(), this.f531463b.Q0());
        } else {
            xv1.d.h(b(), a().f538920a);
        }
    }

    @Override // wv1.a
    public void l(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        wv1.r rVar = (wv1.r) k3Var;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            q(rVar);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new wv1.j(this, rVar));
        }
    }

    public final ot0.q m() {
        if (this.f531479f == null) {
            this.f531479f = ot0.q.v(this.f531463b.j());
        }
        return this.f531479f;
    }

    public final java.lang.String n() {
        if (this.f531485l == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f531480g, true);
            if (n17 != null) {
                this.f531485l = n17.w0();
            } else {
                this.f531485l = "";
            }
        }
        return this.f531485l;
    }

    public final java.lang.String o() {
        if (this.f531484k == null) {
            java.lang.String str = this.f531480g;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str) : null;
            if (z07 != null) {
                this.f531484k = z07.z0(p());
            } else {
                this.f531484k = "";
            }
        }
        return this.f531484k;
    }

    public java.lang.String p() {
        if (this.f531481h == null) {
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f531480g);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = xv1.d.f538924a;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f531463b;
            if (f9Var != null) {
                if (f9Var.A0() == 1) {
                    r2 = c01.z1.r();
                } else {
                    r2 = R4 ? c01.w9.s(f9Var.j()) : null;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)) {
                        r2 = f9Var.Q0();
                    }
                }
            }
            this.f531481h = r2;
        }
        return this.f531481h;
    }

    public final void q(wv1.r rVar) {
        int i17 = this.f531466e;
        if (i17 == 0) {
            rVar.f531516q.setVisibility(8);
            rVar.f531517r.setVisibility(8);
            android.widget.CheckBox checkBox = rVar.f531510h;
            checkBox.setVisibility(0);
            android.view.View view = rVar.f531511i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setChecked(false);
            rVar.f531512m.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            rVar.f531516q.setVisibility(0);
            rVar.f531517r.setVisibility(8);
            rVar.f531510h.setVisibility(8);
            android.view.View view2 = rVar.f531511i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f531512m.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            rVar.f531516q.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = rVar.f531517r;
            c22626x3e1b8dda.setVisibility(0);
            rVar.f531510h.setVisibility(8);
            android.view.View view3 = rVar.f531511i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f531512m.setVisibility(8);
            long j17 = this.f531465d;
            if (j17 > 0) {
                int i18 = (int) ((((float) this.f531464c) / ((float) j17)) * 100.0f);
                if (i18 == -1 || i18 >= 100) {
                    c22626x3e1b8dda.m81381x3ae760af(100);
                    return;
                } else {
                    c22626x3e1b8dda.m81381x3ae760af(i18);
                    return;
                }
            }
            return;
        }
        if (i17 == 3) {
            rVar.f531516q.setVisibility(8);
            rVar.f531517r.setVisibility(8);
            rVar.f531510h.setVisibility(0);
            android.view.View view4 = rVar.f531511i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f531512m.setVisibility(8);
            return;
        }
        if (i17 == 4) {
            rVar.f531516q.setVisibility(8);
            rVar.f531517r.setVisibility(8);
            rVar.f531510h.setVisibility(8);
            android.view.View view5 = rVar.f531511i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f531512m.setVisibility(0);
            rVar.f531515p.setText(c().toUpperCase() + " " + b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7_));
            return;
        }
        if (i17 != 5) {
            return;
        }
        rVar.f531516q.setVisibility(8);
        rVar.f531517r.setVisibility(8);
        rVar.f531510h.setVisibility(8);
        android.view.View view6 = rVar.f531511i;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rVar.f531512m.setVisibility(0);
        rVar.f531515p.setText(c().toUpperCase() + " " + b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b79));
    }
}
