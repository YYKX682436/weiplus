package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public abstract class ix extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck {

    /* renamed from: q, reason: collision with root package name */
    public final int f185236q;

    public ix() {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.aia, null, 0, null, null, 30, null);
        int i17;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z17 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        this.f185236q = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck
    /* renamed from: q */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.mb4 mb4Var = item.getFeedObject().m59311x25315bf4() ? (r45.mb4) kz5.n0.X(item.getFeedObject().m59259x7dea7760()) : (r45.mb4) kz5.n0.X(item.getFeedObject().m59264x7efe73ec());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int dimension = (this.f185236q - ((int) holder.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9))) / 2;
        int a17 = bu2.z.a(bu2.z.g(mb4Var), dimension, item.getFeedObject().m59311x25315bf4());
        if (a17 > 0) {
            layoutParams.width = dimension;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16));
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (K0) {
            g1Var.e().c(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView, g1Var.h(mn2.f1.f411486d));
        } else {
            g1Var.e().c(new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), imageView, g1Var.h(mn2.f1.f411486d));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f568828o70);
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(1);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            java.lang.String m75945x2fec83074 = mb4Var.m75945x2fec8307(19);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            str = m75945x2fec83073.concat(m75945x2fec83074);
        } else {
            str = concat;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) holder.p(com.p314xaae8f345.mm.R.id.f98);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ffc);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
        int i19 = 0;
        if (item.getFeedObject().m59311x25315bf4()) {
            r45.nw1 m59258xd0557130 = item.getFeedObject().m59258xd0557130();
            if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                e17.c(q3Var, imageView2, g1Var.h(mn2.f1.f411486d));
                c15315xe70278e1.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            } else {
                i95.m c17 = i95.n0.c(c61.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                c61.zb.g7((c61.zb) c17, imageView2, str, 0, 4, null);
                c15315xe70278e1.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            c15315xe70278e1.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaType:");
        sb6.append(item.getFeedObject().getMediaType());
        sb6.append(",liveStatus:");
        r45.nw1 m59258xd05571302 = item.getFeedObject().m59258xd0557130();
        sb6.append(m59258xd05571302 != null ? java.lang.Integer.valueOf(m59258xd05571302.m75939xb282bd08(2)) : null);
        sb6.append(",contact liveStatus:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m59285x25476984 = item.getFeedObject().m59285x25476984();
        sb6.append(m59285x25476984 != null ? java.lang.Integer.valueOf(m59285x25476984.m76177x2220c3f4()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedVideoRoundCornerConvert", sb6.toString());
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.i1g);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
        if (textView4 != null) {
            textView4.setMaxLines(2);
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.e0b);
        if (p18 != null) {
            java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
            if (text == null) {
                text = "";
            }
            p18.setTag(com.p314xaae8f345.mm.R.id.e79, text);
            ya2.b2 contact = item.getContact();
            if (contact != null && (c19780xceb4c4dc = contact.f69300x731cac1b) != null) {
                i19 = c19780xceb4c4dc.m76027x1cbb0791();
            }
            p18.setTag(com.p314xaae8f345.mm.R.id.e5i, java.lang.Integer.valueOf(i19));
            java.lang.CharSequence text2 = textView3 != null ? textView3.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            p18.setTag(com.p314xaae8f345.mm.R.id.f565941e61, text2);
            java.lang.CharSequence text3 = textView4 != null ? textView4.getText() : null;
            p18.setTag(com.p314xaae8f345.mm.R.id.e5o, text3 != null ? text3 : "");
            p18.setTag(com.p314xaae8f345.mm.R.id.f565949e73, java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        }
    }
}
