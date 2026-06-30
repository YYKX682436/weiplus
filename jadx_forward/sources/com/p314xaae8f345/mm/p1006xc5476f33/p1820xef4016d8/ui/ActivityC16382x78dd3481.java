package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI */
/* loaded from: classes9.dex */
public class ActivityC16382x78dd3481 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {
    public static final /* synthetic */ int F1 = 0;
    public android.widget.TextView A;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d A1;
    public android.widget.Button B;
    public final android.view.View.OnClickListener B1;
    public java.lang.String C;
    public int C1;
    public int D;
    public final qr.a D1;
    public java.lang.String E;
    public int E1;
    public int G;
    public java.lang.String H;
    public int I;
    public java.util.LinkedList M;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 P;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b Q;
    public android.view.ViewGroup R;
    public android.view.View S;
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb T;
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb U;
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 V;
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6647x77d2a065 W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f227902g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f227903h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f227904i;

    /* renamed from: l1, reason: collision with root package name */
    public int f227905l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f227906m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f227907n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a f227908o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f227909p;

    /* renamed from: p0, reason: collision with root package name */
    public int f227910p0;

    /* renamed from: p1, reason: collision with root package name */
    public long f227911p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f227912q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227913r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f227914s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f227915t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f227916u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f227917v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f227918w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f227919x;

    /* renamed from: x0, reason: collision with root package name */
    public int f227920x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f227921x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f227922y;

    /* renamed from: y0, reason: collision with root package name */
    public int f227923y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f227924y1;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719 f227925z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f227926z1;
    public android.app.Dialog F = null;

