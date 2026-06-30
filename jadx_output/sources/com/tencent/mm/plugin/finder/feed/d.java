package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class d extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f106522u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f106523v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.tencent.mm.ui.MMActivity r12, androidx.fragment.app.Fragment r13, int r14, int r15, boolean r16, int r17, kotlin.jvm.internal.i r18) {
        /*
            r11 = this;
            r9 = r11
            r10 = r13
            r0 = r17 & 16
            if (r0 == 0) goto L9
            r0 = 0
            r4 = r0
            goto Lb
        L9:
            r4 = r16
        Lb:
            java.lang.String r0 = "context"
            r1 = r12
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.g(r13, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r11
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f106522u = r10
            java.lang.String r0 = "Finder.FinderAllFeedUIContract.AllFeedViewCallback"
            r9.f106523v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.d.<init>(com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGridItemClick dataList:");
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter = z().f107156e.getDataListJustForAdapter();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(dataListJustForAdapter, 10));
        for (T t17 : dataListJustForAdapter) {
            arrayList.add("type:" + t17.h() + "_id:" + t17.getItemId());
        }
        sb6.append(arrayList);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f106523v;
        com.tencent.mars.xlog.Log.i(str, sb7);
        boolean z17 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
        com.tencent.mm.ui.MMActivity context = this.f106174d;
        boolean z18 = false;
        java.lang.Integer num = null;
        num = null;
        if (z17) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onGridItemClick ");
            sb8.append(a07);
            sb8.append(" id:");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            sb8.append(baseFinderFeed.getFeedObject().getId());
            sb8.append(", pos:");
            sb8.append(i17);
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
            if (baseFinderFeed.getFeedObject().isLiveFeed()) {
                r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
                if (liveInfo != null && liveInfo.getInteger(2) == 2) {
                    z18 = true;
                }
                if (z18) {
                    long id6 = baseFinderFeed.getFeedObject().getId();
                    java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    new db2.g4(id6, objectNonceId, 279, 1, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, baseFinderFeed.w(), null, 402644928, null).l().h(new com.tencent.mm.plugin.finder.feed.b(j5Var, this, a07, view));
                    return;
                }
            }
            W(baseFinderFeed, a07, view);
            return;
        }
        if (j5Var instanceof so2.a0) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onGridItemClick item pos:");
            sb9.append(i17);
            sb9.append(" fixPos:");
            sb9.append(a07);
            sb9.append(" topicId ");
            so2.a0 a0Var = (so2.a0) j5Var;
            r45.vx0 vx0Var = (r45.vx0) a0Var.f410244d.getCustom(2);
            sb9.append(pm0.v.u(vx0Var != null ? vx0Var.getLong(0) : 0L));
            sb9.append('}');
            com.tencent.mars.xlog.Log.i(str, sb9.toString());
            r45.vx0 vx0Var2 = (r45.vx0) a0Var.f410244d.getCustom(2);
            if (vx0Var2 != null) {
                android.content.Intent intent = new android.content.Intent();
                ya2.b2 b2Var = a0Var.f410245e;
                intent.putExtra("collection_info", vx0Var2.toByteArray());
                intent.putExtra("collection_author_username", b2Var != null ? b2Var.D0() : null);
                intent.putExtra("collection_nickname", b2Var != null ? b2Var.w0() : null);
                intent.putExtra("collection_avatar_url", b2Var != null ? b2Var.getAvatarUrl() : null);
                intent.putExtra("collection_authicon_url", (b2Var == null || (finderAuthInfo2 = b2Var.field_authInfo) == null) ? null : finderAuthInfo2.getAuthIconUrl());
                if (b2Var != null && (finderAuthInfo = b2Var.field_authInfo) != null) {
                    num = java.lang.Integer.valueOf(finderAuthInfo.getAuthIconType());
                }
                intent.putExtra("collection_authicon_type", num);
                intent.putExtra("collection_ref_comment_scene", 349);
                intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderCollectionUI.class);
                wa2.x.e(intent, view, 0L, false, false, null, 30, null);
                com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mMActivity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderAllFeedUIContract$AllFeedViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(mMActivity, "com/tencent/mm/plugin/finder/feed/FinderAllFeedUIContract$AllFeedViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
        if (z().f107156e.getSize() <= this.f106179i * 3) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z().f107156e;
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader");
            if (((com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader) baseFeedLoader).f107528g) {
                com.tencent.mm.view.RefreshLoadMoreLayout.K(this.f106180m, false, 1, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean R() {
        return !(this instanceof com.tencent.mm.plugin.finder.feed.xa);
    }

    public final void W(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, android.view.View view) {
        int i18;
        java.lang.Integer num;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.k0 z17 = z();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z17.f107156e;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList = baseFeedLoader.getDataList();
        java.lang.Integer num2 = null;
        if (!(dataList instanceof com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer)) {
            dataList = null;
        }
        int i19 = 1;
        if (dataList != null) {
            java.util.Iterator<T> it = baseFeedLoader.getDataList().iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().setCommentScene(0);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = dataList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (!(((so2.j5) next) instanceof so2.a0)) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
        }
        pm0.v.b0(arrayList, new com.tencent.mm.plugin.finder.feed.c(baseFinderFeed));
        java.util.Iterator it7 = arrayList.iterator();
        int i27 = 0;
        while (true) {
            if (!it7.hasNext()) {
                i27 = -1;
                break;
            } else {
                if (((so2.j5) it7.next()).getItemId() == baseFinderFeed.getItemId()) {
                    break;
                } else {
                    i27++;
                }
            }
        }
        if (i27 < 0 || i27 == i17) {
            i18 = i17;
        } else {
            com.tencent.mars.xlog.Log.i(this.f106523v, "saveCache modify pos from " + i17 + " to " + i27);
            i18 = i27;
        }
        baseFeedLoader.passTo(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList, baseFeedLoader.getLastBuffer(), i18, null, null, 16, null), intent);
        androidx.fragment.app.Fragment fragment = this.f106522u;
        boolean z18 = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment;
        com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment finderAllFeedGridFragment = z18 ? (com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment) fragment : null;
        if (finderAllFeedGridFragment != null) {
            int i28 = finderAllFeedGridFragment.f129265p;
            if (i28 == 100) {
                i19 = 2;
            } else if (i28 != 102) {
                i19 = 7;
            }
            num = java.lang.Integer.valueOf(i19);
        } else {
            num = null;
        }
        intent.putExtra("TabFlag", num);
        com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment finderAllFeedGridFragment2 = z18 ? (com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment) fragment : null;
        if (finderAllFeedGridFragment2 != null) {
            num2 = java.lang.Integer.valueOf(finderAllFeedGridFragment2.f129265p == 10001 ? 3 : 0);
        }
        intent.putExtra("ItemFlag", num2);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        iyVar.c(this.f106174d, intent);
        wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f444181d, getRecyclerView(), baseFinderFeed.getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), null, 8, null), 14, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        i0Var.getClass();
        intent.setClass(activity, com.tencent.mm.plugin.finder.feed.ui.FinderAllTimelineUI.class);
        iyVar.c(activity, intent);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(activity, arrayList3.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAllTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAllTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        long itemId = baseFinderFeed.getItemId();
        java.lang.String w17 = baseFinderFeed.w();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
        java.lang.String jSONObject = baseFinderFeed.getUdfKv().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, itemId, w17, recyclerView, 0, jSONObject, 0L, null, 208, null);
        com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, baseFinderFeed, 18);
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        fc2.o Z6;
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        androidx.fragment.app.Fragment fragment = this.f106522u;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(getRecyclerView());
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return this.f106174d.findViewById(com.tencent.mm.R.id.f484229dg3);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f106184q.d(context);
    }
}
