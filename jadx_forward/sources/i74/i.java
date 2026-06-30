package i74;

/* loaded from: classes4.dex */
public class i implements i74.l, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f371024d;

    /* renamed from: e, reason: collision with root package name */
    public m74.b f371025e;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f371027g;

    /* renamed from: h, reason: collision with root package name */
    public final i74.d f371028h;

    /* renamed from: i, reason: collision with root package name */
    public final i74.a f371029i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f371030m;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f371032o;

    /* renamed from: p, reason: collision with root package name */
    public int f371033p;

    /* renamed from: f, reason: collision with root package name */
    public final int f371026f = com.p314xaae8f345.mm.R.C30864xbddafb2a.cos;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f371031n = new java.util.HashSet();

    public i(android.content.Context context) {
        this.f371032o = false;
        this.f371033p = 0;
        this.f371024d = context;
        i74.a aVar = new i74.a();
        this.f371029i = aVar;
        this.f371028h = new i74.d(context, aVar, this);
        this.f371033p = this.f371024d.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a_c);
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
            this.f371032o = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            aVar.f370990c = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
    }

    @Override // i74.l
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.util.Set set = this.f371031n;
        if (set != null) {
            ((java.util.HashSet) set).clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    @Override // i74.l
    public void b(android.view.View view, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        try {
            if (i17 == 5) {
                k(view, obj);
            } else {
                if (i17 == 1) {
                    m(view);
                } else if (i17 == 2) {
                    i();
                } else if (i17 == 3) {
                    j();
                } else if (i17 == 4) {
                    l(view, obj);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1962, i17 + 10);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FeedbackPromptManager", "onAction failed : actionId = " + i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public int c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f371033p, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view2.getMeasuredHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = iArr[0];
        rect.left = i17;
        rect.top = iArr[1];
        rect.right = i17 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        if (rect.bottom + measuredHeight <= rect2.height()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return 0;
        }
        int i18 = -(measuredHeight + rect.height());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return i18;
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        m74.b bVar = this.f371025e;
        if (bVar != null) {
            bVar.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    @Override // i74.l
    /* renamed from: dismiss */
    public void mo134889x63a3b28a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (this.f371025e == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f371024d).inflate(this.f371026f, (android.view.ViewGroup) null);
            m74.b bVar = new m74.b(this.f371024d);
            this.f371025e = bVar;
            bVar.setContentView(inflate);
            this.f371025e.setWidth(this.f371033p);
            this.f371025e.setHeight(-2);
            this.f371025e.setFocusable(true);
            this.f371025e.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            this.f371025e.setOnDismissListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        android.content.Context context = this.f371024d;
        boolean z17 = true;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return true;
        }
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return false;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return z17;
    }

    public ca4.j g(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("obtainAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.lang.Object tag = view.getTag();
        if (tag instanceof ca4.j) {
            ca4.j jVar = (ca4.j) tag;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return jVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPromptManager", "the tag is not AdUnlikeTag");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return null;
    }

    public android.view.View h(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (view instanceof android.view.ViewGroup) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return view;
        }
        java.lang.Object parent = view.getParent();
        if (parent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return view;
        }
        android.view.View view2 = (android.view.View) parent;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return view2;
    }

    public void i() {
        j74.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        p(true);
        d();
        i74.a aVar2 = this.f371029i;
        if (aVar2 != null) {
            aVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = aVar2.f370989b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 e17 = aVar2.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 d17 = aVar2.d();
            if (c17933xe8d1b226 == null || e17 == null || d17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                aVar = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createAdApprovedChannelData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
                aVar = new j74.a();
                aVar.f379584a = c17933xe8d1b226.f68891x29d1292e;
                aVar.f379586c = this.f371032o ? 2 : 1;
                aVar.f379585b = ca4.c0.a(d17.f38104xce64ddf1);
                aVar.f379587d = e17.f38172xd73c98cc;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAdApprovedChannelData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            a84.t0.a(aVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        try {
            android.content.Context context = this.f371024d;
            if (context != null) {
                android.content.Intent f17 = this.f371029i.f();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(f17, "complaint_weapp", false)) {
                    q(f17);
                } else {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(f17, context);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void k(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.util.Set set = this.f371031n;
        if (set != null && (obj instanceof j74.c)) {
            int i17 = ((j74.c) obj).f379597a;
            if (view == null || !view.isSelected()) {
                ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
            } else {
                ((java.util.HashSet) set).add(java.lang.Integer.valueOf(i17));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.i.l(android.view.View, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.View r13) {
        /*
            r12 = this;
            java.lang.String r0 = "onNoInterestingClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.util.Set r2 = r12.f371031n
            if (r2 == 0) goto L11
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.clear()
        L11:
            i74.a r2 = r12.f371029i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Lc4
            r2.getClass()
            java.lang.String r5 = "hasNoInterestingReason"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r6)
            com.tencent.mm.plugin.sns.storage.ADInfo r7 = r2.d()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5c
            com.tencent.mm.plugin.sns.storage.d r7 = r7.f38084x2725a301     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5c
            java.util.List r7 = r7.a()     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5c
            r8.<init>()     // Catch: java.lang.Throwable -> L5c
            r9 = r3
        L36:
            int r10 = r7.size()     // Catch: java.lang.Throwable -> L5c
            if (r9 >= r10) goto L54
            java.lang.Object r10 = r7.get(r9)     // Catch: java.lang.Throwable -> L5c
            com.tencent.mm.plugin.sns.storage.c r10 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) r10     // Catch: java.lang.Throwable -> L5c
            int r10 = r10.f247478d     // Catch: java.lang.Throwable -> L5c
            r11 = 10006(0x2716, float:1.4021E-41)
            if (r10 == r11) goto L51
            java.lang.Object r10 = r7.get(r9)     // Catch: java.lang.Throwable -> L5c
            com.tencent.mm.plugin.sns.storage.c r10 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) r10     // Catch: java.lang.Throwable -> L5c
            r8.add(r10)     // Catch: java.lang.Throwable -> L5c
        L51:
            int r9 = r9 + 1
            goto L36
        L54:
            boolean r7 = a84.b0.e(r8)     // Catch: java.lang.Throwable -> L5c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            goto L60
        L5c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            r7 = r3
        L60:
            if (r7 == 0) goto Lc4
            m74.b r5 = r12.f371025e
            if (r5 == 0) goto Lc4
            e42.c0 r13 = e42.c0.clicfg_fix_feedback_anchor_extra_space_ui
            int r13 = ca4.m0.u0(r13, r4)
            if (r13 != r4) goto L6f
            goto L70
        L6f:
            r4 = r3
        L70:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r5 = "fixExtraSpace is "
            r13.<init>(r5)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            java.lang.String r5 = "FeedbackPromptManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r13)
            if (r4 == 0) goto L98
            m74.b r13 = r12.f371025e
            android.view.View r13 = r13.getContentView()
            android.view.ViewTreeObserver r13 = r13.getViewTreeObserver()
            i74.f r4 = new i74.f
            r4.<init>(r12, r13)
            r13.addOnPreDrawListener(r4)
            goto Lb1
        L98:
            android.view.View r13 = r12.f371027g
            m74.b r4 = r12.f371025e
            android.view.View r4 = r4.getContentView()
            int r8 = r12.c(r13, r4)
            r12.n(r8)
            m74.b r5 = r12.f371025e
            android.view.View r6 = r12.f371027g
            r7 = 0
            r9 = -1
            r10 = -1
            r5.update(r6, r7, r8, r9, r10)
        Lb1:
            com.tencent.mm.plugin.sns.model.q2 r13 = r2.k(r3)
            if (r13 == 0) goto Le5
            gm0.j1.i()
            gm0.y r2 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r2 = r2.f354821b
            r2.g(r13)
            goto Le5
        Lc4:
            r12.p(r3)
            r12.d()
            com.tencent.mm.plugin.sns.ui.listener.i r3 = r12.f371030m
            if (r3 == 0) goto Ld1
            r3.G(r13)
        Ld1:
            if (r2 == 0) goto Le5
            com.tencent.mm.plugin.sns.model.q2 r13 = r2.k(r4)
            if (r13 == 0) goto Le5
            gm0.j1.i()
            gm0.y r2 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r2 = r2.f354821b
            r2.g(r13)
        Le5:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.i.m(android.view.View):void");
    }

    public void n(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        i74.d dVar = this.f371028h;
        if (dVar != null) {
            dVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = dVar.f370996f;
            if (c22699x3dcdb352 != null && dVar.f370997g != null) {
                if (i17 < 0) {
                    c22699x3dcdb352.setVisibility(8);
                    dVar.f370997g.setVisibility(0);
                } else {
                    c22699x3dcdb352.setVisibility(0);
                    dVar.f370997g.setVisibility(8);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:7:0x0013, B:9:0x0019, B:12:0x0023, B:20:0x003c, B:24:0x004a, B:28:0x0059, B:30:0x0082, B:31:0x008f, B:34:0x0089, B:37:0x0040), top: B:6:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(android.view.View r8, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r9) {
        /*
            r7 = this;
            i74.a r0 = r7.f371029i
            java.lang.String r1 = "FeedbackPromptManager"
            java.lang.String r2 = "showFeedback"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            if (r8 != 0) goto L13
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        L13:
            ca4.j r5 = r7.g(r8)     // Catch: java.lang.Throwable -> Laf
            if (r5 != 0) goto L23
            java.lang.String r8 = "the unlike tag is null. there is no data for showing window!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)     // Catch: java.lang.Throwable -> Laf
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        L23:
            r0.q(r5, r9)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r9 = "shouldUseNewFeedbackPanel"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r5)     // Catch: java.lang.Throwable -> Laf
            r6 = 1
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.e()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            int r0 = r0.f38258x18e4c3bf     // Catch: java.lang.Throwable -> L40
            if (r0 <= 0) goto L3b
            r0 = r6
            goto L3c
        L3b:
            r0 = r4
        L3c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r5)     // Catch: java.lang.Throwable -> Laf
            goto L44
        L40:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r5)     // Catch: java.lang.Throwable -> Laf
            r0 = r4
        L44:
            if (r0 != 0) goto L4a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        L4a:
            r7.e()     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f371025e     // Catch: java.lang.Throwable -> Laf
            boolean r9 = r9.isShowing()     // Catch: java.lang.Throwable -> Laf
            if (r9 == 0) goto L59
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r6
        L59:
            android.view.View r8 = r7.h(r8)     // Catch: java.lang.Throwable -> Laf
            r7.f371027g = r8     // Catch: java.lang.Throwable -> Laf
            i74.d r8 = r7.f371028h     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f371025e     // Catch: java.lang.Throwable -> Laf
            android.view.View r9 = r9.getContentView()     // Catch: java.lang.Throwable -> Laf
            r8.e(r9)     // Catch: java.lang.Throwable -> Laf
            android.view.View r8 = r7.f371027g     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f371025e     // Catch: java.lang.Throwable -> Laf
            android.view.View r9 = r9.getContentView()     // Catch: java.lang.Throwable -> Laf
            int r8 = r7.c(r8, r9)     // Catch: java.lang.Throwable -> Laf
            r7.n(r8)     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f371025e     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "getAnimationStyle"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r3)     // Catch: java.lang.Throwable -> Laf
            if (r8 >= 0) goto L89
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r3)     // Catch: java.lang.Throwable -> Laf
            r0 = 2131821463(0x7f110397, float:1.927567E38)
            goto L8f
        L89:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r3)     // Catch: java.lang.Throwable -> Laf
            r0 = 2131821464(0x7f110398, float:1.9275672E38)
        L8f:
            r9.setAnimationStyle(r0)     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f371025e     // Catch: java.lang.Throwable -> Laf
            android.view.View r0 = r7.f371027g     // Catch: java.lang.Throwable -> Laf
            r5 = 8388613(0x800005, float:1.175495E-38)
            r9.showAsDropDown(r0, r4, r8, r5)     // Catch: java.lang.Throwable -> Laf
            m74.b r8 = r7.f371025e     // Catch: java.lang.Throwable -> Laf
            java.lang.String r9 = "getDimAccount"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r3)     // Catch: java.lang.Throwable -> Laf
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r3)     // Catch: java.lang.Throwable -> Laf
            r9 = 1056964608(0x3f000000, float:0.5)
            r8.a(r9)     // Catch: java.lang.Throwable -> Laf
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r6
        Laf:
            java.lang.String r8 = "show feedback window has something wrong!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.i.o(android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        this.f371025e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void p(boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        try {
            i74.a aVar = this.f371029i;
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasNewStyleFlag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = aVar.f370989b;
            if (c17933xe8d1b226 != null) {
                z18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771.m70100xbfbe13e0(c17933xe8d1b226.m70346x10413e67());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasNewStyleFlag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasNewStyleFlag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z18 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackPromptManager", "thanks, hasNewStyleFlag=" + z18);
            if (z18) {
                db5.t7.h(this.f371024d, z17 ? this.f371024d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ls7) : this.f371024d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574722ls4));
            } else {
                android.content.Context context = this.f371024d;
                db5.t7.h(context, z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8_) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8a));
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void q(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "appUserName");
        java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "appPagePath");
        java.lang.String l19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "appVersion");
        java.lang.String l27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "aId");
        java.lang.String l28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "traceId");
        java.lang.String l29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "sceneNote");
        java.lang.String l37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "uxInfo");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1045);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (android.text.TextUtils.isEmpty(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPromptManager", "the app user name is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } else {
            ca4.z0.r0(l17, l18, l19, l27, l28, l29, l37, g17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }
}
