package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class zf extends com.tencent.mm.plugin.finder.convert.qe {
    public static java.lang.String D1 = "1";
    public final com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1 A1;
    public final com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFinderLiveExitListener$1 B1;
    public volatile boolean C1;

    /* renamed from: l1, reason: collision with root package name */
    public final int f105109l1;

    /* renamed from: p1, reason: collision with root package name */
    public final java.lang.String f105110p1;

    /* renamed from: x1, reason: collision with root package name */
    public kotlinx.coroutines.r2 f105111x1;

    /* renamed from: y0, reason: collision with root package name */
    public final cw2.f8 f105112y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f105113y1;

    /* renamed from: z1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedExposeListener$1 f105114z1;

    public /* synthetic */ zf(cw2.f8 f8Var, com.tencent.mm.plugin.finder.feed.k8 k8Var, boolean z17, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(f8Var, k8Var, (i19 & 4) != 0 ? false : z17, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? 0 : i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O1(com.tencent.mm.plugin.finder.convert.zf r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof com.tencent.mm.plugin.finder.convert.Cif
            if (r0 == 0) goto L16
            r0 = r12
            com.tencent.mm.plugin.finder.convert.if r0 = (com.tencent.mm.plugin.finder.convert.Cif) r0
            int r1 = r0.f103665f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f103665f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.convert.if r0 = new com.tencent.mm.plugin.finder.convert.if
            r0.<init>(r9, r12)
        L1b:
            java.lang.Object r12 = r0.f103663d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f103665f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.throwOnFailure(r12)
            goto Ld1
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = 0
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto Ld6
            in5.s0 r12 = r9.T1(r10)
            if (r12 == 0) goto Ld6
            android.view.View r2 = r12.itemView
            boolean r2 = r2.isShown()
            java.lang.String r5 = r9.f105110p1
            if (r2 != 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "deleteLiveFeed not same pos: "
            r9.<init>(r10)
            int r10 = r12.getAdapterPosition()
            r9.append(r10)
            java.lang.String r10 = " isShown = false"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.e(r5, r9)
            goto Ld6
        L6a:
            int r2 = r12.getAdapterPosition()
            androidx.recyclerview.widget.RecyclerView r6 = r9.f104357J
            if (r6 == 0) goto L7d
            androidx.recyclerview.widget.f2 r6 = r6.getAdapter()
            if (r6 == 0) goto L7d
            int r6 = r6.getItemCount()
            goto L7e
        L7d:
            r6 = 0
        L7e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "deleteLiveFeed itemCount: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r8 = " adapterPosition: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.e(r5, r7)
            int r5 = r2 + 1
            if (r5 >= r6) goto Ld6
            if (r2 < 0) goto Ld6
            java.lang.Object r12 = r12.f293125i
            boolean r2 = r12 instanceof so2.h1
            r5 = 0
            if (r2 == 0) goto La7
            so2.h1 r12 = (so2.h1) r12
            goto La8
        La7:
            r12 = r5
        La8:
            if (r12 != 0) goto Lab
            goto Lad
        Lab:
            r12.f410380g = r4
        Lad:
            androidx.recyclerview.widget.RecyclerView r12 = r9.f104357J
            if (r12 == 0) goto Ld6
            tb2.h r2 = new tb2.h
            r2.<init>(r12)
            r12.setItemAnimator(r2)
            com.tencent.mm.plugin.finder.convert.jf r2 = new com.tencent.mm.plugin.finder.convert.jf
            r2.<init>(r9, r10)
            r12.post(r2)
            kotlinx.coroutines.p0 r12 = kotlinx.coroutines.q1.f310570c
            com.tencent.mm.plugin.finder.convert.kf r2 = new com.tencent.mm.plugin.finder.convert.kf
            r2.<init>(r9, r10, r5)
            r0.f103665f = r4
            java.lang.Object r12 = kotlinx.coroutines.l.g(r12, r2, r0)
            if (r12 != r1) goto Ld1
            goto Ld7
        Ld1:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.booleanValue()
        Ld6:
            r1 = r3
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.zf.O1(com.tencent.mm.plugin.finder.convert.zf, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void Q1(com.tencent.mm.plugin.finder.convert.zf zfVar, long j17, boolean z17, java.lang.Integer num, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkDeleteLiveFeed");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 8) != 0) {
            str = null;
        }
        zfVar.P1(j17, z18, num, str);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void A0(ec2.f ev6) {
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(ev6, "ev");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f104357J;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || (s0Var = (in5.s0) in5.n0.Y(wxRecyclerAdapter, ev6.f250965j, false, 2, null)) == null) {
            return;
        }
        java.lang.Object obj = s0Var.f293125i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var == null) {
            return;
        }
        this.f104851e.g(s0Var, ev6);
        if (h1Var.getFeedObject().isLiveFeedExptOn()) {
            return;
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = h1Var.getFeedObject().getFeedObject();
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        r45.qt2 V6 = Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null;
        ((b92.d1) zbVar).getClass();
        dk2.u6.f234171a.e(context, feedObject, V6, true);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void B0(ec2.f ev6) {
        in5.s0 s0Var;
        r45.nw1 liveInfo;
        int i17;
        kotlin.jvm.internal.o.g(ev6, "ev");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f104357J;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || (s0Var = (in5.s0) in5.n0.Y(wxRecyclerAdapter, ev6.f250965j, false, 2, null)) == null) {
            return;
        }
        java.lang.Object obj = s0Var.f293125i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var == null) {
            return;
        }
        this.f104851e.h(s0Var, ev6);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        int i18 = Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135380n : 0;
        if (h1Var.getFeedObject().isLiveFeedExptOn()) {
            return;
        }
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        dk2.u6 u6Var = dk2.u6.f234171a;
        r45.nw1 liveInfo2 = h1Var.getFeedObject().getLiveInfo();
        java.lang.String string = liveInfo2 != null ? liveInfo2.getString(3) : null;
        boolean z17 = true;
        if ((string == null || string.length() == 0) || ((i17 = this.f104360h) != 1 && i17 != 3 && i17 != 4 && i17 != 35 && i18 != 1)) {
            z17 = false;
        }
        if (z17) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = h1Var.getFeedObject().getFeedObject();
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            zy2.ra Sj2 = ((c61.p2) ybVar2).Sj(context);
            r45.qt2 V6 = Sj2 != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj2).V6() : null;
            ((b92.d1) zbVar).getClass();
            kotlin.jvm.internal.o.g(finderObject, "finderObject");
            long j17 = dk2.u6.f234180j;
            r45.nw1 liveInfo3 = finderObject.getLiveInfo();
            if (j17 == (liveInfo3 != null ? liveInfo3.getLong(0) : 0L)) {
                return;
            }
            r45.nw1 liveInfo4 = finderObject.getLiveInfo();
            dk2.u6.f234180j = liveInfo4 != null ? liveInfo4.getLong(0) : 0L;
            r45.nw1 liveInfo5 = finderObject.getLiveInfo();
            boolean A = pm0.v.A(liveInfo5 != null ? liveInfo5.getLong(57) : 0L, 1L);
            int i19 = dk2.u6.f234173c;
            if (A) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[needJoinLiveOnExposure] true");
                if (zl2.q4.f473933a.E()) {
                    db5.t7.makeText(context, "当前直播feed曝光即上报", 0).show();
                }
            } else {
                r45.nw1 liveInfo6 = finderObject.getLiveInfo();
                r5 = ((liveInfo6 != null ? liveInfo6.getInteger(38) : 0) <= 0 || (liveInfo = finderObject.getLiveInfo()) == null) ? i19 : liveInfo.getInteger(38);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlayLiveOnFeedFlow: validWatchTime:");
            sb6.append(r5);
            sb6.append(", serverConfigTime:");
            r45.nw1 liveInfo7 = finderObject.getLiveInfo();
            sb6.append(liveInfo7 != null ? java.lang.Integer.valueOf(liveInfo7.getInteger(38)) : null);
            sb6.append(", clientValidWatchTime:");
            sb6.append(i19);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
            dk2.u6.f234172b = new dk2.r6(r5, context, finderObject, V6);
            dk2.u6.f234174d.c(r5 * 1000, 0L);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void D0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, long j17, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, int i17, int i18, boolean z18, long j18, int i19, int i27) {
        so2.h1 item = (so2.h1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void K(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18) {
        so2.h1 item = (so2.h1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (b2()) {
            return;
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.iar);
        if (V1(item)) {
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        com.tencent.mm.plugin.finder.view.y yVar = new com.tencent.mm.plugin.finder.view.y();
        yVar.f133367c = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
        yVar.f133368d = this.f105112y0;
        yVar.f133366b = this.f104360h;
        yVar.f133370f = new com.tencent.mm.plugin.finder.convert.hf(p17, holder, item, this);
        finderMediaLayout.a(item, yVar);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public int P() {
        return 9;
    }

    public final void P1(long j17, boolean z17, java.lang.Integer num, java.lang.String str) {
        java.lang.String str2 = this.f105110p1;
        com.tencent.mars.xlog.Log.i(str2, "checkDeleteLiveFeed feedId: " + j17 + " isNeedCheck: " + z17);
        in5.s0 T1 = T1(j17);
        if (T1 != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) T1.f293125i;
            if ((baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L) != j17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDeleteLiveFeed isShown = false, feedId: ");
                sb6.append(j17);
                sb6.append(" deleteJob: ");
                kotlinx.coroutines.r2 r2Var = this.f105111x1;
                sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
                com.tencent.mars.xlog.Log.e(str2, sb6.toString());
                return;
            }
            if (!z17 || (num != null && num.intValue() == 2)) {
                kotlinx.coroutines.r2 r2Var2 = this.f105111x1;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                this.f105111x1 = kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.finder.convert.ff(baseFinderFeed, this, j17, T1, num, str, null), 3, null);
            } else {
                com.tencent.mars.xlog.Log.i(str2, "checkDeleteLiveFeed status not end, feedId: " + j17);
            }
            r1 = jz5.f0.f302826a;
        }
        if (r1 == null) {
            com.tencent.mars.xlog.Log.i(str2, "checkDeleteLiveFeed cur holder = null feedId, " + j17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void R0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.Boolean bool) {
        so2.h1 item = (so2.h1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = (com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView) holder.p(com.tencent.mm.R.id.efq);
        if (finderFeedLiveNoticeView == null) {
            return;
        }
        finderFeedLiveNoticeView.setVisibility(8);
    }

    public final void R1(in5.s0 holder, android.widget.FrameLayout frameLayout, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        uc2.b bVar = (uc2.b) this.f104851e.a(holder, uc2.b.class);
        if (bVar != null) {
            bg2.x0 x0Var = (bg2.x0) bVar;
            if (x0Var.f20619n) {
                x0Var.f20615g = frameLayout;
                cg2.k kVar = x0Var.f20616h;
                if (kVar != null) {
                    kVar.getBulletManager().d(x0Var.f20624s, z17);
                    pm0.v.V(100L, new bg2.o0(x0Var));
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void S0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        so2.h1 item = (so2.h1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    public final void S1(so2.j5 feed, in5.s0 holder, boolean z17, android.content.Intent intent) {
        java.lang.String str;
        java.util.HashSet hashSet;
        r45.dm2 object_extend;
        r45.pm2 pm2Var;
        android.content.Intent intent2;
        r45.dm2 object_extend2;
        r45.cl2 cl2Var;
        java.lang.String string;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject5;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.uo1 liveDesc;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject6;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject7;
        android.content.Intent intent3;
        java.lang.String stringExtra;
        android.content.Intent intent4;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject8;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject9;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject10;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(intent, "intent");
        boolean z18 = feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
        intent.putExtra("CURRENT_FEED_ID", (baseFinderFeed == null || (feedObject10 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject10.getId());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
        intent.putExtra("key_ad_flag", (baseFinderFeed2 == null || (feedObject8 = baseFinderFeed2.getFeedObject()) == null || (feedObject9 = feedObject8.getFeedObject()) == null) ? 0 : feedObject9.getAdFlag());
        intent.putExtra("LAUNCH_WITH_ANIM", z17);
        intent.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
        intent.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", false);
        android.content.Context context = holder.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String stringExtra2 = (activity == null || (intent4 = activity.getIntent()) == null) ? null : intent4.getStringExtra("key_jsapi_bypass");
        if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "enterLive, byPass:" + stringExtra2);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra2);
                intent.putExtra("key_enter_live_param_by_pass_type", jSONObject.optInt("by_pass_type"));
                intent.putExtra("key_enter_live_param_by_pass_info", jSONObject.optString("by_pass_info"));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FeedFullLiveConvert", th6, "byPassJson error", new java.lang.Object[0]);
            }
        }
        android.app.Activity activity2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String str2 = "";
        if (activity2 != null && (intent3 = activity2.getIntent()) != null && (stringExtra = intent3.getStringExtra("key_extra_info")) != null) {
            try {
                com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "enterLiveVisitorUI origin chnl_extra:".concat(stringExtra));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(r26.i0.t(stringExtra, ";", ",", false));
                java.lang.String stringExtra3 = intent.getStringExtra("key_chnl_extra");
                org.json.JSONObject put = stringExtra3 != null ? new org.json.JSONObject(r26.i0.t(stringExtra3, ";", ",", false)).put("s1s", jSONObject2.optJSONObject("s1s")) : null;
                if (put != null) {
                    jSONObject2 = put;
                }
                intent.putExtra("key_chnl_extra", jSONObject2.toString());
                com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "enterLiveVisitorUI final chnl_extra:".concat(stringExtra));
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FeedFullLiveConvert", th7, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.ui.MMActivity f122643d = this.f104358f.getF122643d();
        if (f122643d != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            long id6 = (baseFinderFeed3 == null || (feedObject7 = baseFinderFeed3.getFeedObject()) == null) ? 0L : feedObject7.getId();
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "[enterLiveVisitorUI] objectId = ".concat(pm0.v.u(id6)));
            r45.k42 k42Var = new r45.k42();
            r45.j42 j42Var = new r45.j42();
            r45.kc1 kc1Var = new r45.kc1();
            r45.kc1 P6 = ((com.tencent.mm.plugin.finder.feed.fg) ((zy2.b8) pf5.z.f353948a.a(f122643d).c(zy2.b8.class))).P6(id6);
            kc1Var.set(0, P6 != null ? P6.getString(0) : null);
            j42Var.set(0, kc1Var);
            k42Var.set(0, j42Var);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            k42Var.set(1, (baseFinderFeed4 == null || (feedObject6 = baseFinderFeed4.getFeedObject()) == null) ? null : feedObject6.getDescription());
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            if (baseFinderFeed5 == null || (feedObject5 = baseFinderFeed5.getFeedObject()) == null || (finderObject = feedObject5.getFinderObject()) == null || (objectDesc = finderObject.getObjectDesc()) == null || (liveDesc = objectDesc.getLiveDesc()) == null || (obj = liveDesc.getString(1)) == null) {
                obj = "";
            }
            k42Var.set(3, obj);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed6 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            k42Var.set(2, (baseFinderFeed6 == null || (feedObject4 = baseFinderFeed6.getFeedObject()) == null) ? null : feedObject4.getLocation());
            intent.putExtra("PRE_JOIN_LIVE_INFO", k42Var.toByteArray());
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed7 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject11 = (baseFinderFeed7 == null || (feedObject3 = baseFinderFeed7.getFeedObject()) == null) ? null : feedObject3.getFeedObject();
        int i17 = this.f105109l1;
        if (i17 != 0 && feedObject11 != null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "enterLiveVisitorUI rewrite commentScene:" + i17 + " sessionBuffer:" + feedObject11.getSessionBuffer());
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).rk(feedObject11, i17, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(feed);
        jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, feed);
        java.util.List list = (java.util.List) Ai.f302833d;
        int intValue = ((java.lang.Number) Ai.f302834e).intValue();
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed8 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
        if (baseFinderFeed8 == null || (feedObject2 = baseFinderFeed8.getFeedObject()) == null || (str = feedObject2.getNickName()) == null) {
            str = "";
        }
        y74Var.set(2, str);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed9 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
        y74Var.set(5, (baseFinderFeed9 == null || (feedObject = baseFinderFeed9.getFeedObject()) == null) ? null : feedObject.getFeedObject());
        wk0Var.set(6, y74Var);
        r45.ta4 ta4Var = new r45.ta4();
        ta4Var.set(10, java.lang.Integer.valueOf(holder.getAdapterPosition() + 1));
        if (feedObject11 != null && (object_extend2 = feedObject11.getObject_extend()) != null && (cl2Var = (r45.cl2) object_extend2.getCustom(4)) != null && (string = cl2Var.getString(2)) != null) {
            str2 = string;
        }
        byte[] bytes = str2.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        ta4Var.set(1, new com.tencent.mm.protobuf.g(bytes, 0, bytes.length));
        android.app.Activity activity3 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean booleanExtra = (activity3 == null || (intent2 = activity3.getIntent()) == null) ? true : intent2.getBooleanExtra("key_jsapi_enable_history", true);
        if (!booleanExtra) {
            ta4Var.set(25, java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "enableHistory:" + booleanExtra);
        }
        if (feedObject11 != null && (object_extend = feedObject11.getObject_extend()) != null && (pm2Var = (r45.pm2) object_extend.getCustom(12)) != null && ((r45.wm2) pm2Var.getCustom(10)) != null) {
            r45.wm2 wm2Var = new r45.wm2();
            nv2.h1 h1Var = nv2.n1.f340550g;
            nv2.n1 n1Var = nv2.n1.f340551h;
            wm2Var.set(0, java.lang.Integer.valueOf(((java.lang.Boolean) n1Var.k(feedObject11).f302833d).booleanValue() ? 1 : 0));
            wm2Var.set(1, java.lang.Integer.valueOf(n1Var.l(feedObject11)));
            wm2Var.set(3, n1Var.h(feedObject11));
            ta4Var.set(30, new com.tencent.mm.protobuf.g(wm2Var.toByteArray()));
        }
        wk0Var.set(7, ta4Var);
        r45.u74 u74Var = new r45.u74();
        r45.ta4 ta4Var2 = (r45.ta4) wk0Var.getCustom(7);
        u74Var.set(0, ta4Var2 != null ? ta4Var2.getByteString(1) : null);
        so2.h1 h1Var2 = feed instanceof so2.h1 ? (so2.h1) feed : null;
        u74Var.set(1, h1Var2 != null ? h1Var2.f410379f : null);
        wk0Var.set(8, u74Var);
        tc2.b bVar = this.f104851e;
        bVar.getClass();
        tc2.g c18 = bVar.c(holder);
        if (c18 != null && (hashSet = c18.f417144d) != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.Object obj2 = (tc2.c) it.next();
                tc2.h hVar = obj2 instanceof tc2.h ? (tc2.h) obj2 : null;
                if (hVar != null) {
                    hVar.g5(intent, wk0Var);
                }
            }
        }
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context, intent, list, intValue, wk0Var, null);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void T0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final in5.s0 T1(long j17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f104357J;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            return (in5.s0) in5.n0.Y(wxRecyclerAdapter, j17, false, 2, null);
        }
        return null;
    }

    public final java.util.Map U1(r45.nw1 nw1Var) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[3];
        boolean z17 = false;
        lVarArr[0] = new jz5.l("live_id", nw1Var != null ? pm0.v.u(nw1Var.getLong(0)) : 0);
        if (nw1Var != null && nw1Var.getInteger(2) == 1) {
            z17 = true;
        }
        if (z17) {
            ml2.v1 v1Var = ml2.v1.f328140e;
            j17 = 1;
        } else {
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            j17 = 2;
        }
        lVarArr[1] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[2] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }

    public final boolean V1(so2.h1 h1Var) {
        r45.rp1 rp1Var;
        r45.nw1 liveInfo = h1Var.getFeedObject().getLiveInfo();
        if ((liveInfo == null || (rp1Var = (r45.rp1) liveInfo.getCustom(45)) == null || rp1Var.getInteger(0) != 1 || rp1Var.getInteger(3) == 1) ? false : true) {
            return true;
        }
        r45.nw1 liveInfo2 = h1Var.getFeedObject().getLiveInfo();
        java.lang.String string = liveInfo2 != null ? liveInfo2.getString(3) : null;
        if (string == null || string.length() == 0) {
            return true;
        }
        r45.nw1 liveInfo3 = h1Var.getFeedObject().getLiveInfo();
        if ((liveInfo3 == null || cm2.a.f43328a.u(liveInfo3, "", liveInfo3.getLong(0))) ? false : true) {
            return true;
        }
        r45.nw1 liveInfo4 = h1Var.getFeedObject().getLiveInfo();
        return liveInfo4 != null && liveInfo4.getInteger(42) == 1;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void W0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (b2()) {
            return;
        }
        super.W0(holder);
        java.lang.Object obj = holder.f293125i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var != null) {
            Y1(holder, h1Var, false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    /* renamed from: W1, reason: merged with bridge method [inline-methods] */
    public void u0(in5.s0 holder, android.view.View view, so2.h1 item, android.view.MotionEvent motionEvent) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        if (b2()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "[onMediaLongClick] feedId=".concat(pm0.v.u(item.getItemId())));
        D1 = "1";
        if (C(item) && item.getFeedObject().getMediaType() == 9 && !item.getIsPreview()) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Aa).getValue()).r()).intValue();
            android.content.Context context = holder.f293121e;
            if (intValue == 1) {
                com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104358f;
                if (!k8Var.d0()) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
                    k0Var.f211872n = k8Var.Y(item, k0Var);
                    k0Var.f211881s = k8Var.c4(item, holder);
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(holder, item.getItemId(), item.getFeedObject());
                    db5.g4 g4Var = new db5.g4(context);
                    k8Var.Y(item, k0Var).onCreateMMMenu(g4Var);
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(g4Var.f228344d)) {
                        view.performHapticFeedback(0, 2);
                        k0Var.v();
                    }
                }
            }
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
            java.lang.String valueOf = java.lang.String.valueOf(Sj != null ? java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135380n) : null);
            zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
            java.lang.String str = Sj2 != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj2).f135382p : null;
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.S1;
            jz5.l[] lVarArr = new jz5.l[4];
            r45.nw1 liveInfo = item.getFeedObject().getLiveInfo();
            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = item.getFeedObject().getFeedObject();
            lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(feedObject != null ? java.lang.Long.valueOf(feedObject.getId()) : null));
            lVarArr[2] = new jz5.l("panel_sence", "1");
            lVarArr[3] = new jz5.l("sessionBuffer", item.g0());
            zy2.zb.I8(zbVar, u1Var, kz5.c1.l(lVarArr), str, valueOf, item.g0(), null, false, 96, null);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.u1 u1Var2 = ml2.u1.T1;
            jz5.l[] lVarArr2 = new jz5.l[3];
            r45.nw1 liveInfo2 = item.getFeedObject().getLiveInfo();
            lVarArr2[0] = new jz5.l("liveid", java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null));
            com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = item.getFeedObject().getFeedObject();
            lVarArr2[1] = new jz5.l("feedid", pm0.v.u(feedObject2 != null ? feedObject2.getId() : 0L));
            lVarArr2[2] = new jz5.l("panel_sence", "1");
            zy2.zb.I8(zbVar2, u1Var2, kz5.c1.l(lVarArr2), str, valueOf, item.g0(), null, false, 96, null);
            view.performHapticFeedback(0, 2);
            n0(holder, item, view, 2);
        }
        tc2.b bVar = this.f104851e;
        bVar.getClass();
        tc2.g c19 = bVar.c(holder);
        if (c19 == null || (hashSet = c19.f417144d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).T6(view);
        }
    }

    public final void X1(in5.s0 s0Var) {
        if (b2()) {
            android.view.View view = s0Var.itemView;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            int childCount = ((android.view.ViewGroup) view).getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View view2 = s0Var.itemView;
                kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.View childAt = ((android.view.ViewGroup) view2).getChildAt(i17);
                if (!kotlin.jvm.internal.o.b(childAt, (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.jdk))) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshContainerForEnterLiveRoom", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshContainerForEnterLiveRoom", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y1(in5.s0 r24, so2.h1 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.zf.Y1(in5.s0, so2.h1, boolean):void");
    }

    public final void Z1(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, int i17, android.content.Context context) {
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(context, "context");
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(feedObject.getFeedObject().getId()));
        jn0Var.set(12, feedObject.getDupFlag());
        jn0Var.set(1, feedObject.getFeedObject().getUsername());
        jn0Var.set(2, feedObject.getFeedObject().getSessionBuffer());
        jn0Var.set(5, java.lang.Integer.valueOf(feedObject.getMediaType()));
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "live expose adFlag : " + feedObject.getFeedObject().getAdFlag() + " actionType: " + i17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", i17);
        jSONObject.put("value", java.lang.System.currentTimeMillis() / ((long) 1000));
        jn0Var.set(3, jSONObject.toString());
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        ((c61.l7) b6Var).al(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null, 18054, jn0Var);
    }

    public final void a2(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (b2()) {
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) holder.p(com.tencent.mm.R.id.f484869fs3);
            if (finderBaseMediaBanner != null) {
                finderBaseMediaBanner.getMediaView().setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                finderBaseMediaBanner.requestLayout();
            }
            java.lang.Object obj = holder.f293125i;
            so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
            if (h1Var != null) {
                uc2.d dVar = (uc2.d) this.f104851e.a(holder, uc2.d.class);
                if (dVar != null) {
                    ((com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController) dVar).Z6(holder, false, true);
                }
                holder.itemView.setTag(com.tencent.mm.R.id.tp6, java.lang.Boolean.TRUE);
                com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner finderLiveRoomBanner = (com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner) holder.p(com.tencent.mm.R.id.f484869fs3);
                if (dVar != null) {
                    uc2.d.E5(dVar, holder, finderLiveRoomBanner != null ? finderLiveRoomBanner.getMediaView() : null, h1Var, true, false, 16, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b2() {
        /*
            r9 = this;
            java.lang.Class<zy2.b6> r0 = zy2.b6.class
            i95.m r0 = i95.n0.c(r0)
            zy2.b6 r0 = (zy2.b6) r0
            c61.l7 r0 = (c61.l7) r0
            boolean r0 = r0.zk()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            ae2.in r0 = ae2.in.f3688a
            lb2.j r0 = r0.s()
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r1
        L28:
            jz5.g r3 = ae2.in.I2
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            lb2.j r3 = (lb2.j) r3
            java.lang.Object r3 = r3.r()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r2) goto L40
            r3 = r2
            goto L41
        L40:
            r3 = r1
        L41:
            java.lang.String r4 = "key_enable_mixed_timeline_with_liveroom"
            com.tencent.mm.plugin.finder.feed.k8 r5 = r9.f104358f
            if (r3 == 0) goto L5d
            com.tencent.mm.ui.MMActivity r3 = r5.getF122643d()
            if (r3 == 0) goto L58
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L58
            boolean r3 = r3.getBooleanExtra(r4, r1)
            goto L59
        L58:
            r3 = r1
        L59:
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r0 == 0) goto L76
            com.tencent.mm.ui.MMActivity r6 = r5.getF122643d()
            if (r6 == 0) goto L71
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L71
            boolean r6 = r6.getBooleanExtra(r4, r1)
            goto L72
        L71:
            r6 = r1
        L72:
            if (r6 == 0) goto L76
            r6 = r2
            goto L77
        L76:
            r6 = r1
        L77:
            int r7 = r9.f105109l1
            if (r0 == 0) goto L83
            if (r7 == r2) goto L81
            r0 = 120(0x78, float:1.68E-43)
            if (r7 != r0) goto L83
        L81:
            r0 = r2
            goto L84
        L83:
            r0 = r1
        L84:
            r8 = 39
            if (r7 != r8) goto L9e
            com.tencent.mm.ui.MMActivity r5 = r5.getF122643d()
            if (r5 == 0) goto L99
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L99
            boolean r4 = r5.getBooleanExtra(r4, r1)
            goto L9a
        L99:
            r4 = r1
        L9a:
            if (r4 == 0) goto L9e
            r4 = r2
            goto L9f
        L9e:
            r4 = r1
        L9f:
            if (r3 != 0) goto La7
            if (r6 != 0) goto La7
            if (r0 != 0) goto La7
            if (r4 == 0) goto La8
        La7:
            r1 = r2
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.zf.b2():boolean");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void c1(in5.s0 holder, android.graphics.Rect videoViewRect) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(videoViewRect, "videoViewRect");
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "refreshLiveOrientationBtnLayout videoViewRect " + videoViewRect);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f484759tn5);
        if (weImageView != null) {
            weImageView.post(new com.tencent.mm.plugin.finder.convert.sf(weImageView, videoViewRect));
        }
    }

    public final void c2(android.view.Window window) {
        if (this.C1 && window != null) {
            window.clearFlags(8192);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unlock screen record:");
        sb6.append(this.C1);
        sb6.append(",window:");
        sb6.append(window != null ? window.hashCode() : 0);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        this.C1 = false;
    }

    @Override // in5.r
    public int e() {
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T7).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "getLayoutId slideModeEnable=" + z17);
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        return z17 ? booleanValue ? com.tencent.mm.R.layout.dt7 : com.tencent.mm.R.layout.dt6 : booleanValue ? com.tencent.mm.R.layout.f487848dt5 : com.tencent.mm.R.layout.f487847p;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        so2.h1 item = (so2.h1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        boolean b27 = b2();
        tc2.b bVar = this.f104851e;
        if (b27) {
            uc2.d dVar = (uc2.d) bVar.a(holder, uc2.d.class);
            com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner finderLiveRoomBanner = (com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner) holder.p(com.tencent.mm.R.id.f484869fs3);
            if (finderLiveRoomBanner != null) {
                finderLiveRoomBanner.setLiveRoomController(dVar);
            }
            android.view.View p17 = holder.p(com.tencent.mm.R.id.iar);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.tencent.mm.R.id.eqi);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            X1(holder);
            return;
        }
        if (z17) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder liveFeedStateChangeListener:");
        com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1 finderFeedFullLiveConvert$liveFeedStateChangeListener$1 = this.A1;
        sb6.append(finderFeedFullLiveConvert$liveFeedStateChangeListener$1);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        finderFeedFullLiveConvert$liveFeedStateChangeListener$1.alive();
        alive();
        com.tencent.mars.xlog.Log.e(this.f105110p1, "onBindViewHolder getItemId: " + item.getItemId());
        r45.nw1 liveInfo = item.getFeedObject().getLiveInfo();
        int integer = liveInfo != null ? liveInfo.getInteger(2) : 2;
        if (!b2()) {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.o77);
            android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.eqi);
            if (imageView2 == null) {
                com.tencent.mars.xlog.Log.e("Finder.FeedFullLiveConvert", "[refreshMask] holder=" + holder.getItemViewType() + " position=" + holder.getAdapterPosition() + " data=" + holder.f293125i + " holder=" + holder + ' ' + holder.itemView);
            }
            android.view.View p19 = holder.p(com.tencent.mm.R.id.iar);
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().getLiveMediaList());
            if (mb4Var == null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                r45.nw1 liveInfo2 = item.getFeedObject().getLiveInfo();
                sb7.append(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null);
                sb7.append(" firstMedia is empty");
                com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb7.toString());
            }
            java.lang.String string = mb4Var != null ? mb4Var.getString(16) : null;
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = mb4Var != null ? mb4Var.getString(20) : null;
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String concat = string.concat(string2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
                java.lang.String string3 = mb4Var != null ? mb4Var.getString(1) : null;
                if (string3 == null) {
                    string3 = "";
                }
                java.lang.String string4 = mb4Var != null ? mb4Var.getString(19) : null;
                str = string3.concat(string4 != null ? string4 : "");
            } else {
                str = concat;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("refreshMask item=");
            ya2.b2 contact = item.getContact();
            sb8.append(contact != null ? contact.w0() : null);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb8.toString());
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (integer == 1) {
                holder.itemView.post(new com.tencent.mm.plugin.finder.convert.vf(holder, item, integer, this));
                android.view.View p27 = holder.p(com.tencent.mm.R.id.f98);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View p28 = holder.p(com.tencent.mm.R.id.iar);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View p29 = holder.p(com.tencent.mm.R.id.f98);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(p29, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (V1(item)) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d e17 = g1Var.e();
                mn2.j0 j0Var = new mn2.j0(str);
                kotlin.jvm.internal.o.d(imageView2);
                e17.c(j0Var, imageView2, g1Var.h(mn2.f1.f329953d));
                if (p19 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p19, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                i95.m c17 = i95.n0.c(c61.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                kotlin.jvm.internal.o.d(imageView2);
                c61.zb.g7((c61.zb) c17, imageView2, str, 0, 4, null);
            }
        }
        android.content.Context context = holder.itemView.getContext();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI != null) {
            if ((item.getFeedObject().getFeedObject().getBlock_cgi_flag() & 1) == 0) {
                zy2.b8 b8Var = (zy2.b8) pf5.z.f353948a.a(mMFinderUI).c(zy2.b8.class);
                long id6 = item.getFeedObject().getId();
                java.lang.String objectNonceId = item.getFeedObject().getObjectNonceId();
                r45.nw1 liveInfo3 = item.getFeedObject().getLiveInfo();
                ((com.tencent.mm.plugin.finder.feed.fg) b8Var).R6(id6, objectNonceId, liveInfo3 != null ? liveInfo3.getLong(0) : 0L, item.w(), mMFinderUI);
            }
            com.tencent.mm.plugin.finder.convert.pf pfVar = new com.tencent.mm.plugin.finder.convert.pf(this, item);
            android.view.View p37 = holder.p(com.tencent.mm.R.id.f484869fs3);
            if (p37 != null) {
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(p37, "live_room_card");
                ((cy1.a) aVar.ik(p37, 32, 26236)).Ai(p37, pfVar);
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = item.getFeedObject();
                android.content.Context context2 = p37.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                ym5.a1.h(p37, new com.tencent.mm.plugin.finder.convert.mf(feedObject, this, context2));
            }
        }
        com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter = (com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter) holder.p(com.tencent.mm.R.id.f484610ti1);
        if (finderLiveBubbleLayoutCompatSlideEnter != null) {
            bVar.getClass();
            tc2.g c18 = bVar.c(holder);
            uc2.i iVar = (uc2.i) (c18 != null ? c18.a(sb2.o.class) : null);
            com.tencent.mm.plugin.finder.feed.k8 contract = this.f104358f;
            kotlin.jvm.internal.o.g(contract, "contract");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onBind tabType=");
            int i19 = this.f104360h;
            sb9.append(i19);
            sb9.append(" mediaClickController=");
            sb9.append(iVar != null ? iVar.hashCode() : 0);
            com.tencent.mars.xlog.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", sb9.toString());
            finderLiveBubbleLayoutCompatSlideEnter.B = iVar;
            finderLiveBubbleLayoutCompatSlideEnter.P = i19;
            finderLiveBubbleLayoutCompatSlideEnter.L = contract;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context3 = holder.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context3);
        java.lang.String valueOf = java.lang.String.valueOf(Sj != null ? java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135380n) : null);
        zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context3);
        java.lang.String str2 = Sj2 != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj2).f135382p : null;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f484759tn5);
        if (weImageView != null) {
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.qf(holder, item, str2, valueOf));
            java.lang.Object obj = holder.f293125i;
            so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
            if (h1Var != null) {
                if (h1Var.f2()) {
                    java.lang.System.nanoTime();
                    boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    if (!z18) {
                        weImageView.setVisibility(0);
                        i95.m c19 = i95.n0.c(zy2.zb.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        zy2.zb zbVar = (zy2.zb) c19;
                        ml2.u1 u1Var = ml2.u1.f328058k3;
                        jz5.l[] lVarArr = new jz5.l[1];
                        r45.nw1 liveInfo4 = item.getFeedObject().getLiveInfo();
                        lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo4 != null ? java.lang.Long.valueOf(liveInfo4.getLong(0)) : null));
                        zy2.zb.I8(zbVar, u1Var, kz5.c1.l(lVarArr), str2, valueOf, item.g0(), null, false, 96, null);
                        return;
                    }
                }
                weImageView.setVisibility(8);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public boolean h0() {
        in5.s0 s0Var = this.f104375z;
        if (s0Var != null) {
            uc2.g gVar = (uc2.g) this.f104851e.a(s0Var, uc2.g.class);
            java.lang.Integer num = null;
            if (gVar != null) {
                in5.s0 s0Var2 = ((sb2.l) gVar).f417141d.f417149i;
                android.view.ViewGroup viewGroup = s0Var2 != null ? (android.view.ViewGroup) s0Var2.p(com.tencent.mm.R.id.ltb) : null;
                if (viewGroup != null) {
                    num = java.lang.Integer.valueOf(viewGroup.getChildCount());
                }
            }
            if (num != null && num.intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        if (!b2()) {
            com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
            com.tencent.mm.plugin.finder.view.qr qrVar = com.tencent.mm.plugin.finder.view.qr.f132907f;
            com.tencent.mm.plugin.finder.view.s0 s0Var = new com.tencent.mm.plugin.finder.view.s0();
            s0Var.f132988a = recyclerView;
            finderMediaLayout.b(qrVar, s0Var);
            holder.w(com.tencent.mm.R.id.a_x, 8);
            holder.w(com.tencent.mm.R.id.c79, 8);
            holder.w(com.tencent.mm.R.id.msw, 8);
            holder.w(com.tencent.mm.R.id.f487088ng5, 8);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.aur);
            if (p17 != null) {
                p17.getLayoutParams().height = (int) (((java.lang.Number) ((jz5.n) this.f104369t).getValue()).intValue() * 0.38d);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout2 = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        com.tencent.mm.plugin.finder.view.qr qrVar2 = com.tencent.mm.plugin.finder.view.qr.f132909h;
        com.tencent.mm.plugin.finder.view.s0 s0Var2 = new com.tencent.mm.plugin.finder.view.s0();
        s0Var2.f132988a = recyclerView;
        finderMediaLayout2.b(qrVar2, s0Var2);
        X1(holder);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        os5.r rVar = kd2.p1.N.a().M;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        if (rVar != null) {
            dk2.ef.f233398n = rVar;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            return;
        }
        finderLinearLayoutManager.f132638w = true;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, com.tencent.mm.plugin.finder.convert.w7, in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (b2() && (s0Var = this.f104375z) != null) {
            android.view.View view = s0Var.itemView;
            com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
            if (simpleTouchableLayout != null) {
                simpleTouchableLayout.a(false, "Finder.FeedFullLiveConvert");
            }
            uc2.d dVar = (uc2.d) this.f104851e.a(s0Var, uc2.d.class);
            if (dVar != null) {
                uc2.d.K2(dVar, s0Var, false, false, 4, null);
            }
            s0Var.itemView.setTag(com.tencent.mm.R.id.tp6, java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "onDetachedFromRecyclerView: focusedHolder detached, liveRoomController: " + dVar + ", focusedHolder: " + s0Var);
        }
        super.j(recyclerView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromRecyclerView liveFeedStateChangeListener:");
        com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1 finderFeedFullLiveConvert$liveFeedStateChangeListener$1 = this.A1;
        sb6.append(finderFeedFullLiveConvert$liveFeedStateChangeListener$1);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        android.content.Context context = recyclerView.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        c2(activity != null ? activity.getWindow() : null);
        finderFeedFullLiveConvert$liveFeedStateChangeListener$1.dead();
        dead();
        dead();
        kotlinx.coroutines.r2 r2Var = this.f105111x1;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onDetachedFromRecyclerView deleteJob: ");
        kotlinx.coroutines.r2 r2Var2 = this.f105111x1;
        sb7.append(r2Var2 != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var2).a()) : null);
        com.tencent.mars.xlog.Log.i(this.f105110p1, sb7.toString());
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.l(holder);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewRecycled liveFeedStateChangeListener:");
        com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1 finderFeedFullLiveConvert$liveFeedStateChangeListener$1 = this.A1;
        sb6.append(finderFeedFullLiveConvert$liveFeedStateChangeListener$1);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        androidx.recyclerview.widget.RecyclerView o17 = holder.o();
        android.content.Context context = o17 != null ? o17.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        c2(activity != null ? activity.getWindow() : null);
        finderFeedFullLiveConvert$liveFeedStateChangeListener$1.dead();
        dead();
        com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView finderFeedLiveRecommendView = (com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView) holder.p(com.tencent.mm.R.id.efr);
        finderFeedLiveRecommendView.getClass();
        finderFeedLiveRecommendView.f131099i.clear();
        com.tencent.mars.xlog.Log.i("FinderFeedLiveRecommendView", "[clearAll]");
        if (b2()) {
            java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.tp6);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean b17 = kotlin.jvm.internal.o.b(tag, bool);
            if (kotlin.jvm.internal.o.b(holder, this.f104375z) || !b17) {
                android.view.View view = holder.itemView;
                com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
                if (simpleTouchableLayout != null) {
                    simpleTouchableLayout.a(false, "Finder.FeedFullLiveConvert");
                }
                uc2.d dVar = (uc2.d) this.f104851e.a(holder, uc2.d.class);
                if (dVar != null) {
                    uc2.d.K2(dVar, holder, false, false, 4, null);
                }
                androidx.recyclerview.widget.RecyclerView o18 = holder.o();
                android.content.Context context2 = o18 != null ? o18.getContext() : null;
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                android.view.View findViewById = activity2 != null ? activity2.findViewById(com.tencent.mm.R.id.ggn) : null;
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view2 = findViewById;
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                androidx.recyclerview.widget.RecyclerView o19 = holder.o();
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o19 != null ? o19.getLayoutManager() : null;
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
                if (finderLinearLayoutManager != null) {
                    finderLinearLayoutManager.f132638w = false;
                }
                holder.itemView.setTag(com.tencent.mm.R.id.tp6, bool);
                com.tencent.mars.xlog.Log.w("Finder.FeedFullLiveConvert", "onViewRecycled: exit live room as fallback, holder == focusedHolder: " + kotlin.jvm.internal.o.b(holder, this.f104375z) + ", hasExited: " + b17 + ", liveRoomController: " + dVar + ", holder: " + holder);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.w7
    public java.util.List n() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(super.n());
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        arrayList.addAll(kz5.c0.i(bg2.d2.class, bg2.g2.class, bg2.n2.class, bg2.u.class, bg2.k0.class, bg2.l.class, bg2.z3.class, bg2.o4.class, bg2.j0.class, bg2.r.class, bg2.d.class, bg2.e2.class, bg2.k.class, bg2.c5.class, bg2.j5.class, bg2.c.class, bg2.q6.class, bg2.l8.class, bg2.a5.class, bg2.y0.class, bg2.h4.class, bg2.o5.class, bg2.x2.class, bg2.s5.class, bg2.x8.class, bg2.t1.class, bg2.x0.class, bg2.d0.class, bg2.d1.class, bg2.j1.class, bg2.g1.class, bg2.b3.class, com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController.class));
        arrayList.add(sb2.o.class);
        arrayList.add(sb2.l.class);
        arrayList.add(sb2.k.class);
        arrayList.add(sb2.b.class);
        arrayList.add(sb2.i.class);
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void p0(in5.s0 holder) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.p0(holder);
        java.lang.Object obj = holder.f293125i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var != null) {
            r45.nw1 liveInfo = h1Var.getFeedObject().getLiveInfo();
            if (liveInfo != null && liveInfo.getInteger(2) == 2) {
                D(holder, h1Var);
            }
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ae2.in.S3.r()).intValue() > 0) {
                Y1(holder, h1Var, true);
            }
            if (b2()) {
                com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner finderLiveRoomBanner = (com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner) holder.p(com.tencent.mm.R.id.f484869fs3);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
                android.content.Context context = holder.f293121e;
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                long j17 = 0;
                if (activity != null && (intent = activity.getIntent()) != null) {
                    j17 = intent.getLongExtra("KEY_FIRST_FOCUSED_FEED_ID", 0L);
                }
                uc2.d dVar = (uc2.d) this.f104851e.a(holder, uc2.d.class);
                if (dVar != null) {
                    ((com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveConvertLiveRoomViewController) dVar).Y6(holder, finderLiveRoomBanner != null ? finderLiveRoomBanner.getMediaView() : null, h1Var, false, baseFinderFeed.getItemId() == j17);
                }
                X1(holder);
                android.view.View view = holder.itemView;
                com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
                if (simpleTouchableLayout != null) {
                    simpleTouchableLayout.a(true, "Finder.FeedFullLiveConvert");
                }
                android.content.Context context2 = holder.o().getContext();
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                android.view.View findViewById = activity2 != null ? activity2.findViewById(com.tencent.mm.R.id.ggn) : null;
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void q0(androidx.lifecycle.y owner) {
        androidx.recyclerview.widget.RecyclerView o17;
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "onLifecycleDestroy");
        if (b2()) {
            in5.s0 s0Var = this.f104375z;
            if (s0Var != null) {
                android.view.View view = s0Var.itemView;
                com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
                if (simpleTouchableLayout != null) {
                    simpleTouchableLayout.a(false, "Finder.FeedFullLiveConvert");
                }
                uc2.d dVar = (uc2.d) this.f104851e.a(s0Var, uc2.d.class);
                if (dVar != null) {
                    uc2.d.K2(dVar, s0Var, true, false, 4, null);
                }
                s0Var.itemView.setTag(com.tencent.mm.R.id.tp6, java.lang.Boolean.TRUE);
            }
            in5.s0 s0Var2 = this.f104375z;
            android.content.Context context = (s0Var2 == null || (o17 = s0Var2.o()) == null) ? null : o17.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            android.view.View findViewById = activity != null ? activity.findViewById(com.tencent.mm.R.id.ggn) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onLifecycleDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onLifecycleDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r12.isFinishing() == true) goto L32;
     */
    @Override // com.tencent.mm.plugin.finder.convert.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r0(androidx.lifecycle.y r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.zf.r0(androidx.lifecycle.y):void");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public boolean s0(in5.s0 holder, android.view.View view, com.tencent.mm.protocal.protobuf.FinderObject finderObj, android.view.MotionEvent motionEvent, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        if (b2()) {
            return true;
        }
        this.f104851e.e(holder, view, intent);
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void t0(in5.s0 holder, android.view.View view, android.view.MotionEvent e17, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void t1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder, boolean z17, int i17) {
        so2.h1 item = (so2.h1) baseFinderFeed;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.t1(item, holder, z17, i17);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.lkg);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.convert.wf(this, holder, item));
        }
        uc2.a aVar = (uc2.a) this.f104851e.a(holder, uc2.a.class);
        if (aVar != null) {
            boolean isEmpty = nv2.n1.f340551h.h(item.getFeedObject().getFeedObject()).isEmpty();
            bg2.d0 d0Var = (bg2.d0) aVar;
            in5.s0 s0Var = d0Var.f417141d.f417149i;
            android.content.Context context = s0Var != null ? s0Var.f293121e : null;
            if (context == null) {
                return;
            }
            if (!kotlin.jvm.internal.o.b(d0Var.f20007q, java.lang.Boolean.valueOf(isEmpty))) {
                if (isEmpty) {
                    com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z6 = d0Var.Z6();
                    if (Z6 != null) {
                        Z6.setTranslationY(i65.a.h(context, com.tencent.mm.R.dimen.f479738dv));
                    }
                    com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z62 = d0Var.Z6();
                    if (Z62 != null) {
                        Z62.setMaxHeight(i65.a.h(context, com.tencent.mm.R.dimen.f479734dr));
                    }
                } else {
                    com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z63 = d0Var.Z6();
                    if (Z63 != null) {
                        Z63.setTranslationY(i65.a.h(context, com.tencent.mm.R.dimen.f479672c9));
                    }
                    com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z64 = d0Var.Z6();
                    if (Z64 != null) {
                        Z64.setMaxHeight(i65.a.h(context, com.tencent.mm.R.dimen.f479723df));
                    }
                }
                ag2.d dVar = d0Var.f20000g;
                if (dVar != null) {
                    dVar.notifyDataSetChanged();
                }
                d0Var.f20007q = java.lang.Boolean.valueOf(isEmpty);
            }
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z65 = d0Var.Z6();
            if (Z65 != null && Z65.getVisibility() == 0) {
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z66 = d0Var.Z6();
                if ((Z66 != null ? Z66.getChildCount() : 0) > 0) {
                    d0Var.a7();
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void w(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, boolean z17) {
        so2.h1 item = (so2.h1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) holder.p(com.tencent.mm.R.id.f484869fs3);
        if (finderBaseMediaBanner != null) {
            android.content.Context context = finderBaseMediaBanner.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            int i18 = ((android.app.Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels;
            java.lang.Object parent = holder.o().getParent().getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            int bottom = ((android.view.View) parent).getBottom();
            java.util.LinkedList<r45.mb4> mediaList = item.getFeedObject().getMediaList();
            r45.mb4 first = mediaList.getFirst();
            for (r45.mb4 mb4Var : mediaList) {
                r45.mb4 mb4Var2 = first;
                if ((mb4Var2.getFloat(5) * 1.0f) / mb4Var2.getFloat(4) < (mb4Var.getFloat(5) * 1.0f) / mb4Var.getFloat(4)) {
                    first = mb4Var;
                }
                com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "calculateMediaLayoutParams res:[" + mb4Var.getFloat(4) + " x " + mb4Var.getFloat(5));
            }
            finderBaseMediaBanner.getMediaView().getLayoutParams().width = i18;
            finderBaseMediaBanner.getMediaView().getLayoutParams().height = bottom;
            android.view.ViewGroup.LayoutParams layoutParams = finderBaseMediaBanner.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.gravity = 17;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
            android.view.ViewGroup.LayoutParams layoutParams3 = finderVideoLayout != null ? finderVideoLayout.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.topMargin = 0;
                layoutParams4.bottomMargin = 0;
                layoutParams4.gravity = 17;
            }
            finderBaseMediaBanner.requestLayout();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void x0(long j17, in5.s0 holder) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollIdle focusPos: ");
        in5.s0 s0Var = this.f104375z;
        java.lang.Integer num = null;
        sb6.append(s0Var != null ? java.lang.Integer.valueOf(s0Var.getAdapterPosition()) : null);
        sb6.append(" feedId: ");
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f105110p1;
        com.tencent.mars.xlog.Log.i(str, sb7);
        in5.s0 T1 = T1(j17);
        if (T1 != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) T1.f293125i;
            if ((baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L) == j17) {
                this.f105113y1 = j17;
                if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (liveInfo = feedObject.getLiveInfo()) != null) {
                    num = java.lang.Integer.valueOf(liveInfo.getInteger(2));
                }
                Q1(this, j17, true, num, null, 8, null);
                return;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onScrollIdle isShown = false, feedId: ");
            sb8.append(j17);
            sb8.append(" deleteJob: ");
            kotlinx.coroutines.r2 r2Var = this.f105111x1;
            sb8.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
            kotlinx.coroutines.r2 r2Var2 = this.f105111x1;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void z0(in5.s0 holder, int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.z0(holder, i17, i18, z17);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        int S6 = finderHomeUIC != null ? finderHomeUIC.S6() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUnFocusFeedCenter isFromScroll:");
        sb6.append(z17);
        sb6.append(",newTabType:");
        sb6.append(S6);
        sb6.append(",curTabType:");
        int i19 = this.f104360h;
        sb6.append(i19);
        sb6.append(',');
        cm2.a aVar = cm2.a.f43328a;
        java.lang.Object obj = holder.f293125i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        sb6.append(aVar.y((h1Var == null || (feedObject = h1Var.getFeedObject()) == null) ? null : feedObject.getLiveInfo()));
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        if (z17 || S6 != i19) {
            android.content.Context context2 = holder.o().getContext();
            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            c2(activity != null ? activity.getWindow() : null);
        }
        java.lang.Object obj2 = holder.f293125i;
        so2.h1 h1Var2 = obj2 instanceof so2.h1 ? (so2.h1) obj2 : null;
        if (h1Var2 == null) {
            return;
        }
        if (!h1Var2.getFeedObject().isLiveFeedExptOn()) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = h1Var2.getFeedObject().getFeedObject();
            zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
            r45.qt2 V6 = Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null;
            ((b92.d1) zbVar).getClass();
            dk2.u6.f234171a.e(context, feedObject2, V6, true);
        }
        if (b2()) {
            androidx.recyclerview.widget.RecyclerView o17 = holder.o();
            android.content.Context context3 = o17 != null ? o17.getContext() : null;
            android.app.Activity activity2 = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("activity:");
            sb7.append(activity2 != null ? activity2.getClass().getSimpleName() : null);
            sb7.append(",isFinishing:");
            sb7.append(activity2 != null ? java.lang.Boolean.valueOf(activity2.isFinishing()) : null);
            sb7.append(",isDestroyed:");
            sb7.append(activity2 != null ? java.lang.Boolean.valueOf(activity2.isDestroyed()) : null);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb7.toString());
            if (!z17 && S6 == i19) {
                if (!(activity2 != null && activity2.isFinishing())) {
                    return;
                }
            }
            android.view.View view = holder.itemView;
            com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
            if (simpleTouchableLayout != null) {
                simpleTouchableLayout.a(false, "Finder.FeedFullLiveConvert");
            }
            uc2.d dVar = (uc2.d) this.f104851e.a(holder, uc2.d.class);
            if (dVar != null) {
                uc2.d.K2(dVar, holder, false, false, 4, null);
            }
            holder.itemView.setTag(com.tencent.mm.R.id.tp6, java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "onUnFocusFeedCenter liveRoomController:" + dVar + ", holder:" + holder);
            android.content.Context context4 = holder.o().getContext();
            android.app.Activity activity3 = context4 instanceof android.app.Activity ? (android.app.Activity) context4 : null;
            android.view.View findViewById = activity3 != null ? activity3.findViewById(com.tencent.mm.R.id.ggn) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = holder.o().getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager == null) {
                return;
            }
            finderLinearLayoutManager.f132638w = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFinderLiveExitListener$1] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedExposeListener$1] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1] */
    public zf(cw2.f8 videoCore, final com.tencent.mm.plugin.finder.feed.k8 contract, boolean z17, int i17, int i18) {
        super(contract, z17, i17, false);
        kotlin.jvm.internal.o.g(videoCore, "videoCore");
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f105112y0 = videoCore;
        this.f105109l1 = i18;
        this.f105110p1 = "LiveFeedDelete_" + hashCode();
        final com.tencent.mm.ui.MMActivity f122643d = contract.getF122643d();
        this.f105114z1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedLiveFeedExposeEvent>(f122643d) { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedExposeListener$1
            {
                this.__eventId = 339975038;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedLiveFeedExposeEvent feedLiveFeedExposeEvent) {
                com.tencent.mm.autogen.events.FeedLiveFeedExposeEvent event = feedLiveFeedExposeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveFeedExposeListener receive feedId: ");
                sb6.append(event.f54248g.f6546a);
                sb6.append(" focusedHolder: ");
                com.tencent.mm.plugin.finder.convert.zf zfVar = com.tencent.mm.plugin.finder.convert.zf.this;
                sb6.append(zfVar.f104375z);
                com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
                com.tencent.mm.plugin.finder.feed.k8 k8Var = contract;
                if (!k8Var.getF122643d().isPaused()) {
                    return false;
                }
                in5.s0 s0Var = zfVar.f104375z;
                so2.j5 j5Var = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
                so2.h1 h1Var = j5Var instanceof so2.h1 ? (so2.h1) j5Var : null;
                if (h1Var == null) {
                    return false;
                }
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = h1Var.getFeedObject();
                androidx.appcompat.app.AppCompatActivity context = k8Var.getF122643d().getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                zfVar.Z1(feedObject, 68, context);
                return false;
            }
        };
        final com.tencent.mm.ui.MMActivity f122643d2 = contract.getF122643d();
        this.A1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(f122643d2) { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.convert.nf(event, com.tencent.mm.plugin.finder.convert.zf.this));
                return false;
            }
        };
        final com.tencent.mm.ui.MMActivity f122643d3 = contract.getF122643d();
        this.B1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveExitEvent>(f122643d3) { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFinderLiveExitListener$1
            {
                this.__eventId = 721137114;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveExitEvent finderLiveExitEvent) {
                so2.j5 j5Var;
                com.tencent.mm.autogen.events.FinderLiveExitEvent event = finderLiveExitEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveFinderLiveExitListener receive feedId: ");
                am.pb pbVar = event.f54285g;
                sb6.append(pbVar.f7611a);
                sb6.append(" focusedHolder: ");
                com.tencent.mm.plugin.finder.convert.zf zfVar = com.tencent.mm.plugin.finder.convert.zf.this;
                sb6.append(zfVar.f104375z);
                sb6.append("focusedHolder feedId: ");
                in5.s0 s0Var = zfVar.f104375z;
                sb6.append((s0Var == null || (j5Var = (so2.j5) s0Var.f293125i) == null) ? null : java.lang.Long.valueOf(j5Var.getItemId()));
                com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
                in5.s0 s0Var2 = zfVar.f104375z;
                if (s0Var2 != null) {
                    so2.j5 j5Var2 = (so2.j5) s0Var2.f293125i;
                    if (j5Var2 != null && pbVar.f7611a == j5Var2.getItemId()) {
                        s0Var2.itemView.post(new com.tencent.mm.plugin.finder.convert.of(s0Var2));
                    }
                }
                return false;
            }
        };
    }
}
