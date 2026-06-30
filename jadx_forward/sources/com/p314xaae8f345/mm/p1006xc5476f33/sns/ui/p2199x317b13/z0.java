package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class z0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d {

    /* renamed from: q, reason: collision with root package name */
    public boolean f250965q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f250967s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f250969u;

    /* renamed from: r, reason: collision with root package name */
    public boolean f250966r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f250968t = new android.view.View.OnClickListener() { // from class: ed4.y$$a
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 z0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0.this;
            z0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", z0Var, array);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "VideoTimeLineItem click to post finder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = z0Var.f250967s;
            if (c17933xe8d1b226 == null) {
                yj0.a.h(z0Var, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
                return;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
            java.lang.String str = m70371x485d7.f39013x4c306a8a;
            java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", z0Var.f250967s.f38324x142bbdc6);
            if (n34.h3.f416143d.i(z0Var.f250784h.f249575h, j17, str, z0Var.f250967s.f68891x29d1292e, r7.f38324x142bbdc6, m70371x485d7.f39043xa1529a15, false, false)) {
                view.post(new ed4.z(z0Var, view));
            }
            yj0.a.h(z0Var, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f250970v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f250971w = "";

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f250972x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f250973y = false;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View.OnClickListener f250974z = new ed4.a0(this);

    public void F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "%s Ad Video doPause", this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f250969u;
        if (baseViewHolder != null && (g9Var = baseViewHolder.f250802f0) != null) {
            g9Var.f249948e.mo69313x65825f6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f250967s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250784h;
            if (bsVar != null && (l1Var = bsVar.f249569b) != null && (b1Var = l1Var.f251235c) != null && c17933xe8d1b226 != null) {
                b1Var.q(c17933xe8d1b226.f68891x29d1292e);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        }
        this.f250965q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    public final void G(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "lxl setVideoStatusIvVisibility %s, but isPlaying", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        } else {
            baseViewHolder.f250802f0.f249952i.setVisibility(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        }
    }

    public void H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "try show play btn");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f250969u;
        if (baseViewHolder != null && baseViewHolder.f250802f0 != null && !this.f250965q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "show play btn");
            this.f250969u.f250802f0.f249952i.setVisibility(0);
            this.f250969u.f250802f0.f249953j.setVisibility(8);
            this.f250969u.f250802f0.f249952i.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            this.f250969u.f250802f0.f249952i.setContentDescription(this.f250782f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x021e  */
    @Override // xd4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r25, int r26) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0.c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int):void");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "onUIPause");
        F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        android.view.View view = this.f250970v;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f250970v.getMeasuredWidth() + i17, this.f250970v.getMeasuredHeight() + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        return rect;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        this.f250782f.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.f250969u = baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.csn);
            android.view.ViewStub viewStub2 = (android.view.ViewStub) baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f566851ha2);
            if (!baseViewHolder.f250800e0) {
                baseViewHolder.f250802f0.f249947d = viewStub2.inflate();
                baseViewHolder.f250800e0 = true;
            }
        } else {
            baseViewHolder.f250802f0.f249947d = baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.n_5);
            baseViewHolder.f250800e0 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = baseViewHolder.f250802f0;
        g9Var.f249951h = g9Var.f249947d.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var2 = baseViewHolder.f250802f0;
        g9Var2.f249948e = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) g9Var2.f249947d.findViewById(com.p314xaae8f345.mm.R.id.h88);
        baseViewHolder.f250802f0.f249948e.mo69318x764d819b(true);
        baseViewHolder.f250802f0.f249951h.setOnClickListener(this.f250974z);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var3 = baseViewHolder.f250802f0;
        g9Var3.f249952i = (android.widget.ImageView) g9Var3.f249947d.findViewById(com.p314xaae8f345.mm.R.id.nhn);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var4 = baseViewHolder.f250802f0;
        g9Var4.f249953j = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) g9Var4.f249947d.findViewById(com.p314xaae8f345.mm.R.id.lbi);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var5 = baseViewHolder.f250802f0;
        g9Var5.f249955l = (android.widget.TextView) g9Var5.f249947d.findViewById(com.p314xaae8f345.mm.R.id.dgp);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var6 = baseViewHolder.f250802f0;
        g9Var6.f249954k = (android.widget.TextView) g9Var6.f249947d.findViewById(com.p314xaae8f345.mm.R.id.dhd);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var7 = baseViewHolder.f250802f0;
        g9Var7.f249956m = (android.widget.ImageView) g9Var7.f249947d.findViewById(com.p314xaae8f345.mm.R.id.nar);
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(344065, java.lang.Boolean.FALSE)).booleanValue()) {
            baseViewHolder.f250802f0.f249948e.m69300x417fee((android.widget.TextView) ((android.view.ViewStub) baseViewHolder.f250802f0.f249947d.findViewById(com.p314xaae8f345.mm.R.id.mwl)).inflate());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0759  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r35, int r36, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r37, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r38, int r39, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r40) {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "pause");
        F();
        H();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "%s Ad Video stop", this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f250969u;
        if (baseViewHolder != null && (g9Var = baseViewHolder.f250802f0) != null) {
            g9Var.f249948e.p();
        }
        this.f250965q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        return "VideoTimeLineItem";
    }
}
