package ab2;

/* loaded from: classes2.dex */
public abstract class g extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f2768u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2769v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2770w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2771x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2772y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f2773z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.lang.String r15, com.tencent.mm.ui.MMActivity r16, int r17, int r18, boolean r19, int r20, boolean r21, int r22, kotlin.jvm.internal.i r23) {
        /*
            r14 = this;
            r9 = r14
            r10 = r15
            r0 = r22 & 16
            r1 = 0
            if (r0 == 0) goto L9
            r4 = r1
            goto Lb
        L9:
            r4 = r19
        Lb:
            r0 = r22 & 32
            if (r0 == 0) goto L11
            r11 = r1
            goto L13
        L11:
            r11 = r20
        L13:
            r0 = r22 & 64
            if (r0 == 0) goto L19
            r12 = r1
            goto L1b
        L19:
            r12 = r21
        L1b:
            java.lang.String r0 = "bizName"
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.String r0 = "context"
            r13 = r16
            kotlin.jvm.internal.o.g(r13, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f2768u = r10
            r9.f2769v = r11
            r9.f2770w = r12
            r0 = 7
            r9.f2771x = r0
            boolean r0 = lk5.s.b(r16)
            r9.f2772y = r0
            com.tencent.mm.plugin.finder.profile.h r1 = new com.tencent.mm.plugin.finder.profile.h
            r2 = 0
            r3 = 0
            r4 = 1
            r17 = r1
            r18 = r16
            r19 = r2
            r20 = r3
            r21 = r0
            r22 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r9.f2773z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ab2.g.<init>(java.lang.String, com.tencent.mm.ui.MMActivity, int, int, boolean, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void J(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        try {
            int a07 = i17 - o().a0();
            if (a07 < 0 || a07 >= z().f107156e.getSize()) {
                return;
            }
            so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
            if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && zl2.q4.f473933a.C((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var)) {
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                ym5.a1.h(itemView, new ab2.c(j5Var, this));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "profile_live_room_card");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 26236);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                r45.nw1 liveInfo = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getLiveInfo();
                if (liveInfo != null) {
                    linkedHashMap.put("live_id", pm0.v.u(liveInfo.getLong(0)));
                }
                linkedHashMap.put("feed_id", pm0.v.u(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject().getId()));
                java.lang.String username = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject().getUsername();
                if (username == null) {
                    username = "";
                }
                linkedHashMap.put("finder_username", username);
                ml2.q1 q1Var = ml2.q1.f327812e;
                linkedHashMap.put("comment_scene", "temp_5");
                linkedHashMap.put("session_buffer", "");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.itemView, linkedHashMap);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new ab2.d(this, j5Var));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        boolean z17;
        int a07;
        int i18;
        android.app.Activity parentActivity;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17 && (a07 = i17 - ((in5.n0) adapter).a0()) >= 0 && a07 < z().f107156e.getSize()) {
            so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.F0().r()).intValue();
                com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
                if (intValue == 1) {
                    com.tencent.mm.ui.vas.VASActivity vASActivity = mMActivity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) mMActivity : null;
                    if (vASActivity != null && (parentActivity = vASActivity.getParentActivity()) != null && this.f2772y && (parentActivity instanceof com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI)) {
                        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) parentActivity;
                        pf5.z zVar = pf5.z.f353948a;
                        com.tencent.mm.plugin.finder.viewmodel.component.s4 s4Var = (com.tencent.mm.plugin.finder.viewmodel.component.s4) zVar.a(appCompatActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.s4.class);
                        if (s4Var != null) {
                            s4Var.O6();
                        }
                        com.tencent.mm.plugin.finder.viewmodel.component.s4 s4Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.s4) zVar.a(appCompatActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.s4.class);
                        if (s4Var2 != null) {
                            s4Var2.R6(j5Var);
                            return;
                        }
                        return;
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
                sb6.append(a07);
                sb6.append(" id:");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                sb6.append(baseFinderFeed.getFeedObject().getId());
                sb6.append(", pos:");
                sb6.append(a07);
                com.tencent.mars.xlog.Log.i("Finder.FinderBizProfileContract", sb6.toString());
                boolean fk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
                if (((java.lang.Number) ae2.in.f3688a.s().r()).intValue() == 1 && !fk6) {
                    z18 = true;
                }
                if (!zl2.q4.f473933a.C(baseFinderFeed) || z18) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("KEY_BIZ_USERNAME", this.f2768u);
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent, a07, null, 4, null);
                    com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
                    int i19 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
                    com.tencent.mars.xlog.Log.i("Finder.FinderBizProfileContract", "startPreloadVideo onGridItemClick feedId:" + pm0.v.u(feedObject.getId()) + " return for disable");
                    yz5.p Ri = wa2.u.f444181d.Ri(getRecyclerView(), baseFinderFeed.getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), new ab2.f(this));
                    i18 = a07;
                    intent.putExtra("KEY_REQUEST_BACK_DATA", wa2.x.e(intent, view, 0L, false, true, Ri, 6, null));
                    if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
                        com.tencent.mm.ui.MMActivity mMActivity2 = this.f106174d;
                        ab2.e eVar = new ab2.e(this, intent, j5Var);
                        ((vd0.j2) q1Var).getClass();
                        v24.o0.h(mMActivity2, 34359738368L, null, eVar, 3);
                    } else {
                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ri(mMActivity, intent, 10010);
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        if (nyVar != null) {
                            r45.qt2 V6 = nyVar.V6();
                            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, j5Var.getItemId(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).w(), this.f106180m.getRecyclerView(), 0, null, 0L, null, 240, null);
                            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
                        }
                    }
                } else {
                    ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Bi(new zy2.nc(baseFinderFeed.getFeedObject().getUserName(), baseFinderFeed.getFeedObject().getId(), baseFinderFeed.getFeedObject().getObjectNonceId(), baseFinderFeed.getFeedObject().getLiveInfo(), baseFinderFeed.g0(), baseFinderFeed.getFeedObject().getNickName(), (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f484927fz0), null, 128, null), baseFinderFeed.getItemId(), view, ez2.a.f257856e, new ab2.b(this, baseFinderFeed, i17, view, android.os.SystemClock.elapsedRealtime()));
                    i18 = a07;
                }
                com.tencent.mm.autogen.events.ProfileFinderClickEvent profileFinderClickEvent = new com.tencent.mm.autogen.events.ProfileFinderClickEvent();
                am.wo woVar = profileFinderClickEvent.f54629g;
                woVar.getClass();
                woVar.f8306a = i18;
                woVar.f8307b = "";
                woVar.f8308c = this.f2769v;
                woVar.f8309d = this.f2770w;
                profileFinderClickEvent.e();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public com.tencent.mm.plugin.finder.storage.vj0 q() {
        return this.f2773z;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        this.f106180m.setEnableRefresh(false);
        this.f106180m.setSuperNestedScroll(true);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        android.view.View l17 = l(com.tencent.mm.R.id.f484229dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        return this.f2773z.c();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f2773z.d(context);
    }
}
