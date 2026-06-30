package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class uh extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f104706e;

    public uh(int i17) {
        this.f104706e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ahw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        com.tencent.mm.plugin.finder.convert.uh uhVar;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        so2.j1 item = (so2.j1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = item.f410439d;
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        if (contact == null || (str = contact.getHeadUrl()) == null) {
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.iaj);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.iam);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.text.TextPaint paint = ((android.widget.TextView) holder.p(com.tencent.mm.R.id.iam)).getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
        if (contact2 == null || (str2 = contact2.getNickname()) == null) {
            str2 = "";
        }
        textView.setText(((c61.p2) ybVar).cj(context, paint, str2, 5));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.view.View p18 = holder.p(com.tencent.mm.R.id.f483299a85);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) p18;
        com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
        zy2.tb.a(m1Var, imageView, contact3 != null ? contact3.getAuthInfo() : null, 0, 4, null);
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        int integer = liveInfo != null ? liveInfo.getInteger(2) : 2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        if (finderMedia == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.nw1 liveInfo2 = finderObject.getLiveInfo();
            sb6.append(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null);
            sb6.append(" firstMedia is empty");
            com.tencent.mars.xlog.Log.i("FinderFeedLiveListItemConvert", sb6.toString());
        }
        java.lang.String coverUrl = finderMedia != null ? finderMedia.getCoverUrl() : null;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (coverUrl == null) {
            coverUrl = "";
        }
        java.lang.String cover_url_token = finderMedia != null ? finderMedia.getCover_url_token() : null;
        if (cover_url_token == null) {
            cover_url_token = "";
        }
        java.lang.String concat = coverUrl.concat(cover_url_token);
        java.lang.String thumbUrl = finderMedia != null ? finderMedia.getThumbUrl() : null;
        if (thumbUrl == null) {
            thumbUrl = "";
        }
        java.lang.String thumb_url_token = finderMedia != null ? finderMedia.getThumb_url_token() : null;
        if (thumb_url_token == null) {
            thumb_url_token = "";
        }
        java.lang.String concat2 = thumbUrl.concat(thumb_url_token);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            concat = concat2;
        }
        ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.o6z)).setImageBitmap(null);
        if (integer == 1) {
            wo0.c a18 = g1Var.e().a(new mn2.q3(concat, com.tencent.mm.plugin.finder.storage.y90.f128355e));
            a18.f447874e = new ap0.g(null, null, 3, null);
            a18.g(g1Var.h(mn2.f1.f329953d));
            android.view.View p19 = holder.p(com.tencent.mm.R.id.o6z);
            kotlin.jvm.internal.o.f(p19, "getView(...)");
            a18.c((android.widget.ImageView) p19);
            android.view.View p27 = holder.p(com.tencent.mm.R.id.ffc);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p27, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p28 = holder.p(com.tencent.mm.R.id.exx);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p28, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uhVar = this;
            i19 = 1;
        } else {
            i95.m c17 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.zb zbVar = (c61.zb) c17;
            android.view.View p29 = holder.p(com.tencent.mm.R.id.o6z);
            kotlin.jvm.internal.o.f(p29, "getView(...)");
            android.widget.ImageView imageView2 = (android.widget.ImageView) p29;
            i19 = 1;
            c61.zb.g7(zbVar, imageView2, concat, 0, 4, null);
            android.view.View p37 = holder.p(com.tencent.mm.R.id.ffc);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p37, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p38 = holder.p(com.tencent.mm.R.id.exx);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p38, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListItemConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uhVar = this;
        }
        int i27 = uhVar.f104706e;
        if (i27 == 2) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindLbsConfig recommendReason is empty:");
            java.lang.String recommendReason = finderObject.getRecommendReason();
            sb7.append((recommendReason == null || recommendReason.length() == 0) ? i19 : 0);
            sb7.append(",recommendReasonType:");
            sb7.append(finderObject.getRecommendReasonType());
            com.tencent.mars.xlog.Log.i("FinderFeedLiveListItemConvert", sb7.toString());
            java.lang.String recommendReason2 = finderObject.getRecommendReason();
            if (((recommendReason2 == null || recommendReason2.length() == 0) ? i19 : 0) == 0) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.cgz);
                android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.chb);
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483933ci4);
                java.lang.String recommendReason3 = finderObject.getRecommendReason();
                textView2.setText(recommendReason3 != null ? recommendReason3 : "");
                textView2.setVisibility(0);
                int recommendReasonType = finderObject.getRecommendReasonType();
                if (recommendReasonType != i19) {
                    switch (recommendReasonType) {
                        case 9:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_me, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                            imageView3.setVisibility(0);
                            break;
                        case 10:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_topic, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                            imageView3.setVisibility(0);
                            break;
                        case 11:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_sight, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                            imageView3.setVisibility(0);
                            break;
                        case 12:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_filled_fire, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                            imageView3.setVisibility(0);
                            break;
                        case 13:
                            linearLayout.setVisibility(0);
                            imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.finder_icons_filled_food, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                            imageView3.setVisibility(0);
                            break;
                        default:
                            linearLayout.setVisibility(8);
                            imageView3.setVisibility(8);
                            textView2.setVisibility(8);
                            break;
                    }
                } else {
                    linearLayout.setVisibility(0);
                    imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_location, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
                    imageView3.setVisibility(0);
                }
            }
        } else if (i27 == i19) {
            ((android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.cgz)).setVisibility(8);
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ger);
            textView3.setTextSize(i19, 10.0f);
            java.lang.String recommendReason4 = finderObject.getRecommendReason();
            if (((recommendReason4 == null || recommendReason4.length() == 0) ? i19 : 0) != 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView3.setText(finderObject.getRecommendReason());
            }
            com.tencent.mars.xlog.Log.i("FinderFeedLiveListItemConvert", "bindFriendConfig item:" + item);
        }
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListItemConvert", "[updateLiveList]onBindViewHolder holder:" + holder + " tabType:" + i27 + ",position:" + i17 + ",type:" + i18 + ',' + item);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
