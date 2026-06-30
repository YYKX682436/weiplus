package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class u4 extends com.tencent.mm.plugin.finder.convert.x1 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104670e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104671f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f104672g;

    /* renamed from: h, reason: collision with root package name */
    public da2.g f104673h;

    public u4(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter, boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        this.f104670e = presenter;
        this.f104671f = z17;
        this.f104672g = feedObj;
        jz5.h.b(com.tencent.mm.plugin.finder.convert.r3.f104438d);
    }

    public static /* synthetic */ void K(com.tencent.mm.plugin.finder.convert.u4 u4Var, in5.s0 s0Var, r45.j60 j60Var, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, long j17, so2.y0 y0Var, boolean z17, int i17, java.lang.Object obj) {
        u4Var.J(s0Var, j60Var, imageView, finderFixedRatioLayout, j17, y0Var, (i17 & 64) != 0 ? false : z17);
    }

    public static /* synthetic */ void M(com.tencent.mm.plugin.finder.convert.u4 u4Var, in5.s0 s0Var, r45.s60 s60Var, android.widget.ImageView imageView, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, long j17, so2.y0 y0Var, boolean z17, int i17, java.lang.Object obj) {
        u4Var.L(s0Var, s60Var, imageView, viewGroup, finderFixedRatioLayout, j17, y0Var, (i17 & 128) != 0 ? false : z17);
    }

    public final void J(in5.s0 s0Var, r45.j60 j60Var, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, long j17, so2.y0 y0Var, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        kotlin.jvm.internal.o.d(j60Var);
        float integer = j60Var.getInteger(2) > 0 ? j60Var.getInteger(2) : 16.0f;
        float integer2 = j60Var.getInteger(3) > 0 ? j60Var.getInteger(3) : 9.0f;
        if (z17) {
            jz5.l a17 = com.tencent.mm.plugin.finder.convert.c3.f103016g.a(integer, integer2);
            int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a17.f302833d).intValue());
            int dimensionPixelSize2 = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a17.f302834e).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = finderFixedRatioLayout.getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            finderFixedRatioLayout.setLayoutParams(layoutParams);
            finderFixedRatioLayout.b(dimensionPixelSize, dimensionPixelSize2, false);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int integer3 = j60Var.getInteger(4);
            if (integer > 0.0f && integer2 > 0.0f) {
                if (integer3 > 0) {
                    R(s0Var, finderFixedRatioLayout, integer3, integer, integer2, j60Var.getInteger(6));
                } else {
                    finderFixedRatioLayout.b(integer, integer2, false);
                }
            }
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dqg, (android.view.ViewGroup) null);
        finderFixedRatioLayout.removeView(inflate);
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        if (advertisement_info != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) advertisement_info.getCustom(0)) != null) {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
            if (native_info != null && native_info.getNative_type() == 14) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                layoutParams2.topMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                finderFixedRatioLayout.addView(inflate, layoutParams2);
            }
        }
        if (imageView != null) {
            long c17 = c01.id.c();
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).I).getValue());
            java.lang.String string = j60Var.getString(0);
            if (string == null) {
                string = "";
            }
            wo0.c a18 = d1Var.a(new mn2.j0(string));
            com.tencent.mm.plugin.finder.convert.d3 d3Var = new com.tencent.mm.plugin.finder.convert.d3(this, j17, c17);
            a18.getClass();
            a18.f447873d = d3Var;
            a18.c(imageView);
        }
        ym5.a1.i(finderFixedRatioLayout, new com.tencent.mm.plugin.finder.convert.e3(this, j17));
    }

    public final void L(in5.s0 s0Var, r45.s60 s60Var, android.widget.ImageView imageView, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, long j17, so2.y0 y0Var, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView v07 = this.f104670e.v0();
        java.lang.String str3 = "";
        if (s60Var == null || (str = s60Var.getString(0)) == null) {
            str = "";
        }
        v07.getMediaReporter().a(this.f104672g.getItemId(), y0Var.f410703d.u0());
        v07.setAid(j17);
        android.view.ViewParent parent = v07.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(v07);
        }
        if (viewGroup != null) {
            viewGroup.addView(v07);
        }
        viewGroup.setVisibility(0);
        imageView.setVisibility(8);
        boolean z18 = true;
        if (v07.getPlayerState() != 1 && v07.getPlayerState() != 0 && v07.getPlayerState() != 10) {
            java.lang.String str4 = v07.mediaId;
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            if (!(!kotlin.jvm.internal.o.b(str4, com.tencent.mm.sdk.platformtools.w2.b(str.getBytes())))) {
                z18 = false;
            }
        }
        if (z18) {
            imageView.setVisibility(0);
            long c17 = c01.id.c();
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).I).getValue());
            if (s60Var == null || (str2 = s60Var.getString(2)) == null) {
                str2 = "";
            }
            wo0.c a17 = d1Var.a(new mn2.j0(str2));
            a17.f447873d = new com.tencent.mm.plugin.finder.convert.f3(this, j17, c17);
            ((wo0.b) a17).c(imageView);
            if (s60Var != null && (string = s60Var.getString(0)) != null) {
                str3 = string;
            }
            v07.u(str3, new com.tencent.mm.plugin.finder.convert.j3(v07, imageView, s0Var, y0Var));
            v07.getOnePlayContext().getClass();
            java.lang.String fTPPTag = v07.getFTPPTag();
            v07.getOnePlayContext().getClass();
            com.tencent.mars.xlog.Log.i(fTPPTag, "prepareToFirstFrameRender return for isViewFocused:true");
        }
        kotlin.jvm.internal.o.d(s60Var);
        float integer = s60Var.getInteger(4) > 0 ? s60Var.getInteger(4) : 16.0f;
        float integer2 = s60Var.getInteger(5) > 0 ? s60Var.getInteger(5) : 9.0f;
        if (z17) {
            jz5.l a18 = com.tencent.mm.plugin.finder.convert.c3.f103016g.a(integer, integer2);
            int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f302833d).intValue());
            int dimensionPixelSize2 = s0Var.f293121e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f302834e).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = finderFixedRatioLayout.getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            finderFixedRatioLayout.setLayoutParams(layoutParams);
            finderFixedRatioLayout.b(dimensionPixelSize, dimensionPixelSize2, false);
        } else {
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            int integer3 = s60Var.getInteger(7);
            if (integer > 0.0f && integer2 > 0.0f) {
                if (integer3 > 0) {
                    R(s0Var, finderFixedRatioLayout, integer3, integer, integer2, s60Var.getInteger(9));
                } else {
                    finderFixedRatioLayout.b(integer, integer2, false);
                }
            }
        }
        ym5.a1.i(finderFixedRatioLayout, new com.tencent.mm.plugin.finder.convert.k3(v07, j17, s0Var, y0Var));
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed N() {
        return cu2.u.f222441a.p(this.f104670e.z0());
    }

    public final int O(java.lang.String str, java.lang.String str2) {
        int i17 = 0;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            try {
                boolean z17 = true;
                if (!jSONObject.has(str2)) {
                    z17 = false;
                }
                if (z17) {
                    i17 = jSONObject.getInt(str2);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", e17);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("Finder.FinderFeedCommentConvert", e18.getMessage());
        }
        return i17;
    }

    public final java.lang.String P(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String str3 = null;
            try {
                boolean z17 = true;
                if (!jSONObject.has(str2)) {
                    z17 = false;
                }
                if (z17) {
                    str3 = jSONObject.getString(str2);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
            }
            return str3 == null ? "" : str3;
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("Finder.FinderFeedCommentConvert", e18.getMessage());
            return "";
        }
    }

    public final void R(in5.s0 s0Var, com.tencent.mm.plugin.finder.view.FinderFixedRatioLayout finderFixedRatioLayout, int i17, float f17, float f18, int i18) {
        float f19;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var;
        r45.ky0 advertisement_info;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var2;
        r45.ky0 advertisement_info2;
        int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        android.content.Context context = s0Var.f293121e;
        int c17 = com.tencent.mm.plugin.finder.assist.e8.f102131a.c(null) - (dimensionPixelSize + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9));
        float b17 = r8.b(context) * kx2.a.f313278a.a(context);
        int i19 = (int) ((i17 * b17) / 100.0f);
        int i27 = (int) ((i19 * 9.0f) / 16);
        int i28 = i27 * i19;
        int b18 = i65.a.b(context, i18 > 0 ? i18 : 9216);
        int i29 = i28 < b18 ? b18 : i28;
        float sqrt = (float) java.lang.Math.sqrt((i29 / f17) / f18);
        int i37 = (((int) (sqrt * f18)) / 8) * 8;
        float f27 = (i37 / f18) * f17;
        java.lang.Object obj = s0Var.f293125i;
        so2.y0 y0Var = obj instanceof so2.y0 ? (so2.y0) obj : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAdHeightPercentage: resultWidth=");
        sb6.append(f27);
        sb6.append(", resultHeight=");
        sb6.append(i37);
        sb6.append(", area=");
        sb6.append(i29);
        sb6.append(", calArea=");
        sb6.append(i28);
        sb6.append(", realMiniArea=");
        sb6.append(b18);
        sb6.append(", svrMiniArea=");
        sb6.append(i18);
        sb6.append("proportion=");
        sb6.append(sqrt);
        sb6.append(", commentAreaHeight=");
        sb6.append(b17);
        sb6.append(", heightPercentage=");
        sb6.append(i17);
        sb6.append(", refWidth=");
        sb6.append(i27);
        sb6.append(", refHeight=");
        sb6.append(i19);
        sb6.append(", maxWidth=");
        sb6.append(c17);
        sb6.append(", aid=");
        sb6.append((y0Var == null || (yj0Var2 = y0Var.f410703d) == null || (advertisement_info2 = yj0Var2.u0().getAdvertisement_info()) == null) ? null : java.lang.Long.valueOf(advertisement_info2.getLong(1)));
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedCommentConvert", sb6.toString());
        float f28 = c17;
        if (f27 > f28) {
            f19 = f18;
            i37 = (int) ((f28 / f17) * f19);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleAdHeightPercentage: out of width limit, resultHeight=");
            sb7.append(i37);
            sb7.append(", maxWidth=");
            sb7.append(c17);
            sb7.append("aid=");
            sb7.append((y0Var == null || (yj0Var = y0Var.f410703d) == null || (advertisement_info = yj0Var.u0().getAdvertisement_info()) == null) ? null : java.lang.Long.valueOf(advertisement_info.getLong(1)));
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedCommentConvert", sb7.toString());
        } else {
            f19 = f18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = finderFixedRatioLayout.getLayoutParams();
        layoutParams.height = i37;
        finderFixedRatioLayout.setLayoutParams(layoutParams);
        finderFixedRatioLayout.b(f17, f19, false);
    }

    public final void S(in5.s0 s0Var, android.view.View view, android.view.View view2, so2.y0 y0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str) {
        int i17;
        android.view.View view3;
        jz5.f0 f0Var;
        if (finderJumpInfo != null) {
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view != null) {
                view.post(new com.tencent.mm.plugin.finder.convert.l3(view2, view, s0Var));
            }
            int business_type = finderJumpInfo.getBusiness_type();
            if (business_type == 54) {
                i17 = 0;
                view3 = view2;
                Z("template", s0Var, view2, finderJumpInfo, com.tencent.mm.R.string.f9v, com.tencent.mm.R.raw.icons_filled_camera_template_follow, com.tencent.mm.R.color.Orange_100, new com.tencent.mm.plugin.finder.convert.m3(s0Var, finderJumpInfo, this));
            } else if (business_type != 62) {
                i17 = 0;
                view3 = view2;
                Z("topic=" + str, s0Var, view2, finderJumpInfo, com.tencent.mm.R.string.lox, com.tencent.mm.R.raw.icons_outlined_camera, com.tencent.mm.R.color.FG_2, new com.tencent.mm.plugin.finder.convert.o3(s0Var, str, y0Var, finderJumpInfo));
            } else {
                i17 = 0;
                view3 = view2;
                Z("music", s0Var, view2, finderJumpInfo, com.tencent.mm.R.string.f9v, com.tencent.mm.R.raw.icons_filled_music3_regular, com.tencent.mm.R.color.Brand_100, new com.tencent.mm.plugin.finder.convert.n3(this, s0Var, y0Var, finderJumpInfo));
            }
            f0Var = jz5.f0.f302826a;
        } else {
            i17 = 0;
            view3 = view2;
            f0Var = null;
        }
        if (f0Var != null || view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
    
        if (r13 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(in5.s0 r28, int r29, android.view.View r30, android.view.View r31, so2.y0 r32, com.tencent.mm.protocal.protobuf.FinderJumpInfo r33, java.lang.String r34, java.lang.String r35, int r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.u4.T(in5.s0, int, android.view.View, android.view.View, so2.y0, com.tencent.mm.protocal.protobuf.FinderJumpInfo, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public final void U(in5.s0 s0Var, so2.y0 y0Var) {
        F(s0Var, this.f104672g.getFeedObject(), y0Var);
        s0Var.p(com.tencent.mm.R.id.uca).setOnClickListener(new com.tencent.mm.plugin.finder.convert.q3(y0Var, this, s0Var));
    }

    public final boolean V() {
        return this.f104670e.W() == 2;
    }

    public final void W(so2.y0 y0Var, in5.s0 s0Var, boolean z17) {
        jz5.f0 f0Var;
        java.lang.String string;
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        java.lang.String str = (advertisement_info == null || (string = advertisement_info.getString(4)) == null) ? "" : string;
        r45.xk bizInfo = y0Var.f410703d.getBizInfo();
        if (bizInfo != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string2 = bizInfo.getString(0);
            java.lang.String str2 = string2 == null ? "" : string2;
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f104670e;
            so2.g0.b(y0Var, context, str2, nPresenter.getCommentScene(), nPresenter.z0(), str);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String Z0 = y0Var.f410703d.Z0();
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, Z0, context2, str);
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        o3Var.Gk(context3, y0Var.f410703d.field_feedId, true, true, 1, z17);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // in5.r
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 r84, so2.y0 r85, int r86, int r87, boolean r88, java.util.List r89) {
        /*
            Method dump skipped, instructions count: 7610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.u4.h(in5.s0, so2.y0, int, int, boolean, java.util.List):void");
    }

    public final void Y(so2.y0 y0Var, boolean z17, in5.s0 s0Var) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.a_z);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.iht);
        boolean[] zArr = {false};
        p17.setOnTouchListener(new com.tencent.mm.plugin.finder.convert.p4(zArr));
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int s17 = s(context, z17, this.f104670e);
        weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.icons_filled_good : com.tencent.mm.R.raw.icons_outlined_star_new);
        weImageView.setIconColor(s17);
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479691cq);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
        p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.q4(s0Var, this, zArr));
    }

    public final void Z(java.lang.String str, in5.s0 s0Var, android.view.View view, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i17, int i18, int i19, yz5.l lVar) {
        java.lang.Object obj;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.lang.String str2;
        android.widget.TextView textView;
        java.lang.String string;
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.sd) ((r45.wf6) obj).getCustom(33)) != null) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.sd sdVar = wf6Var != null ? (r45.sd) wf6Var.getCustom(33) : null;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483843c75)) != null) {
            java.lang.String string2 = sdVar != null ? sdVar.getString(1) : null;
            if (string2 == null || string2.length() == 0) {
                string = s0Var.f293121e.getResources().getString(i17);
            } else {
                string = sdVar != null ? sdVar.getString(1) : null;
            }
            textView.setText(string);
        }
        if (view != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f483842c74)) != null) {
            if (sdVar == null || (str2 = sdVar.getString(0)) == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                d75.b.g(new com.tencent.mm.plugin.finder.convert.o4(weImageView, i18, i19));
            } else {
                weImageView.setIconColor(s0Var.f293121e.getResources().getColor(i19));
                mn2.g1 g1Var = mn2.g1.f329975a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r));
                com.tencent.mm.plugin.finder.convert.r4 r4Var = new com.tencent.mm.plugin.finder.convert.r4(this, weImageView, i18, i19);
                b17.getClass();
                b17.f447879j = r4Var;
                b17.f447878i = new com.tencent.mm.plugin.finder.convert.s4(this, weImageView, i18, i19);
                b17.c(weImageView);
            }
        }
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.convert.t4(str, finderJumpInfo, lVar));
        }
    }

    public final void a0(android.view.ViewGroup viewGroup) {
        android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView = childAt instanceof com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView ? (com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView) childAt : null;
        if (finderCommentAdVideoView == null) {
            return;
        }
        if (finderCommentAdVideoView.isAttached) {
            finderCommentAdVideoView.q();
        }
        viewGroup.removeAllViews();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487834c;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.tencent.mm.R.id.a_z), "finder_feed_first_comment_awesome_iv");
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.f486643lz4);
        finderCollapsibleTextView.setLimitLine(2);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.f(false, true);
        finderCollapsibleTextView.setOnCollapse(new com.tencent.mm.plugin.finder.convert.k4(holder, this));
        android.content.Context context = holder.f293121e;
        finderCollapsibleTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
        finderCollapsibleTextView2.setLimitLine(4);
        finderCollapsibleTextView2.setCollapse(true);
        finderCollapsibleTextView2.f(false, true);
        finderCollapsibleTextView2.setExpandTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479121qk));
        finderCollapsibleTextView2.setOnCollapse(new com.tencent.mm.plugin.finder.convert.l4(holder, this));
        com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout finderInterceptFrameLayout = (com.tencent.mm.plugin.finder.view.FinderInterceptFrameLayout) holder.p(com.tencent.mm.R.id.rrw);
        if (finderInterceptFrameLayout != null) {
            finderInterceptFrameLayout.setInterceptListener(new com.tencent.mm.plugin.finder.convert.m4(this));
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.i(itemView, new com.tencent.mm.plugin.finder.convert.n4(holder, this));
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) holder.p(com.tencent.mm.R.id.swk);
        if (ringProgressView != null) {
            ringProgressView.setBackColor(context.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
            ringProgressView.setForeColor(context.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.v2_);
        if (weImageView != null) {
            java.lang.Object tag = weImageView.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (kotlin.jvm.internal.o.b(tag, bool)) {
                return;
            }
            weImageView.setTag(bool);
            weImageView.post(new d92.a(weImageView));
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sc2.a8.class);
        a8Var.getClass();
        a8Var.f7(holder);
        da2.g gVar = this.f104673h;
        if (gVar != null) {
            gVar.j();
        }
        this.f104673h = null;
        try {
            if (kotlin.jvm.internal.o.b(holder.f293124h, java.lang.Boolean.TRUE)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.c6i);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.rga);
                a0(viewGroup);
                a0(viewGroup2);
                holder.f293124h = java.lang.Boolean.FALSE;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.FinderFeedCommentConvert", "onViewRecycled error=" + th6);
        }
    }
}
