package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI */
/* loaded from: classes12.dex */
public class ActivityC15592x3f0b3363 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 implements i11.c {
    public static final /* synthetic */ int W1 = 0;
    public int F1;
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 L1;
    public android.view.View M1;
    public android.view.View N1;
    public android.view.View O1;
    public android.widget.TextView P1;
    public android.view.View Q1;
    public android.view.View R1;
    public android.app.Dialog S1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q0 G1 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q0(this, null);
    public boolean H1 = true;
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.f0 I1 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.f0(this);
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d J1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6195x6d6250ec>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.1
        {
            this.f39173x3fe91575 = -1317958916;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6195x6d6250ec c6195x6d6250ec) {
            if (c6195x6d6250ec == null) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363.this.s7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainUI", "UpdateFtsSearchDataEvent");
            return false;
        }
    };
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.k1 K1 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.l0(this);
    public int T1 = -1;
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.r0 U1 = null;
    public int V1 = 1;

    public static void v7(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = activityC15592x3f0b3363.f219470y0.f291856h;
        if (o3Var != null) {
            if (o3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v) o3Var).m63651x26e44afa(true);
            } else if (o3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15620x588c74c5) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15620x588c74c5) o3Var).m63626x26e44afa(true);
            }
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15592x3f0b3363).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        if (((z13.f) a17).f7()) {
            activityC15592x3f0b3363.f219470y0.q(activityC15592x3f0b3363.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4p));
        } else {
            activityC15592x3f0b3363.h7();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            return;
        }
        activityC15592x3f0b3363.x7(true, b23.e.f98921d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        super.P4(str);
        this.G1.f219679c = false;
        if (this.H1 != com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            this.H1 = K0;
            android.view.View view = this.f219450h;
            if (view != null) {
                int i17 = (!K0 || this.f219449g <= 0) ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0
    public void R3(int i17, boolean z17) {
        boolean z18;
        boolean z19;
        int i18;
        boolean z27;
        boolean z28;
        super.R3(i17, z17);
        java.util.List<t13.k> list = this.L1.f219685q;
        boolean z29 = false;
        if (list != null && !list.isEmpty()) {
            for (t13.k kVar : list) {
                if (kVar != null && kVar.e() > 0 && kVar.mo9548xfb85f7b0() != 256) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = true;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q0 q0Var = this.G1;
            q0Var.f219679c = true;
            if (!this.L1.f219586m.f219618b) {
                boolean n17 = o13.n.n(b7());
                boolean o17 = o13.n.o(b7());
                if (i17 <= 0) {
                    android.view.View view = this.O1;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    i18 = 8;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (n17 || o17) {
                    android.view.View view2 = this.O1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i18 = 8;
                } else {
                    i18 = 8;
                }
                if (n17 || o17) {
                    android.view.View view3 = this.N1;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    g23.k kVar2 = this.L1.f219686r;
                    kVar2.f349488t = n17 ? 1 : 0;
                    kVar2.f349489u = o17 ? 1 : 0;
                    int i19 = n17 ? i18 : o17 ? 9 : 0;
                    p13.e eVar = new p13.e();
                    eVar.f432607b = kVar2.f349493y + 1;
                    eVar.f432612g = "SearchContactBar";
                    eVar.f432611f = c01.id.c() - kVar2.f349470b;
                    eVar.f432608c = i19;
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) kVar2.N;
                    if (!arrayList4.contains(eVar)) {
                        arrayList4.add(eVar);
                    }
                    android.view.View view4 = this.N1;
                    boolean z37 = view4 != null && view4.getVisibility() == 0;
                    q0Var.getClass();
                    if (z37) {
                        q0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2(16385), null);
                    }
                    z19 = false;
                    this.H = !z18 && z19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainUI", "onEnd: hasNoLocalResults=" + this.H + ", noLocalAdapterResult=" + z18 + ", noContactFooter=" + z19);
                }
            }
            z19 = true;
            this.H = !z18 && z19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainUI", "onEnd: hasNoLocalResults=" + this.H + ", noLocalAdapterResult=" + z18 + ", noContactFooter=" + z19);
        } else {
            android.view.View view5 = this.N1;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        boolean z38 = this.H;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[aisearch] onSearchEnd: hasLocalResult:" + z38);
        if (z38 && z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = fVar.f550932e;
            if (vVar != null) {
                if (vVar.f291495e.getLayout().getLineWidth(0) > vVar.f291495e.getWidth()) {
                    z28 = true;
                    z27 = true;
                } else {
                    z27 = false;
                    z28 = true;
                }
                if (z27 == z28) {
                    z29 = z28;
                }
            }
            if (z29) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar2 = fVar.f550932e;
                if (vVar2 != null) {
                    vVar2.m63652x82c606ea(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n1.f219840g);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar3 = fVar.f550932e;
                if (vVar3 != null) {
                    vVar3.q();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 W6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2(w0Var, this.F1);
        this.L1 = q2Var;
        q2Var.f219686r.f349494z = 2;
        q2Var.f219589p = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.m0(this);
        return q2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public java.util.List a7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.M1 == null) {
            android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcz, (android.view.ViewGroup) null, false);
            this.M1 = inflate;
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.mdo);
            this.N1 = findViewById;
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o0(this));
            this.O1 = this.M1.findViewById(com.p314xaae8f345.mm.R.id.mdn);
            this.P1 = (android.widget.TextView) this.M1.findViewById(com.p314xaae8f345.mm.R.id.mdq);
        }
        arrayList.add(this.M1);
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            c23.c0 c0Var = (c23.c0) pf5.z.f435481a.a(this).a(c23.c0.class);
            android.widget.ListView parentView = this.f219452l1;
            c0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
            if (c0Var.f119551t == null) {
                android.view.View inflate2 = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcw, (android.view.ViewGroup) parentView, false);
                em.l0 l0Var = new em.l0(inflate2);
                c0Var.f119551t = l0Var;
                if (l0Var.f336065d == null) {
                    l0Var.f336065d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f568135uy1);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = l0Var.f336065d;
                if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setVisibility(0);
                    }
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setOnClickListener(new c23.x(c0Var));
                    }
                } else if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(8);
                }
            }
            em.l0 l0Var2 = c0Var.f119551t;
            android.view.View view = l0Var2 != null ? l0Var2.f336062a : null;
            if (view != null) {
                arrayList.add(view);
            }
        }
        if (this.Q1 == null) {
            android.view.View inflate3 = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcc, (android.view.ViewGroup) null, false);
            this.Q1 = inflate3;
            this.R1 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.im7);
        }
        arrayList.add(this.Q1);
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n0(this), !mo78514x143f1b92().K() ? 0 : 100);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void g7() {
        int intExtra = getIntent().getIntExtra("from_tab_index", -1);
        if (intExtra == 0) {
            this.F1 = 1;
            return;
        }
        if (intExtra == 1) {
            this.F1 = 2;
            return;
        }
        if (intExtra == 2) {
            this.F1 = 3;
        } else if (intExtra != 3) {
            this.F1 = 0;
        } else {
            this.F1 = 4;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bcf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void h7() {
        this.f219470y0.q((java.lang.String) ((jz5.n) this.I1.f219801c).mo141623x754a37bb());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j7() {
        /*
            r11 = this;
            super.j7()
            boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(r11)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            pf5.z r0 = pf5.z.f435481a
            pf5.v r0 = r0.a(r11)
            java.lang.Class<z13.f> r3 = z13.f.class
            androidx.lifecycle.c1 r0 = r0.a(r3)
            java.lang.String r3 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            z13.f r0 = (z13.f) r0
            com.tencent.mm.plugin.fts.ui.widget.v r0 = r0.f550932e
            if (r0 == 0) goto L28
            boolean r0 = r0.D
            if (r0 != r1) goto L28
            r0 = r1
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 != 0) goto L36
            b23.e r0 = b23.e.f98921d
            r11.x7(r1, r0)
            goto L3b
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.y7(r0)
        L3b:
            android.view.View r0 = r11.R1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            java.util.Collections.reverse(r1)
            java.lang.Object[] r4 = r1.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI"
            java.lang.String r6 = "setEmptyQueryView"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI"
            java.lang.String r5 = "setEmptyQueryView"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363.j7():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void k7() {
        super.k7();
        x7(false, b23.e.f98921d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void l7() {
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void m7() {
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        super.n5(str);
        if (!this.G1.f219679c || android.text.TextUtils.isEmpty(b7()) || su4.r2.l()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = this.L1;
        q2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = q2Var.f219685q.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((t13.k) it.next()).g());
        }
        if (arrayList.size() == 0 && android.text.TextUtils.isEmpty(this.P1.getText())) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7161xc0c34297 c7161xc0c34297 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7161xc0c34297();
            c7161xc0c34297.f144654d = 1L;
            c7161xc0c34297.f144655e = 1L;
            c7161xc0c34297.f144656f = c7161xc0c34297.b("query", b7(), true);
            c7161xc0c34297.k();
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7161xc0c34297 c7161xc0c342972 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7161xc0c34297();
        c7161xc0c342972.f144654d = 1L;
        c7161xc0c342972.f144655e = 2L;
        c7161xc0c342972.f144656f = c7161xc0c342972.b("query", b7(), true);
        c7161xc0c342972.k();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void o7() {
        super.o7();
        x7(false, b23.e.f98921d);
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f219452l1.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Object m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4) m78511x9f88d943).c(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.i0(this));
        }
        h7();
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f219470y0.f291856h;
        if (o3Var != null) {
            o3Var.mo81056x490edfcd(4);
        }
        y7(java.lang.Boolean.TRUE);
        mo78530x8b45058f();
        o13.p.f423783c = o13.n.g(3);
        int i17 = this.F1;
        java.lang.String b76 = z13.f.Y6(mo55332x76847179()).b7();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.d(1L)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6985x41353810 c6985x41353810 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6985x41353810();
            c6985x41353810.f142955d = i17;
            c6985x41353810.s(java.lang.String.valueOf(o13.p.f423783c));
            c6985x41353810.f142957e = 1L;
            c6985x41353810.H = 1L;
            c6985x41353810.Y = o13.p.f423783c;
            c6985x41353810.f142968j0 = c01.id.c();
            c6985x41353810.p(b76);
            c6985x41353810.k();
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj() == null) {
            finish();
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c = true;
        su4.o2.f(null, 3, 0L, null, false);
        this.J1.mo48813x58998cd();
        ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).aj(3, 0);
        if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(this)) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            z13.f fVar = (z13.f) a17;
            yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$$a
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363.W1;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363.this;
                    if (activityC15592x3f0b3363.T) {
                        activityC15592x3f0b3363.x7(!bool.booleanValue(), b23.e.f98922e);
                        activityC15592x3f0b3363.y7(java.lang.Boolean.TRUE);
                        if (bool.booleanValue()) {
                            activityC15592x3f0b3363.f219470y0.q(activityC15592x3f0b3363.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4p));
                            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m1 m1Var = activityC15592x3f0b3363.f219470y0;
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var2 = m1Var.f291856h;
                            if (o3Var2 != null) {
                                o3Var2.c(bool2);
                            }
                        } else {
                            activityC15592x3f0b3363.f219470y0.q(activityC15592x3f0b3363.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4_));
                        }
                    } else {
                        activityC15592x3f0b3363.s7();
                    }
                    return jz5.f0.f384359a;
                }
            };
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[aisearch] setOnAISearchCheckedListener " + fVar.f550932e);
            fVar.f550933f = lVar;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = fVar.f550932e;
            if (vVar != null) {
                vVar.C = lVar;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        h7();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m1 m1Var = this.f219470y0;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j0(this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = m1Var.f291856h;
        if (o3Var != null) {
            o3Var.mo81054x7e02efba(j0Var);
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("en")) && com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            this.f219470y0.f219836t = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.k0(this);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((ku5.t0) ku5.t0.f394148d).A("FTSMainUI.GetLocation");
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).b();
        }
        o13.p.f423785e = "";
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = this.L1;
        if (q2Var != null) {
            q2Var.f219589p = null;
        }
        this.J1.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainUI", "onGetLocation %b %f|%f", java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4) {
                return false;
            }
            onBackPressed();
            return false;
        }
        if (!this.G1.f219679c || this.L1.getCount() != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b7())) {
            return false;
        }
        j75.f m67437x4bd5310 = m67437x4bd5310();
        java.lang.String b76 = b7();
        long j17 = o13.p.f423784d;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        m67437x4bd5310.B3(new fi0.b(b76, j17, k23.s2.a(((z13.f) a17).f550939o), true));
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
        c6205xeec13785.f136457g.f87952a = 0L;
        c6205xeec13785.e();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            this.B1 = null;
            this.T = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null);
        }
        su4.r2.o();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        mo48674x36654fab();
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void p7() {
        x7(false, b23.e.f98921d);
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void q7(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(str);
        u1Var.a(true);
        u1Var.c(null, null);
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void s7() {
        super.s7();
        ((java.util.ArrayList) this.G1.f219677a).clear();
        this.H = false;
        android.view.View view = this.O1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.N1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.V1 = 1;
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            z13.f fVar = (z13.f) a17;
            m67437x4bd5310().B3(new fi0.k(b7(), o13.p.f423784d, k23.s2.a(fVar.f550939o), fVar.i7()));
        }
        java.lang.CharSequence charSequence = o13.n.n(b7()) ? o13.q.d(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffm), "", p13.i.a(b7(), b7(), false, false)).f432638a : o13.n.o(b7()) ? o13.q.d(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffn), "", p13.i.a(b7(), b7(), false, false)).f432638a : null;
        android.widget.TextView textView = this.P1;
        if (textView != null) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(textView, "search_for_phoneAndQQ");
            aVar.ik(textView, 40, 33926);
        }
        this.P1.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(mo55332x76847179(), charSequence, i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void t7() {
        super.t7();
        this.V1 = 1;
        m67437x4bd5310().B3(new fi0.m(b7(), o13.p.f423784d));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78
    public void u7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b7())) {
            return;
        }
        m67437x4bd5310().B3(new fi0.b(b7(), o13.p.f423784d, true, false));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }

    public final void x7(boolean z17, b23.e eVar) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17 ? "true" : "false";
        objArr[1] = java.lang.Integer.valueOf(eVar.ordinal());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainUI", "setEducationPageVisible, visible: %s, sourceType: %d", objArr);
        m67437x4bd5310().B3(new b23.f(z17, eVar));
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        if (z17) {
            if (!(fVar.f550934g.length() > 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = fVar.f550932e;
                if (vVar != null) {
                    vVar.x();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar2 = fVar.f550932e;
                if (vVar2 != null) {
                    vVar2.y();
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar3 = fVar.f550932e;
            if (vVar3 != null) {
                vVar3.t();
            }
        }
        y7(java.lang.Boolean.valueOf(z17));
    }

    public void y7(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSMainUI", "[fts] setFTSBackgroundColorKt in isFinishing");
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(this)) {
            int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tyv);
            if (findViewById != null) {
                findViewById.setBackgroundColor(color);
            }
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.mfg);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(color);
            }
            mo64405x4dab7448(color);
            return;
        }
        int color2 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.akw);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.u8q);
        if (findViewById3 != null) {
            findViewById3.setBackgroundColor(color2);
        }
        mo64405x4dab7448(color2);
        if (!booleanValue) {
            color2 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560688al0);
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.tyv);
        if (findViewById4 != null) {
            findViewById4.setBackgroundColor(color2);
        }
        ul5.k m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != null) {
            m78511x9f88d943.mo82162xa5089f5c(color2);
        }
        mo78578x8b18f126(color2);
        this.f219470y0.f291861m = true;
    }
}
