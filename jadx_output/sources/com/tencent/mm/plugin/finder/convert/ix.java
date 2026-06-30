package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public abstract class ix extends com.tencent.mm.plugin.finder.convert.ck {

    /* renamed from: q, reason: collision with root package name */
    public final int f103703q;

    public ix() {
        super(com.tencent.mm.R.layout.aia, null, 0, null, null, 30, null);
        int i17;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        this.f103703q = i18;
    }

    @Override // com.tencent.mm.plugin.finder.convert.ck
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.mb4 mb4Var = item.getFeedObject().isLiveFeed() ? (r45.mb4) kz5.n0.X(item.getFeedObject().getLiveMediaList()) : (r45.mb4) kz5.n0.X(item.getFeedObject().getMediaList());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int dimension = (this.f103703q - ((int) holder.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9))) / 2;
        int a17 = bu2.z.a(bu2.z.g(mb4Var), dimension, item.getFeedObject().isLiveFeed());
        if (a17 > 0) {
            layoutParams.width = dimension;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16));
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (K0) {
            g1Var.e().c(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.f329953d));
        } else {
            g1Var.e().c(new mn2.r3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), imageView, g1Var.h(mn2.f1.f329953d));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        java.lang.String string = mb4Var.getString(16);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = mb4Var.getString(20);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String concat = string.concat(string2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            java.lang.String string3 = mb4Var.getString(1);
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String string4 = mb4Var.getString(19);
            if (string4 == null) {
                string4 = "";
            }
            str = string3.concat(string4);
        } else {
            str = concat;
        }
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) holder.p(com.tencent.mm.R.id.f98);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ffc);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        int i19 = 0;
        if (item.getFeedObject().isLiveFeed()) {
            r45.nw1 liveInfo = item.getFeedObject().getLiveInfo();
            if (liveInfo != null && liveInfo.getInteger(2) == 1) {
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e);
                kotlin.jvm.internal.o.d(imageView2);
                e17.c(q3Var, imageView2, g1Var.h(mn2.f1.f329953d));
                finderLiveOnliveWidget.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            } else {
                i95.m c17 = i95.n0.c(c61.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                kotlin.jvm.internal.o.d(imageView2);
                c61.zb.g7((c61.zb) c17, imageView2, str, 0, 4, null);
                finderLiveOnliveWidget.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            finderLiveOnliveWidget.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaType:");
        sb6.append(item.getFeedObject().getMediaType());
        sb6.append(",liveStatus:");
        r45.nw1 liveInfo2 = item.getFeedObject().getLiveInfo();
        sb6.append(liveInfo2 != null ? java.lang.Integer.valueOf(liveInfo2.getInteger(2)) : null);
        sb6.append(",contact liveStatus:");
        com.tencent.mm.protocal.protobuf.FinderContact refObjectContact = item.getFeedObject().getRefObjectContact();
        sb6.append(refObjectContact != null ? java.lang.Integer.valueOf(refObjectContact.getLiveStatus()) : null);
        com.tencent.mars.xlog.Log.i("FinderFeedVideoRoundCornerConvert", sb6.toString());
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        if (textView4 != null) {
            textView4.setMaxLines(2);
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.e0b);
        if (p18 != null) {
            java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
            if (text == null) {
                text = "";
            }
            p18.setTag(com.tencent.mm.R.id.e79, text);
            ya2.b2 contact = item.getContact();
            if (contact != null && (finderAuthInfo = contact.field_authInfo) != null) {
                i19 = finderAuthInfo.getAuthIconType();
            }
            p18.setTag(com.tencent.mm.R.id.e5i, java.lang.Integer.valueOf(i19));
            java.lang.CharSequence text2 = textView3 != null ? textView3.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            p18.setTag(com.tencent.mm.R.id.f484408e61, text2);
            java.lang.CharSequence text3 = textView4 != null ? textView4.getText() : null;
            p18.setTag(com.tencent.mm.R.id.e5o, text3 != null ? text3 : "");
            p18.setTag(com.tencent.mm.R.id.f484416e73, java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        }
    }
}
