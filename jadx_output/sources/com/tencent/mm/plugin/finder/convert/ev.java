package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ev extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b9j;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia first2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media3;
        com.tencent.mm.protocal.protobuf.FinderMedia first3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media4;
        com.tencent.mm.protocal.protobuf.FinderMedia first4;
        java.lang.String string;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        so2.j1 item = (so2.j1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        mn2.g1 g1Var = mn2.g1.f329975a;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = item.f410439d;
        if (!z17) {
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) holder.p(com.tencent.mm.R.id.a9q);
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout2 = (com.tencent.mm.plugin.finder.feed.RoundLinearLayout) holder.p(com.tencent.mm.R.id.a9s);
            roundLinearLayout.setRadius(0.2f);
            roundLinearLayout2.setRadius(0.2f);
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.iak);
            android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ial);
            roundLinearLayout2.setVisibility(0);
            r45.pw2 snsShareInfo = finderObject.getSnsShareInfo();
            if (((snsShareInfo == null || (list3 = snsShareInfo.getList(3)) == null) ? 0 : list3.size()) <= 1) {
                roundLinearLayout2.setVisibility(8);
            }
            r45.pw2 snsShareInfo2 = finderObject.getSnsShareInfo();
            if (snsShareInfo2 != null && (list2 = snsShareInfo2.getList(3)) != null) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) kz5.n0.Z(list2);
                if (finderContact != null) {
                    vo0.d i19 = g1Var.i();
                    mn2.n nVar = new mn2.n(finderContact.getHeadUrl(), null, 2, null);
                    kotlin.jvm.internal.o.d(imageView);
                    i19.c(nVar, imageView, g1Var.h(mn2.f1.f329960n));
                }
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) kz5.n0.a0(list2, 1);
                if (finderContact2 != null) {
                    vo0.d i27 = g1Var.i();
                    mn2.n nVar2 = new mn2.n(finderContact2.getHeadUrl(), null, 2, null);
                    kotlin.jvm.internal.o.d(imageView2);
                    i27.c(nVar2, imageView2, g1Var.h(mn2.f1.f329960n));
                }
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.iam);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        if (contact == null || (str = contact.getNickname()) == null) {
            str = "";
        }
        textView.setText(((c61.p2) ybVar).cj(context, paint, str, 5));
        ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.f483299a85)).setVisibility(8);
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483299a85);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        zy2.tb.a(m1Var, (android.widget.ImageView) p17, contact2 != null ? contact2.getAuthInfo() : null, 0, 4, null);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.n9f);
        r45.pw2 snsShareInfo3 = finderObject.getSnsShareInfo();
        if (p18 != null && snsShareInfo3 != null) {
            android.widget.TextView textView2 = (android.widget.TextView) p18;
            textView2.setVisibility(0);
            android.content.Context context2 = holder.f293121e;
            textView2.setTextSize(0, i65.a.h(context2, com.tencent.mm.R.dimen.f479930ja));
            int integer = snsShareInfo3.getInteger(0);
            if (integer == 1) {
                if (snsShareInfo3.getInteger(1) > 2) {
                    string = context2.getString(com.tencent.mm.R.string.f5j, "" + snsShareInfo3.getInteger(1));
                } else {
                    string = context2.getString(com.tencent.mm.R.string.f490558yg);
                }
                textView2.setText(string);
            } else if (integer != 2) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(context2.getString(com.tencent.mm.R.string.f5i, "" + snsShareInfo3.getInteger(2)));
            }
        }
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        int integer2 = liveInfo != null ? liveInfo.getInteger(2) : 2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        java.lang.String coverUrl = (objectDesc == null || (media4 = objectDesc.getMedia()) == null || (first4 = media4.getFirst()) == null) ? null : first4.getCoverUrl();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (coverUrl == null) {
            coverUrl = "";
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
        java.lang.String cover_url_token = (objectDesc2 == null || (media3 = objectDesc2.getMedia()) == null || (first3 = media3.getFirst()) == null) ? null : first3.getCover_url_token();
        if (cover_url_token == null) {
            cover_url_token = "";
        }
        java.lang.String concat = coverUrl.concat(cover_url_token);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
        java.lang.String thumbUrl = (objectDesc3 == null || (media2 = objectDesc3.getMedia()) == null || (first2 = media2.getFirst()) == null) ? null : first2.getThumbUrl();
        if (thumbUrl == null) {
            thumbUrl = "";
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = finderObject.getObjectDesc();
        java.lang.String thumb_url_token = (objectDesc4 == null || (media = objectDesc4.getMedia()) == null || (first = media.getFirst()) == null) ? null : first.getThumb_url_token();
        java.lang.String concat2 = thumbUrl.concat(thumb_url_token != null ? thumb_url_token : "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            concat = concat2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshMask liveId:");
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        sb6.append(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null);
        sb6.append(", liveStatus:");
        sb6.append(integer2);
        sb6.append(", showImageUrl:");
        sb6.append(concat);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListItemConvert", sb6.toString());
        ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.o6z)).setImageBitmap(null);
        if (integer2 == 1) {
            if (!z17) {
                wo0.c a17 = g1Var.e().a(new mn2.q3(concat, com.tencent.mm.plugin.finder.storage.y90.f128355e));
                a17.f447874e = new ap0.g(null, null, 3, null);
                a17.g(g1Var.h(mn2.f1.f329953d));
                android.view.View p19 = holder.p(com.tencent.mm.R.id.o6z);
                kotlin.jvm.internal.o.f(p19, "getView(...)");
                a17.c((android.widget.ImageView) p19);
            }
            android.view.View p27 = holder.p(com.tencent.mm.R.id.exx);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p27, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.view.View p28 = holder.p(com.tencent.mm.R.id.o6z);
        kotlin.jvm.internal.o.f(p28, "getView(...)");
        c61.zb.g7((c61.zb) c17, (android.widget.ImageView) p28, concat, 0, 4, null);
        android.view.View p29 = holder.p(com.tencent.mm.R.id.exx);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p29, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p29.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderSnsLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.n9f);
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(8);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        float min = (java.lang.Math.min(context.getResources().getDisplayMetrics().heightPixels, context.getResources().getDisplayMetrics().widthPixels) - i65.a.b(context, 16)) / 3.5f;
        if (min <= 0.0f) {
            min = context.getResources().getDimension(com.tencent.mm.R.dimen.by);
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        layoutParams.width = (int) min;
        layoutParams.height = (int) ((4 * min) / 3);
        holder.itemView.setLayoutParams(layoutParams);
    }
}
