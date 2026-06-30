package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class oj extends in5.r {
    public boolean A;
    public android.view.View B;
    public cw2.da C;
    public final jz5.g D;
    public td2.c E;
    public com.tencent.mm.plugin.finder.view.ka F;
    public final jz5.g G;
    public int H;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f104183e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.k8 f104184f;

    /* renamed from: g, reason: collision with root package name */
    public final int f104185g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f104186h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f104187i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f104188m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f104189n;

    /* renamed from: o, reason: collision with root package name */
    public int f104190o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f104191p;

    /* renamed from: q, reason: collision with root package name */
    public in5.s0 f104192q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout f104193r;

    /* renamed from: s, reason: collision with root package name */
    public int f104194s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f104195t;

    /* renamed from: u, reason: collision with root package name */
    public int f104196u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f104197v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f104198w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f104199x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.Map f104200y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f104201z;

    public oj(yz5.l lVar, com.tencent.mm.plugin.finder.feed.k8 contract, int i17) {
        androidx.appcompat.app.AppCompatActivity context;
        fc2.c Y6;
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f104183e = lVar;
        this.f104184f = contract;
        this.f104185g = i17;
        this.f104186h = "FinderFeedPlaceHolderConvert";
        this.f104187i = jz5.h.b(com.tencent.mm.plugin.finder.convert.xi.f104954d);
        this.f104188m = jz5.h.b(com.tencent.mm.plugin.finder.convert.wi.f104876d);
        this.f104189n = jz5.h.b(com.tencent.mm.plugin.finder.convert.lj.f103931d);
        this.f104190o = 3;
        this.f104199x = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.finder.convert.mj(this), true);
        com.tencent.mm.ui.MMActivity f122643d = contract.getF122643d();
        if (f122643d != null && (context = f122643d.getContext()) != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null && (Y6 = nyVar.Y6(i17)) != null) {
                Y6.a(new com.tencent.mm.plugin.finder.convert.ei(this));
            }
        }
        this.D = jz5.h.b(com.tencent.mm.plugin.finder.convert.nj.f104102d);
        this.G = jz5.h.b(new com.tencent.mm.plugin.finder.convert.qi(this));
    }

    public static final java.util.Map n(com.tencent.mm.plugin.finder.convert.oj ojVar) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        cw2.da daVar = ojVar.C;
        java.lang.String str = null;
        java.lang.Object tag = daVar != null ? daVar.getTag() : null;
        com.tencent.mm.plugin.finder.convert.gi giVar = tag instanceof com.tencent.mm.plugin.finder.convert.gi ? (com.tencent.mm.plugin.finder.convert.gi) tag : null;
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u((giVar == null || (baseFinderFeed2 = giVar.f103489b) == null) ? 0L : baseFinderFeed2.getItemId()));
        if (giVar != null && (baseFinderFeed = giVar.f103489b) != null) {
            str = baseFinderFeed.g0();
        }
        lVarArr[1] = new jz5.l("session_buffer", str);
        return kz5.c1.k(lVarArr);
    }

    public final void A() {
        cw2.da daVar = this.C;
        if (daVar != null) {
            daVar.d();
        }
        cw2.da daVar2 = this.C;
        if (daVar2 != null) {
            daVar2.b();
        }
        this.C = null;
    }

    public final void B(java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.fi fiVar) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        boolean z17;
        boolean z18;
        java.lang.String str4 = this.f104186h;
        try {
            com.tencent.mars.xlog.Log.i(str4, str + " removeSocialItem item=" + baseFinderFeed + ",removeReason=" + fiVar);
            if (baseFinderFeed == null) {
                return;
            }
            com.tencent.mm.plugin.finder.convert.fi fiVar2 = com.tencent.mm.plugin.finder.convert.fi.f103386h;
            com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104184f;
            if (fiVar == fiVar2) {
                pm0.z.b(xy2.b.f458155b, "removeSocialHotPlaceHolder", false, null, null, false, false, null, 124, null);
            } else if (fiVar == com.tencent.mm.plugin.finder.convert.fi.f103383e) {
                com.tencent.mars.xlog.Log.i(str4, str + " change to target tab");
            } else {
                com.tencent.mm.ui.MMActivity context = k8Var.getF122643d();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[5];
                java.lang.String str5 = "";
                if (V6 == null || (str2 = V6.getString(1)) == null) {
                    str2 = "";
                }
                lVarArr[0] = new jz5.l("finder_context_id", str2);
                if (V6 == null || (str3 = V6.getString(2)) == null) {
                    str3 = "";
                }
                lVarArr[1] = new jz5.l("finder_tab_context_id", str3);
                lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
                lVarArr[3] = new jz5.l("ltr_card_unexpose_reason", java.lang.Integer.valueOf(fiVar.f103389d));
                r45.en2 place_holder_info = baseFinderFeed.getFeedObject().getFinderObject().getPlace_holder_info();
                if (place_holder_info != null && (string = place_holder_info.getString(5)) != null) {
                    str5 = string;
                }
                lVarArr[4] = new jz5.l("report_info", str5);
                ((cy1.a) rVar).Bj("lead_to_rec_card", "lead_to_rec_card_unexpose", kz5.c1.k(lVarArr), 1, false);
            }
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (z18 && fiVar == com.tencent.mm.plugin.finder.convert.fi.f103384f) {
                db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, "Debug:引导卡片取不到有效feed播放，所以删除了");
            }
            k8Var.s0(baseFinderFeed);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, java.lang.String.valueOf(str4));
        }
    }

    public final void C() {
        this.f104197v = true;
        android.widget.TextView textView = this.f104191p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f104196u = 0;
        this.f104199x.d();
    }

    public final void D(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(baseFinderFeed.getFeedObject().getMediaList());
        if (mb4Var != null) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(41));
            mn2.g1 g1Var = mn2.g1.f329975a;
            java.lang.String str = this.f104186h;
            if (!K0) {
                com.tencent.mars.xlog.Log.i(str, "bindSocialHotPlaceHolder: use full cover url, position=" + i17 + ", feedId=" + pm0.v.u(baseFinderFeed.getItemId()));
                g1Var.e().c(new mn2.f4(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), imageView, g1Var.h(mn2.f1.B));
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16))) {
                com.tencent.mars.xlog.Log.i(str, "bindSocialHotPlaceHolder: use thumb url, position=" + i17 + ", feedId=" + pm0.v.u(baseFinderFeed.getItemId()));
                g1Var.e().c(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "bindSocialHotPlaceHolder: use cover url, position=" + i17 + ", feedId=" + pm0.v.u(baseFinderFeed.getItemId()));
            g1Var.e().c(new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), imageView, g1Var.h(mn2.f1.B));
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b_f;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        boolean z18;
        android.widget.ImageView imageView;
        android.view.View findViewById;
        boolean z19;
        android.view.ViewGroup viewGroup;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        android.view.View findViewById2;
        android.view.View findViewById3;
        android.widget.TextView textView;
        java.lang.String string;
        android.widget.TextView textView2;
        r45.yk2 yk2Var;
        so2.n1 item = (so2.n1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.en2 place_holder_info = item.getFeedObject().getFinderObject().getPlace_holder_info();
        android.view.View p17 = holder.p(com.tencent.mm.R.id.nsw);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "resetSocialHotRecommend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "resetSocialHotRecommend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Object obj = this.C;
        android.view.View view2 = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view2);
            }
        }
        A();
        java.lang.Integer valueOf = place_holder_info != null ? java.lang.Integer.valueOf(place_holder_info.getInteger(2)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            p(holder, item);
            return;
        }
        if (valueOf != null && valueOf.intValue() == 7) {
            p(holder, item);
            return;
        }
        java.lang.String str = this.f104186h;
        com.tencent.mm.plugin.finder.feed.k8 contract = this.f104184f;
        if (valueOf != null && valueOf.intValue() == 2) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed w17 = w("SocialHot_onBindViewHolder", contract.getF122643d(), 4);
            if (w17 != null) {
                q("SocialHotGoRecommend ", holder, item, i17, place_holder_info, w17, 4);
                return;
            } else {
                com.tencent.mars.xlog.Log.e(str, "bindSocialHotPlaceHolder fail,get first unread feed is null!");
                holder.itemView.post(new com.tencent.mm.plugin.finder.convert.ri(this, item));
                return;
            }
        }
        java.lang.String str2 = "";
        android.content.Context context = holder.f293121e;
        if (valueOf == null) {
            i19 = 0;
        } else {
            if (valueOf.intValue() == 4) {
                if (!item.f2()) {
                    if (!((c01.z1.j() & 34359738368L) != 0)) {
                        com.tencent.mars.xlog.Log.i(str, "skip RelJumpTips, finder entrance already opened");
                        holder.itemView.post(new com.tencent.mm.plugin.finder.convert.si(this, item));
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.w(str, "bindRelJumpTips position=" + i17 + ", isProfileGuide=" + item.f2());
                this.f104201z = true;
                android.view.View p18 = holder.p(com.tencent.mm.R.id.fuz);
                if (p18 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p19 = holder.p(com.tencent.mm.R.id.f484964g30);
                if (p19 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fvd);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.view.View p27 = holder.p(com.tencent.mm.R.id.nsw);
                if (p27 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p27, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p27.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p28 = holder.p(com.tencent.mm.R.id.cgb);
                if (p28 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p29 = holder.p(com.tencent.mm.R.id.hbk);
                if (p29 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(p29, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p29.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p37 = holder.p(com.tencent.mm.R.id.vfn);
                if (p37 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(p37, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p38 = holder.p(com.tencent.mm.R.id.vfo);
                if (p38 != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(p38, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p38.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = this.B;
                if (view3 != null) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(0);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view3, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsBaseLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view4 = this.B;
                if (view4 != null && (textView2 = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.qwl)) != null) {
                    textView2.setText("");
                }
                android.view.View view5 = this.B;
                if (view5 != null && (textView = (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.vfn)) != null) {
                    i95.m c17 = i95.n0.c(zy2.s6.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.s6 s6Var = (zy2.s6) c17;
                    r45.en2 place_holder_info2 = item.getFeedObject().getFinderObject().getPlace_holder_info();
                    textView.setText(zy2.s6.l6(s6Var, (place_holder_info2 == null || (string = place_holder_info2.getString(3)) == null) ? "" : string, (int) textView.getTextSize(), false, null, 0, false, null, 124, null));
                }
                android.view.View view6 = this.B;
                if (view6 != null && (findViewById3 = view6.findViewById(com.tencent.mm.R.id.qtw)) != null) {
                    if (item.f2()) {
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        arrayList11.add(8);
                        java.util.Collections.reverse(arrayList11);
                        yj0.a.d(findViewById3, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsSwipeUpContainer", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsSwipeUpContainer", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        arrayList12.add(0);
                        java.util.Collections.reverse(arrayList12);
                        yj0.a.d(findViewById3, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsSwipeUpContainer", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsSwipeUpContainer", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ej(this, i17));
                    }
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = item.f410491e;
                if (finderObject != null) {
                    com.tencent.mars.xlog.Log.i(str, "getJumpObjectFromShareRel: use attachedJumpFeed id=" + finderObject.getId());
                } else {
                    if (contract instanceof com.tencent.mm.plugin.finder.feed.t8) {
                        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = ((com.tencent.mm.plugin.finder.feed.t8) contract).f106570t;
                        java.util.List list2 = (baseFeedLoader == null || !(baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader)) ? null : ((com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader) baseFeedLoader).R;
                        if (list2 != null) {
                            finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(list2);
                        }
                    }
                    finderObject = null;
                }
                if (finderObject == null) {
                    com.tencent.mars.xlog.Log.i(str, "no jumpObject");
                    return;
                }
                android.view.View view7 = this.B;
                if (view7 != null && (findViewById2 = view7.findViewById(com.tencent.mm.R.id.qnz)) != null) {
                    findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.dj(this, item, holder, finderObject));
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed p39 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 256));
                com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
                java.lang.String headUrl = contact != null ? contact.getHeadUrl() : null;
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                mn2.n nVar = new mn2.n(headUrl, null, 2, null);
                android.view.View p47 = holder.p(com.tencent.mm.R.id.a_4);
                kotlin.jvm.internal.o.f(p47, "getView(...)");
                a17.c(nVar, (android.widget.ImageView) p47, g1Var.h(mn2.f1.f329957h));
                ((android.widget.TextView) holder.p(com.tencent.mm.R.id.kbq)).setText(p39.getFeedObject().getNickNameSpan());
                com.tencent.mm.protocal.protobuf.FinderContact contact2 = p39.getFeedObject().getFeedObject().getContact();
                if (contact2 != null) {
                    r45.xk a18 = ya2.d.a(contact2, false);
                    if (a18 == null || (authInfo = ya2.d.e(a18)) == null) {
                        authInfo = contact2.getAuthInfo();
                    }
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.m1 m1Var = ya2.m1.f460511a;
                    android.view.View p48 = holder.p(com.tencent.mm.R.id.f483299a85);
                    kotlin.jvm.internal.o.f(p48, "getView(...)");
                    zy2.tb.a(m1Var, (android.widget.ImageView) p48, authInfo, 0, 4, null);
                }
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(p39.getFeedObject().getMediaList());
                if (mb4Var != null && mb4Var.getInteger(2) == 4) {
                    android.view.View view8 = this.B;
                    android.view.View findViewById4 = view8 != null ? view8.findViewById(com.tencent.mm.R.id.cki) : null;
                    if (findViewById4 == null) {
                        z19 = false;
                    } else {
                        java.util.ArrayList arrayList13 = new java.util.ArrayList();
                        arrayList13.add(8);
                        java.util.Collections.reverse(arrayList13);
                        yj0.a.d(findViewById4, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        z19 = false;
                        findViewById4.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "setupRelJumpTipsMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view9 = this.B;
                    if (view9 == null || (viewGroup = (androidx.constraintlayout.widget.ConstraintLayout) view9.findViewById(com.tencent.mm.R.id.quv)) == null) {
                        z18 = z19;
                    } else {
                        z18 = z19;
                        y("bindRelJumpTips", viewGroup, item, p39, i17, 4, 4);
                    }
                    com.tencent.mm.ui.MMActivity f122643d = contract.getF122643d();
                    td2.c cVar2 = this.E;
                    if (cVar2 != null) {
                        f122643d.mo133getLifecycle().c(cVar2);
                    }
                    com.tencent.mm.plugin.finder.convert.FinderFeedPlaceHolderConvert$bindLifeCycle$2 finderFeedPlaceHolderConvert$bindLifeCycle$2 = new com.tencent.mm.plugin.finder.convert.FinderFeedPlaceHolderConvert$bindLifeCycle$2(this, f122643d);
                    this.E = finderFeedPlaceHolderConvert$bindLifeCycle$2;
                    f122643d.mo133getLifecycle().a(finderFeedPlaceHolderConvert$bindLifeCycle$2);
                    com.tencent.mm.plugin.finder.convert.hi hiVar = new com.tencent.mm.plugin.finder.convert.hi(new java.lang.ref.WeakReference(this));
                    cw2.da daVar = this.C;
                    if (daVar != null) {
                        daVar.setIMMVideoViewCallback(hiVar);
                    }
                } else {
                    z18 = false;
                    android.view.View view10 = this.B;
                    if (view10 != null && (imageView = (android.widget.ImageView) view10.findViewById(com.tencent.mm.R.id.cki)) != null) {
                        imageView.setVisibility(0);
                        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = x() - context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479659bw);
                        }
                        D(imageView, item, i17);
                    }
                }
                if (item.f2()) {
                    android.view.View view11 = this.B;
                    if (view11 == null) {
                        return;
                    }
                    hc2.v0.e(view11, "personal_finder_lead_card", 40, 0, false, false, null, new com.tencent.mm.plugin.finder.convert.yi(this, item), 60, null);
                    return;
                }
                android.view.View view12 = this.B;
                if (view12 == null || (findViewById = view12.findViewById(com.tencent.mm.R.id.qnz)) == null) {
                    return;
                }
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(findViewById, "lead_to_rec_card");
                aVar.ik(findViewById, 40, 25496);
                aVar.Tj(findViewById, 40, 1, z18);
                aVar.Ai(findViewById, new com.tencent.mm.plugin.finder.convert.zi(this));
                return;
            }
            i19 = 0;
        }
        if (valueOf != null && valueOf.intValue() == 6) {
            int integer = place_holder_info.getInteger(4);
            com.tencent.mm.plugin.finder.feed.pz pzVar = contract instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) contract : null;
            int i27 = pzVar != null ? pzVar.f108762p : i19;
            if (((java.lang.Boolean) ((jz5.n) this.G).getValue()).booleanValue()) {
                com.tencent.mm.ui.MMActivity activity = contract.getF122643d();
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
                if ((((1 << finderHomeUIC.W6(integer)) & finderHomeUIC.f133574n.f257509o) > 0 ? 1 : i19) != 0) {
                    com.tencent.mars.xlog.Log.i(str, "skip tab card, has enter before");
                    holder.itemView.post(new com.tencent.mm.plugin.finder.convert.ti(this, item));
                    return;
                }
            }
            com.tencent.mm.ui.MMActivity activity2 = contract.getF122643d();
            kotlin.jvm.internal.o.g(activity2, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            if ((((1 << finderHomeUIC2.W6(i27)) & finderHomeUIC2.f133574n.f257510p) > 0 ? 1 : i19) != 0) {
                com.tencent.mars.xlog.Log.i(str, "skip tab card, has card enter before");
                holder.itemView.post(new com.tencent.mm.plugin.finder.convert.ui(this, item));
                return;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) place_holder_info.getCustom(7);
            if (finderObject2 != null) {
                q("JumpOtherTabWithBackend", holder, item, i17, place_holder_info, cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject2, i19)), integer);
                return;
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed w18 = w("JumpOther_onBindViewHolder", contract.getF122643d(), integer);
            if (w18 != null) {
                q("JumpOtherTabWithFirstUnreadFeed", holder, item, i17, place_holder_info, w18, integer);
                return;
            } else {
                com.tencent.mars.xlog.Log.e(str, "jumpOtherTab fail,get first unread feed is null!");
                holder.itemView.post(new com.tencent.mm.plugin.finder.convert.vi(this, item));
                return;
            }
        }
        if (valueOf != null && valueOf.intValue() == 8) {
            com.tencent.mars.xlog.Log.w(str, "bindNPSSurvey position=" + i17);
            android.view.View p49 = holder.p(com.tencent.mm.R.id.fuz);
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(p49, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p49.setVisibility(((java.lang.Integer) arrayList14.get(i19)).intValue());
            yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p57 = holder.p(com.tencent.mm.R.id.f484964g30);
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(8);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(p57, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p57.setVisibility(((java.lang.Integer) arrayList15.get(i19)).intValue());
            yj0.a.f(p57, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.fvd)).setVisibility(8);
            android.view.View p58 = holder.p(com.tencent.mm.R.id.nsw);
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(p58, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p58.setVisibility(((java.lang.Integer) arrayList16.get(i19)).intValue());
            yj0.a.f(p58, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view13 = this.B;
            if (view13 != null) {
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                arrayList17.add(8);
                java.util.Collections.reverse(arrayList17);
                yj0.a.d(view13, arrayList17.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList17.get(i19)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNPSSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;ILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (place_holder_info == null || (yk2Var = (r45.yk2) place_holder_info.getCustom(10)) == null) {
                return;
            }
            this.f104192q = holder;
            com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout = (com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.f484901ts5);
            finderNPSFrameLayout.setVisibility(i19);
            finderNPSFrameLayout.setBackground(b3.l.getDrawable(context, com.tencent.mm.R.drawable.f481812d43));
            kotlin.jvm.internal.o.g(contract, "contract");
            finderNPSFrameLayout.f131335h = item;
            finderNPSFrameLayout.f131336i = new com.tencent.mm.plugin.finder.viewmodel.component.pq(com.tencent.mm.plugin.finder.viewmodel.component.rq.f135828i, 0L, 0, 0, null, null, null, null, null, null, null, null, 4094, null);
            finderNPSFrameLayout.f131337m = yk2Var;
            finderNPSFrameLayout.f131331d = i17;
            kotlinx.coroutines.l.d(finderNPSFrameLayout.getMainScope(), null, null, new com.tencent.mm.plugin.finder.view.sf(finderNPSFrameLayout, holder, contract, null), 3, null);
            return;
        }
        if (valueOf != null && valueOf.intValue() == 9) {
            o(holder, item, i17);
            return;
        }
        android.view.View p59 = holder.p(com.tencent.mm.R.id.fuz);
        java.util.ArrayList arrayList18 = new java.util.ArrayList();
        arrayList18.add(0);
        java.util.Collections.reverse(arrayList18);
        yj0.a.d(p59, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNormal", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p59.setVisibility(((java.lang.Integer) arrayList18.get(i19)).intValue());
        yj0.a.f(p59, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNormal", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p66 = holder.p(com.tencent.mm.R.id.f484964g30);
        java.util.ArrayList arrayList19 = new java.util.ArrayList();
        arrayList19.add(8);
        java.util.Collections.reverse(arrayList19);
        yj0.a.d(p66, arrayList19.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNormal", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p66.setVisibility(((java.lang.Integer) arrayList19.get(i19)).intValue());
        yj0.a.f(p66, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindNormal", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IILcom/tencent/mm/protocal/protobuf/FinderObjectPlaceHolderInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.fvd)).setVisibility(8);
        if (place_holder_info != null) {
            int integer2 = place_holder_info.getInteger(1);
            if (integer2 == -4036) {
                str2 = place_holder_info.getString(i19);
                if (str2 == null) {
                    str2 = context.getResources().getString(com.tencent.mm.R.string.f492069f45);
                    kotlin.jvm.internal.o.f(str2, "getString(...)");
                }
            } else if (integer2 == -4033) {
                str2 = place_holder_info.getString(i19);
                if (str2 == null) {
                    str2 = context.getResources().getString(com.tencent.mm.R.string.cwu);
                    kotlin.jvm.internal.o.f(str2, "getString(...)");
                }
            } else if (integer2 == -4011 && (str2 = place_holder_info.getString(i19)) == null) {
                str2 = context.getResources().getString(com.tencent.mm.R.string.cv_);
                kotlin.jvm.internal.o.f(str2, "getString(...)");
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = context.getResources().getString(com.tencent.mm.R.string.cro);
                kotlin.jvm.internal.o.f(str2, "getString(...)");
            }
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.oqc)).setText(str2);
        }
        holder.p(com.tencent.mm.R.id.nsw).setOnClickListener(new com.tencent.mm.plugin.finder.convert.li(this));
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f487417ol3);
        this.f104191p = textView4;
        if (!this.f104197v) {
            if (textView4 != null) {
                textView4.setVisibility(i19);
            }
            android.widget.TextView textView5 = this.f104191p;
            if (textView5 != null) {
                textView5.setText(context.getString(com.tencent.mm.R.string.f491283cm1, 3));
            }
            this.f104190o = 3;
            this.f104199x.c(1000L, 1000L);
        } else if (textView4 != null) {
            textView4.setVisibility(8);
        }
        this.f104196u = i17;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.fvd);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) p17);
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.f487065qx2);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        this.B = inflate;
        if (inflate != null) {
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate.findViewById(com.tencent.mm.R.id.qnz);
            if (roundCornerConstraintLayout != null) {
                roundCornerConstraintLayout.setRadius(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv));
            }
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout2 = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate.findViewById(com.tencent.mm.R.id.quv);
            if (roundCornerConstraintLayout2 != null) {
                roundCornerConstraintLayout2.setRadius(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl));
            }
        }
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        C();
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i(this.f104186h, "onViewRecycled finderVideoView=" + this.C);
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f104195t;
        if (finderColumnFrameLayout != null && (adapter = finderColumnFrameLayout.getRecyclerView().getAdapter()) != null) {
            adapter.onViewRecycled(holder);
        }
        A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x042b, code lost:
    
        if (r12 != null) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0590 A[LOOP:0: B:137:0x058a->B:139:0x0590, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(in5.s0 r31, so2.n1 r32, int r33) {
        /*
            Method dump skipped, instructions count: 1937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.oj.o(in5.s0, so2.n1, int):void");
    }

    public final void p(in5.s0 s0Var, so2.n1 n1Var) {
        so2.n1 n1Var2;
        java.lang.String str;
        r45.en2 place_holder_info = n1Var.getFeedObject().getFinderObject().getPlace_holder_info();
        int integer = place_holder_info != null ? place_holder_info.getInteger(2) : 1;
        this.A = true;
        java.lang.String str2 = this.f104186h;
        com.tencent.mars.xlog.Log.i(str2, "bindEnableRecommend showType:" + integer);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.fuz);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.f484964g30);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Context context = s0Var.f293121e;
        i65.a.a(context, 48.0f);
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(p18, "open_personalized_rec_guide");
        aVar.ik(p18, 32, 25496);
        aVar.Ai(p18, new com.tencent.mm.plugin.finder.convert.ii(s0Var));
        java.lang.String str3 = null;
        s0Var.p(com.tencent.mm.R.id.nsw).setOnClickListener(null);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.roo);
        if (textView != null) {
            r45.en2 place_holder_info2 = n1Var.getFeedObject().getFinderObject().getPlace_holder_info();
            java.lang.String string = place_holder_info2 != null ? place_holder_info2.getString(6) : null;
            if (string == null || string.length() == 0) {
                str3 = context.getString(com.tencent.mm.R.string.mrm);
            } else {
                r45.en2 place_holder_info3 = n1Var.getFeedObject().getFinderObject().getPlace_holder_info();
                if (place_holder_info3 != null) {
                    str3 = place_holder_info3.getString(6);
                }
            }
            textView.setText(str3);
        }
        if (integer == 7) {
            android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484952rp4);
            r45.en2 place_holder_info4 = n1Var.getFeedObject().getFinderObject().getPlace_holder_info();
            java.lang.String str4 = "";
            if (place_holder_info4 == null || (str = place_holder_info4.getString(0)) == null) {
                str = "";
            }
            if (str.length() > 0) {
                com.tencent.mars.xlog.Log.i(str2, "showWording:".concat(str));
            } else {
                boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                int i17 = this.f104185g;
                if (isTeenMode) {
                    if (i17 == 1) {
                        str4 = context.getString(com.tencent.mm.R.string.ny_);
                    } else if (i17 == 3) {
                        str4 = context.getString(com.tencent.mm.R.string.ny9);
                    } else if (i17 == 4) {
                        str4 = context.getString(com.tencent.mm.R.string.f491968mr3);
                    }
                    kotlin.jvm.internal.o.d(str4);
                } else {
                    if (i17 == 1) {
                        str4 = context.getString(com.tencent.mm.R.string.ny8);
                    } else if (i17 == 3) {
                        str4 = context.getString(com.tencent.mm.R.string.ny7);
                    } else if (i17 == 4) {
                        str4 = context.getString(com.tencent.mm.R.string.esn);
                    }
                    kotlin.jvm.internal.o.d(str4);
                }
                str = str4;
            }
            textView2.setText(str);
            android.view.View p19 = s0Var.p(com.tencent.mm.R.id.rom);
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            n1Var2 = n1Var;
        } else {
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484952rp4)).setText(context.getString(((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() ? com.tencent.mm.R.string.f491967mr2 : com.tencent.mm.R.string.esm));
            n1Var2 = n1Var;
            if (n1Var2.f410490d) {
                android.view.View p27 = s0Var.p(com.tencent.mm.R.id.rom);
                if (p27 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View p28 = s0Var.p(com.tencent.mm.R.id.rom);
                if (p28 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert", "bindEnableRecommend", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedPlaceHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) s0Var.p(com.tencent.mm.R.id.ron).getLayoutParams();
        if (marginLayoutParams != null) {
            int dimensionPixelOffset = (int) (context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz) * i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a));
            marginLayoutParams.height = dimensionPixelOffset;
            marginLayoutParams.width = dimensionPixelOffset;
        }
        android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.fvd);
        if (n1Var2.f410490d) {
            textView3.setBackgroundResource(com.tencent.mm.R.drawable.cvg);
            textView3.setTextColor(context.getColor(com.tencent.mm.R.color.f479257u9));
            textView3.setText(context.getResources().getString(com.tencent.mm.R.string.ny6));
        } else {
            textView3.setBackgroundResource(com.tencent.mm.R.drawable.adg);
            textView3.setTextColor(context.getColor(com.tencent.mm.R.color.f479254u6));
            textView3.setText(context.getResources().getString(com.tencent.mm.R.string.esl));
            textView3.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ji(this, integer, s0Var, n1Var2));
        }
        aVar.pk(textView3, "open_personalize_rec");
        aVar.ik(textView3, 40, 25496);
        aVar.Ai(textView3, new com.tencent.mm.plugin.finder.convert.ki(s0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x03f3, code lost:
    
        if (r15 == null) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r33, in5.s0 r34, so2.n1 r35, int r36, r45.en2 r37, com.tencent.mm.plugin.finder.model.BaseFinderFeed r38, int r39) {
        /*
            Method dump skipped, instructions count: 1631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.oj.q(java.lang.String, in5.s0, so2.n1, int, r45.en2, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.String r18, java.util.LinkedList r19, int r20) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.oj.r(java.lang.String, java.util.LinkedList, int):void");
    }

    public final void s(java.lang.String str) {
        android.view.View view;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout;
        if (this.C != null) {
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).O6(new com.tencent.mm.plugin.finder.convert.oi(c0Var, this));
            boolean z17 = c0Var.f310112d;
            java.lang.String str2 = this.f104186h;
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" FinderVideoRecycler contain videoView ");
                cw2.da daVar = this.C;
                sb6.append(daVar != null ? daVar.hashCode() : 0);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                return;
            }
            java.lang.Object obj = this.C;
            java.lang.Object tag = obj != null ? ((android.view.View) obj).getTag() : null;
            com.tencent.mm.plugin.finder.convert.gi giVar = tag instanceof com.tencent.mm.plugin.finder.convert.gi ? (com.tencent.mm.plugin.finder.convert.gi) tag : null;
            if (giVar != null && (view = this.B) != null && (constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(com.tencent.mm.R.id.quv)) != null) {
                y(str, constraintLayout, giVar.f103488a, giVar.f103489b, giVar.f103490c, giVar.f103491d, giVar.f103492e);
            }
            com.tencent.mars.xlog.Log.w(str2, str + " videoView " + this.C + " invalid!");
        }
    }

    public final java.util.ArrayList t() {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104184f;
        if (k8Var instanceof com.tencent.mm.plugin.finder.feed.c0) {
            return ((com.tencent.mm.plugin.finder.feed.c0) k8Var).f();
        }
        if (k8Var instanceof com.tencent.mm.plugin.finder.feed.fp) {
            return ((com.tencent.mm.plugin.finder.feed.fp) k8Var).f();
        }
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader u17 = u(k8Var.getF122643d(), this.f104185g);
        if (u17 != null && (dataListJustForAdapter = u17.getDataListJustForAdapter()) != 0) {
            if (dataListJustForAdapter.size() > 0) {
                return dataListJustForAdapter;
            }
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader u(android.content.Context context, int i17) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6;
        com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        if (finderHomeUIC == null || (U6 = finderHomeUIC.U6(i17)) == null || (t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) pf5.z.f353948a.b(U6).e(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)) == null) {
            return null;
        }
        if (!t80Var.V6()) {
            t80Var = null;
        }
        if (t80Var != null) {
            return t80Var.Q6();
        }
        return null;
    }

    public final int v(java.lang.String str, int i17) {
        java.lang.StringBuilder sb6;
        java.lang.String sb7;
        java.lang.String str2 = this.f104186h;
        int i18 = 0;
        try {
            try {
                com.tencent.mm.ui.MMActivity activity = this.f104184f.getF122643d();
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(i17);
                if (U6 != null) {
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(U6).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
                    if (!((com.tencent.mm.plugin.finder.viewmodel.component.t80) a17).V6()) {
                        a17 = null;
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) a17;
                    if (t80Var != null) {
                        int P6 = t80Var.P6();
                        if (P6 >= 0) {
                            i18 = P6;
                        }
                    }
                }
                sb7 = str + " tabType " + i17 + " getFirstPlayIndex=" + i18;
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, str2 + "_getFirstPlayIndex");
                sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" tabType ");
                sb6.append(i17);
                sb6.append(" getFirstPlayIndex=0");
                sb7 = sb6.toString();
                com.tencent.mars.xlog.Log.i(str2, sb7);
                return i18;
            }
        } catch (java.lang.Throwable unused) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(" tabType ");
            sb6.append(i17);
            sb6.append(" getFirstPlayIndex=0");
            sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i(str2, sb7);
            return i18;
        }
        com.tencent.mars.xlog.Log.i(str2, sb7);
        return i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r9 != 0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed w(java.lang.String r8, android.content.Context r9, int r10) {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.convert.pi r0 = new com.tencent.mm.plugin.finder.convert.pi
            r0.<init>(r10, r7, r8)
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r9 = r7.u(r9, r10)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L24
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r9 = r9.getDataListJustForAdapter()
            if (r9 == 0) goto L24
            int r4 = r9.size()
            if (r4 <= 0) goto L1c
            r4 = r3
            goto L1d
        L1c:
            r4 = r2
        L1d:
            if (r4 == 0) goto L20
            goto L21
        L20:
            r9 = r1
        L21:
            if (r9 == 0) goto L24
            goto L48
        L24:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r4 = " getTabLoaderDataList tabType="
            r9.append(r4)
            r9.append(r10)
            java.lang.String r4 = ",but loader is null!"
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r4 = r7.f104186h
            com.tencent.mars.xlog.Log.e(r4, r9)
            java.lang.Object r9 = r0.invoke()
            java.util.List r9 = (java.util.List) r9
        L48:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L51:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r9.next()
            boolean r5 = r4 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L51
            r0.add(r4)
            goto L51
        L63:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L93
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r5.getFeedObject()
            boolean r6 = r6.isUrlValid()
            if (r6 == 0) goto L8c
            int r5 = r5.h()
            r6 = 4
            if (r5 != r6) goto L8c
            r5 = r3
            goto L8d
        L8c:
            r5 = r2
        L8d:
            if (r5 == 0) goto L6c
            r9.add(r4)
            goto L6c
        L93:
            java.util.List r0 = hc2.v.b(r9, r10)
            boolean r4 = r0.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto La6
            java.lang.Object r8 = kz5.n0.X(r0)
            r1 = r8
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r1
            goto Lc4
        La6:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto Lc4
            int r8 = r7.v(r8, r10)
            int r10 = r9.size()
            int r10 = r10 - r3
            if (r8 <= r10) goto Lb9
            r8 = r10
        Lb9:
            if (r8 >= 0) goto Lbc
            goto Lbd
        Lbc:
            r2 = r8
        Lbd:
            java.lang.Object r8 = r9.get(r2)
            r1 = r8
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r1
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.oj.w(java.lang.String, android.content.Context, int):com.tencent.mm.plugin.finder.model.BaseFinderFeed");
    }

    public final int x() {
        return ((java.lang.Number) ((jz5.n) this.f104187i).getValue()).intValue();
    }

    public final void y(java.lang.String str, android.view.ViewGroup viewGroup, so2.n1 n1Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18, int i19) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.storage.FeedData a17 = com.tencent.mm.plugin.finder.storage.FeedData.Companion.a(baseFinderFeed);
        java.util.LinkedList<r45.mb4> mediaList = a17.getMediaList();
        boolean isEmpty = mediaList.isEmpty();
        java.lang.String str2 = this.f104186h;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.e(str2, str + " initVideoView but mediaList is empty!");
            return;
        }
        ds2.h hVar = ds2.h.f242866a;
        long id6 = a17.getId();
        r45.mb4 mb4Var = mediaList.get(0);
        kotlin.jvm.internal.o.f(mb4Var, "get(...)");
        mn2.g4 c17 = hVar.c(id6, mb4Var, false);
        boolean z17 = a17.getId() == 0 && com.tencent.mm.vfs.w6.j(c17.getUrl());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy(context);
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).P6(finderThumbPlayerProxy);
        this.C = finderThumbPlayerProxy;
        n3.t1 t1Var = new n3.t1(viewGroup);
        while (true) {
            if (!t1Var.hasNext()) {
                obj = null;
                break;
            } else {
                obj = t1Var.next();
                if (((android.view.View) obj) instanceof cw2.da) {
                    break;
                }
            }
        }
        android.view.View view = (android.view.View) obj;
        if (view != null) {
            viewGroup.removeView(view);
        }
        java.lang.Object obj2 = this.C;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type android.view.View");
        viewGroup.addView((android.view.View) obj2, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
        cw2.da daVar = this.C;
        if (daVar != null) {
            daVar.setTag(new com.tencent.mm.plugin.finder.convert.gi(n1Var, baseFinderFeed, i17, i18, i19));
        }
        cw2.da daVar2 = this.C;
        if (daVar2 != null) {
            daVar2.n(c17, z17, a17);
        }
        cw2.da daVar3 = this.C;
        if (daVar3 != null) {
            daVar3.setIsShouldPlayResume(false);
        }
        zy2.a7 a7Var = (zy2.a7) i95.n0.c(zy2.a7.class);
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
        com.tencent.mm.ui.MMActivity context2 = this.f104184f.getF122643d();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        ((com.tencent.mm.plugin.finder.service.l2) a7Var).Bi(feedObject, nyVar != null ? nyVar.V6().getInteger(5) : 0, 0);
        r(str + "_initVideoView", mediaList, i19);
        com.tencent.mars.xlog.Log.i(str2, str + " initVideoView holder=" + n1Var + ",itemFeed=" + baseFinderFeed + ",position=" + i17 + ",targetTab=" + i18);
    }

    public final void z(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        if (finderObject == null) {
            return;
        }
        java.lang.String str2 = "jump finder " + finderObject.getId();
        java.lang.String str3 = this.f104186h;
        com.tencent.mars.xlog.Log.i(str3, str2);
        long j17 = c01.z1.j();
        pr2.a aVar = pr2.a.f357949a;
        boolean z18 = (34359738368L & j17) != 0;
        if (z18) {
            aVar.b(j17, str3);
        }
        int bl6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(4);
        pf5.u uVar = pf5.u.f353936a;
        ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4);
        ey2.q0 q0Var = ey2.q0.f257472e;
        N6.a(q0Var);
        N6.f257449i = java.lang.System.currentTimeMillis();
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).a(q0Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
        intent.putExtra("KEY_FROM_SHARE_REL", true);
        intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
        intent.putExtra("KEY_OBJECT_ID", finderObject.getId());
        intent.putExtra("KEY_OBJECT_NONCE_ID", finderObject.getObjectNonceId());
        intent.putExtra("insert_source_feed", true);
        intent.putExtra("KEY_OPEN_FINDER_ENTRANCE", z18);
        intent.putExtra("KEY_OPEN_FINDER_ENTRANCE_FROM_PROFILE_GUIDE", z17);
        intent.putExtra("KEY_OPEN_FINDER_ENTRANCE_REF_COMMENT_SCENE", V6.getInteger(5));
        java.lang.String string = V6.getString(1);
        int parseInt = (string == null || (str = (java.lang.String) r26.n0.e0(string, new char[]{'-'}, false, 0, 6, null).get(0)) == null) ? -1 : java.lang.Integer.parseInt(str);
        if (parseInt > 0 && bl6 > 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(parseInt, z17 ? 2 : 9, bl6, intent);
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.d();
        bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0), bu2.i.f24531l);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.ub.L7((c61.ub) c17, context, intent, 1, false, 8, null);
    }
}
