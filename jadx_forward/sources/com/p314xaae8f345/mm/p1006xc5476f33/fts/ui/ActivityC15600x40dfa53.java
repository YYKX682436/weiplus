package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/FTSBizDetailUI;", "Lcom/tencent/mm/plugin/fts/ui/FTSBaseUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBizDetailUI */
/* loaded from: classes12.dex */
public final class ActivityC15600x40dfa53 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int K = 0;
    public android.widget.ImageView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 D;
    public r45.h55 E;
    public su4.p1 F;
    public long H;

    /* renamed from: r, reason: collision with root package name */
    public boolean f219481r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f219482s;

    /* renamed from: t, reason: collision with root package name */
    public a23.g f219483t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q1 f219484u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f219485v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f219486w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f219487x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f219488y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f219489z;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f219479p = "MicroMsg.FTS.FTSBizDetailUI";

    /* renamed from: q, reason: collision with root package name */
    public int f219480q = 251658241;
    public final jz5.g G = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w1(this));
    public final java.util.HashSet I = new java.util.HashSet();

    /* renamed from: J, reason: collision with root package name */
    public int f219478J = 1;

    public static final void f7(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53, java.lang.String str) {
        int h76 = activityC15600x40dfa53.h7();
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.lang.String str2 = o13.n.l(h76).toString();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sceneActionType", "1");
        hashMap.put("isHomePage", "0");
        hashMap.put("needCameraIcon", "0");
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = 35;
        r45.h55 h55Var = activityC15600x40dfa53.E;
        java.lang.String str3 = h55Var != null ? h55Var.f457390d : null;
        if (str3 == null) {
            str3 = "";
        }
        objArr[1] = str3;
        objArr[2] = str;
        objArr[3] = java.lang.Long.valueOf(activityC15600x40dfa53.H);
        java.lang.String format = java.lang.String.format("%s:%s:%s:%s", java.util.Arrays.copyOf(objArr, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        hashMap.put("parentSearchID", format);
        hashMap.put("businessType", java.lang.String.valueOf(33554499));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Di(activityC15600x40dfa53, h76, str, str2, false, hashMap, 33554499, true, "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0
    public void R3(int i17, boolean z17) {
        super.R3(i17, z17);
        l7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q1 q1Var = this.f219484u;
        if (q1Var != null) {
            return q1Var;
        }
        int i17 = this.f219480q;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q1 q1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q1(this, i17 != 0 ? i17 != 1 ? 5 : 6 : 7, i17);
        this.f219484u = q1Var2;
        return q1Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public java.lang.String W6() {
        java.lang.String string = this.f219480q == 1 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3t) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String stringExtra = getIntent().getStringExtra("key_hint");
        if (stringExtra != null) {
            return stringExtra;
        }
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.id6, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void Z6() {
        super.Z6();
        i7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void a7() {
        super.a7();
        android.widget.LinearLayout linearLayout = this.f219482s;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void b7() {
        super.b7();
        android.widget.TextView textView = this.f219438f;
        if (textView != null) {
            textView.setText(this.f219480q == 1 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.nca) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncb));
        }
        this.f219436d.setVisibility(0);
        android.widget.LinearLayout linearLayout = this.f219482s;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void c7() {
        super.c7();
        android.widget.LinearLayout linearLayout = this.f219482s;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void d7() {
        super.d7();
        if (this.F != null) {
            gm0.j1.d().d(this.F);
            this.F = null;
        }
        this.H = o13.n.g(h7());
        r45.g55 g55Var = new r45.g55();
        g55Var.f456422d = this.f219443n;
        g55Var.f456424f = java.lang.String.valueOf((java.lang.String) ((jz5.n) this.G).mo141623x754a37bb());
        g55Var.f456425g = java.lang.String.valueOf(this.H);
        g55Var.f456430o = h7();
        g55Var.f456431p = 33554499;
        g55Var.f456433r = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
        su4.p1 p1Var = new su4.p1(g55Var);
        gm0.j1.d().g(p1Var);
        this.F = p1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void e7() {
        super.e7();
        this.f219478J = 1;
        this.E = null;
        android.view.View view = this.f219486w;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f219487x;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.I.clear();
        i7();
        if (this.F != null) {
            gm0.j1.d().d(this.F);
            this.F = null;
        }
    }

    public final int g7() {
        int i17 = this.f219480q;
        if (i17 != 0) {
            return i17 != 1 ? 33554499 : 52;
        }
        return 51;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    /* renamed from: getFooterView */
    public android.view.View mo63598x42edd6d6() {
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bd_, (android.view.ViewGroup) null, false);
        this.f219485v = inflate;
        if (inflate != null) {
            this.f219487x = inflate.findViewById(com.p314xaae8f345.mm.R.id.phq);
            this.f219486w = inflate.findViewById(com.p314xaae8f345.mm.R.id.pht);
            this.f219488y = inflate.findViewById(com.p314xaae8f345.mm.R.id.phs);
            this.A = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.phx);
            this.B = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.phv);
            this.C = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.phr);
            this.D = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4t);
            this.f219489z = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.ltp);
        }
        android.view.View view = this.f219488y;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.C;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.f219481r) {
            android.view.View view2 = this.f219487x;
            if (view2 != null) {
                view2.setMinimumHeight(view2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
            }
        } else {
            android.view.View view3 = this.f219487x;
            if (view3 != null) {
                view3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.r1(this));
            }
        }
        return this.f219485v;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbu;
    }

    public final int h7() {
        return this.f219480q != 1 ? 69 : 185;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if ((!r0.isEmpty()) == true) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7() {
        /*
            r9 = this;
            boolean r0 = r9.f219481r
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.LinearLayout r0 = r9.f219482s
            if (r0 == 0) goto Lc
            r0.removeAllViews()
        Lc:
            a23.g r0 = r9.f219483t
            r1 = 0
            if (r0 == 0) goto L16
            java.util.List r0 = r0.b()
            goto L17
        L16:
            r0 = r1
        L17:
            r2 = 0
            if (r0 == 0) goto L78
            java.util.Iterator r3 = r0.iterator()
            r4 = r2
        L1f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L78
            java.lang.Object r5 = r3.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L74
            a23.e r5 = (a23.e) r5
            android.view.LayoutInflater r4 = r9.getLayoutInflater()
            r7 = 2131497131(0x7f0c10ab, float:1.8617846E38)
            android.widget.LinearLayout r8 = r9.f219482s
            android.view.View r4 = r4.inflate(r7, r8, r2)
            r7 = 2131301911(0x7f091617, float:1.8221893E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = r5.f82382a
            r7.setText(r8)
            com.tencent.mm.plugin.fts.ui.s1 r8 = new com.tencent.mm.plugin.fts.ui.s1
            r8.<init>(r9, r5)
            r7.setOnClickListener(r8)
            com.tencent.mm.plugin.fts.ui.t1 r8 = new com.tencent.mm.plugin.fts.ui.t1
            r8.<init>(r4)
            r7.setOnTouchListener(r8)
            r7 = 2131302532(0x7f091884, float:1.8223153E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            com.tencent.mm.plugin.fts.ui.u1 r8 = new com.tencent.mm.plugin.fts.ui.u1
            r8.<init>(r4, r9, r5)
            r7.setOnTouchListener(r8)
            android.widget.LinearLayout r5 = r9.f219482s
            if (r5 == 0) goto L72
            r5.addView(r4)
        L72:
            r4 = r6
            goto L1f
        L74:
            kz5.c0.p()
            throw r1
        L78:
            if (r0 == 0) goto L83
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L83
            goto L84
        L83:
            r1 = r2
        L84:
            if (r1 == 0) goto Lab
            android.view.LayoutInflater r0 = r9.getLayoutInflater()
            r1 = 2131497130(0x7f0c10aa, float:1.8617844E38)
            android.widget.LinearLayout r3 = r9.f219482s
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r1 = 2131302522(0x7f09187a, float:1.8223133E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            com.tencent.mm.plugin.fts.ui.v1 r3 = new com.tencent.mm.plugin.fts.ui.v1
            r3.<init>(r9)
            r1.setOnClickListener(r3)
            android.widget.LinearLayout r1 = r9.f219482s
            if (r1 == 0) goto Lab
            r1.addView(r0)
        Lab:
            android.widget.LinearLayout r0 = r9.f219482s
            if (r0 != 0) goto Lb0
            goto Lb3
        Lb0:
            r0.setVisibility(r2)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53.i7():void");
    }

    public final void j7(r45.jo0 jo0Var, r45.h55 h55Var, int i17) {
        java.lang.String str;
        java.lang.String str2;
        r45.lq5 lq5Var = new r45.lq5();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bizsugresultreport=1&searchid=");
        sb6.append(h55Var.f457390d);
        sb6.append("&query=");
        sb6.append(fp.s0.b(this.f219443n, "utf8"));
        sb6.append("&scene=");
        sb6.append(h7());
        sb6.append("&businesstype=33554499&type=");
        sb6.append(i17);
        sb6.append("&clienttimestamp=");
        sb6.append(c01.id.c());
        sb6.append("&docid=");
        r45.di6 di6Var = jo0Var.f459519d;
        java.lang.String str3 = "";
        if (di6Var == null || (str = di6Var.f454046e) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("&sugpos=");
        sb6.append(jo0Var.f459520e + 1);
        sb6.append("&iss1sitem=0&sugresult=");
        r45.di6 di6Var2 = jo0Var.f459519d;
        if (di6Var2 != null && (str2 = di6Var2.f454045d) != null) {
            str3 = str2;
        }
        sb6.append(fp.s0.b(str3, "utf8"));
        lq5Var.f461289t = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f219479p, "reportSugAction " + lq5Var.f461289t);
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public final void k7(r45.h55 h55Var, int i17) {
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = "bizsugresultreport=1&searchid=" + h55Var.f457390d + "&query=" + fp.s0.b(this.f219443n, "utf8") + "&scene=" + h7() + "&businesstype=33554499&type=" + i17 + "&clienttimestamp=" + c01.id.c() + "&iss1sitem=1&docid=" + fp.s0.b(this.f219443n, "utf8");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportWebSearchBarAction ");
        sb6.append(lq5Var.f461289t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f219479p, sb6.toString());
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public final void l7() {
        r45.fi6 fi6Var;
        if (su4.r2.l()) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.f219489z;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        android.view.View view = this.f219486w;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f219487x;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String string = this.f219480q != 1 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.p09) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.p0_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (this.f219481r) {
            android.widget.ImageView imageView = this.A;
            if (imageView != null) {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb);
                layoutParams.height = i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb);
                imageView.setLayoutParams(layoutParams);
            }
            android.widget.TextView textView = this.B;
            if (textView != null) {
                textView.setText(string);
            }
            android.widget.TextView textView2 = this.B;
            if (textView2 != null) {
                textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
            }
            android.widget.TextView textView3 = this.B;
            if (textView3 != null) {
                textView3.setTextSize(0, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
            }
            android.widget.TextView textView4 = this.B;
            if (textView4 != null) {
                textView4.setSingleLine();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.D;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("key_search_bar_title_suffix");
            if (stringExtra == null) {
                stringExtra = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573694fg4);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            android.widget.TextView textView5 = this.B;
            if (textView5 != null) {
                textView5.setText(o13.q.m(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573703fh0), stringExtra, this.f219443n + "  "));
            }
        }
        r45.h55 h55Var = this.E;
        java.util.LinkedList linkedList = (h55Var == null || (fi6Var = h55Var.f457396m) == null) ? null : fi6Var.f455920d;
        if (this.f219481r) {
            if (linkedList == null || linkedList.isEmpty()) {
                linkedList = new java.util.LinkedList();
            }
            kz5.h0.B(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x1(this));
            r45.di6 di6Var = new r45.di6();
            java.lang.String str = this.f219443n;
            di6Var.f454045d = str;
            di6Var.f454046e = str;
            linkedList.addFirst(di6Var);
        }
        if (linkedList != null) {
            if (!(linkedList.size() > 0)) {
                linkedList = null;
            }
            if (linkedList != null) {
                int i17 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.di6 di6Var2 = (r45.di6) obj;
                    android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egp, (android.view.ViewGroup) this.f219489z, false);
                    inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y1(this));
                    android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi);
                    if (this.f219481r) {
                        textView6.setText(o13.q.c(textView6.getContext(), di6Var2.f454045d, this.f219443n));
                    } else {
                        textView6.setText(di6Var2.f454045d);
                    }
                    textView6.setContentDescription(di6Var2.f454045d + getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573708fh5));
                    r45.jo0 jo0Var = new r45.jo0();
                    jo0Var.f459519d = di6Var2;
                    jo0Var.f459520e = i17;
                    inflate.setTag(jo0Var);
                    android.widget.LinearLayout linearLayout2 = this.f219489z;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(inflate);
                    }
                    i17 = i18;
                }
                android.widget.LinearLayout linearLayout3 = this.f219489z;
                if (linearLayout3 == null) {
                    return;
                }
                linearLayout3.setVisibility(0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f219480q = getIntent().getIntExtra("intent_service_type", 251658241);
        this.f219481r = ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).cj();
        super.onCreate(bundle);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c = true;
        gm0.j1.d().a(1076, this);
        this.f219440h.m80997xdc5215a6().g();
        this.f219440h.m80997xdc5215a6().m();
        this.f219440h.m80997xdc5215a6().t();
        this.f219482s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.u2s);
        this.f219483t = new a23.g(g7());
        i7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(1076, this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q1 q1Var = this.f219484u;
        if (q1Var != null) {
            q1Var.g();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        i7();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fi6 fi6Var;
        java.util.LinkedList linkedList;
        su4.p1 p1Var = this.F;
        if (p1Var != null) {
            java.lang.Integer num = null;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, p1Var)) {
                p1Var = null;
            }
            if (p1Var != null) {
                this.E = p1Var.f494569f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd searchResponse GuideText:");
                r45.h55 h55Var = this.E;
                sb6.append(h55Var != null ? h55Var.f457394h : null);
                sb6.append(" size:");
                r45.h55 h55Var2 = this.E;
                if (h55Var2 != null && (fi6Var = h55Var2.f457396m) != null && (linkedList = fi6Var.f455920d) != null) {
                    num = java.lang.Integer.valueOf(linkedList.size());
                }
                sb6.append(num);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f219479p, sb6.toString());
                l7();
            }
        }
    }
}
