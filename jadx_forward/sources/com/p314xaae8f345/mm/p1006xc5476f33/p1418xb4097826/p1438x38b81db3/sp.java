package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class sp extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e7t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        so2.o3 item = (so2.o3) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15372x3f906e75 c15372x3f906e75 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15372x3f906e75) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        dm.pd pdVar = item.f491944d;
        c15372x3f906e75.m62459xe9e3a728(pdVar);
        java.lang.CharSequence f213058i = c15372x3f906e75.getF213058i();
        if ((f213058i == null || f213058i.length() == 0) == true) {
            c15372x3f906e75.setVisibility(8);
        } else {
            c15372x3f906e75.setVisibility(0);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66112x830ccb);
        android.content.Context context = holder.f374654e;
        if (K0) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66116x38e2f75a)) {
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = pdVar.f66112x830ccb;
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epv, pdVar.f66116x38e2f75a, pdVar.f66112x830ccb);
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
            }
        }
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) p19;
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
        android.widget.TextView textView3 = (android.widget.TextView) p27;
        textView3.setVisibility(8);
        java.lang.String l17 = pdVar.l();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            imageView.setVisibility(8);
            if (pdVar.f66103x1a330c39 == 1) {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = textView3.getContext();
                java.lang.String str3 = pdVar.f66081x4f4dc37;
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, str3));
                textView3.setVisibility(0);
            }
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(l17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411496q));
            imageView.setVisibility(0);
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.jtg);
        if (p28 != null) {
            p28.setTag(com.p314xaae8f345.mm.R.id.e79, item.a());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = pdVar.f66071x3a790d90;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p28.setTag(com.p314xaae8f345.mm.R.id.e5k, str);
            java.lang.String str4 = pdVar.f66079xad49e234;
            if (str4 == null) {
                str4 = "";
            }
            p28.setTag(com.p314xaae8f345.mm.R.id.f565951e75, str4);
            java.lang.String str5 = pdVar.f66112x830ccb;
            if (str5 == null) {
                str5 = "";
            }
            p28.setTag(com.p314xaae8f345.mm.R.id.e77, str5);
            java.lang.String str6 = pdVar.f66116x38e2f75a;
            p28.setTag(com.p314xaae8f345.mm.R.id.e7f, str6 != null ? str6 : "");
        }
        java.lang.String n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.n(context, pdVar.f66080xac3be4e * 1000);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o7z);
        if (textView4 != null) {
            textView4.setVisibility(0);
            textView4.setText(n17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "finder_history_comment_item");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.f3639x46306858;
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("commentid", pm0.v.u(pdVar.f66076x418206d5));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(pdVar.f66108x2327e25f));
        lVarArr[2] = new jz5.l("is_reply_comment", java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66112x830ccb) ? 1 : 0));
        lVarArr[3] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[4] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(holder.f3639x46306858, 40, 1, false);
        int i19 = pdVar.f66075xb4d0aad9;
        r45.e60 e60Var = pdVar.f66074xb4cb804d;
        boolean z18 = pm0.v.z(pdVar.f66082x26b1b2e8, 256);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
        c14727x5e078d.b(holder, pdVar.f66076x418206d5, pdVar.f66108x2327e25f, i19, e60Var, z18);
        c14727x5e078d.c(holder, pdVar.f66076x418206d5, pdVar.f66108x2327e25f, i19, e60Var, z18);
    }
}
