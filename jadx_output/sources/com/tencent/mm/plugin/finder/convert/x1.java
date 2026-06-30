package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public abstract class x1 extends in5.r {
    public static final /* synthetic */ java.lang.String n(com.tencent.mm.plugin.finder.convert.x1 x1Var) {
        x1Var.getClass();
        return "Finder.FinderCommentConvert";
    }

    public static final void o(com.tencent.mm.plugin.finder.convert.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, boolean z17) {
        x1Var.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.convert.f1(z17, viewGroup, view2, view3, view, x1Var, s0Var, j17, j18, j60Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(in5.s0 r9, so2.y0 r10, android.widget.ImageView r11) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "authView"
            kotlin.jvm.internal.o.g(r11, r0)
            com.tencent.mm.plugin.finder.storage.yj0 r0 = r10.f410703d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.u0()
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.getAuthor_contact()
            r1 = 0
            if (r0 == 0) goto L21
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r0 = r0.getAuthInfo()
            goto L22
        L21:
            r0 = r1
        L22:
            android.content.Context r9 = r9.f293121e
            if (r0 != 0) goto L4d
            com.tencent.mm.plugin.finder.storage.yj0 r2 = r10.f410703d
            java.lang.String r2 = r2.Z0()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r9, r3)
            java.lang.String r3 = xy2.c.e(r9)
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            if (r2 == 0) goto L4d
            ya2.g r0 = ya2.h.f460484a
            com.tencent.mm.plugin.finder.storage.yj0 r2 = r10.f410703d
            java.lang.String r2 = r2.Z0()
            ya2.b2 r0 = r0.b(r2)
            if (r0 == 0) goto L4b
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r0.field_authInfo
        L4b:
            r4 = r1
            goto L4e
        L4d:
            r4 = r0
        L4e:
            r0 = 0
            if (r4 == 0) goto L56
            int r1 = r4.getAuthIconType()
            goto L57
        L56:
            r1 = r0
        L57:
            java.lang.Class<zy2.b6> r2 = zy2.b6.class
            i95.m r2 = i95.n0.c(r2)
            zy2.b6 r2 = (zy2.b6) r2
            r2.getClass()
            ya2.m1 r2 = ya2.m1.f460511a
            r5 = 0
            r6 = 4
            r7 = 0
            r3 = r11
            zy2.tb.a(r2, r3, r4, r5, r6, r7)
            cq.k1.a()
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            lb2.j r2 = r2.L1()
            java.lang.Object r2 = r2.r()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Laa
            r2 = 1
            if (r1 == r2) goto La7
            r2 = 2
            if (r1 == r2) goto La3
            com.tencent.mm.plugin.finder.storage.yj0 r10 = r10.f410703d
            boolean r10 = r10.e1()
            if (r10 == 0) goto Laa
            r11.setVisibility(r0)
            r10 = 2131100030(0x7f06017e, float:1.781243E38)
            int r10 = i65.a.d(r9, r10)
            r0 = 2131691259(0x7f0f06fb, float:1.9011585E38)
            android.graphics.drawable.Drawable r9 = com.tencent.mm.ui.uk.e(r9, r0, r10)
            r11.setImageDrawable(r9)
            goto Laa
        La3:
            r11.setVisibility(r0)
            goto Laa
        La7:
            r11.setVisibility(r0)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.x1.A(in5.s0, so2.y0, android.widget.ImageView):void");
    }

    public final void B(in5.s0 holder, so2.y0 commentItem, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter) {
        java.lang.String md52;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swc);
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = (com.tencent.mm.plugin.finder.view.FinderEmojiView) holder.p(com.tencent.mm.R.id.sw_);
        if (commentItem.f410703d.w0() != 1 || commentItem.f410714r == null) {
            finderEmojiView.setOnClickListener(null);
            finderEmojiView.setOnLongClickListener(null);
            viewGroup.setVisibility(8);
            finderEmojiView.setEmojiInfo(null);
            finderEmojiView.setStatusListener(null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCommentEmoji ");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = commentItem.f410714r;
        sb6.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        sb6.append(' ');
        sb6.append(finderEmojiView);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb6.toString());
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(finderEmojiView, "comment_big_sticker");
        boolean z17 = false;
        aVar.Tj(finderEmojiView, 40, 1, false);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(commentItem.f410703d.field_feedId));
        lVarArr[1] = new jz5.l("comment_id", pm0.v.u(commentItem.f410703d.t0()));
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = commentItem.f410714r;
        lVarArr[2] = new jz5.l("pid", iEmojiInfo2 != null ? iEmojiInfo2.getGroupId() : null);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = commentItem.f410714r;
        lVarArr[3] = new jz5.l("emoticon_activityid", iEmojiInfo3 != null ? iEmojiInfo3.S0() : null);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo4 = commentItem.f410714r;
        lVarArr[4] = new jz5.l("emoticon_designerid", iEmojiInfo4 != null ? iEmojiInfo4.X0() : null);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo5 = commentItem.f410714r;
        lVarArr[5] = new jz5.l("emoticon_md5", iEmojiInfo5 != null ? iEmojiInfo5.getMd5() : null);
        aVar.gk(finderEmojiView, kz5.c1.k(lVarArr));
        viewGroup.setVisibility(0);
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.f0().r()).booleanValue()) {
            com.tencent.mm.api.IEmojiInfo iEmojiInfo6 = commentItem.f410714r;
            if (iEmojiInfo6 != null && (md52 = iEmojiInfo6.getMd5()) != null && !r26.i0.y(md52, "failedTest", false)) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.feature.emoji.api.n6 n6Var = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("failedTest:");
                com.tencent.mm.api.IEmojiInfo iEmojiInfo7 = commentItem.f410714r;
                sb7.append(iEmojiInfo7 != null ? iEmojiInfo7.getMd5() : null);
                commentItem.f410714r = ((com.tencent.mm.feature.emoji.t2) n6Var).Bi(sb7.toString(), null);
            }
        }
        com.tencent.mm.api.IEmojiInfo emojiInfo = finderEmojiView.getEmojiInfo();
        java.lang.String md53 = emojiInfo != null ? emojiInfo.getMd5() : null;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo8 = commentItem.f410714r;
        if (!kotlin.jvm.internal.o.b(md53, iEmojiInfo8 != null ? iEmojiInfo8.getMd5() : null) || (finderEmojiView.getStatusListener() == null && finderEmojiView.getStatus() != 1)) {
            finderEmojiView.setEmojiInfo(commentItem.f410714r);
            finderEmojiView.requestLayout();
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swd);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ddp);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.t7i);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.t7j);
        finderEmojiView.setDownloadListener(new com.tencent.mm.plugin.finder.convert.o1(commentItem));
        finderEmojiView.setStatusListener(new com.tencent.mm.plugin.finder.convert.p1(commentItem, viewGroup2, p17, p18, p19, this));
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Pc).getValue()).r()).booleanValue()) {
            finderEmojiView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.q1(presenter, finderEmojiView, commentItem));
        }
        finderEmojiView.setOnLongClickListener(new com.tencent.mm.plugin.finder.convert.u1(this, commentItem, finderEmojiView, holder, presenter));
    }

    public final void C(in5.s0 holder, so2.y0 commentItem, java.lang.Object obj, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter) {
        r45.j60 j60Var;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swi);
        if (viewGroup == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.c7_);
        r45.e60 v07 = commentItem.f410703d.v0();
        r45.j60 j60Var2 = (v07 == null || (list = v07.getList(1)) == null) ? null : (r45.j60) kz5.n0.Z(list);
        if (commentItem.f410703d.j1() || commentItem.f410703d.w0() != 2 || j60Var2 == null) {
            viewGroup.setOnClickListener(null);
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        android.content.Context context = holder.f293121e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479662c0);
        int min = java.lang.Math.min(j60Var2.getInteger(2), j60Var2.getInteger(3));
        float max = min == 0 ? 1.0f : java.lang.Math.max(j60Var2.getInteger(2), j60Var2.getInteger(3)) / min;
        if (max > 1.3333334f) {
            max = 1.3333334f;
        }
        if (j60Var2.getInteger(3) > j60Var2.getInteger(2)) {
            viewGroup.getLayoutParams().width = dimensionPixelSize;
            viewGroup.getLayoutParams().height = (int) (dimensionPixelSize * max);
        } else {
            viewGroup.getLayoutParams().width = (int) (dimensionPixelSize * max);
            viewGroup.getLayoutParams().height = dimensionPixelSize;
        }
        java.util.LinkedList Q0 = commentItem.f410703d.Q0();
        java.lang.String string = (Q0 == null || (j60Var = (r45.j60) kz5.n0.Z(Q0)) == null) ? null : j60Var.getString(0);
        if (string == null || string.length() == 0) {
            t(holder, commentItem.f410703d.t0(), commentItem.f410703d.field_feedId, j60Var2, !kotlin.jvm.internal.o.b(obj, 6));
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "use localImage");
            ((android.view.ViewGroup) holder.p(com.tencent.mm.R.id.swj)).setVisibility(8);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            wo0.c d17 = d1Var.d(ya2.l.f460502a.e(string, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            kotlin.jvm.internal.o.d(imageView);
            d17.b(imageView, !kotlin.jvm.internal.o.b(obj, 5));
        }
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.convert.v1(presenter, commentItem));
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(viewGroup, "image_comment");
        aVar.Tj(viewGroup, 40, 1, false);
        aVar.gk(viewGroup, kz5.c1.l(new jz5.l("comment_scene", java.lang.Integer.valueOf(presenter.getCommentScene())), new jz5.l("comment_id", pm0.v.u(commentItem.f410703d.t0())), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("feed_id", pm0.v.u(commentItem.f410703d.field_feedId))));
        I(holder, commentItem);
    }

    public final void D(in5.s0 holder, android.view.View commentContent) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(commentContent, "commentContent");
        so2.y0 y0Var = (so2.y0) holder.f293125i;
        java.util.ArrayList arrayList = y0Var != null ? y0Var.A : null;
        if (arrayList == null || arrayList.isEmpty()) {
            ym5.a1.h(commentContent, null);
        } else {
            ym5.a1.h(commentContent, new com.tencent.mm.plugin.finder.convert.w1(holder));
        }
    }

    public final void E(android.content.Context context, android.view.View feedCommentLayout, android.view.View avatar, android.widget.TextView nickNameTv, android.view.View view, android.widget.TextView textView, android.widget.TextView commentTime, android.view.View view2, android.widget.TextView textView2, android.widget.TextView textView3, android.view.View view3, android.view.View view4, android.widget.TextView textView4, android.view.View view5, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.TextView textView7, android.view.View view6, android.view.View view7) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedCommentLayout, "feedCommentLayout");
        kotlin.jvm.internal.o.g(avatar, "avatar");
        kotlin.jvm.internal.o.g(nickNameTv, "nickNameTv");
        kotlin.jvm.internal.o.g(commentTime, "commentTime");
        if (feedCommentLayout.getWidth() > 0) {
            int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479646bl);
            int f18 = i65.a.f(context, com.tencent.mm.R.dimen.f479648bn);
            int width = feedCommentLayout.getWidth() - i65.a.f(context, com.tencent.mm.R.dimen.f479704cz);
            int width2 = avatar.getWidth();
            int width3 = (view == null || view.getVisibility() != 0) ? 0 : view.getWidth();
            if (view7 != null && view7.getVisibility() == 0 && ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue()) {
                width3 += view7.getWidth();
            }
            int r17 = (view4 == null || view4.getVisibility() != 0 || textView4 == null || textView4.getVisibility() != 0) ? 0 : hc2.f1.r(textView2, 0) + i65.a.f(context, com.tencent.mm.R.dimen.f479714d7) + view4.getPaddingLeft() + view4.getPaddingRight();
            android.view.View view8 = (android.view.View) (view2 != null ? view2.getParent() : null);
            if (view8 == null || view8.getVisibility() != 0 || view2 == null || view2.getVisibility() != 0) {
                i17 = 0;
            } else {
                i17 = view2.getWidth() + view8.getPaddingLeft() + view8.getPaddingRight();
                if (textView2 != null && textView2.getVisibility() == 0) {
                    i17 += hc2.f1.r(textView2, f17);
                }
            }
            int f19 = i65.a.f(context, com.tencent.mm.R.dimen.f479718db);
            if (i17 < f19) {
                i17 = f19;
            }
            android.view.View view9 = (android.view.View) (view3 != null ? view3.getParent() : null);
            if (view9 == null || view9.getVisibility() != 0 || textView3 == null || textView3.getVisibility() != 0) {
                i18 = 0;
            } else {
                i18 = textView3.getWidth() + view9.getPaddingLeft() + view9.getPaddingRight();
                if (textView2 != null && textView3.getVisibility() == 0) {
                    i18 += hc2.f1.r(textView3, f17);
                }
            }
            int width4 = view5 != null ? view5.getWidth() : 0;
            int width5 = view6 != null ? view6.getWidth() : 0;
            int r18 = hc2.f1.r(commentTime, f18);
            int r19 = hc2.f1.r(textView, f18);
            int r27 = hc2.f1.r(textView5, f18);
            int r28 = hc2.f1.r(textView6, f18);
            int r29 = hc2.f1.r(textView7, f18);
            int p17 = hc2.f1.p(nickNameTv);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("minMax ");
            float f27 = p17 * 2.5f;
            sb6.append(ym5.x.b(context, f27));
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb6.toString());
            int i19 = width - ((((((((((((width2 + width3) + r27) + r28) + r29) + r18) + r19) + i17) + r17) + width4) + p17) + i18) + width5);
            int i27 = (int) f27;
            if (i19 < i27) {
                i19 = i27;
            }
            nickNameTv.setMaxWidth(i19);
        }
    }

    public final void F(in5.s0 holder, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, so2.y0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.uca);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.v2_);
        if (!finderItem.isSelfFeed() || !item.f410703d.d1()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!finderItem.isChosenComment()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if ((item.f410703d.u0().getExtFlag() & 2) != 0) {
            kotlin.jvm.internal.o.d(weImageView);
            G(true, weImageView);
        } else {
            kotlin.jvm.internal.o.d(weImageView);
            G(false, weImageView);
        }
    }

    public final void G(boolean z17, com.tencent.mm.ui.widget.imageview.WeImageView start) {
        kotlin.jvm.internal.o.g(start, "start");
        if (z17) {
            start.s(com.tencent.mm.R.raw.star_filled, com.tencent.mm.R.color.f479206su);
        } else {
            start.s(com.tencent.mm.R.raw.star_regular, com.tencent.mm.R.color.adg);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r6 == null || r6.length() == 0) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(in5.s0 r22, so2.y0 r23) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.x1.H(in5.s0, so2.y0):void");
    }

    public final void I(in5.s0 holder, so2.y0 commentItem) {
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) holder.p(com.tencent.mm.R.id.swk);
        if (ringProgressView == null || (imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.c7_)) == null) {
            return;
        }
        if (commentItem.f410703d.field_state != 3) {
            ringProgressView.setVisibility(8);
            imageView.setForeground(null);
        } else {
            ringProgressView.setVisibility(0);
            ringProgressView.setProgress(commentItem.f410703d.f128399y1);
            imageView.setForeground(new android.graphics.drawable.ColorDrawable(holder.f293121e.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5)));
        }
    }

    public final void p(android.view.View view, float f17, float f18) {
        view.clearAnimation();
        view.setTranslationX(f18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "animateViewMove", "(Landroid/view/View;FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "animateViewMove", "(Landroid/view/View;FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().translationX(0.0f).alpha(1.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.convert.c1(view)).start();
    }

    public final void q(android.view.View maskView, so2.y0 item, int i17, java.lang.String tag) {
        kotlin.jvm.internal.o.g(maskView, "maskView");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mars.xlog.Log.i(tag, "blinkView, " + i17 + ", blink:" + item.f410718v + ", hasBlink:" + item.f410720x + " isBlinking:" + item.f410721y);
        if (!item.f410721y) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(maskView, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            maskView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(maskView, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!item.f410718v || item.f410720x || item.f410721y) {
            return;
        }
        com.tencent.mars.xlog.Log.i(tag, "begin blink animation " + i17 + ", duration:" + item.f410719w);
        item.f410720x = true;
        item.f410721y = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(maskView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        maskView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(maskView, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(maskView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        maskView.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(maskView, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        maskView.animate().alpha(0.0f).setDuration(1000L).setStartDelay(item.f410719w).setListener(new com.tencent.mm.plugin.finder.convert.d1(maskView, item, tag, i17)).start();
    }

    public final void r(android.content.Context context, java.util.List labels, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(labels, "labels");
        if (labels.isEmpty()) {
            if (z17) {
                r45.zb1 zb1Var = new r45.zb1();
                com.tencent.mm.plugin.finder.assist.d3 d3Var = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                zb1Var.set(1, 1);
                zb1Var.set(0, "<_wc_custom_link_ color=\"Brand_100\" backgroundenabled=\"0\">" + context.getString(com.tencent.mm.R.string.cpv) + "</_wc_custom_link_>");
                labels.add(zb1Var);
                return;
            }
            if (z18) {
                r45.zb1 zb1Var2 = new r45.zb1();
                com.tencent.mm.plugin.finder.assist.d3 d3Var2 = com.tencent.mm.plugin.finder.assist.d3.f102076e;
                zb1Var2.set(1, 1);
                zb1Var2.set(0, "<_wc_custom_link_ color=\"#C5984C\" backgroundenabled=\"0\">" + context.getString(com.tencent.mm.R.string.cpt) + "</_wc_custom_link_>");
                labels.add(zb1Var2);
            }
        }
    }

    public final int s(android.content.Context context, boolean z17, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        return z17 ? presenter.h0() ? context.getResources().getColor(com.tencent.mm.R.color.BW_90) : context.getResources().getColor(com.tencent.mm.R.color.Red_100) : presenter.h0() ? context.getResources().getColor(com.tencent.mm.R.color.BW_90) : context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5);
    }

    public final void t(in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, boolean z17) {
        android.widget.ImageView imageView;
        int i17;
        java.lang.String string;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.swj);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.u3z);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.u3l);
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.u3m);
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.c7_);
        if (z17) {
            viewGroup.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            imageView = imageView2;
            i17 = 0;
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            imageView = imageView2;
            i17 = 0;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = 1L;
        java.lang.String string2 = j60Var.getString(7);
        if (((string2 == null || string2.length() == 0) ? 1 : i17) != 0) {
            h0Var.f310123d = j60Var.getString(i17);
            string = j60Var.getString(1);
            g0Var.f310121d = 0L;
        } else {
            h0Var.f310123d = j60Var.getString(7);
            string = j60Var.getString(8);
        }
        java.lang.String str = string;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.f0().r()).booleanValue()) {
            h0Var.f310123d = "failedTest:" + ((java.lang.String) h0Var.f310123d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadCommentImage ");
        sb6.append((java.lang.String) h0Var.f310123d);
        sb6.append(str == null ? "" : str);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append((java.lang.String) h0Var.f310123d);
        sb7.append(str != null ? str : "");
        wo0.c a17 = d1Var.a(lVar.e(sb7.toString(), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        com.tencent.mm.plugin.finder.convert.g1 g1Var = new com.tencent.mm.plugin.finder.convert.g1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19);
        a17.getClass();
        a17.f447873d = g1Var;
        a17.f447879j = new com.tencent.mm.plugin.finder.convert.h1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19, currentTimeMillis, h0Var, str, g0Var);
        a17.f447878i = new com.tencent.mm.plugin.finder.convert.i1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19);
        kotlin.jvm.internal.o.d(imageView);
        a17.b(imageView, z17);
    }

    public final void u(in5.s0 holder, so2.y0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if ((item.f410703d.z0() & 32768) != 0) {
            holder.w(com.tencent.mm.R.id.sbv, 0);
        } else {
            holder.w(com.tencent.mm.R.id.sbv, 8);
        }
    }

    public final void v(in5.s0 holder, so2.y0 item, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        if ((item.f410703d.z0() & 262144) != 0) {
            cq.k1.a();
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k0().r()).booleanValue() && !feedObj.N0()) {
                holder.w(com.tencent.mm.R.id.sx8, 0);
                return;
            }
        }
        holder.w(com.tencent.mm.R.id.sx8, 8);
    }

    public final void w(in5.s0 holder, so2.y0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (!item.f410703d.h1()) {
            cq.k1.a();
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k0().r()).booleanValue()) {
                if ((item.f410703d.z0() & 131072) != 0) {
                    holder.w(com.tencent.mm.R.id.ufm, 0);
                    return;
                }
            }
        }
        holder.w(com.tencent.mm.R.id.ufm, 8);
    }

    public final void x(in5.s0 holder, so2.y0 item, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        r45.ly0 help_promotion_button = item.f410703d.u0().getHelp_promotion_button();
        if (help_promotion_button != null && help_promotion_button.getInteger(0) == 1) {
            r45.ly0 help_promotion_button2 = item.f410703d.u0().getHelp_promotion_button();
            if ((help_promotion_button2 != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) help_promotion_button2.getCustom(1) : null) != null) {
                android.view.View p17 = holder.p(com.tencent.mm.R.id.s1h);
                if (p17 != null) {
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var = item.f410703d;
                    o3Var.Ik(p17, yj0Var.field_feedId, yj0Var.t0(), item.f410703d.w0(), item.f410703d.j());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshPromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshPromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.f484497te4);
                    textView.setText(com.tencent.mm.R.string.p5m);
                    com.tencent.mm.ui.bk.s0(textView.getPaint());
                    p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.j1(item, p17, feedObj));
                    return;
                }
                return;
            }
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.s1h);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshPromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshPromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, in5.s0 s0Var, so2.y0 y0Var, java.lang.Object obj, boolean z17) {
        int i17;
        int i18;
        r45.k60 friend_recommend_list = y0Var.f410703d.u0().getFriend_recommend_list();
        java.util.LinkedList list = friend_recommend_list != null ? friend_recommend_list.getList(0) : null;
        int i19 = 8;
        if ((list == null || list.isEmpty()) == true) {
            viewGroup.setVisibility(8);
            viewGroup.setOnClickListener(null);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.tyd);
        if (textView == null) {
            return;
        }
        int visibility = viewGroup.getVisibility();
        android.content.Context context = s0Var.f293121e;
        if (visibility == 8 && kotlin.jvm.internal.o.b(obj, 3)) {
            viewGroup.clearAnimation();
            viewGroup.setAlpha(0.0f);
            viewGroup.setTranslationY(-i65.a.h(context, com.tencent.mm.R.dimen.f479704cz));
            viewGroup.animate().alpha(1.0f).translationY(0.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.convert.k1(viewGroup)).start();
        }
        viewGroup.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        n3.t1 t1Var = new n3.t1(viewGroup);
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            if (view instanceof android.widget.ImageView) {
                arrayList.add(view);
            }
        }
        int i27 = 0;
        int i28 = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i29 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) obj2;
            if (i27 >= list.size()) {
                ((android.widget.ImageView) arrayList.get(i27)).setVisibility(i19);
            } else {
                ((android.widget.ImageView) arrayList.get(i27)).setVisibility(0);
                i28++;
                java.lang.String string = ((r45.h60) list.get(i27)).getString(0);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(imageView, string, true);
                com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "[setLikeAvatar] " + i27 + ", " + string);
            }
            i27 = i29;
            i19 = 8;
        }
        r45.h60 h60Var = (r45.h60) kz5.n0.k0(list);
        java.lang.String string2 = h60Var != null ? h60Var.getString(0) : null;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(string2, true);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String P0 = n17.P0();
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(string2, P0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.jvm.internal.o.d(f17);
        sb6.append(hc2.x0.f(f17, 6));
        sb6.append(' ');
        java.lang.String sb7 = sb6.toString();
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.tyb);
        if (list.size() == 1) {
            java.lang.String string3 = textView2.getResources().getString(com.tencent.mm.R.string.d1r);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            android.content.Context context2 = textView2.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            textView2.setText(hc2.x0.k(string3, context2, '#', com.tencent.mm.R.raw.icons_outlined_like, com.tencent.mm.R.color.Brand_100, (int) textView2.getTextSize(), (int) textView2.getTextSize(), 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
            viewGroup.setTag(com.tencent.mm.R.id.f484405tb5, textView2.getContext().getString(com.tencent.mm.R.string.nnp));
            i17 = i28;
        } else {
            i17 = i28;
            java.lang.String h17 = com.tencent.mm.plugin.finder.assist.w2.h(list.size());
            java.lang.String string4 = textView2.getContext().getString(com.tencent.mm.R.string.f492037f10, h17);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            android.content.Context context3 = textView2.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            textView2.setText(hc2.x0.k(string4, context3, '#', com.tencent.mm.R.raw.icons_outlined_like, com.tencent.mm.R.color.Brand_100, (int) textView2.getTextSize(), (int) textView2.getTextSize(), 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
            viewGroup.setTag(com.tencent.mm.R.id.f484405tb5, textView2.getContext().getString(com.tencent.mm.R.string.o2o, h17));
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i37 = a17.f197135a;
        if (!z18 && i37 > (i18 = a17.f197136b)) {
            i37 = i18;
        }
        int f18 = i37 - (y0Var.h() == 2 ? i65.a.f(context, com.tencent.mm.R.dimen.by) : i65.a.f(context, com.tencent.mm.R.dimen.f479649bo));
        float measureText = textView2.getPaint().measureText(textView2.getText().toString());
        float f19 = i17 * i65.a.f(context, com.tencent.mm.R.dimen.f479706d1);
        float f27 = f18;
        if (textView.getPaint().measureText(sb7) + measureText + f19 > f27) {
            sb7 = hc2.x0.f(f17, 3) + ' ';
            if (textView.getPaint().measureText(sb7) + measureText + f19 > f27) {
                sb7 = "";
            }
        }
        textView.setText(sb7);
        viewGroup.setTag(com.tencent.mm.R.id.tb6, sb7);
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.convert.l1(this, list, s0Var, finderItem));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(viewGroup, "friend_recommend_comment");
        aVar.Tj(viewGroup, 40, 1, false);
        aVar.gk(viewGroup, kz5.c1.l(new jz5.l("comment_id", pm0.v.u(y0Var.getItemId())), new jz5.l("feed_id", pm0.v.u(y0Var.f410703d.field_feedId)), new jz5.l("is_my_recommend_comment", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("friend_recommend_cnt", java.lang.Integer.valueOf(y0Var.f410703d.I0()))));
    }

    public final boolean z(so2.y0 item, com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, boolean z18, in5.s0 holder, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.uc9);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.tyc);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.iht);
        boolean contains = presenter.w().contains(java.lang.Long.valueOf(item.getItemId()));
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean d17 = hc2.t.d(context);
        boolean g17 = so2.g0.g(item, contains, z17, z18, false);
        if (!g17 || d17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/storage/FinderItem;ZZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/storage/FinderItem;ZZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!d17 || !g17) {
                viewGroup.setVisibility(8);
                return false;
            }
            kotlin.jvm.internal.o.d(viewGroup);
            y(viewGroup, feed, holder, item, obj, z17);
            return false;
        }
        if (!contains) {
            presenter.w().add(java.lang.Long.valueOf(item.getItemId()));
        }
        if (p17.getVisibility() == 8 && kotlin.jvm.internal.o.b(obj, 2)) {
            kotlin.jvm.internal.o.d(p18);
            p(p18, 0.0f, p18.getWidth());
            p(p17, 0.0f, p18.getWidth());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/storage/FinderItem;ZZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/plugin/finder/storage/FinderItem;ZZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int s17 = s(context, z17, presenter);
        if (hc2.l.g(presenter.z0().getUserName())) {
            p17.setPadding(p17.getPaddingLeft(), p17.getPaddingTop(), context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl), p17.getPaddingBottom());
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f486560lo4);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uxf);
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
        weImageView.setIconColor(s17);
        weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.icons_filled_like : com.tencent.mm.R.raw.heart_medium);
        textView.setTextColor(s17);
        if (z17) {
            textView.setText(com.tencent.mm.R.string.nnp);
        } else {
            textView.setText(com.tencent.mm.R.string.nnh);
        }
        if (z17 && kotlin.jvm.internal.o.b(obj, 3)) {
            kotlin.jvm.internal.o.d(p18);
            p(p18, 1.0f, i65.a.h(context, com.tencent.mm.R.dimen.f479738dv));
        }
        p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.m1(presenter, item, z17, weImageView));
        p17.post(new com.tencent.mm.plugin.finder.convert.n1(obj, z18, this, holder, p17));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(p17, "recommend_comment_button");
        aVar.Tj(p17, 40, 1, false);
        aVar.gk(p17, kz5.c1.l(new jz5.l("comment_id", pm0.v.u(item.getItemId())), new jz5.l("feed_id", pm0.v.u(item.f410703d.field_feedId)), new jz5.l("is_my_like_comment", java.lang.Integer.valueOf(z18 ? 1 : 0)), new jz5.l("recommend_type", java.lang.Integer.valueOf(!z17 ? 1 : 0)), new jz5.l("friend_recommend_cnt", java.lang.Integer.valueOf(item.f410703d.I0()))));
        kotlin.jvm.internal.o.d(viewGroup);
        y(viewGroup, feed, holder, item, obj, z17);
        return true;
    }
}
