package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class bh extends com.tencent.mm.plugin.finder.convert.qe {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f102973y1 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public final vw2.n f102974l1;

    /* renamed from: p1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1 f102975p1;

    /* renamed from: x1, reason: collision with root package name */
    public final jz5.g f102976x1;

    /* renamed from: y0, reason: collision with root package name */
    public final cw2.f8 f102977y0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bh(cw2.f8 r9, com.tencent.mm.plugin.finder.feed.k8 r10, boolean r11, int r12, boolean r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r8 = this;
            r15 = r14 & 4
            r0 = 0
            if (r15 == 0) goto L6
            r11 = r0
        L6:
            r15 = r14 & 8
            if (r15 == 0) goto Lb
            r12 = r0
        Lb:
            r14 = r14 & 16
            if (r14 == 0) goto L10
            r13 = r0
        L10:
            java.lang.String r14 = "videoCore"
            kotlin.jvm.internal.o.g(r9, r14)
            java.lang.String r14 = "contract"
            kotlin.jvm.internal.o.g(r10, r14)
            r8.<init>(r10, r11, r12, r13)
            r8.f102977y0 = r9
            boolean r9 = r10.d0()
            vw2.n r11 = new vw2.n
            r2 = 0
            r3 = 0
            r12 = 3
            ww2.b[] r12 = new ww2.b[r12]
            ww2.a r13 = new ww2.a
            r13.<init>()
            r12[r0] = r13
            ww2.d r13 = new ww2.d
            r13.<init>(r9)
            r14 = 1
            r12[r14] = r13
            ww2.c r13 = new ww2.c
            r13.<init>(r9)
            r9 = 2
            r12[r9] = r13
            java.util.List r4 = kz5.c0.i(r12)
            com.tencent.mm.ui.MMActivity r9 = r10.getF122643d()
            androidx.lifecycle.o r5 = r9.mo133getLifecycle()
            java.lang.String r9 = "getLifecycle(...)"
            kotlin.jvm.internal.o.f(r5, r9)
            r6 = 3
            r7 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f102974l1 = r11
            com.tencent.mm.ui.MMActivity r9 = r10.getF122643d()
            com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1 r11 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1
            r11.<init>(r9)
            r8.f102975p1 = r11
            com.tencent.mm.plugin.finder.convert.ah r9 = new com.tencent.mm.plugin.finder.convert.ah
            r9.<init>(r10, r8)
            jz5.g r9 = jz5.h.b(r9)
            r8.f102976x1 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.bh.<init>(cw2.f8, com.tencent.mm.plugin.finder.feed.k8, boolean, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void A(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J3).getValue()).r()).intValue() != 1) {
            return;
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.qkb);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "checkHideShareToMoreTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert", "checkHideShareToMoreTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.E) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SHARE_TO_MORE_GUIDE_INT, 3);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void C0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (((so2.j5) holder.f293125i) == null) {
            return;
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fd2.j jVar = (fd2.j) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(fd2.j.class);
        if (jVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current autoPlayCount: ");
            fd2.a aVar = fd2.j.f261271i;
            sb6.append(aVar.a());
            com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", sb6.toString());
            in5.s0 s0Var = jVar.P6().f251270f;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
            if (baseFinderFeed != null) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.K9).getValue()).r()).booleanValue() || ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Dg).getValue()).r()).booleanValue() || baseFinderFeed.getFeedTipsStatus().f477475a.f477443c) {
                    return;
                }
                if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f39226d) {
                    com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "onCompletePlayMedia, already enable auto scroll, return!");
                    return;
                }
                if (aVar.b(holder)) {
                    com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "onCompletePlayMedia, there is only one feed in feed list, and no more feed can be loaded, return!");
                    return;
                }
                java.lang.Long a17 = aVar.a();
                if ((a17 != null ? a17.longValue() : 0L) >= ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Cg).getValue()).r()).longValue()) {
                    com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "onCompletePlayMedia, current autoPlayCount: " + aVar.a() + ", reach auto scroll count limits, return!");
                    return;
                }
                baseFinderFeed.getFeedTipsStatus().f477475a.f477441a++;
                long c18 = c01.id.c();
                boolean z17 = c18 - jVar.f261273d > 60000 || ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Eg).getValue()).r()).booleanValue();
                com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_DISPLAY_AUTO_PLAY_TIPS_TIME_LONG_SYNC;
                boolean z18 = c18 - c19.t(u3Var, 0L) > ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Bg).getValue()).r()).longValue();
                com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "onCompletePlayMedia, playCount: " + baseFinderFeed.getFeedTipsStatus().f477475a.f477441a + ", enableShowTipsWithEnoughTimeInterval: " + z18 + ", alreadyPlayMoreThanOneMin: " + z17);
                if (z18 && z17 && baseFinderFeed.getFeedTipsStatus().f477475a.f477441a >= 2) {
                    boolean P6 = jVar.P6().P6(ed2.a.f251252d);
                    com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "onCompletePlayMedia, tryShow result: " + P6);
                    if (P6) {
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(c18));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    @Override // com.tencent.mm.plugin.finder.convert.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(in5.s0 r19) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.bh.I(in5.s0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if ((r12 != null && r12.g2()) != false) goto L25;
     */
    @Override // com.tencent.mm.plugin.finder.convert.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J0(in5.s0 r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r12 = "holder"
            kotlin.jvm.internal.o.g(r11, r12)
            java.lang.Object r12 = r11.f293125i
            so2.j5 r12 = (so2.j5) r12
            r0 = 2131309140(0x7f093254, float:1.8236555E38)
            android.view.View r11 = r11.p(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r11 = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) r11
            if (r11 == 0) goto L90
            boolean r0 = r12 instanceof so2.u1
            if (r0 == 0) goto L1b
            so2.u1 r12 = (so2.u1) r12
            goto L1c
        L1b:
            r12 = 0
        L1c:
            android.view.View r8 = r11.getBulletBtn()
            r0 = 1
            r9 = 0
            if (r12 == 0) goto L32
            com.tencent.mm.plugin.finder.feed.k8 r1 = r10.f104358f
            boolean r1 = r1.d0()
            boolean r1 = r12.h2(r1)
            if (r1 != r0) goto L32
            r1 = r0
            goto L33
        L32:
            r1 = r9
        L33:
            if (r1 != 0) goto L49
            boolean r11 = r11.isSeekMode
            if (r11 == 0) goto L46
            if (r12 == 0) goto L42
            boolean r11 = r12.g2()
            if (r11 != r0) goto L42
            goto L43
        L42:
            r0 = r9
        L43:
            if (r0 == 0) goto L46
            goto L49
        L46:
            r11 = 8
            goto L4a
        L49:
            r11 = r9
        L4a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.ThreadLocal r0 = zj0.c.f473285a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.add(r11)
            java.util.Collections.reverse(r12)
            java.lang.Object[] r1 = r12.toArray()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert"
            java.lang.String r3 = "refreshBulletLayout"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r8
            yj0.a.d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r11 = r12.get(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.setVisibility(r11)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert"
            java.lang.String r2 = "refreshBulletLayout"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r8
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.bh.J0(in5.s0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0097, code lost:
    
        if (r4.D() == true) goto L12;
     */
    @Override // com.tencent.mm.plugin.finder.convert.qe
    /* renamed from: O1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(in5.s0 r20, so2.u1 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.bh.K(in5.s0, so2.u1, int, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public int P() {
        return 4;
    }

    @Override // in5.r
    /* renamed from: P1 */
    public void h(in5.s0 holder, so2.u1 item, int i17, int i18, boolean z17, java.util.List list) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.FeedFullVideoConvert-onBindViewHolder position=");
        sb6.append(i17);
        sb6.append(" type=");
        sb6.append(i18);
        sb6.append(" isHotPatch=");
        sb6.append(z17);
        sb6.append(" payloads:");
        if (list != null) {
            java.util.ArrayList<jz5.l> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof jz5.l) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (jz5.l lVar : arrayList2) {
                arrayList.add(((java.lang.Number) lVar.f302833d).intValue() + " - " + lVar.f302834e);
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullVideoConvert", sb6.toString());
        o(holder, item, i17, i18, z17, list);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void d0(in5.s0 holder, android.util.Size size) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var == null) {
            return;
        }
        int adapterPosition = holder.getAdapterPosition();
        com.tencent.mars.xlog.Log.i("Finder.FeedFullVideoConvert", "resizeVideo, feedId: %s, currentPosition: %d", java.lang.Long.valueOf(u1Var.getItemId()), java.lang.Integer.valueOf(adapterPosition));
        u1Var.R1(size);
        com.tencent.mm.plugin.finder.convert.qe.x(this, holder, u1Var, adapterPosition, false, 8, null);
    }

    @Override // in5.r
    public int e() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue() ? com.tencent.mm.R.layout.f487851dy2 : com.tencent.mm.R.layout.f487850r;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void e0(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class)).O6(holder, this.f104358f, z17);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullVideoConvert", "onAttachedToRecyclerView this=" + this + ", toolbarButtonCarouselAnimationHelper=" + this.f102974l1.hashCode());
        if (this.f104360h == 4) {
            ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f102976x1).getValue()).alive();
        }
        com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1 finderFeedFullVideoConvert$videoFinishListener$1$1 = this.f102975p1;
        if (finderFeedFullVideoConvert$videoFinishListener$1$1 != null) {
            finderFeedFullVideoConvert$videoFinishListener$1$1.alive();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        com.tencent.mm.plugin.finder.view.qr qrVar = com.tencent.mm.plugin.finder.view.qr.f132907f;
        com.tencent.mm.plugin.finder.view.s0 s0Var = new com.tencent.mm.plugin.finder.view.s0();
        s0Var.f132988a = recyclerView;
        finderMediaLayout.b(qrVar, s0Var);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.g99);
        if (weImageView != null) {
            weImageView.setFocusable(false);
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.setFloatPlayIcon(weImageView);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, com.tencent.mm.plugin.finder.convert.w7, in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullVideoConvert", "onDetachedFromRecyclerView this=" + this + ", toolbarButtonCarouselAnimationHelper=" + this.f102974l1.hashCode());
        if (this.f104360h == 4) {
            ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f102976x1).getValue()).dead();
        }
        com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1 finderFeedFullVideoConvert$videoFinishListener$1$1 = this.f102975p1;
        if (finderFeedFullVideoConvert$videoFinishListener$1$1 != null) {
            finderFeedFullVideoConvert$videoFinishListener$1$1.dead();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.l(holder);
        bb2.p0 p0Var = bb2.p0.f18940a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        bb2.a1 a17 = p0Var.a(itemView);
        if (a17 != null) {
            a17.onDetach();
        }
        java.util.Map map = vw2.n.f440866e;
        int hashCode = holder.hashCode();
        java.util.Map map2 = vw2.n.f440868g;
        android.animation.Animator animator = (android.animation.Animator) ((java.util.LinkedHashMap) map2).get(java.lang.Integer.valueOf(hashCode));
        if (animator != null) {
            animator.cancel();
        }
        map2.remove(java.lang.Integer.valueOf(hashCode));
        vw2.n.f440867f.remove(java.lang.Long.valueOf(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i).getItemId()));
        com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "removeHolder: " + holder + " is removed");
    }

    @Override // com.tencent.mm.plugin.finder.convert.w7
    public boolean p() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void p0(in5.s0 holder) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.yx2 yx2Var;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X62;
        android.view.View findViewById;
        android.view.View findViewById2;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.p0(holder);
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
        boolean z17 = u1Var != null && u1Var.g2();
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        android.content.Context context = holder.f293121e;
        if (z17) {
            bb2.p0 p0Var = bb2.p0.f18940a;
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            bb2.a1 a17 = p0Var.a(itemView);
            if (a17 != null) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
                java.lang.Object obj = holder.f293125i;
                kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
                finderBulletUIC.e7(holder, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj, this.f104361i);
                a17.a(k8Var.d0());
            }
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || !feedObject.canShowSubtitleBtn()) {
            return;
        }
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.viewmodel.component.l70 l70Var = (com.tencent.mm.plugin.finder.viewmodel.component.l70) uVar.c(k8Var.getF122643d()).a(com.tencent.mm.plugin.finder.viewmodel.component.l70.class);
        l70Var.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        if (!(baseFinderFeed2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            baseFinderFeed2 = null;
        }
        if (baseFinderFeed2 == null) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "attachSubtitleContainer holder or item is null");
            return;
        }
        android.view.View view = holder.itemView;
        if (view != null && (findViewById2 = view.findViewById(com.tencent.mm.R.id.tvl)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "attachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "attachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.d70(l70Var, holder));
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) uVar.c(l70Var.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar != null && (X62 = ptVar.X6()) != null && (findViewById = X62.findViewById(com.tencent.mm.R.id.tvl)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "attachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "attachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.e70(l70Var, holder));
        }
        if (baseFinderFeed2.getFeedObject().canShowSubtitleBtn()) {
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
            android.view.View subtitleBtn = finderFullSeekBarLayout != null ? finderFullSeekBarLayout.getSubtitleBtn() : null;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = subtitleBtn instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) subtitleBtn : null;
            int i17 = com.tencent.mm.R.raw.caption_regular;
            if (weImageView != null) {
                weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.f70(l70Var, holder));
                l70Var.S6(weImageView, baseFinderFeed2);
                weImageView.setImageResource(baseFinderFeed2.getFeedObject().canShowSubtitle() ? com.tencent.mm.R.raw.caption_regular : com.tencent.mm.R.raw.caption_lock_regular);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.pt) uVar.c(l70Var.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
            android.view.View subtitleBtnLayout = (ptVar2 == null || (X6 = ptVar2.X6()) == null) ? null : X6.getSubtitleBtnLayout();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = subtitleBtnLayout instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) subtitleBtnLayout : null;
            if (weImageView2 != null) {
                weImageView2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.g70(l70Var, holder));
                l70Var.S6(weImageView2, baseFinderFeed2);
                if (!baseFinderFeed2.getFeedObject().canShowSubtitle()) {
                    i17 = com.tencent.mm.R.raw.caption_lock_regular;
                }
                weImageView2.setImageResource(i17);
            }
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a18 = uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ((com.tencent.mm.plugin.finder.viewmodel.component.o70) a18).S6(holder, false);
        r45.dm2 object_extend = baseFinderFeed2.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null || (yx2Var = (r45.yx2) object_extend.getCustom(42)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var = (com.tencent.mm.plugin.finder.viewmodel.component.o70) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
        long j17 = yx2Var.getLong(1);
        o70Var.getClass();
        if (j17 == 0) {
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.HashMap hashMap = o70Var.f135436d;
        if (!hashMap.containsKey(valueOf) || hashMap.get(java.lang.Long.valueOf(j17)) == null) {
            hashMap.put(java.lang.Long.valueOf(j17), new com.tencent.mm.plugin.finder.viewmodel.component.n70(o70Var, j17));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.LinkedList<r45.ay2> list = yx2Var.getList(5);
            if (list != null) {
                for (r45.ay2 ay2Var : list) {
                    if (r45.ch7.a(ay2Var.getInteger(0)) != null) {
                        arrayList3.add(ay2Var);
                    }
                }
            }
            com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var = (com.tencent.mm.plugin.finder.viewmodel.component.n70) hashMap.get(java.lang.Long.valueOf(j17));
            if (n70Var != null) {
                n70Var.f135276l = arrayList3;
                n70Var.f135275k = kz5.c0.k(kz5.n0.X(arrayList3));
            }
            com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.n70) hashMap.get(java.lang.Long.valueOf(j17));
            if (n70Var2 != null) {
                n70Var2.g(yx2Var);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void w0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        so2.u1 item = (so2.u1) baseFinderFeed;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        K(holder, item, holder.getAdapterPosition(), holder.getItemViewType());
        super.w0(item, holder);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null) {
            cw2.v9.n(finderVideoLayout, holder.getAdapterPosition(), null, null, 6, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void x0(long j17, in5.s0 holder) {
        lw2.m videoScaleCleanHelper;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.x0(j17, holder);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout == null || (videoScaleCleanHelper = finderVideoLayout.getVideoScaleCleanHelper()) == null) {
            return;
        }
        videoScaleCleanHelper.g();
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void x1(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.B();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void z0(in5.s0 holder, int i17, int i18, boolean z17) {
        bb2.w1 bulletManager;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.z0(holder, i17, i18, z17);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullVideoConvert", "onUnFocusFeedCenter this=" + this + ", toolbarButtonCarouselAnimationHelper=" + this.f102974l1.hashCode());
        bb2.p0 p0Var = bb2.p0.f18940a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        bb2.a1 a17 = p0Var.a(itemView);
        if (!z17) {
            if (a17 == null || (bulletManager = a17.getBulletManager()) == null) {
                return;
            }
            bulletManager.l();
            return;
        }
        if (a17 != null) {
            a17.onDetach();
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.l70) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.l70.class)).O6(holder);
    }
}
