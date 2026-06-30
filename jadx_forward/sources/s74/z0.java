package s74;

/* loaded from: classes4.dex */
public final class z0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d {
    public final z74.c A;
    public final s74.x0 B;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f486150s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f486151t;

    /* renamed from: v, reason: collision with root package name */
    public r45.jj4 f486153v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f486154w;

    /* renamed from: x, reason: collision with root package name */
    public s74.p0 f486155x;

    /* renamed from: y, reason: collision with root package name */
    public s74.o2 f486156y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f486157z;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f486148q = jz5.h.b(new s74.v0(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f486149r = jz5.h.b(new s74.s0(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f486152u = jz5.h.b(new s74.u0(this));

    public z0() {
        jz5.h.b(new s74.t0(this));
        this.f486154w = "";
        this.A = new s74.y0(this);
        this.B = new s74.x0(this);
    }

    public static final /* synthetic */ s74.p0 F(s74.z0 z0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMContentHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        s74.p0 p0Var = z0Var.f486155x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMContentHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public boolean D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return true;
    }

    public final boolean G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        if (I() != 5 && I() != 15) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return false;
        }
        if (this.f486156y != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(this.f486150s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "dynamicAd livingStream doPause, item.hash=" + hashCode());
            s74.o2 o2Var = this.f486156y;
            if (o2Var != null && (R = o2Var.R()) != null) {
                R.g();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "dynamicAd video doPause, item.hash=" + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f486150s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250784h;
        if (bsVar != null && (l1Var = bsVar.f249569b) != null && (b1Var = l1Var.f251235c) != null && c17933xe8d1b226 != null) {
            b1Var.q(c17933xe8d1b226.f68891x29d1292e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        this.f486151t = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return true;
    }

    public final s74.o2 H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAdComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        s74.o2 o2Var = this.f486156y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAdComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return o2Var;
    }

    public final int I() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        s74.p0 p0Var = this.f486155x;
        int i17 = (p0Var == null || (c19807x593d1720 = p0Var.f38402x94f64b00) == null || (a90Var = c19807x593d1720.f39014x86965dde) == null) ? 0 : a90Var.f451370e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return i17;
    }

    public final android.view.ViewGroup J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f486152u).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return viewGroup;
    }

    public final android.widget.ImageView K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f486148q).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return imageView;
    }

