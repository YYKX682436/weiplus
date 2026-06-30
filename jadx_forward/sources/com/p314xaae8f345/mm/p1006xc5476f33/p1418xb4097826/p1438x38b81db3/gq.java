package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public class gq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp f185041h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f185042i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3r, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f185041h = data;
        this.f185042i = "Finder.FinderMsgLikeConvert";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.gai);
        if (textView != null) {
            d92.f.f309003a.l(textView, 12.0f, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        int i18;
        java.lang.String str;
        int i19;
        so2.y3 item = (so2.y3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        dm.pd pdVar = item.f491944d;
        y(holder, pdVar, 2);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f185042i, sb6.toString());
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        int i27 = pdVar.f66082x26b1b2e8;
        int i28 = i27 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i28 == 0 && (i27 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p27, g1Var.h(mn2.f1.f411490h));
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66112x830ccb);
        int i29 = this.f185041h.f185384a;
        android.content.Context context = holder.f374654e;
        if (i29 == 1 && ((int) pdVar.f66110xf8be237e) == 2 && !z18) {
            android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.i1v);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.i1y);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ju_)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epm));
        } else {
            android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.i1v);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p38, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p39 = holder.p(com.p314xaae8f345.mm.R.id.i1y);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p39, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p39.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p47 = holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p47, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p47.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.i1r);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        r45.bm2 e17 = cu2.f0.f303924a.e((int) pdVar.f66110xf8be237e);
        c22699x3dcdb352.setLayerPaint(null);
        c22699x3dcdb352.m82040x7541828(0);
        if (z18) {
            java.lang.String str5 = pdVar.f66079xad49e234;
            if (str5 == null || str5.length() == 0) {
                i18 = 8;
                c22699x3dcdb352.setVisibility(0);
                textView.setVisibility(8);
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
                c22699x3dcdb352.m82040x7541828(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            } else {
                i18 = 8;
                c22699x3dcdb352.setVisibility(8);
                textView.setVisibility(0);
                i95.m c17 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.s6 s6Var = (zy2.s6) c17;
                java.lang.String field_content = pdVar.f66079xad49e234;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_content, "field_content");
                textView.setText(zy2.s6.l6(s6Var, field_content, (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs), false, null, 0, false, null, 124, null));
            }
        } else {
            i18 = 8;
            zy2.s6 s6Var2 = (zy2.s6) i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            zy2.o6 o6Var = new zy2.o6();
            o6Var.f559047d = e17;
            o6Var.f559046c = pdVar.f66092x4956d0f8 != 0;
            java.lang.String field_content2 = pdVar.f66079xad49e234;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_content2, "field_content");
            o6Var.f559045b = field_content2;
            ((ht2.y0) s6Var2).Bi(c22699x3dcdb352, textView, o6Var);
        }
        if (z18) {
            android.view.View p48 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(p48, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66116x38e2f75a)) {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str6 = pdVar.f66112x830ccb;
                ((ke0.e) xVar).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str6));
            } else {
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epv, pdVar.f66116x38e2f75a, pdVar.f66112x830ccb);
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
            }
        } else {
            android.view.View p49 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(p49, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p49.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p57 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p57, "getView(...)");
        android.view.View p58 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p58, "getView(...)");
        A(pdVar, (android.widget.ImageView) p57, (android.widget.TextView) p58);
        android.view.View p59 = holder.p(com.p314xaae8f345.mm.R.id.gah);
        if (p59 != null) {
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P0().r()).intValue() == 1) {
                r45.t64 t64Var = pdVar.f66101x5f78ee8a;
                if ((t64Var != null ? t64Var.m75939xb282bd08(2) : 0) > 0) {
                    i19 = 0;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(p59, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p59.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(p59, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            i19 = i18;
            java.util.ArrayList arrayList112 = new java.util.ArrayList();
            arrayList112.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList112);
            yj0.a.d(p59, arrayList112.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p59.setVisibility(((java.lang.Integer) arrayList112.get(0)).intValue());
            yj0.a.f(p59, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p66 = holder.p(com.p314xaae8f345.mm.R.id.jtj);
        if (p66 != null) {
            p66.setTag(com.p314xaae8f345.mm.R.id.e79, item.a());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = pdVar.f66071x3a790d90;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p66.setTag(com.p314xaae8f345.mm.R.id.e5k, str);
            java.lang.String str7 = pdVar.f66112x830ccb;
            if (str7 == null) {
                str7 = "";
            }
            p66.setTag(com.p314xaae8f345.mm.R.id.e77, str7);
            java.lang.String str8 = pdVar.f66116x38e2f75a;
            p66.setTag(com.p314xaae8f345.mm.R.id.e7f, str8 != null ? str8 : "");
        }
    }
}
