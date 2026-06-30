package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yn extends com.tencent.mm.plugin.finder.convert.bh {
    public final jz5.g A1;
    public final jz5.g B1;
    public final jz5.g C1;
    public java.lang.Runnable D1;
    public long E1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f105028z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(cw2.f8 videoCore, com.tencent.mm.plugin.finder.feed.k8 contract) {
        super(videoCore, contract, false, 301, true, 4, null);
        fc2.c Y6;
        kotlin.jvm.internal.o.g(videoCore, "videoCore");
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f105028z1 = jz5.h.b(com.tencent.mm.plugin.finder.convert.un.f104722d);
        this.A1 = jz5.h.b(new com.tencent.mm.plugin.finder.convert.wn(contract, this));
        this.B1 = jz5.h.b(new com.tencent.mm.plugin.finder.convert.ln(contract));
        this.C1 = jz5.h.b(com.tencent.mm.plugin.finder.convert.xn.f104963d);
        com.tencent.mm.ui.MMActivity context = contract.getF122643d();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (Y6 = nyVar.Y6(this.f104360h)) == null) {
            return;
        }
        Y6.a(new com.tencent.mm.plugin.finder.convert.an(contract, this));
    }

    public static final void Q1(com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var, boolean z17) {
        ynVar.getClass();
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.frs);
        int i17 = (p17.getVisibility() != 0 || z17) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.SeekBar seekBar = (android.widget.SeekBar) s0Var.p(com.tencent.mm.R.id.f487542oy0);
        if (seekBar != null) {
            seekBar.setVisibility(i17 != 0 ? 0 : 8);
        }
        if (i17 == 0) {
            java.lang.Runnable runnable = ynVar.D1;
            if (runnable != null) {
                ynVar.R1().removeCallbacks(runnable);
                ynVar.D1 = null;
            }
            ynVar.D1 = new com.tencent.mm.plugin.finder.convert.bn(s0Var, ynVar);
            ynVar.R1().postDelayed(ynVar.D1, 5000L);
        } else {
            java.lang.Runnable runnable2 = ynVar.D1;
            if (runnable2 != null) {
                ynVar.R1().removeCallbacks(runnable2);
                ynVar.D1 = null;
            }
        }
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.fsk);
        android.view.ViewGroup.LayoutParams layoutParams = p19 != null ? p19.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.bottomMargin = ym5.x.a(s0Var.f293121e, i17 == 0 ? 0.0f : 16.0f);
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, com.tencent.mm.plugin.finder.convert.qe
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public void K(in5.s0 holder, so2.u1 item, int i17, int i18) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.frs);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p19 = holder.p(com.tencent.mm.R.id.frr);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p27 = holder.p(com.tencent.mm.R.id.fup);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.storage.FeedData a17 = com.tencent.mm.plugin.finder.storage.FeedData.Companion.a(item);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (S1()) {
            finderVideoLayout.setSelectedToPlay(true);
            finderVideoLayout.setLoop(false);
            finderVideoLayout.setReuseSamePlayer(true);
        }
        com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar finderVideoGreenSeekBar = (com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar) holder.p(com.tencent.mm.R.id.frt);
        android.view.View p28 = holder.p(com.tencent.mm.R.id.g99);
        kotlin.jvm.internal.o.f(p28, "getView(...)");
        finderVideoGreenSeekBar.setPlayButton((android.widget.ImageView) p28);
        finderVideoGreenSeekBar.setOnPauseClickListener(new com.tencent.mm.plugin.finder.convert.dn(holder));
        android.view.View p29 = holder.p(com.tencent.mm.R.id.iqn);
        finderVideoGreenSeekBar.setRelativeCurrentTimeTv((android.widget.TextView) holder.p(com.tencent.mm.R.id.f484005co4));
        finderVideoGreenSeekBar.setRelativeTotalTimeTv((android.widget.TextView) holder.p(com.tencent.mm.R.id.ohr));
        finderVideoGreenSeekBar.setOnSeekStart(new com.tencent.mm.plugin.finder.convert.en(this, holder, finderVideoGreenSeekBar, p29));
        finderVideoGreenSeekBar.setOnSeekEnd(new com.tencent.mm.plugin.finder.convert.fn(p29, finderVideoGreenSeekBar, holder));
        android.content.Context context = holder.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        finderVideoGreenSeekBar.setPlayStatusListener(new com.tencent.mm.plugin.finder.convert.gn(this, holder, finderVideoLayout, finderVideoGreenSeekBar, (activity == null || (intent = activity.getIntent()) == null || intent.getIntExtra("key_comment_scene", 0) != 285) ? false : true, (((r45.mb4) kz5.n0.Z(a17.getMediaList())) != null ? r0.getInteger(3) : 0) * 1000, item));
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(a17.getMediaList());
        finderVideoGreenSeekBar.setVideoTotalTime(mb4Var != null ? mb4Var.getInteger(3) : 0);
        kotlin.jvm.internal.o.d(finderVideoLayout);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout.v(finderVideoLayout, 0, a17, finderVideoGreenSeekBar, this.f104360h, null, null, false, false, null, com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX, null);
        finderVideoLayout.C(finderVideoGreenSeekBar);
        finderVideoGreenSeekBar.setVideoLongPressStateChangeListener(new com.tencent.mm.plugin.finder.convert.hn(holder));
        if (S1()) {
            cw2.da videoView = finderVideoLayout.getVideoView();
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setPlaySpeed(1.0f);
            }
            cw2.v9.n(finderVideoLayout, 0, null, null, 7, null);
            r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(a17.getMediaList());
            if (mb4Var2 != null) {
                r45.gn2 gn2Var = (r45.gn2) mb4Var2.getCustom(45);
                if (gn2Var != null && gn2Var.getBoolean(1)) {
                    cw2.da videoView2 = finderVideoLayout.getVideoView();
                    com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                    if (finderThumbPlayerProxy2 != null) {
                        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.h0(finderThumbPlayerProxy2, new cw2.t4((r45.gn2) mb4Var2.getCustom(45), com.tencent.mm.pluginsdk.ui.e1.CROP), false, 2, null);
                    }
                }
            }
        }
        finderVideoLayout.setOnClickListener(new com.tencent.mm.plugin.finder.convert.in(finderVideoLayout, item, this, holder));
        android.widget.SeekBar seekBar = (android.widget.SeekBar) holder.p(com.tencent.mm.R.id.f487542oy0);
        if (seekBar != null) {
            seekBar.setVisibility(0);
        }
        finderVideoLayout.t(new com.tencent.mm.plugin.finder.convert.jn(holder));
        android.view.View p37 = holder.p(com.tencent.mm.R.id.iqj);
        if (p37 != null) {
            int i19 = item.getFeedObject().isLongVideo() ? 0 : 8;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setOnClickListener(new com.tencent.mm.plugin.finder.convert.kn(finderVideoLayout, holder));
        }
        android.view.View p38 = holder.p(com.tencent.mm.R.id.iqi);
        if (p38 != null) {
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i27 = z17 ? 8 : 0;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p38, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setOnClickListener(new com.tencent.mm.plugin.finder.convert.cn(holder));
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, com.tencent.mm.plugin.finder.convert.qe
    public int P() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.tencent.mm.plugin.finder.storage.y90, java.lang.Object, kotlin.jvm.internal.i] */
    @Override // com.tencent.mm.plugin.finder.convert.bh, in5.r
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.u1 item, int i17, int i18, boolean z17, java.util.List list) {
        android.content.Context context;
        java.lang.String str;
        android.content.Context context2;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        this.f104851e.d(holder, item, i17, i18, z17, list);
        com.tencent.mars.xlog.Log.i("FinderLongVideoConvert", "onBindViewHolder position:" + i17 + " type:" + i18 + " holder:" + holder + ", id=" + pm0.v.u(item.getItemId()));
        if (this.f104358f instanceof com.tencent.mm.plugin.finder.feed.tl) {
            holder.f293125i = item;
            if (holder.o() == null) {
                holder.f293126m = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.A1).getValue();
            }
            jz5.g gVar = this.f105028z1;
            ((java.util.ArrayList) ((jz5.n) gVar).getValue()).clear();
            ((java.util.ArrayList) ((jz5.n) gVar).getValue()).add(item);
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        if (zl5.b.f474087b) {
            itemView.setTag(com.tencent.mm.R.id.nxc, "Finder");
            itemView.setTag(com.tencent.mm.R.id.nxb, item);
        }
        boolean z18 = list == null || list.isEmpty();
        int i19 = 3;
        int i27 = 4;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = null;
        java.lang.String str3 = "getContext(...)";
        int i28 = 2;
        android.content.Context context3 = holder.f293121e;
        if (z18) {
            context = context3;
            str = "getContext(...)";
        } else {
            boolean z19 = true;
            for (java.lang.Object obj : list) {
                if (obj instanceof jz5.l) {
                    int intValue = ((java.lang.Number) ((jz5.l) obj).f302833d).intValue();
                    if (intValue == 1) {
                        context2 = context3;
                        str2 = str3;
                        com.tencent.mm.plugin.finder.convert.qe.M0(this, item, holder, null, 4, null);
                    } else if (intValue != i28) {
                        if (intValue == i19) {
                            context2 = context3;
                            str2 = str3;
                            nv2.n1 n1Var = nv2.n1.f340551h;
                            jz5.l k17 = n1Var.k(item.getFeedObject().getFeedObject());
                            boolean booleanValue = ((java.lang.Boolean) k17.f302833d).booleanValue();
                            boolean booleanValue2 = ((java.lang.Boolean) k17.f302834e).booleanValue();
                            I0(item, booleanValue, booleanValue2, n1Var.l(item.getFeedObject().getFeedObject()), holder, i17);
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_like_click", holder.p(com.tencent.mm.R.id.a_x), kz5.c1.k(new jz5.l("is_action_like", java.lang.Integer.valueOf(booleanValue ? 1 : 0)), new jz5.l("is_private", java.lang.Integer.valueOf(booleanValue2 ? 1 : 0))), 24617);
                            t1(item, holder, true, i17);
                            if (booleanValue) {
                                kotlin.jvm.internal.o.f(context2, str2);
                                pf5.z zVar = pf5.z.f353948a;
                                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                com.tencent.mm.plugin.finder.viewmodel.component.po poVar = (com.tencent.mm.plugin.finder.viewmodel.component.po) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.viewmodel.component.po.class);
                                if (poVar != null) {
                                    com.tencent.mm.plugin.finder.feed.xj xjVar = poVar.f135573e;
                                    if (xjVar == null) {
                                        kotlin.jvm.internal.o.o("viewCallback");
                                        throw null;
                                    }
                                    com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) xjVar.f111072a.findViewById(com.tencent.mm.R.id.ipw);
                                    if (appBarLayout != null) {
                                        appBarLayout.d(true, false, true);
                                    }
                                }
                            }
                        } else if (intValue == i27) {
                            context2 = context3;
                            str2 = str3;
                            B1(holder, item);
                            P0(holder, item);
                        } else if (intValue == 29) {
                            context2 = context3;
                            str2 = str3;
                            T0(holder);
                        } else if (intValue != 30) {
                            switch (intValue) {
                                case 9:
                                    context2 = context3;
                                    str2 = str3;
                                    U0(item, holder);
                                    break;
                                case 10:
                                    context2 = context3;
                                    str2 = str3;
                                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = item.getFeedObject();
                                    feedObject.setForwardCount(feedObject.getForwardCount() + 1);
                                    U0(item, holder);
                                    break;
                                case 11:
                                    context2 = context3;
                                    str2 = str3;
                                    com.tencent.mm.plugin.finder.convert.qe.M0(this, item, holder, null, 4, null);
                                    break;
                                case 12:
                                    context2 = context3;
                                    str2 = str3;
                                    com.tencent.mm.plugin.finder.convert.qe.M0(this, item, holder, null, 4, null);
                                    U0(item, holder);
                                    nv2.n1 n1Var2 = nv2.n1.f340551h;
                                    jz5.l k18 = n1Var2.k(item.getFeedObject().getFeedObject());
                                    I0(item, ((java.lang.Boolean) k18.f302833d).booleanValue(), ((java.lang.Boolean) k18.f302834e).booleanValue(), n1Var2.l(item.getFeedObject().getFeedObject()), holder, i17);
                                    z(holder, item);
                                    J0(holder, true);
                                    break;
                            }
                        } else {
                            context2 = context3;
                            str2 = str3;
                            java.lang.Object obj2 = holder.f293125i;
                            kotlin.jvm.internal.o.f(obj2, "getAssociatedObject(...)");
                            com.tencent.mm.plugin.finder.convert.qe.x(this, holder, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2, i17, false, 8, null);
                            T0(holder);
                        }
                        nyVar = null;
                    } else {
                        context2 = context3;
                        str2 = str3;
                        com.tencent.mm.plugin.finder.convert.qe.n1(this, item, holder, false, 4, null);
                    }
                    str3 = str2;
                    context3 = context2;
                    i28 = 2;
                    i19 = 3;
                    i27 = 4;
                    z19 = z19;
                }
                context2 = context3;
                str2 = str3;
                z19 = false;
                continue;
                str3 = str2;
                context3 = context2;
                i28 = 2;
                i19 = 3;
                i27 = 4;
                z19 = z19;
            }
            context = context3;
            str = str3;
            if (z19) {
                return;
            }
        }
        if (!z17) {
            if (S1()) {
                l(holder);
            }
            K(holder, item, i17, i18);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "finder_feed_item_view");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(item.getFeedObject().getFeedObject().getId()));
        lVarArr[1] = new jz5.l("session_buffer", item.getFeedObject().getFeedObject().getSessionBuffer());
        kotlin.jvm.internal.o.f(context, str);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : nyVar;
        lVarArr[2] = new jz5.l("comment_scene", nyVar2 != null ? java.lang.Integer.valueOf(nyVar2.f135380n) : nyVar);
        lVarArr[3] = new jz5.l("finder_username", item.getFeedObject().getFeedObject().getUsername());
        lVarArr[4] = new jz5.l("media_type", java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
        lVarArr[5] = new jz5.l("video_duration_time", java.lang.String.valueOf(mb4Var != null ? mb4Var.getInteger(3) : 0));
        lVarArr[6] = new jz5.l("long_video_id", pm0.v.u(item.getItemId()));
        lVarArr[7] = new jz5.l("feed_display_type", "1");
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new com.tencent.mm.plugin.finder.convert.mn(holder));
        ?? r142 = nyVar;
        com.tencent.mm.plugin.finder.convert.qe.x(this, holder, item, i17, false, 8, null);
        T0(holder);
        ya2.b2 contact = item.getContact();
        java.lang.String avatarUrl = contact != null ? contact.getAvatarUrl() : r142;
        if (avatarUrl == null || avatarUrl.length() == 0) {
            com.tencent.mm.protocal.protobuf.FinderContact contact2 = item.getFeedObject().getFeedObject().getContact();
            avatarUrl = contact2 != null ? contact2.getHeadUrl() : r142;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(avatarUrl, r142, 2, r142);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329957h));
        N0(holder, item);
        nv2.n1 n1Var3 = nv2.n1.f340551h;
        jz5.l k19 = n1Var3.k(item.getFeedObject().getFeedObject());
        I0(item, ((java.lang.Boolean) k19.f302833d).booleanValue(), ((java.lang.Boolean) k19.f302834e).booleanValue(), n1Var3.l(item.getFeedObject().getFeedObject()), holder, i17);
        v(holder, i17);
        com.tencent.mm.plugin.finder.convert.qe.M0(this, item, holder, null, 4, null);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.gbz);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.msw);
        if (p19 != null) {
            p19.setOnClickListener(new com.tencent.mm.plugin.finder.convert.nn(this, holder));
        }
        holder.p(com.tencent.mm.R.id.msw).setOnLongClickListener(new com.tencent.mm.plugin.finder.convert.on(holder, item));
        t1(item, holder, false, i17);
        U0(item, holder);
        W0(holder);
        P0(holder, item);
        B1(holder, item);
        k1(item, holder);
        g1(item, holder);
        e0(holder, false);
        if (S1()) {
            Z0(item, holder, i17, true);
            R1().removeCallbacksAndMessages(r142);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public int R(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
        com.tencent.mm.plugin.finder.feed.tl tlVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.tl ? (com.tencent.mm.plugin.finder.feed.tl) k8Var : null;
        if (tlVar == null) {
            return super.R(holder);
        }
        android.view.View findViewById = tlVar.g().f111072a.findViewById(com.tencent.mm.R.id.iqo);
        if (findViewById != null) {
            return findViewById.getHeight();
        }
        return 0;
    }

    public final com.tencent.mm.sdk.platformtools.n3 R1() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.C1).getValue();
    }

    public final boolean S1() {
        return ((java.lang.Boolean) ((jz5.n) this.B1).getValue()).booleanValue();
    }

    public final void T1(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.iqf);
        android.content.Context context = holder.f293121e;
        if (frameLayout != null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b2j, (android.view.ViewGroup) null, false);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) inflate;
            finderVideoLayout.setVideoCore(this.f102977y0);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(finderVideoLayout, 0, layoutParams);
        }
        com.tencent.mm.plugin.finder.convert.rn rnVar = new com.tencent.mm.plugin.finder.convert.rn(this, holder);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f484005co4);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) p17);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.ohr);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) p18);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ehh);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e0e);
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.a8p);
        com.tencent.mm.ui.widget.FlowTextMixView flowTextMixView = (com.tencent.mm.ui.widget.FlowTextMixView) holder.itemView.findViewById(com.tencent.mm.R.id.g9g);
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        flowTextMixView.setMaxWidth((int) (((android.app.Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels * 0.36f));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a_4);
        imageView.setOnClickListener(rnVar);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(imageView, "finder_feed_avatar");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(imageView, 8, 24617);
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) holder.p(com.tencent.mm.R.id.f487278o45);
        com.tencent.mm.plugin.finder.view.b0 b0Var = com.tencent.mm.plugin.finder.view.CollapsibleTextView.f130818x;
        kotlin.jvm.internal.o.d(neatTextView);
        neatTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(neatTextView, new com.tencent.mm.plugin.finder.view.a0(neatTextView)));
        com.tencent.mm.plugin.finder.convert.qn qnVar = new com.tencent.mm.plugin.finder.convert.qn(this, holder);
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            qnVar.run();
        } else {
            holder.itemView.post(qnVar);
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.gbz);
        if (p19 != null) {
            if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.D1().r()).booleanValue()) {
                p19.setOnClickListener(com.tencent.mm.plugin.finder.convert.pn.f104272d);
            }
            android.widget.TextView textView4 = (android.widget.TextView) p19.findViewById(com.tencent.mm.R.id.lja);
            if (textView4 != null) {
                textView4.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView5 = (android.widget.TextView) p19.findViewById(com.tencent.mm.R.id.dtx);
            if (textView5 != null) {
                textView5.setTextSize(1, 12.0f);
                textView5.setText(cu2.f0.f222391a.g());
            }
            android.widget.TextView textView6 = (android.widget.TextView) p19.findViewById(com.tencent.mm.R.id.msm);
            if (textView6 != null) {
                textView6.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView7 = (android.widget.TextView) p19.findViewById(com.tencent.mm.R.id.i1g);
            if (textView7 != null) {
                textView7.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView8 = (android.widget.TextView) p19.findViewById(com.tencent.mm.R.id.f487086ng3);
            if (textView8 != null) {
                textView8.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView9 = (android.widget.TextView) p19.findViewById(com.tencent.mm.R.id.c6s);
            if (textView9 != null) {
                textView9.setTextSize(1, 12.0f);
            }
        }
        android.widget.TextView textView10 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485561i44);
        if (textView10 != null) {
            textView10.setTextSize(1, 10.0f);
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.f487088ng5);
        if (p27 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p27, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r(holder);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public void N0(in5.s0 holder, so2.u1 item) {
        int i17;
        java.util.LinkedList<r45.cw2> short_title;
        r45.cw2 cw2Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) holder.p(com.tencent.mm.R.id.f487278o45);
        android.content.Context context = holder.f293121e;
        if (this.f104361i) {
            neatTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        }
        java.lang.CharSequence descriptionSpan = item.getFeedObject().getDescriptionSpan();
        if (descriptionSpan == null) {
            descriptionSpan = "";
        }
        boolean z17 = true;
        if (!(descriptionSpan.length() == 0)) {
            neatTextView.k(0.0f, 1.2f);
            neatTextView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.sn(this, item, holder));
            neatTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (S1()) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y2).getValue()).r()).intValue();
            } else {
                i17 = 4;
            }
            neatTextView.setMaxLines(i17);
            neatTextView.setVisibility(0);
            item.getFeedObject().getTopicClickExtra().f102475d = new java.lang.ref.WeakReference(context);
            neatTextView.b(descriptionSpan);
            com.tencent.mars.xlog.Log.i("FinderLongVideoConvert", "content:" + ((java.lang.Object) descriptionSpan) + " nickname:" + item.getFeedObject().getFeedObject().getNickname());
        } else if (neatTextView != null) {
            neatTextView.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e0e);
        if (textView != null) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = item.getFeedObject().getFeedObject().getObjectDesc();
            java.lang.String string = (objectDesc == null || (short_title = objectDesc.getShort_title()) == null || (cw2Var = (r45.cw2) kz5.n0.Z(short_title)) == null) ? null : cw2Var.getString(0);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.tn(this, holder, item));
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    /* renamed from: V1, reason: merged with bridge method [inline-methods] */
    public void Z0(so2.u1 item, in5.s0 holder, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ehc);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "refreshHotComment", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "refreshHotComment", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        super.Z0(item, holder, i17, z17);
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, in5.r
    public int e() {
        return com.tencent.mm.R.layout.ahk;
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, com.tencent.mm.plugin.finder.convert.qe
    public void e0(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.u1 u1Var = (so2.u1) holder.f293125i;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.g4n);
        int i17 = (u1Var.getFeedObject().isLongVideo() && u1Var.h2(this.f104358f.d0())) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.e0(holder, z17);
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        T1(holder);
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        tc2.b bVar = this.f104851e;
        bVar.getClass();
        bVar.b(holder);
        bb2.p0 p0Var = bb2.p0.f18940a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        bb2.a1 a17 = p0Var.a(itemView);
        if (a17 != null) {
            a17.onDetach();
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null) {
            finderVideoLayout.P();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void o0(in5.s0 holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDeepEnjoyMedia] ");
        ya2.b2 contact = u1Var.getContact();
        sb6.append(contact != null ? contact.w0() : null);
        sb6.append(" position=");
        sb6.append(i17);
        sb6.append(" type=");
        sb6.append(i18);
        sb6.append(" source=");
        sb6.append(i19);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(u1Var.getItemId()));
        com.tencent.mars.xlog.Log.i("FinderLongVideoConvert", sb6.toString());
        if (this.f104358f.d0() || u1Var.getIsDeepEnjoy()) {
            return;
        }
        u1Var.e1(true);
        com.tencent.mm.plugin.finder.convert.qe.G(this, holder, u1Var, false, 4, null);
        H(holder, u1Var);
        k1(u1Var, holder);
        W0(holder);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void v1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        so2.u1 item = (so2.u1) baseFinderFeed;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b8  */
    @Override // com.tencent.mm.plugin.finder.convert.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(in5.s0 r11, com.tencent.mm.plugin.finder.model.BaseFinderFeed r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.yn.w(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.convert.bh, com.tencent.mm.plugin.finder.convert.qe
    public void z0(in5.s0 holder, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f104851e.f(holder, i17, i18, z17);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.frs);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.SeekBar seekBar = (android.widget.SeekBar) holder.p(com.tencent.mm.R.id.f487542oy0);
        if (seekBar != null) {
            seekBar.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout == null || finderVideoLayout.J()) {
            return;
        }
        finderVideoLayout.M();
    }
}
