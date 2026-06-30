package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class ExdeviceRankInfoUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements q32.e, com.tencent.mm.plugin.exdevice.ui.b7, q32.f, p32.k {
    public static int V = 128;
    public int A;
    public java.util.List B;
    public java.util.ArrayList C;
    public java.util.ArrayList D;
    public boolean E;
    public boolean F;
    public java.lang.String G;
    public java.lang.String H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f99332J;
    public java.lang.String K;
    public java.lang.String L;
    public boolean M;
    public boolean N;
    public boolean P;
    public r45.dh7 Q;
    public r45.ri5 R;
    public p32.l S;
    public int U;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f99333d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.i5 f99334e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f99335f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView f99336g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView f99337h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f99338i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f99339m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f99340n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f99341o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f99342p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f99343q;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f99346t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f99347u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f99348v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f99349w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f99350x;

    /* renamed from: y, reason: collision with root package name */
    public r32.a f99351y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f99352z;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99344r = null;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f99345s = new java.util.HashMap();
    public final h32.b T = new com.tencent.mm.plugin.exdevice.ui.m6(this);

    public static void U6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI, r45.ri5 ri5Var) {
        r45.za7 za7Var;
        exdeviceRankInfoUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankExtInfoView() called with: rankExtInfo = [" + ri5Var + "]");
        exdeviceRankInfoUI.f99342p.setVisibility(8);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(exdeviceRankInfoUI.f99342p, "wesport_rank_header_jumper");
        dy1.r ik6 = aVar.ik(exdeviceRankInfoUI.f99342p, 32, 32337);
        android.view.ViewGroup viewGroup = exdeviceRankInfoUI.f99342p;
        a42.g gVar = a42.g.f1206a;
        r45.ri5 ri5Var2 = exdeviceRankInfoUI.R;
        java.lang.String str = (ri5Var2 == null || (za7Var = ri5Var2.f384938d) == null) ? null : za7Var.f391881m;
        if (str == null) {
            str = "";
        }
        ((cy1.a) ik6).fk(viewGroup, "wesport_task_jumper_txt", gVar.a(str));
        if (ri5Var == null) {
            exdeviceRankInfoUI.f99342p.setVisibility(8);
            return;
        }
        r45.za7 za7Var2 = ri5Var.f384938d;
        if (za7Var2 != null) {
            exdeviceRankInfoUI.f99342p.setVisibility(0);
            exdeviceRankInfoUI.f99340n.setText(za7Var2.f391880i);
            gVar.c(exdeviceRankInfoUI.f99340n, 14.0f);
            exdeviceRankInfoUI.f99341o.setText(za7Var2.f391881m);
            gVar.c(exdeviceRankInfoUI.f99341o, 14.0f);
            android.widget.ImageView imageView = exdeviceRankInfoUI.f99339m;
            if (imageView != null) {
                imageView.setOutlineProvider(new a42.e(0.5f));
            }
            if (imageView != null) {
                imageView.setClipToOutline(true);
            }
            n11.a b17 = n11.a.b();
            java.lang.String str2 = za7Var2.f391879h;
            android.widget.ImageView imageView2 = exdeviceRankInfoUI.f99339m;
            o11.f fVar = new o11.f();
            fVar.f342077a = true;
            fVar.f342078b = true;
            fVar.f342096t = true;
            b17.h(str2, imageView2, fVar.a());
            exdeviceRankInfoUI.f99342p.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.n6(exdeviceRankInfoUI, za7Var2));
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(exdeviceRankInfoUI.f99342p, "wesport_rank_header_jumper");
            dy1.r ik7 = aVar2.ik(exdeviceRankInfoUI.f99342p, 8, 32337);
            android.view.ViewGroup viewGroup2 = exdeviceRankInfoUI.f99342p;
            r45.za7 za7Var3 = ri5Var.f384938d;
            java.lang.String str3 = za7Var3 != null ? za7Var3.f391881m : null;
            ((cy1.a) ik7).fk(viewGroup2, "wesport_task_jumper_txt", gVar.a(str3 != null ? str3 : ""));
        }
    }

    public static void V6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        android.view.View view = exdeviceRankInfoUI.f99346t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String W6() {
        java.util.List list = this.B;
        if (list == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r32.d dVar = ((com.tencent.mm.plugin.exdevice.ui.e7) it.next()).f99447a;
            if (dVar != null && dVar.field_ranknum == 1) {
                return dVar.field_username;
            }
        }
        return null;
    }

    public void X6(java.lang.String str) {
        ve4.g.a(6);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.class);
        intent.putExtra(dm.i4.COL_USERNAME, str);
        intent.putExtra("usernickname", (java.lang.String) ((java.util.HashMap) this.f99345s).get(str));
        intent.putExtra("app_username", this.f99349w);
        intent.putExtra("rank_id", this.f99350x);
        startActivityForResult(intent, 4);
    }

    public final void Y6() {
        r32.a aVar = this.f99351y;
        if (aVar == null) {
            this.f99338i.setImageResource(com.tencent.mm.R.color.f478866jc);
            this.L = null;
            return;
        }
        java.lang.String str = this.L;
        java.lang.String str2 = aVar.field_championUrl;
        if (str != str2) {
            if (str == null || !str.equals(str2)) {
                android.widget.ImageView imageView = this.f99338i;
                java.lang.String str3 = this.f99351y.field_championUrl;
                iz5.a.g(null, imageView != null);
                if (com.tencent.mm.sdk.platformtools.u3.e()) {
                    p32.g.b(this, imageView, str3, com.tencent.mm.R.color.f478866jc);
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new p32.d(this, imageView, str3, com.tencent.mm.R.color.f478866jc));
                }
                this.L = this.f99351y.field_championUrl;
            }
        }
    }

    public final void Z6(boolean z17) {
        if (z17) {
            java.lang.String W6 = W6();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(W6)) {
                this.f99352z = W6;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99349w)) {
            this.f99337h.setVisibility(8);
        } else {
            this.f99337h.a(this.f99352z);
            this.f99337h.setVisibility(0);
        }
    }

    public final void a7() {
        java.lang.String str;
        java.lang.String valueOf;
        r45.dh7 dh7Var;
        r32.a y07;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99332J) && (y07 = com.tencent.mm.plugin.exdevice.model.l3.wi().y0(this.f99347u)) != null) {
            this.f99332J = y07.field_championUrl;
        }
        r32.d c17 = this.f99334e.c(this.f99347u, this.D);
        if (c17 != null) {
            str = java.lang.String.valueOf(c17.field_ranknum);
            valueOf = java.lang.String.valueOf(c17.field_score);
        } else {
            str = "--";
            valueOf = (c17 != null || (dh7Var = this.Q) == null) ? "0" : java.lang.String.valueOf(dh7Var.f372476e);
        }
        new com.tencent.mm.plugin.exdevice.model.f3().b(this, str, valueOf, this.f99332J, new com.tencent.mm.plugin.exdevice.ui.g6(this));
    }

    @Override // q32.e
    public void b3(java.lang.String str, q32.d dVar) {
        iz5.a.g(null, (dVar == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? false : true);
        if (!"HardDeviceRankInfo".equals(str)) {
            if ("HardDeviceChampionInfo".equals(str) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f99352z) && this.f99352z.equals(dVar.f359931b)) {
                this.f99351y = com.tencent.mm.plugin.exdevice.model.l3.wi().y0(this.f99352z);
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.a6(this));
                return;
            }
            return;
        }
        java.lang.String str2 = this.f99350x;
        if (str2 == null || !str2.equals(dVar.f359930a)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "onRankChange, rankId(%s).", this.f99350x);
        d7(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99352z) || !this.f99352z.equals(W6())) {
            java.lang.String W6 = W6();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(W6)) {
                this.f99352z = W6;
            }
            this.f99351y = com.tencent.mm.plugin.exdevice.model.l3.wi().y0(this.f99352z);
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.y5(this));
        }
        runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.z5(this));
    }

    public final void b7() {
        java.util.List list;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "try2LocateToUser, locate2User(%s), username(%s).", this.K, this.f99347u);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.K)) {
            return;
        }
        java.lang.String str = this.K;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser, locate2User(%s), username(%s).", str, this.f99347u);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (list = this.B) == null || ((java.util.ArrayList) list).size() == 0) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.B).size(); i17++) {
            r32.d dVar = ((com.tencent.mm.plugin.exdevice.ui.e7) ((java.util.ArrayList) this.B).get(i17)).f99447a;
            int i18 = ((com.tencent.mm.plugin.exdevice.ui.e7) ((java.util.ArrayList) this.B).get(i17)).f99449c;
            if (dVar != null && str.equalsIgnoreCase(dVar.field_username) && !str.equalsIgnoreCase(this.f99347u) && (i18 & 2) != 2) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i19 = displayMetrics.heightPixels;
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser pos(%d).(h : %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
                this.f99333d.setSelectionFromTop(i17, i19 / 4);
                com.tencent.mm.plugin.exdevice.ui.i5 i5Var = this.f99334e;
                i5Var.f99508h = str;
                i5Var.g(this.Q);
                this.f99334e.notifyDataSetInvalidated();
                e7();
                return;
            }
        }
        this.f99334e.f99508h = null;
    }

    public final void c7() {
        java.lang.String str;
        r32.a aVar = this.f99351y;
        if (aVar != null && (str = this.f99347u) != null && str.equals(aVar.field_username) && com.tencent.mm.sdk.platformtools.t8.K0(this.f99351y.field_championUrl)) {
            android.view.View view = this.f99343q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView = this.f99336g;
            if (exdeviceRankListHeaderView != null) {
                exdeviceRankListHeaderView.setOnViewClickListener(new com.tencent.mm.plugin.exdevice.ui.r6(this));
                return;
            }
            return;
        }
        android.view.View view2 = this.f99343q;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r32.a aVar2 = this.f99351y;
        if (aVar2 != null) {
            java.lang.String str2 = aVar2.field_username;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(this.f99347u) || com.tencent.mm.sdk.platformtools.t8.K0(this.f99351y.field_championUrl)) {
                return;
            }
            this.f99336g.setOnViewClickListener(new com.tencent.mm.plugin.exdevice.ui.s6(this));
        }
    }

    public final void d7(boolean z17) {
        if (!this.F || z17) {
            this.D = com.tencent.mm.plugin.exdevice.model.l3.cj().a(this.f99350x);
            java.util.ArrayList J0 = com.tencent.mm.plugin.exdevice.model.l3.Ri().J0();
            this.C = J0;
            this.B = this.f99334e.a(J0, this.D, this.I);
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.b6(this));
        }
    }

    public final void e7() {
        android.view.View childAt = this.f99333d.getChildAt(0);
        int[] iArr = new int[2];
        if (childAt != null) {
            if (this.f99333d.getFirstVisiblePosition() == 0) {
                childAt.getLocationOnScreen(iArr);
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.K) && V == 128) {
                    V = iArr[1];
                }
                int i17 = iArr[1];
                if (i17 > 0) {
                    int i18 = V;
                    float f17 = i17 >= i18 ? 1.0f : i17 / i18;
                    this.f99337h.setAlpha(f17);
                    this.f99337h.setVisibility(0);
                    android.view.View view = this.f99343q;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
            }
            this.f99337h.setAlpha(0.0f);
            android.view.View view2 = this.f99343q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f99337h.setVisibility(8);
        }
    }

    public final void f7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankInfoUIFromServer");
        p32.l lVar = new p32.l(this.f99350x, this.f99349w, this.f99352z, this.E, this.T);
        this.S = lVar;
        lVar.f351501z = this;
        gm0.j1.n().f273288b.g(this.S);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a_f;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f99335f = findViewById(com.tencent.mm.R.id.f486161ke5);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView = new com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView(this);
        android.graphics.Rect rect = new android.graphics.Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i17 = rect.top;
        if (i17 == 0) {
            i17 = a42.i.d(this, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479745e2));
        }
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int dimensionPixelSize = displayMetrics.widthPixels > displayMetrics.heightPixels ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
        android.view.Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int height = ((defaultDisplay.getHeight() / 2) - i17) - dimensionPixelSize;
        if (defaultDisplay.getHeight() <= 0 || height <= 0) {
            height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479739dw);
        }
        exdeviceRankListHeaderView.setMinimumHeight(height);
        exdeviceRankListHeaderView.setMinimumWidth(defaultDisplay.getWidth());
        exdeviceRankListHeaderView.setTag(java.lang.Integer.valueOf(height));
        this.f99336g = exdeviceRankListHeaderView;
        this.f99342p = (android.view.ViewGroup) exdeviceRankListHeaderView.findViewById(com.tencent.mm.R.id.f484268rk4);
        this.f99340n = (android.widget.TextView) this.f99336g.findViewById(com.tencent.mm.R.id.okx);
        this.f99341o = (android.widget.TextView) this.f99336g.findViewById(com.tencent.mm.R.id.s9f);
        this.f99339m = (android.widget.ImageView) this.f99336g.findViewById(com.tencent.mm.R.id.hlr);
        this.f99342p.setVisibility(8);
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = (com.tencent.mm.ui.base.MMPullDownView) findViewById(com.tencent.mm.R.id.lcx);
        this.f99333d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.dja);
        this.f99337h = (com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView) findViewById(com.tencent.mm.R.id.beg);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mn7);
        this.f99343q = findViewById;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.t6(this));
        this.f99336g.setIsShowTip(false);
        c7();
        mMPullDownView.setIsBottomShowAll(false);
        mMPullDownView.setTopViewVisible(false);
        mMPullDownView.setBottomViewVisible(false);
        mMPullDownView.setIsBottomShowAll(false);
        mMPullDownView.setIsTopShowAll(false);
        boolean z17 = true;
        mMPullDownView.setCanOverScrool(true);
        mMPullDownView.setOnInterceptTouchEventListener(new com.tencent.mm.plugin.exdevice.ui.r5(this));
        mMPullDownView.setAtBottomCallBack(new com.tencent.mm.plugin.exdevice.ui.s5(this));
        mMPullDownView.setOnScrollChangedListener(new com.tencent.mm.plugin.exdevice.ui.t5(this));
        mMPullDownView.setAtTopCallBack(new com.tencent.mm.plugin.exdevice.ui.u5(this));
        this.f99333d.setOnScrollListener(new com.tencent.mm.plugin.exdevice.ui.v5(this));
        this.f99333d.addHeaderView(this.f99336g, null, false);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.a_d, (android.view.ViewGroup) null);
        this.f99346t = inflate.findViewById(com.tencent.mm.R.id.hes);
        inflate.findViewById(com.tencent.mm.R.id.her).setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.w5(this));
        android.view.View view = this.f99346t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f99333d.addFooterView(inflate);
        java.util.ArrayList arrayList2 = this.C;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        java.util.ArrayList arrayList3 = this.D;
        if (size + (arrayList3 != null ? arrayList3.size() : 0) == 0) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            this.B = arrayList4;
            this.f99334e.f99505e = arrayList4;
        }
        this.f99344r = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.exdevice.ui.x5(this));
        this.f99333d.setAdapter((android.widget.ListAdapter) this.f99334e);
        this.f99334e.f99509i = this;
        if (this.A == 1) {
            this.f99333d.setVisibility(0);
            android.view.View view2 = this.f99335f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f99333d.setVisibility(8);
            android.view.View view3 = this.f99335f;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        }
        if (!z17) {
            finish();
            return;
        }
        this.f99338i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.diw);
        mMPullDownView.setCanOverScrool(false);
        int B = i65.a.B(this);
        int intValue = ((java.lang.Integer) this.f99336g.getTag()).intValue();
        if (this.I) {
            intValue += (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479753ea) / 2) + getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.e_);
        }
        this.f99338i.setLayoutParams(new android.widget.FrameLayout.LayoutParams(B, intValue));
        Y6();
        Z6(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (!p32.g.a(this, i17, i18, intent, this.f99349w) && i18 == -1) {
            if (i17 == 1) {
                if (intent == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sport.ExdeviceRankInfoUI", "onActivityResult, data is null.(reqestCode : %d)", java.lang.Integer.valueOf(i17));
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (stringExtra == null || stringExtra.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sport.ExdeviceRankInfoUI", "select conversation failed, toUser is null.");
                    return;
                }
                com.tencent.mm.plugin.exdevice.model.f3.c(this, stringExtra, new com.tencent.mm.vfs.r6(getCacheDir(), "sport_share_bitmap.jpg").o(), intent.getStringExtra("custom_send_text"), this.H);
                db5.e1.T(getContext(), getResources().getString(com.tencent.mm.R.string.f490560yi));
                return;
            }
            if (i17 == 2) {
                db5.e1.T(getContext(), getResources().getString(com.tencent.mm.R.string.f490560yi));
                return;
            }
            if (i17 != 3) {
                if (i17 == 4 && intent != null && intent.getBooleanExtra("KeyNeedUpdateRank", false)) {
                    f7();
                    return;
                }
                return;
            }
            if (intent != null) {
                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("received_card_name").split(","));
                java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    ((dk5.s5) tg3.t1.a()).Di("gh_43f2581f6fd6", str, com.tencent.mm.storage.z3.R4(str), null);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                        com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                        am.mt mtVar = sendMsgEvent.f54752g;
                        mtVar.f7362a = str;
                        mtVar.f7363b = stringExtra2;
                        mtVar.f7364c = c01.e2.C(str);
                        mtVar.f7365d = 0;
                        sendMsgEvent.e();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0372  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.N = true;
        if (this.f99334e != null) {
            ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
            db5.d5 d5Var = com.tencent.mm.plugin.sport.model.c0.f171773a;
            if (d5Var != null) {
                d5Var.dismiss();
                com.tencent.mm.plugin.sport.model.c0.f171773a = null;
            }
        }
        super.onDestroy();
        p32.l lVar = this.S;
        if (lVar != null) {
            lVar.f351501z = null;
        }
        q32.a hj6 = com.tencent.mm.plugin.exdevice.model.l3.hj();
        hj6.getClass();
        android.util.SparseArray sparseArray = hj6.f359925a;
        if (sparseArray != null) {
            sparseArray.remove(hashCode());
        }
        com.tencent.mm.plugin.exdevice.model.l3.cj().f359929d = null;
        com.tencent.mm.plugin.exdevice.model.l3.cj().getClass();
        int i17 = this.U;
        if (i17 > 0) {
            jx3.f.INSTANCE.d(13168, 0, java.lang.Integer.valueOf(i17), 0, 0);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        d7(true);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(z32.a0.class);
        hashSet.add(y32.c.class);
    }
}
