package ac2;

/* loaded from: classes2.dex */
public final class t extends com.tencent.mm.plugin.finder.feed.dj {
    public final java.lang.String A;
    public final java.lang.String B;
    public boolean C;
    public jz5.l D;
    public ac2.y E;
    public final java.util.List F;
    public long G;
    public long H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f3056J;
    public long K;
    public com.tencent.mm.plugin.finder.view.FinderCountDownTextView L;
    public com.tencent.mm.plugin.finder.view.w2 M;
    public long N;
    public long P;
    public cw2.ea Q;
    public com.tencent.mm.plugin.finder.video.FinderVideoLayout R;
    public com.tencent.mm.plugin.finder.view.w2 S;
    public long T;
    public boolean U;
    public final java.util.Map V;
    public final java.util.Set W;

    /* renamed from: y, reason: collision with root package name */
    public final long f3057y;

    /* renamed from: z, reason: collision with root package name */
    public long f3058z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.ui.MMActivity context, long j17, long j18, java.lang.String str) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f3057y = j17;
        this.f3058z = j18;
        this.A = str;
        this.B = "FinderNativeDramaTimelineContract";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Presenter init nativeDramaId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" selectObjectId=");
        sb6.append(pm0.v.u(this.f3058z));
        sb6.append(" hasSessionBuffer=");
        sb6.append(true ^ (str == null || str.length() == 0));
        com.tencent.mars.xlog.Log.i("FinderNativeDramaTimelineContract", sb6.toString());
        this.F = new java.util.ArrayList();
        this.G = -1L;
        this.H = -1L;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f3056J = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127792kd).getValue()).r()).booleanValue();
        this.V = new java.util.LinkedHashMap();
        this.W = new java.util.LinkedHashSet();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        ac2.y yVar = this.E;
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i(this.B, "loadMore waitCountDownAtFeed " + yVar.f3069u + " hasLoadFirstPage " + this.C);
            if (!this.C) {
                yVar.o().N(0);
                return;
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    public final void C0(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
        if (mMActivity.isDestroyed() || mMActivity.isFinishing()) {
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(mMActivity);
        e4Var.f211776c = text;
        e4Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(com.tencent.mm.plugin.finder.model.BaseFinderFeed r9) {
        /*
            r8 = this;
            com.tencent.mm.ui.MMActivity r0 = r8.f106421d
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L73
            boolean r1 = r0.isFinishing()
            if (r1 == 0) goto Lf
            goto L73
        Lf:
            boolean r1 = r8.f3056J
            r2 = 2131781464(0x7f106758, float:1.9194542E38)
            if (r1 == 0) goto L23
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.o.f(r9, r0)
            r8.C0(r9)
            goto L66
        L23:
            com.tencent.mm.plugin.finder.view.w2 r0 = r8.S
            if (r0 == 0) goto L66
            r1 = 2131315338(0x7f094a8a, float:1.8249126E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.finder.view.FinderCountDownTextView r0 = (com.tencent.mm.plugin.finder.view.FinderCountDownTextView) r0
            if (r0 == 0) goto L66
            int r1 = r0.tempWordingResId
            r3 = 1
            if (r1 == 0) goto L47
            long r4 = r0.remainTimeMs
            long r6 = r0.showTempWordingUntilTime
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L47
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L47
            r1 = r3
            goto L48
        L47:
            r1 = 0
        L48:
            if (r1 != 0) goto L4e
            r1 = 3
            r8.w0(r3, r1, r9)
        L4e:
            ac2.s r1 = new ac2.s
            r1.<init>(r8, r9)
            r0.setTempWordingFinishCallback(r1)
            long r3 = r0.remainTimeMs
            r5 = 1500(0x5dc, double:7.41E-321)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L66
            r0.tempWordingResId = r2
            long r3 = r3 - r5
            r0.showTempWordingUntilTime = r3
            r0.c()
        L66:
            com.tencent.mm.plugin.finder.feed.i0 r9 = r8.f106424g
            if (r9 == 0) goto L73
            com.tencent.mm.view.RefreshLoadMoreLayout r9 = r9.o()
            if (r9 == 0) goto L73
            hc2.f1.x(r9)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.t.D0(com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void E0() {
        android.view.ViewStub viewStub;
        java.util.List dataList;
        ac2.y yVar = this.E;
        if (yVar == null || yVar.f3069u == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        int i17 = -1;
        if (baseFeedLoader != null && (dataList = baseFeedLoader.getDataList()) != null) {
            java.util.Iterator it = dataList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.o.b((so2.j5) it.next(), yVar.f3069u)) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderNativeDramaTimelineContract", "showFeedAfterPromotion " + i17);
        yVar.f3069u = null;
        com.tencent.mm.ui.MMActivity activity = yVar.f106968d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ac2.g gVar = (ac2.g) pf5.z.f353948a.a(activity).a(ac2.g.class);
        androidx.recyclerview.widget.RecyclerView recyclerView = gVar.f3026d;
        androidx.recyclerview.widget.k3 p07 = recyclerView != null ? recyclerView.p0(i17) : null;
        android.view.View view = p07 != null ? p07.itemView : null;
        if (view != null && (viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.skr)) != null) {
            viewStub.inflate();
        }
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.tbo) : null;
        if (findViewById != null) {
            gVar.f3029g = new ac2.f(gVar, p07, findViewById, findViewById);
            android.view.ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(gVar.f3029g);
            }
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = yVar.o().getRecyclerView().getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            finderLinearLayoutManager.C = true;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void G(ym5.s3 reason) {
        ac2.y yVar;
        kotlin.jvm.internal.o.g(reason, "reason");
        if (!reason.f463521f || (yVar = this.E) == null) {
            return;
        }
        yVar.v(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r2 == null || r2.length() == 0) != false) goto L23;
     */
    @Override // com.tencent.mm.plugin.finder.feed.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P() {
        /*
            r40 = this;
            r0 = r40
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r1 = r0.f106570t
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader"
            kotlin.jvm.internal.o.e(r1, r2)
            com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader r1 = (com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader) r1
            boolean r2 = r0.C
            if (r2 != 0) goto Lb8
            ac2.z r2 = r1.f105294i
            long r3 = r2.f3074d
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L2e
            java.lang.String r2 = r2.f3077g
            if (r2 == 0) goto L29
            int r2 = r2.length()
            if (r2 != 0) goto L27
            goto L29
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = r5
        L2a:
            if (r2 == 0) goto L2e
            goto Lb8
        L2e:
            long r2 = r0.f3058z
            ac2.z r1 = r1.f105294i
            java.lang.String r1 = r1.f3077g
            java.lang.String r9 = ""
            int r10 = r0.f106422e
            r11 = 2
            java.lang.String r12 = ""
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            if (r1 != 0) goto L46
            java.lang.String r1 = ""
        L46:
            r21 = r1
            com.tencent.mm.ui.MMActivity r1 = r0.f106421d
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r1, r6)
            pf5.z r6 = pf5.z.f353948a
            pf5.v r6 = r6.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r7 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r6 = r6.a(r7)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r6 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r6
            if (r6 == 0) goto L64
            r45.qt2 r6 = r6.V6()
            goto L65
        L64:
            r6 = 0
        L65:
            r22 = r6
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r45.tj2 r6 = new r45.tj2
            r37 = r6
            r6.<init>()
            java.lang.String r7 = r0.A
            r6.set(r5, r7)
            long r7 = r0.f3057y
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r6.set(r4, r5)
            r38 = 268423104(0xfffcfc0, float:2.5224964E-29)
            r39 = 0
            db2.g4 r4 = new db2.g4
            r6 = r4
            r19 = 0
            r20 = 0
            r7 = r2
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            pq5.g r4 = r4.l()
            r4.f(r1)
            ac2.j r1 = new ac2.j
            r1.<init>(r0, r2)
            r4.h(r1)
            goto Lbf
        Lb8:
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r1 = r0.f106570t
            if (r1 == 0) goto Lbf
            r1.requestRefresh()
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.t.P():void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void V() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj viewCallback) {
        ac2.y yVar;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(viewCallback, "viewCallback");
        super.X(model, viewCallback);
        this.E = viewCallback instanceof ac2.y ? (ac2.y) viewCallback : null;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader");
        com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader = (com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader) baseFeedLoader;
        ac2.y yVar2 = this.E;
        if (yVar2 != null) {
            com.tencent.mm.ui.MMActivity mMActivity = yVar2.f106968d;
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.lbi);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            yVar2.f3067s = findViewById;
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.m2d);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            yVar2.f3068t = findViewById2;
        }
        ac2.z zVar = finderNativeDramaTimelineFeedLoader.f105294i;
        finderNativeDramaTimelineFeedLoader.f105297o = p0(zVar.f3077g, zVar.f3074d);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderNativeDramaTimelineFeedLoader, false, 1, null);
        if (finderNativeDramaTimelineFeedLoader.getDataList().isEmpty() && (yVar = this.E) != null) {
            yVar.C();
        }
        finderNativeDramaTimelineFeedLoader.f105298p = new ac2.i(finderNativeDramaTimelineFeedLoader, this);
    }

    public final void Z() {
        cw2.ea eaVar = this.Q;
        if (eaVar != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.R;
            if (finderVideoLayout != null) {
                finderVideoLayout.T(eaVar);
            }
            this.Q = null;
        }
        this.R = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean e0() {
        ac2.y yVar;
        com.tencent.mm.plugin.finder.view.w2 w2Var = this.M;
        boolean z17 = false;
        if (w2Var != null && w2Var.isShowing()) {
            z17 = true;
        }
        if (z17 && (yVar = this.E) != null) {
            yVar.f3070v = true;
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public boolean g() {
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (i0Var == null || (o17 = i0Var.o()) == null || (recyclerView = o17.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            return true;
        }
        java.lang.Object a07 = kz5.n0.a0(y(), finderLinearLayoutManager.w());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = a07 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) a07 : null;
        return baseFinderFeed == null || !baseFinderFeed.getFeedObject().isNativeDramaPromotionFeed() || baseFinderFeed.getNativeDramaUnlockCountDownFinish();
    }

    public final void i0(java.lang.String str) {
        com.tencent.mm.plugin.finder.view.w2 w2Var = this.M;
        if (w2Var != null) {
            com.tencent.mars.xlog.Log.i(this.B, "pause/dismiss showPromotionCountDownToast, reason=" + str + " hostFeedId=" + pm0.v.u(this.P));
            com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView = (com.tencent.mm.plugin.finder.view.FinderCountDownTextView) w2Var.findViewById(com.tencent.mm.R.id.ukc);
            if (finderCountDownTextView != null) {
                finderCountDownTextView.a();
            }
            if (w2Var.isShowing()) {
                com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
                if (!mMActivity.isDestroyed() && !mMActivity.isFinishing()) {
                    w2Var.dismiss();
                }
            }
        }
        this.M = null;
        this.P = 0L;
        this.N = 0L;
        ac2.y yVar = this.E;
        if (yVar == null) {
            return;
        }
        yVar.f3070v = false;
    }

    public final void j0(float f17) {
        android.view.View decorView;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.tencent.mm.plugin.finder.view.w2 w2Var = this.M;
        if (w2Var != null && w2Var.isShowing()) {
            if (f17 >= 1.0f) {
                w2Var.b(true);
            } else {
                w2Var.b(false);
                android.view.Window window = w2Var.getWindow();
                if (window != null) {
                    ug5.x.e(window, com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.a9e));
                }
            }
            android.view.Window window2 = w2Var.getWindow();
            if (window2 == null || (decorView = window2.getDecorView()) == null) {
                return;
            }
            android.view.ViewPropertyAnimator animate = decorView.animate();
            if (animate != null) {
                animate.cancel();
            }
            android.view.ViewPropertyAnimator animate2 = decorView.animate();
            if (animate2 == null || (alpha = animate2.alpha(f17)) == null || (duration = alpha.setDuration(200L)) == null) {
                return;
            }
            duration.start();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void m(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.m(feed, menu, sheet, holder);
        menu.removeItem(305);
        menu.removeItem(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager] */
    /* JADX WARN: Type inference failed for: r6v46 */
    @Override // com.tencent.mm.plugin.finder.feed.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(in5.s0 r34, com.tencent.mm.plugin.finder.model.BaseFinderFeed r35) {
        /*
            Method dump skipped, instructions count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.t.o0(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        super.onDetach();
        Z();
        i0("onDetach");
        com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView = this.L;
        if (finderCountDownTextView != null) {
            finderCountDownTextView.a();
        }
        this.L = null;
        this.K = 0L;
        this.E = null;
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed p0(java.lang.String exportId, long j17) {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        if (exportId == null || exportId.length() == 0) {
            if (j17 == 0 || (h17 = bu2.j.f24534a.h(j17)) == null) {
                return null;
            }
            return cu2.u.f222441a.p(h17);
        }
        zr2.d a17 = zr2.d.f475180b.a(39, false);
        if (a17 == null) {
            return null;
        }
        kotlin.jvm.internal.o.g(exportId, "exportId");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) a17.f475182a.get(exportId);
        if (finderObject != null) {
            return cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0));
        }
        return null;
    }

    public final java.util.List u0(java.util.List list) {
        r45.wx4 wx4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) || ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().isNativeDramaPromotionFeed()) {
                wx4Var = null;
            } else {
                wx4Var = new r45.wx4();
                wx4Var.set(0, java.lang.Long.valueOf(j5Var.getItemId()));
                java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) this.V).get(java.lang.Long.valueOf(j5Var.getItemId()));
                wx4Var.set(1, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
            }
            if (wx4Var != null) {
                arrayList.add(wx4Var);
            }
        }
        return kz5.n0.V0(arrayList);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public java.lang.String v() {
        return this.B;
    }

    public final void w0(int i17, int i18, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        r45.bn2 promotionDramaInfo = baseFinderFeed != null ? baseFinderFeed.getPromotionDramaInfo() : null;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        lVarArr[1] = new jz5.l("native_drama_id", pm0.v.u(this.f3057y));
        lVarArr[2] = new jz5.l("native_drama_item_num", promotionDramaInfo != null ? java.lang.Integer.valueOf(promotionDramaInfo.getInteger(2)) : null);
        lVarArr[3] = new jz5.l("previous_native_drama_feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getPromotionFromObjectId() : 0L));
        lVarArr[4] = new jz5.l("switch_drama_toast_type", java.lang.Integer.valueOf(i18));
        lVarArr[5] = new jz5.l("drama_toast_type", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.finder.report.d2.e(d2Var, mMActivity, "native_drama_ad_count_down_toast", "native_drama_toast_switch", 0, kz5.c1.k(lVarArr), 8, null);
    }

    public final void x0(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127623bd).getValue()).r()).booleanValue()) {
            C0(str);
        }
        com.tencent.mars.xlog.Log.i(this.B, str);
    }
}