    /* renamed from: J, reason: collision with root package name */
    public boolean f227901J = true;
    public int K = 0;
    public int L = 0;
    public int N = 0;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5633xca375ce6> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = -1594159370;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5633xca375ce6 c5633xca375ce6) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5633xca375ce6 c5633xca375ce62 = c5633xca375ce6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "hkCashierPayResultIListener callback");
            if (c5633xca375ce62.f135961g.f87984a == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "hkCashierPayResultIListener callback paysucc");
                c5633xca375ce62.f135961g.f87985b = 1;
                ku5.u0 u0Var = ku5.t0.f394148d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481.this.finish();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 200L, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481.this.A1.mo48814x2efc64();
            return true;
        }
    }

    public ActivityC16382x78dd3481() {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.X = 1;
        this.Y = 0;
        this.Z = 0;
        this.f227910p0 = 0;
        this.f227920x0 = 0;
        this.f227923y0 = 0;
        this.f227905l1 = 0;
        this.f227911p1 = 0L;
        this.f227921x1 = false;
        this.f227924y1 = "";
        this.f227926z1 = "";
        this.A1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);
        this.B1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bh(this);
        this.C1 = 0;
        this.D1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.yg(this);
        this.E1 = 0;
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481) {
        int i17 = activityC16382x78dd3481.L;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i17 == 1) {
            if (!(activityC16382x78dd3481.K == 1)) {
                activityC16382x78dd3481.b7();
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16382x78dd3481.mo55332x76847179(), 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.dh(activityC16382x78dd3481);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.eh(activityC16382x78dd3481);
            k0Var.v();
        }
    }

    public final void W6(int i17) {
        java.lang.String str;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend()");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 15, 3, 0, 1, 1);
        android.app.Dialog dialog = this.F;
        if (dialog == null) {
            this.F = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(mo55332x76847179(), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fh(this));
        } else if (!dialog.isShowing()) {
            this.F.show();
        }
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.T;
        if (interfaceC4987x84e327cb != null) {
            str = interfaceC4987x84e327cb.mo42933xb5885648();
            i18 = this.T.mo42936xfb85f7b0();
        } else {
            str = "";
            i18 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend() mUniqueId:%s userConfirmJump:%s lastPayResult:%s mSendId:%s", this.f227926z1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.E1), this.f227924y1);
        if (!this.f227921x1) {
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k6(this.I, this.H, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.j(r17), this.C, r17, c01.z1.l(), this.D, str, i18, this.f227926z1, i17, this.E1, this.f227924y1, null), false);
        } else {
            int i19 = this.I;
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z5(1, i19, i19, 3, this.H, this.C, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.l(), c01.z1.r(), 2), false);
        }
    }

    public final void X6() {
        int i17;
        this.Z++;
        java.util.LinkedList linkedList = this.M;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex yearMessList is empty!");
            i17 = -1;
        } else {
            gm0.j1.i();
            int h17 = gm0.j1.b().h();
            int size = this.M.size();
            i17 = (((int) (java.lang.System.currentTimeMillis() % size)) + new java.util.Random(h17).nextInt(size)) % size;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex retRand:" + i17);
        }
        this.N = i17;
        if (i17 >= 0 && i17 < this.M.size()) {
            this.I = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f5) this.M.get(this.N)).f226807a;
            this.H = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f5) this.M.get(this.N)).f226808b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "mSelectIndex:" + this.N + " randomAmount:" + this.I + " randomWishing:" + this.H);
        this.f227925z.m66162x70ee0181(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(((double) this.I) / 100.0d));
        c7(false);
        this.f227925z.setFocusable(false);
        this.f227925z.setContentDescription("");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719 c16356x97a60719 = this.f227925z;
        c16356x97a60719.f227504x = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.hh(this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j(c16356x97a60719));
    }

    public final void Y6(int i17) {
        int i18 = this.L;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i18 == 0) {
            this.f227903h.setVisibility(0);
            android.view.View view = this.f227904i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f227907n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f227903h.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "exchangeExpressionState() state:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            android.view.View view3 = this.f227904i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f227906m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gj7);
            android.view.View view4 = this.f227907n;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 1) {
            android.view.View view5 = this.f227904i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f227907n;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f227909p.setVisibility(0);
            this.f227908o.setVisibility(8);
            this.f227912q.setVisibility(8);
            this.f227913r.setVisibility(8);
            this.f227914s.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            if (this.U != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
                this.V = c6646xbe932a67;
                c6646xbe932a67.f139948d = 4L;
                c6646xbe932a67.k();
            }
            this.U = this.T;
            int i19 = this.Y;
            if (i19 == 0) {
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.T;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var).getClass();
                if (n22.m.j(interfaceC4987x84e327cb)) {
                    this.X = 2;
                } else {
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = this.T;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var2).getClass();
                    if (n22.m.p(interfaceC4987x84e327cb2)) {
                        this.X = 4;
                    } else {
                        this.X = 3;
                    }
                }
            } else if (i19 == 1) {
                this.X = 2;
                this.f227910p0++;
            } else if (i19 == 2) {
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var3 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = this.T;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var3).getClass();
                if (n22.m.j(interfaceC4987x84e327cb3)) {
                    this.X = 2;
                    this.f227905l1++;
                } else {
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var4 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb4 = this.T;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var4).getClass();
                    if (n22.m.p(interfaceC4987x84e327cb4)) {
                        this.X = 4;
                        this.f227923y0++;
                    } else {
                        this.X = 3;
                        this.f227920x0++;
                    }
                }
            }
            android.view.View view7 = this.f227904i;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = this.f227907n;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f227909p.setVisibility(8);
            this.f227908o.setVisibility(0);
            this.f227912q.setVisibility(0);
            this.f227913r.setVisibility(8);
            this.f227914s.setVisibility(8);
            return;
        }
        if (i17 == 3) {
            android.view.View view9 = this.f227904i;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = this.f227907n;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f227909p.setVisibility(8);
            this.f227908o.setVisibility(8);
            this.f227912q.setVisibility(8);
            this.f227913r.setVisibility(0);
            this.f227914s.setVisibility(8);
            return;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                return;
            }
            android.view.View view11 = this.f227904i;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f227906m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573961gm1);
            android.view.View view12 = this.f227907n;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view13 = this.f227904i;
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
        arrayList13.add(8);
        java.util.Collections.reverse(arrayList13);
        yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
        yj0.a.f(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view14 = this.f227907n;
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        arrayList14.add(0);
        java.util.Collections.reverse(arrayList14);
        yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
        yj0.a.f(view14, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f227909p.setVisibility(8);
        this.f227908o.setVisibility(8);
        this.f227912q.setVisibility(8);
        this.f227913r.setVisibility(8);
        this.f227914s.setVisibility(0);
        this.f227915t.setImageResource(com.p314xaae8f345.mm.R.raw.f80553x3a45498e);
    }

    public final void Z6(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6647x77d2a065 c6647x77d2a065 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6647x77d2a065();
        this.W = c6647x77d2a065;
        c6647x77d2a065.f139949d = i17;
        c6647x77d2a065.f139950e = this.X;
        c6647x77d2a065.f139951f = this.Z;
        c6647x77d2a065.f139952g = this.f227910p0;
        c6647x77d2a065.f139953h = this.f227920x0;
        c6647x77d2a065.f139956k = this.f227923y0;
        c6647x77d2a065.f139954i = this.f227905l1;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.T;
        c6647x77d2a065.f139955j = c6647x77d2a065.b("EmoticonMd5", interfaceC4987x84e327cb == null ? "" : interfaceC4987x84e327cb.mo42933xb5885648(), true);
        this.W.k();
    }

    public final void a7(java.lang.String str) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(str);
        this.T = wi6;
        this.f227908o.m43719xc040f7d2(wi6);
        Y6(2);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, str);
    }

    public final void b7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
        this.V = c6646xbe932a67;
        c6646xbe932a67.f139948d = 10L;
        c6646xbe932a67.k();
        this.Y = 2;
        this.Q.show();
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
        int i18 = this.K;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i18 == 1) {
            this.P.mo75335xa4269d10(4);
        } else {
            this.P.mo75335xa4269d10(1);
        }
        fc3.j.c("", this.R, this.P, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ch(this));
    }

    public final void c7(boolean z17) {
        this.B.setClickable(z17);
        if (z17) {
            if (this.B.getBackground() != null && this.B.getBackground().mutate() != null) {
                this.B.getBackground().mutate().setAlpha(255);
            }
            this.B.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560895xh));
            return;
        }
        if (this.B.getBackground() != null && this.B.getBackground().mutate() != null) {
            this.B.getBackground().mutate().setAlpha(128);
        }
        this.B.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560896xi));
    }

    public void d7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:updateView");
        java.util.LinkedList linkedList = this.M;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is not valid!");
            this.f227917v.setVisibility(8);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is valid!");
            this.f227917v.setVisibility(0);
        }
        this.A.setTextSize(1, 21.0f);
        this.f227916u.setTextSize(1, 15.0f);
        this.f227925z.c(getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a58), getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f562086a56));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f227925z.getLayoutParams();
        layoutParams.topMargin = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f562080a50);
        this.f227925z.setLayoutParams(layoutParams);
        this.f227925z.invalidate();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f227917v.getLayoutParams();
        layoutParams2.topMargin = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f562082a52);
        this.f227917v.setLayoutParams(layoutParams2);
        this.f227917v.invalidate();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bus;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo64405x4dab7448(-839716110);
        mo67598xf0aced2e(8);
        this.f227902g = findViewById(com.p314xaae8f345.mm.R.id.j4q);
        this.f227916u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567290iy4);
        this.f227925z = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719) findViewById(com.p314xaae8f345.mm.R.id.j3c);
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4a);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567335j43);
        this.B = button;
        android.view.View.OnClickListener onClickListener = this.B1;
        button.setOnClickListener(onClickListener);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567338j46)).setOnClickListener(onClickListener);
        this.f227903h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j3p);
        this.f227904i = findViewById(com.p314xaae8f345.mm.R.id.j3n);
        this.f227906m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j3o);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j3g)).setOnClickListener(onClickListener);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j3o)).setOnClickListener(onClickListener);
        this.f227907n = findViewById(com.p314xaae8f345.mm.R.id.j3m);
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a c10448x87c5001a = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a) findViewById(com.p314xaae8f345.mm.R.id.j3f);
        this.f227908o = c10448x87c5001a;
        c10448x87c5001a.setOnClickListener(onClickListener);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j3k);
        this.f227912q = imageView;
        imageView.setOnClickListener(onClickListener);
        this.f227909p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j3j);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567333j41);
        this.f227913r = textView;
        textView.setOnClickListener(onClickListener);
        this.f227914s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j3e);
        this.f227915t = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.f567217im5);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567332j40);
        this.f227917v = linearLayout;
        linearLayout.setOnClickListener(onClickListener);
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b(this);
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.buc, (android.view.ViewGroup) null);
        this.S = inflate;
        this.Q.setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.S.findViewById(com.p314xaae8f345.mm.R.id.j0q).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zg(this));
        this.Q.f228265f = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ah(this);
        this.R = (android.view.ViewGroup) this.S.findViewById(com.p314xaae8f345.mm.R.id.j0s);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(mo55332x76847179());
        this.P = wi6;
        wi6.mo75357x9d98e686(this.C);
        fc3.j.b(this.P);
        this.f227918w = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j3q);
        this.f227919x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567320j22);
        this.f227922y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567319j21);
        if (this.f227921x1) {
            this.f227918w.setVisibility(4);
            this.f227902g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_n);
            this.f227919x.setVisibility(0);
            this.f227922y.setVisibility(4);
            this.f227916u.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d6 d6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1;
        if (i17 != 1) {
            if (i17 == 5) {
                if (intent == null || !intent.hasExtra("result_data")) {
                    return;
                }
                android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                if (bundleExtra == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
                    return;
                }
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(bundleExtra.getString("payState", "2"), 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + P);
                if (P == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 15, 3, 0, 1, 2);
                    finish();
                    return;
                }
                return;
            }
            if (i17 != 1111) {
                return;
            }
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "go emoji capture failed!");
                return;
            }
            if (intent != null) {
                this.f227911p1 = intent.getLongExtra("key_enter_time", 0L);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(this.f227911p1, 0L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "mTimeEnter == 0L go emoji capture failed!");
                return;
            }
            Y6(4);
            c7(false);
            qr.e eVar = qr.e.f447541a;
            long j17 = this.f227911p1;
            qr.a callback = this.D1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            pm0.v.X(new qr.c(j17, callback));
            return;
        }
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay success!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 15, 3, 0, 1, 2);
            boolean z17 = (intent == null || !intent.hasExtra("key_realname_guide_helper") || (c19088xa4b300c1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1) intent.getParcelableExtra("key_realname_guide_helper")) == null) ? false : !c19088xa4b300c1.a(this, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.xg(this), null);
            if (this.T == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() mEmojiInfo == null");
            } else {
                try {
                    int indexOf = this.E.indexOf("<wcpayinfo>");
                    if (indexOf > 0 && indexOf < this.E.length()) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.T;
                        if (interfaceC4987x84e327cb == null) {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
                            interfaceC4987x84e327cb = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                        }
                        gb3.q.a(sb6, interfaceC4987x84e327cb, 0);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(this.E.substring(0, indexOf));
                        java.lang.String trim = this.E.substring(indexOf).trim();
                        sb7.append((java.lang.CharSequence) sb6);
                        sb7.append(trim);
                        this.E = sb7.toString();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() success");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() Exception:%s", e17.getMessage());
                }
            }
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.E, "msg", null);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "luckymoneyNewYearSendUI onActivityResult values is null");
                finish();
                return;
            }
            if (hb3.o.Ni().Ui().a((java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid"))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "sendLocalMsg() for hb! mMsgXml:%s", this.E);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.C(this.E, this.C, 3);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "it is a duplicate msg");
            }
            if (!z17) {
                finish();
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
            this.V = c6646xbe932a67;
            int i19 = this.X;
            if (i19 == 1) {
                c6646xbe932a67.f139948d = 8L;
            } else if (i19 == 2) {
                c6646xbe932a67.f139948d = 6L;
            } else if (i19 == 3) {
                c6646xbe932a67.f139948d = 7L;
            } else if (i19 == 4) {
                c6646xbe932a67.f139948d = 14L;
            }
            c6646xbe932a67.k();
            Z6(1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay cancel or failed!");
        }
        java.lang.String r17 = c01.z1.r();
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() resultCode == RESULT_OK");
            this.E1 = 1;
            java.lang.String str = this.f227924y1;
            java.lang.String str2 = this.f227926z1;
            java.lang.String str3 = this.C;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            d6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d6(str, str2, 1, r17, str3 == null ? "" : str3);
        } else {
            if (intent != null) {
                this.E1 = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "doNetSceneLuckyMoneyReport() data == null");
                this.E1 = 3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() resultCode != RESULT_OK  payType:%s", java.lang.Integer.valueOf(this.E1));
            java.lang.String str4 = this.f227924y1;
            java.lang.String str5 = this.f227926z1;
            int i27 = this.E1;
            java.lang.String str6 = this.C;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            d6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d6(str4, str5, i27, r17, str6 == null ? "" : str6);
        }
        gm0.j1.n().f354821b.g(d6Var);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        Z6(2);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "lucky send ui create");
        this.C = getIntent().getStringExtra("key_username");
        this.D = getIntent().getIntExtra("key_way", 0);
        this.G = getIntent().getIntExtra("pay_channel", -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyNewYearSendUI", "name null finish");
            finish();
        }
        this.f227921x1 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s();
        mo43517x10010bd5();
        boolean z17 = this.f227921x1;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.A1;
        if (z17) {
            m66164x5406100e(new yb3.f());
            abstractC20980x9b9ad01d.mo48813x58998cd();
        } else {
            m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5(8, "v1.0", ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue()));
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13079, 1, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.Dialog dialog = this.F;
        if (dialog != null && dialog.isShowing()) {
            this.F.dismiss();
        }
        if (this.P != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "commentfooter release");
            this.P.h();
            this.P.getClass();
            this.P.a();
        }
        qr.e.f447541a.b(this.f227911p1, this.D1);
        this.A1.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.mo808xfb85f7b0());
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5 x5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5) m1Var;
                this.I = x5Var.f227231m;
                this.H = x5Var.f227229h;
                int i19 = x5Var.f227244z;
                this.K = i19;
                this.L = x5Var.A;
                this.f227926z1 = x5Var.f227237s;
                this.M = x5Var.D;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "enableSelfIe is %s", java.lang.Integer.valueOf(i19));
                X6();
                d7();
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    Y6(0);
                } else {
                    a7(str2);
                }
                mo67598xf0aced2e(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.B(this.f227902g, null);
                return true;
            }
            finish();
        } else if (m1Var instanceof yb3.f) {
            if (i17 == 0 && i18 == 0) {
                yb3.f fVar = (yb3.f) m1Var;
                int i27 = fVar.f542228p;
                if (i27 == 1) {
                    this.I = fVar.f542225m;
                    this.H = fVar.f542226n;
                    this.M = fVar.f542229q;
                    X6();
                    d7();
                    mo67598xf0aced2e(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.B(this.f227902g, null);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "hk sceneSwitch is %d", java.lang.Integer.valueOf(i27));
                finish();
            } else {
                finish();
            }
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z5) {
            android.app.Dialog dialog = this.F;
            if (dialog != null && dialog.isShowing()) {
                this.F.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z5) m1Var).f227271h;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "payUrl is null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "payUrl is not null");
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.W(mo55332x76847179(), str3, false, 5);
                }
            }
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6) {
            android.app.Dialog dialog2 = this.F;
            if (dialog2 != null && dialog2.isShowing()) {
                this.F.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6) m1Var;
                this.E = h6Var.f226858m;
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                c19760x34448d56.f273647m = h6Var.f226857i;
                c19760x34448d56.f273642e = 37;
                c19760x34448d56.f273644g = this.G;
                h45.a0.f(this, c19760x34448d56, 1);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
        } else {
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k6) {
                android.app.Dialog dialog3 = this.F;
                if (dialog3 != null && dialog3.isShowing()) {
                    this.F.dismiss();
                }
                if (i17 != 0 || i18 != 0) {
                    if (i18 == 268502454) {
                        db5.e1.t(this, str, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vg(this, m1Var));
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
                    this.E1 = 2;
                    if (android.text.TextUtils.isEmpty(str)) {
                        str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
                    }
                    mo67598xf0aced2e(4);
                    db5.e1.G(this, str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.wg(this, this));
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k6 k6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k6) m1Var;
                this.E = k6Var.f226933m;
                this.f227924y1 = k6Var.f226931h;
                if (k6Var.m66102x5c64639d()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() NetScenePrepareNewYearLuckyMoney show JumpRemind Alert");
                    k6Var.f227048f.h(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ug(this));
                    return true;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                c19760x34448d562.f273647m = k6Var.f226932i;
                c19760x34448d562.f273642e = 37;
                c19760x34448d562.f273644g = this.G;
                h45.a0.f(this, c19760x34448d562, 1);
                return true;
            }
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d6) {
                return true;
            }
        }
        return false;
    }
}
