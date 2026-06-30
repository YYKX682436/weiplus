package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class zk extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck {

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f186652q;

    public /* synthetic */ zk(int i17, tu2.b bVar, yz5.r rVar, yz5.a aVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? -1 : i17, (i18 & 2) != 0 ? new tu2.b() : bVar, (i18 & 4) != 0 ? null : rVar, (i18 & 8) != 0 ? null : aVar);
    }

    @Override // in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        tu2.b bVar;
        int i19;
        mn2.g1 g1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.mb4 mb4Var = item.getFeedObject().m59311x25315bf4() ? (r45.mb4) kz5.n0.X(item.getFeedObject().m59259x7dea7760()) : (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        if (mb4Var == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int intValue = ((java.lang.Number) ((jz5.n) this.f186652q).mo141623x754a37bb()).intValue();
        android.content.Context context = holder.f374654e;
        int dimension = (intValue - ((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9))) / 2;
        int a17 = bu2.z.a(bu2.z.g(mb4Var), dimension, item.getFeedObject().m59311x25315bf4());
        if (a17 > 0) {
            layoutParams.width = dimension;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
        }
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.teh, 0L);
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tei, "");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16));
        mn2.g1 g1Var2 = mn2.g1.f411508a;
        tu2.b bVar2 = this.f184596f;
        if (K0) {
            bVar = bVar2;
            i19 = 16;
            wo0.c a18 = g1Var2.e().a(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null));
            g1Var = g1Var2;
            a18.g(g1Var.h(bVar.f503666c ? mn2.f1.E : mn2.f1.B));
            a18.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uk(holder, mb4Var);
            a18.c(imageView);
        } else {
            bVar = bVar2;
            i19 = 16;
            g1Var = g1Var2;
            wo0.c a19 = g1Var.e().a(new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null));
            a19.g(g1Var.h(bVar.f503666c ? mn2.f1.E : mn2.f1.B));
            a19.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vk(holder, mb4Var);
            a19.c(imageView);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f568828o70);
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(i19);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            sb6.append(m75945x2fec83073);
            concat = sb6.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) holder.p(com.p314xaae8f345.mm.R.id.f98);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ffc);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
        int i27 = 0;
        if (item.getFeedObject().m59311x25315bf4()) {
            r45.nw1 m59258xd0557130 = item.getFeedObject().m59258xd0557130();
            if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(concat, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                e17.c(q3Var, imageView2, g1Var.h(bVar.f503666c ? mn2.f1.E : mn2.f1.B));
                c15315xe70278e1.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            } else {
                i95.m c17 = i95.n0.c(c61.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                c61.zb.g7((c61.zb) c17, imageView2, concat, 0, 4, null);
                c15315xe70278e1.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            c15315xe70278e1.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
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
        r45.nw1 m59258xd05571302 = item.getFeedObject().m59258xd0557130();
        sb7.append(m59258xd05571302 != null ? java.lang.Integer.valueOf(m59258xd05571302.m75939xb282bd08(2)) : null);
        sb7.append(",contact liveStatus:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m59285x25476984 = item.getFeedObject().m59285x25476984();
        sb7.append(m59285x25476984 != null ? java.lang.Integer.valueOf(m59285x25476984.m76177x2220c3f4()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedVideoRoundCornerConvert", sb7.toString());
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.i1g);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
        com.p314xaae8f345.mm.ui.fk.a(textView4);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.e0b);
        if (p18 != null) {
            java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
            if (text == null) {
                text = "";
            }
            p18.setTag(com.p314xaae8f345.mm.R.id.e79, text);
            ya2.b2 contact = item.getContact();
            if (contact != null && (c19780xceb4c4dc = contact.f69300x731cac1b) != null) {
                i27 = c19780xceb4c4dc.m76027x1cbb0791();
            }
            p18.setTag(com.p314xaae8f345.mm.R.id.e5i, java.lang.Integer.valueOf(i27));
            java.lang.CharSequence text2 = textView3 != null ? textView3.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            p18.setTag(com.p314xaae8f345.mm.R.id.f565941e61, text2);
            java.lang.CharSequence text3 = textView4.getText();
            p18.setTag(com.p314xaae8f345.mm.R.id.e5o, text3 != null ? text3 : "");
            p18.setTag(com.p314xaae8f345.mm.R.id.f565949e73, java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        }
        if (bVar.f503666c) {
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0);
            int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560788u7);
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.f566403fs4);
            if (p19 != null) {
                p19.setBackgroundColor(color);
            }
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.lb6);
            if (p27 != null) {
                p27.setBackgroundColor(color);
            }
            android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.l96);
            if (p28 != null) {
                p28.setBackgroundColor(color);
            }
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
            if (textView5 != null) {
                textView5.setTextColor(color2);
            }
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
            if (textView6 != null) {
                textView6.setTextColor(color2);
            }
            android.widget.TextView textView7 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fwn);
            if (textView7 != null) {
                textView7.setTextColor(color2);
            }
            android.widget.TextView textView8 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fvz);
            if (textView8 != null) {
                textView8.setTextColor(color2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 c18393x3e165bd9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) holder.p(com.p314xaae8f345.mm.R.id.h9l);
            if (c18393x3e165bd9 != null) {
                c18393x3e165bd9.setBackgroundColor(color);
            }
        }
    }

    public final void y(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = item.getFeedObject().getFeedObject().m76802x2dd01666();
        int m76629x36bbd779 = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) ? 0 : c19788xd7cfd73e.m76629x36bbd779();
        if (m76629x36bbd779 <= 0) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.dzj);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.dzj);
        if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.c(m76629x36bbd779));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(int i17, tu2.b itemViewConfig, yz5.r rVar, yz5.a aVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.aia, itemViewConfig, i17, rVar, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemViewConfig, "itemViewConfig");
        this.f186652q = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wk.f186413d);
    }
}
