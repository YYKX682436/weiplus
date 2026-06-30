package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class jp extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp f185303h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f185304i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.p f185305m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f185306n;

    public /* synthetic */ jp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp kpVar, yz5.l lVar, yz5.p pVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(kpVar, (i17 & 2) != 0 ? null : lVar, (i17 & 4) != 0 ? null : pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.S0().r()).intValue() == 1) goto L29;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yw
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r19, so2.o3 r20, int r21, int r22, boolean r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp.h(in5.s0, so2.o3, int, int, boolean, java.util.List):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        java.lang.String str;
        so2.o3 item = (so2.o3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        dm.pd pdVar = item.f491944d;
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str2 = pdVar.f66131xdec927b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(" nickname ");
        java.lang.String str3 = pdVar.f66106x21f9b213;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" url ");
        java.lang.String str4 = pdVar.f66093xa3f9e12a;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(" flag ");
        sb6.append(pdVar.f66082x26b1b2e8);
        sb6.append(" content ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(pdVar.f66079xad49e234));
        sb6.append(" id ");
        sb6.append(pdVar.f66095xc8a07680);
        sb6.append(" time ");
        sb6.append(pdVar.f66080xac3be4e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f185306n, sb6.toString());
        int i18 = pdVar.f66082x26b1b2e8;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f411490h));
        }
        int i27 = pdVar.f66075xb4d0aad9;
        r45.e60 e60Var = pdVar.f66074xb4cb804d;
        boolean z18 = pm0.v.z(pdVar.f66082x26b1b2e8, 256);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
        c14727x5e078d.b(holder, pdVar.f66076x418206d5, pdVar.f66108x2327e25f, i27, e60Var, z18);
        c14727x5e078d.c(holder, pdVar.f66076x418206d5, pdVar.f66108x2327e25f, i27, e60Var, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15372x3f906e75 c15372x3f906e75 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15372x3f906e75) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        c15372x3f906e75.m62459xe9e3a728(pdVar);
        java.lang.CharSequence f213058i = c15372x3f906e75.getF213058i();
        if (f213058i == null || f213058i.length() == 0) {
            c15372x3f906e75.setVisibility(8);
        } else {
            c15372x3f906e75.setVisibility(0);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66112x830ccb);
        android.content.Context context = holder.f374654e;
        if (K0) {
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66116x38e2f75a)) {
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str5 = pdVar.f66112x830ccb;
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str5));
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epv, pdVar.f66116x38e2f75a, pdVar.f66112x830ccb);
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
            }
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p28, "getView(...)");
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p29, "getView(...)");
        A(pdVar, (android.widget.ImageView) p28, (android.widget.TextView) p29);
        android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.jtg);
        if (p37 != null) {
            p37.setTag(com.p314xaae8f345.mm.R.id.e79, item.a());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = pdVar.f66071x3a790d90;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p37.setTag(com.p314xaae8f345.mm.R.id.e5k, str);
            java.lang.String str6 = pdVar.f66079xad49e234;
            if (str6 == null) {
                str6 = "";
            }
            p37.setTag(com.p314xaae8f345.mm.R.id.f565951e75, str6);
            java.lang.String str7 = pdVar.f66112x830ccb;
            if (str7 == null) {
                str7 = "";
            }
            p37.setTag(com.p314xaae8f345.mm.R.id.e77, str7);
            java.lang.String str8 = pdVar.f66116x38e2f75a;
            p37.setTag(com.p314xaae8f345.mm.R.id.e7f, str8 != null ? str8 : "");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f3639x46306858, "message_center_comment_tab_comment_item");
        aVar.Tj(holder.f3639x46306858, 40, 1, false);
        aVar.gk(holder.f3639x46306858, kz5.c1.l(new jz5.l("account_finder_username", xy2.c.e(context)), new jz5.l("feed_id", pm0.v.u(pdVar.f66108x2327e25f)), new jz5.l("comment_id", pm0.v.u(pdVar.f66076x418206d5)), new jz5.l("comment_content_type", java.lang.Integer.valueOf(pdVar.f66075xb4d0aad9)), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data, yz5.l lVar, yz5.p pVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3k, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f185303h = data;
        this.f185304i = lVar;
        this.f185305m = pVar;
        this.f185306n = "Finder.FinderMsgCommentConvert";
    }
}
