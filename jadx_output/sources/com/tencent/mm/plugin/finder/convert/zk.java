package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class zk extends com.tencent.mm.plugin.finder.convert.ck {

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f105119q;

    public /* synthetic */ zk(int i17, tu2.b bVar, yz5.r rVar, yz5.a aVar, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? -1 : i17, (i18 & 2) != 0 ? new tu2.b() : bVar, (i18 & 4) != 0 ? null : rVar, (i18 & 8) != 0 ? null : aVar);
    }

    @Override // in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        tu2.b bVar;
        int i19;
        mn2.g1 g1Var;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.mb4 mb4Var = item.getFeedObject().isLiveFeed() ? (r45.mb4) kz5.n0.X(item.getFeedObject().getLiveMediaList()) : (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
        if (mb4Var == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int intValue = ((java.lang.Number) ((jz5.n) this.f105119q).getValue()).intValue();
        android.content.Context context = holder.f293121e;
        int dimension = (intValue - ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9))) / 2;
        int a17 = bu2.z.a(bu2.z.g(mb4Var), dimension, item.getFeedObject().isLiveFeed());
        if (a17 > 0) {
            layoutParams.width = dimension;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
        }
        holder.itemView.setTag(com.tencent.mm.R.id.teh, 0L);
        holder.itemView.setTag(com.tencent.mm.R.id.tei, "");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16));
        mn2.g1 g1Var2 = mn2.g1.f329975a;
        tu2.b bVar2 = this.f103063f;
        if (K0) {
            bVar = bVar2;
            i19 = 16;
            wo0.c a18 = g1Var2.e().a(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null));
            g1Var = g1Var2;
            a18.g(g1Var.h(bVar.f422133c ? mn2.f1.E : mn2.f1.B));
            a18.f447873d = new com.tencent.mm.plugin.finder.convert.uk(holder, mb4Var);
            a18.c(imageView);
        } else {
            bVar = bVar2;
            i19 = 16;
            g1Var = g1Var2;
            wo0.c a19 = g1Var.e().a(new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null));
            a19.g(g1Var.h(bVar.f422133c ? mn2.f1.E : mn2.f1.B));
            a19.f447873d = new com.tencent.mm.plugin.finder.convert.vk(holder, mb4Var);
            a19.c(imageView);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        java.lang.String string = mb4Var.getString(i19);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = mb4Var.getString(20);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String concat = string.concat(string2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            if (string3 == null) {
                string3 = "";
            }
            sb6.append(string3);
            concat = sb6.toString();
        }
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) holder.p(com.tencent.mm.R.id.f98);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ffc);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        int i27 = 0;
        if (item.getFeedObject().isLiveFeed()) {
            r45.nw1 liveInfo = item.getFeedObject().getLiveInfo();
            if (liveInfo != null && liveInfo.getInteger(2) == 1) {
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(concat, com.tencent.mm.plugin.finder.storage.y90.f128355e);
                kotlin.jvm.internal.o.d(imageView2);
                e17.c(q3Var, imageView2, g1Var.h(bVar.f422133c ? mn2.f1.E : mn2.f1.B));
                finderLiveOnliveWidget.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            } else {
                i95.m c17 = i95.n0.c(c61.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                kotlin.jvm.internal.o.d(imageView2);
                c61.zb.g7((c61.zb) c17, imageView2, concat, 0, 4, null);
                finderLiveOnliveWidget.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            finderLiveOnliveWidget.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        n(holder, item);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mediaType:");
        sb7.append(item.getFeedObject().getMediaType());
        sb7.append(",liveStatus:");
        r45.nw1 liveInfo2 = item.getFeedObject().getLiveInfo();
        sb7.append(liveInfo2 != null ? java.lang.Integer.valueOf(liveInfo2.getInteger(2)) : null);
        sb7.append(",contact liveStatus:");
        com.tencent.mm.protocal.protobuf.FinderContact refObjectContact = item.getFeedObject().getRefObjectContact();
        sb7.append(refObjectContact != null ? java.lang.Integer.valueOf(refObjectContact.getLiveStatus()) : null);
        com.tencent.mars.xlog.Log.i("FinderFeedVideoRoundCornerConvert", sb7.toString());
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        kotlin.jvm.internal.o.d(textView4);
        com.tencent.mm.ui.fk.a(textView4);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.e0b);
        if (p18 != null) {
            java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
            if (text == null) {
                text = "";
            }
            p18.setTag(com.tencent.mm.R.id.e79, text);
            ya2.b2 contact = item.getContact();
            if (contact != null && (finderAuthInfo = contact.field_authInfo) != null) {
                i27 = finderAuthInfo.getAuthIconType();
            }
            p18.setTag(com.tencent.mm.R.id.e5i, java.lang.Integer.valueOf(i27));
            java.lang.CharSequence text2 = textView3 != null ? textView3.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            p18.setTag(com.tencent.mm.R.id.f484408e61, text2);
            java.lang.CharSequence text3 = textView4.getText();
            p18.setTag(com.tencent.mm.R.id.e5o, text3 != null ? text3 : "");
            p18.setTag(com.tencent.mm.R.id.f484416e73, java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        }
        if (bVar.f422133c) {
            int color = context.getResources().getColor(com.tencent.mm.R.color.f478518a0);
            int color2 = context.getResources().getColor(com.tencent.mm.R.color.f479255u7);
            android.view.View p19 = holder.p(com.tencent.mm.R.id.f484870fs4);
            if (p19 != null) {
                p19.setBackgroundColor(color);
            }
            android.view.View p27 = holder.p(com.tencent.mm.R.id.lb6);
            if (p27 != null) {
                p27.setBackgroundColor(color);
            }
            android.view.View p28 = holder.p(com.tencent.mm.R.id.l96);
            if (p28 != null) {
                p28.setBackgroundColor(color);
            }
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
            if (textView5 != null) {
                textView5.setTextColor(color2);
            }
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
            if (textView6 != null) {
                textView6.setTextColor(color2);
            }
            android.widget.TextView textView7 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fwn);
            if (textView7 != null) {
                textView7.setTextColor(color2);
            }
            android.widget.TextView textView8 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fvz);
            if (textView8 != null) {
                textView8.setTextColor(color2);
            }
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) holder.p(com.tencent.mm.R.id.h9l);
            if (imageIndicatorView != null) {
                imageIndicatorView.setBackgroundColor(color);
            }
        }
    }

    public final void y(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = item.getFeedObject().getFeedObject().getObjectDesc();
        int videoDuration = (objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) ? 0 : finderMedia.getVideoDuration();
        if (videoDuration <= 0) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.dzj);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.dzj);
        if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(com.tencent.mm.plugin.finder.assist.w2.c(videoDuration));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(int i17, tu2.b itemViewConfig, yz5.r rVar, yz5.a aVar) {
        super(com.tencent.mm.R.layout.aia, itemViewConfig, i17, rVar, aVar);
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f105119q = jz5.h.b(com.tencent.mm.plugin.finder.convert.wk.f104880d);
    }
}
