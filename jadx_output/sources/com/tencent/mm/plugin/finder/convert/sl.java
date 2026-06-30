package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sl extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487852s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String nickname;
        java.lang.String username;
        java.lang.Throwable th6;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.i1q);
        imageView.setImageResource(com.tencent.mm.R.color.BW_97);
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (mb4Var != null) {
            if (mb4Var.getInteger(2) == 4) {
                g1Var.e().c(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.f329953d));
            } else {
                g1Var.e().c(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.f329953d));
            }
        }
        java.lang.Throwable th7 = null;
        holder.itemView.setOnClickListener(null);
        java.util.List msgEventLikeList = item.getMsgEventLikeList();
        long id6 = item.getFeedObject().getId();
        java.lang.String objectNonceId = item.getFeedObject().getObjectNonceId();
        com.tencent.mm.protobuf.g likeBuffer = item.getFeedObject().getFeedObject().getLikeBuffer();
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeConvert", "onBindViewHolder name:" + item.getFeedObject().getNickName() + ", likeList size:" + msgEventLikeList.size() + ", jumpFeedId:" + id6);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.lkg);
        if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(holder.p(com.tencent.mm.R.id.f485060ge5));
            arrayList3.add(holder.p(com.tencent.mm.R.id.ge7));
            arrayList3.add(holder.p(com.tencent.mm.R.id.ge9));
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(holder.p(com.tencent.mm.R.id.ge6));
            arrayList4.add(holder.p(com.tencent.mm.R.id.ge8));
            arrayList4.add(holder.p(com.tencent.mm.R.id.ge_));
            java.util.Iterator it6 = arrayList3.iterator();
            int i19 = 0;
            while (true) {
                if (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        java.lang.Throwable th8 = th7;
                        kz5.c0.p();
                        throw th8;
                    }
                    android.widget.ImageView imageView2 = (android.widget.ImageView) next;
                    if (imageView2 != null) {
                        if (i19 >= msgEventLikeList.size()) {
                            android.view.View view = (android.view.View) arrayList4.get(i19);
                            if (view != null) {
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(8);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            it = it6;
                            arrayList = arrayList4;
                        } else {
                            android.view.View view2 = (android.view.View) arrayList4.get(i19);
                            if (view2 == null) {
                                it = it6;
                                arrayList = arrayList4;
                            } else {
                                it = it6;
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                arrayList = arrayList4;
                                arrayList6.add(0);
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            java.lang.String headUrl = ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) msgEventLikeList.get(i19)).getHeadUrl();
                            java.lang.String str = headUrl != null ? headUrl : "";
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) msgEventLikeList.get(i19)).getUsername(), c01.z1.r())) {
                                ng5.a.a(imageView2, c01.z1.r());
                            } else {
                                th6 = null;
                                g1Var.a().c(new mn2.n(str, null, 2, null), imageView2, g1Var.h(mn2.f1.f329957h));
                            }
                        }
                        th6 = null;
                    } else {
                        th6 = th7;
                        it = it6;
                        arrayList = arrayList4;
                    }
                    it6 = it;
                    arrayList4 = arrayList;
                    th7 = th6;
                    i19 = i27;
                } else {
                    android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lkh);
                    android.content.Context context = holder.f293121e;
                    if (textView != null) {
                        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.Z(msgEventLikeList);
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        i95.m c17 = i95.n0.c(c61.yb.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        java.lang.String md6 = c61.yb.md((c61.yb) c17, (finderCommentInfo == null || (username = finderCommentInfo.getUsername()) == null) ? "" : username, (finderCommentInfo == null || (nickname = finderCommentInfo.getNickname()) == null) ? "" : nickname, false, 4, null);
                        ((ke0.e) xVar).getClass();
                        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, md6));
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lke);
                    int msgEventFriendLikeCount = item.getMsgEventFriendLikeCount();
                    int msgEventIncCount = item.getMsgEventIncCount();
                    int i28 = msgEventFriendLikeCount - msgEventIncCount;
                    if (msgEventFriendLikeCount == 1) {
                        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
                        java.lang.String string = context.getString(com.tencent.mm.R.string.f492038f11);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        textView2.setText(hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
                    } else if (msgEventFriendLikeCount > 3 || msgEventIncCount > 0) {
                        if (msgEventIncCount > 0) {
                            kotlin.jvm.internal.o.d(textView2);
                            n(i28, msgEventIncCount, holder, com.tencent.mm.R.string.f492037f10, textView2);
                        } else {
                            textView2.setText(context.getString(com.tencent.mm.R.string.f492037f10, java.lang.String.valueOf(msgEventFriendLikeCount).toString()));
                        }
                    } else if (msgEventIncCount > 0) {
                        kotlin.jvm.internal.o.d(textView2);
                        n(i28, msgEventIncCount, holder, com.tencent.mm.R.string.f492040f13, textView2);
                    } else {
                        textView2.setText(context.getString(com.tencent.mm.R.string.f492040f13, java.lang.String.valueOf(msgEventFriendLikeCount).toString()));
                    }
                    holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ql(holder, item, likeBuffer));
                }
            }
        }
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.rl(id6, objectNonceId, likeBuffer, holder, this));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lkh);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.lke);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
    }

    public final void n(int i17, int i18, in5.s0 s0Var, int i19, android.widget.TextView textView) {
        int i27;
        java.lang.String str = i17 + " + " + i18;
        int length = str.length() - r26.n0.K(str, '+', 0, false, 6, null);
        int dimension = (int) s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        android.content.Context context = s0Var.f293121e;
        java.lang.String string = context.getString(i19, i17 + " + " + i18);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.CharSequence k17 = hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        int K = r26.n0.K(k17, '+', 0, false, 6, null);
        if (K <= 0 || (i27 = length + K) >= ((android.text.SpannableString) k17).length()) {
            textView.setText(k17);
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(k17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f478532ac)), K, i27, 17);
        textView.setText(spannableStringBuilder);
    }
}