    public final void L(s74.q0 playModel) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playModel, "playModel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        jz5.g gVar = this.f486149r;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.ImageView K = K();
        if (K != null) {
            K.setVisibility(8);
        }
        android.widget.ImageView K2 = K();
        if (K2 != null) {
            K2.setContentDescription(this.f250782f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "updateVideoUIModel, playModel = " + playModel);
        int ordinal = playModel.ordinal();
        if (ordinal == 2) {
            android.widget.ImageView K3 = K();
            if (K3 != null) {
                K3.setImageResource(com.p314xaae8f345.mm.R.raw.f81045x460fd68a);
            }
            android.widget.ImageView K4 = K();
            if (K4 != null) {
                K4.setVisibility(0);
            }
        } else if (ordinal == 3) {
            android.widget.ImageView K5 = K();
            if (K5 != null) {
                K5.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            }
            android.widget.ImageView K6 = K();
            if (K6 != null) {
                K6.setVisibility(0);
            }
        } else if (ordinal == 4) {
            android.widget.ImageView K7 = K();
            if (K7 != null) {
                K7.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            }
            android.widget.ImageView K8 = K();
            if (K8 != null) {
                K8.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    @Override // xd4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r14, int r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.z0.c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int):void");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "onUIPause");
        G();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        android.view.ViewGroup J2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        if ((I() != 5 && I() != 15) || (J2 = J()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        J2.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, J2.getMeasuredWidth() + i17, J2.getMeasuredHeight() + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return rect;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "AdDynamicViewHolder build content is called");
        if (!(baseViewHolder instanceof s74.p0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.TimeLineItem", "buildContent::the holder is not type of AdDynamicViewHolder!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        this.f486155x = (s74.p0) baseViewHolder;
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571054cu0);
                if (!((s74.p0) baseViewHolder).f250823q) {
                    android.view.View inflate = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    ((s74.p0) baseViewHolder).D0 = (android.view.ViewGroup) inflate;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    if (((s74.p0) baseViewHolder).b() == null) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(this.f250782f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571055cu1, (android.view.ViewGroup) null);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                        ((s74.p0) baseViewHolder).E0 = viewGroup;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    }
                    ((s74.p0) baseViewHolder).f250823q = true;
                }
            } else if (!((s74.p0) baseViewHolder).f250823q) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ((s74.p0) baseViewHolder).f250805h.findViewById(com.p314xaae8f345.mm.R.id.n2e);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                ((s74.p0) baseViewHolder).D0 = viewGroup2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                if (((s74.p0) baseViewHolder).b() == null) {
                    android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(this.f250782f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571055cu1, (android.view.ViewGroup) null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    ((s74.p0) baseViewHolder).E0 = viewGroup3;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                }
                ((s74.p0) baseViewHolder).f250823q = true;
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("build Content timeline item", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        android.app.Activity activity;
        r45.jj4 jj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        java.lang.String str;
        java.lang.String str2;
        s74.q0 q0Var;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202;
        boolean z18;
        java.lang.String str3;
        java.lang.String str4;
        s74.p0 p0Var;
        boolean z19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        if (!(baseViewHolder instanceof s74.p0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "holder is null!");
            ca4.q.c("holder is null", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        if (nsVar == null || (activity = this.f250782f) == null || !(activity instanceof p012xc85e97e9.p093xedfae76a.y)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.TimeLineItem", "fillItem::the struct or mActivity is null!!!");
            ca4.q.c("sth is null", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = nsVar.f251558a;
        if (c17933xe8d1b2262 == null) {
            ca4.q.c("mSnsInfo is null", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        this.f486150s = c17933xe8d1b2262;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d1720);
        r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
        r45.jj4 jj4Var2 = (a90Var == null || a90Var.f451373h.size() < 1) ? null : (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
        if (jj4Var2 == null) {
            ca4.q.c("mMedia is null", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        this.f486153v = jj4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2008, 0);
        s74.p0 p0Var2 = (s74.p0) baseViewHolder;
        p0Var2.f250836w0 = true;
        java.lang.String str6 = c19807x593d1720.Id;
        if (str6 == null) {
            str6 = "";
        }
        this.f486154w = str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17942x46376cf5 c17942x46376cf5 = p0Var2.f250813l;
        if (c17942x46376cf5 != null) {
            c17942x46376cf5.setVisibility(8);
        }
        s74.q0 q0Var2 = s74.q0.f486032d;
        L(q0Var2);
        if ((I() != 5 && I() != 15) || (jj4Var = this.f486153v) == null || (c17933xe8d1b226 = this.f486150s) == null) {
            str = "";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion";
        } else {
            i64.b1 b1Var = (bsVar == null || (l1Var = bsVar.f249569b) == null) ? null : l1Var.f251235c;
            l44.c0.b(c17933xe8d1b226, jj4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = this.f486150s;
            long j17 = c17933xe8d1b2263 != null ? c17933xe8d1b2263.f68891x29d1292e : 0L;
            java.lang.String Di = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di();
            r45.jj4 jj4Var3 = this.f486153v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jj4Var3);
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(Di, jj4Var3.f459388d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
            r45.jj4 jj4Var4 = this.f486153v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jj4Var4);
            java.lang.String R = ca4.z0.R(jj4Var4);
            str = "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSnsSightName(...)");
            java.lang.String concat = d17.concat(R);
            r45.jj4 jj4Var5 = this.f486153v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jj4Var5);
            int i19 = (int) jj4Var5.R;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "media videoDuration=" + (java.lang.System.nanoTime() - java.lang.System.nanoTime()));
            boolean D = hj6.D(this.f486153v);
            this.f486157z = s74.x2.g() && a84.p.c(this.f486150s);
            if (com.p314xaae8f345.mm.vfs.w6.j(concat)) {
                if (b1Var != null) {
                    b1Var.z(j17, i19, true);
                }
                l44.c0.e();
            } else if (b1Var != null) {
                b1Var.z(j17, i19, false);
            }
            boolean z27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().v(this.f486150s) == 5;
            if (b1Var != null) {
                b1Var.y(j17, z27, 1);
            }
            r45.jj4 jj4Var6 = this.f486153v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = this.f486150s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b2264);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            if (D) {
                if (hj7.E(jj4Var6)) {
                    q0Var = s74.q0.f486035g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                } else if (hj7.B(jj4Var6)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                    q0Var = q0Var2;
                } else {
                    if (hj7.v(c17933xe8d1b2264) <= 5) {
                        s74.p0 p0Var3 = this.f486155x;
                        if (p0Var3 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                            boolean z28 = p0Var3.F0;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                            if (z28) {
                                z17 = true;
                                q0Var = (!z17 || this.f486151t) ? q0Var2 : s74.q0.f486035g;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                            }
                        }
                        z17 = false;
                        if (z17) {
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                    } else {
                        hj7.V(jj4Var6);
                        q0Var = s74.q0.f486035g;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                    }
                    L(q0Var);
                }
            } else if (hj7.C(jj4Var6)) {
                q0Var = s74.q0.f486033e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            } else if (hj7.v(c17933xe8d1b2264) == 5) {
                hj7.U(jj4Var6);
                q0Var = s74.q0.f486033e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            } else if (hj7.z(jj4Var6)) {
                q0Var = s74.q0.f486034f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            } else {
                hj7.V(jj4Var6);
                if (hj7.v(c17933xe8d1b2264) == 4) {
                    q0Var = s74.q0.f486036h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                } else {
                    q0Var = s74.q0.f486035g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                }
            }
            L(q0Var);
        }
        p0Var2.f250802f0.f249951h = p0Var2.b();
        p0Var2.f250802f0.f249952i = K();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = p0Var2.f250802f0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2265 = this.f486150s;
        java.lang.String m70363x51f8f990 = c17933xe8d1b2265 != null ? c17933xe8d1b2265.m70363x51f8f990() : null;
        java.lang.String str7 = m70363x51f8f990 == null ? str : m70363x51f8f990;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2266 = this.f486150s;
        if (c17933xe8d1b2266 != null) {
            z18 = c17933xe8d1b2266.m70377x3172ed();
            c19807x593d17202 = c19807x593d1720;
        } else {
            c19807x593d17202 = c19807x593d1720;
            z18 = false;
        }
        g9Var.a(c19807x593d17202, 0, str7, z18);
        if (this.f486156y == null) {
            int j18 = s74.q4.f486046a.j(this.f250782f);
            android.content.ComponentCallbacks2 componentCallbacks2 = this.f250782f;
            p012xc85e97e9.p093xedfae76a.y yVar = componentCallbacks2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) componentCallbacks2 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            android.view.ViewGroup viewGroup = p0Var2.D0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            if (viewGroup == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            i64.b1 b1Var2 = (bsVar == null || (l1Var2 = bsVar.f249569b) == null) ? null : l1Var2.f251235c;
            if (b1Var2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            s74.r0 r0Var = new s74.r0(bsVar, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var3 = bsVar.f249569b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7 l7Var = l1Var3 != null ? l1Var3.f251236d : null;
            android.view.ViewGroup rootView = p0Var2.f250838x0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
            android.app.Activity mActivity = this.f250782f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mActivity, "mActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            android.view.ViewGroup viewGroup2 = p0Var2.D0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            if (viewGroup2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            android.view.ViewGroup b17 = p0Var2.b();
            if (b17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            android.view.ViewGroup J2 = J();
            if (J2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            str3 = "fillItem";
            str4 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem";
            z19 = false;
            p0Var = p0Var2;
            this.f486156y = new s74.o2("DynamicViewTimeline", yVar, viewGroup, 0, b1Var2, r0Var, l7Var, new s74.p2(rootView, j18, mActivity, viewGroup2, b17, J2, baseViewHolder, bsVar.f249572e, bsVar.d(), i17));
        } else {
            str3 = "fillItem";
            str4 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem";
            p0Var = p0Var2;
            z19 = false;
        }
        s74.o2 o2Var = this.f486156y;
        if (o2Var != null) {
            boolean z29 = this.f250780d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o2Var.B = z29;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        s74.o2 o2Var2 = this.f486156y;
        if (o2Var2 != null) {
            o2Var2.f(this.f486150s);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ad fillItem, dynamic card, pos=");
        sb6.append(i17);
        sb6.append(", snsId=");
        sb6.append(this.f486154w);
        sb6.append(", localId=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2267 = this.f486150s;
        sb6.append(c17933xe8d1b2267 != null ? c17933xe8d1b2267.m70363x51f8f990() : null);
        sb6.append(", hash=");
        sb6.append(hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", sb6.toString());
        p0Var.f250836w0 = z19;
        if (ca4.m0.X(I())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2268 = this.f486150s;
            if ((c17933xe8d1b2268 == null || !c17933xe8d1b2268.m70378x4c74e984()) ? z19 : true) {
                L(s74.q0.f486035g);
            }
        }
        java.lang.String str8 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endSection", str8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endSection", str8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "pause");
        if (G()) {
            L(s74.q0.f486035g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        s74.o2 o2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.TimeLineItem", "stop， hash=" + hashCode());
        this.f486151t = false;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(this.f486150s) && (o2Var = this.f486156y) != null && (R = o2Var.R()) != null) {
            R.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return "AdDynamicView";
    }
}
