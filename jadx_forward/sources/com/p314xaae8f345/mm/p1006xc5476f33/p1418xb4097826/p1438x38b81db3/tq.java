package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public class tq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f186175h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.asd, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f186175h = "Finder.FinderMsgLikeRecommendConvert";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        so2.e4 item = (so2.e4) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String a17 = item.a();
        java.lang.String str2 = this.f186175h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str3 = item.f491944d.f66131xdec927b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" nickname ");
        java.lang.String str4 = item.f491944d.f66106x21f9b213;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(" url ");
        java.lang.String str5 = item.f491944d.f66093xa3f9e12a;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(" flag ");
        sb6.append(item.f491944d.f66082x26b1b2e8);
        sb6.append(" content ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(item.f491944d.f66079xad49e234));
        sb6.append(" id ");
        sb6.append(item.f491944d.f66095xc8a07680);
        sb6.append(" time ");
        sb6.append(item.f491944d.f66080xac3be4e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(item.f491944d.f66093xa3f9e12a, null, 2, null);
        int i18 = item.f491944d.f66082x26b1b2e8;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a18 = g1Var.a();
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
            a18.c(nVar, (android.widget.ImageView) p27, g1Var.h(mn2.f1.f411490h));
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f491944d.f66112x830ccb);
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.i1v);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.i1y);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p38, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p38.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p39 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p39, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p39).setLayerPaint(null);
        android.view.View p47 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p47, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p47).m82040x7541828(0);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.i1r);
        zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        zy2.o6 o6Var = new zy2.o6();
        java.lang.String field_content = item.f491944d.f66079xad49e234;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_content, "field_content");
        o6Var.f559045b = field_content;
        o6Var.f559046c = item.f491944d.f66092x4956d0f8 != 0;
        o6Var.f559044a = true;
        o6Var.f559048e = true;
        ((ht2.y0) s6Var).Bi(c22699x3dcdb352, textView, o6Var);
        if (z18) {
            android.view.View p48 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p48, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.p(com.p314xaae8f345.mm.R.id.f8t).setBackgroundColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f491944d.f66116x38e2f75a)) {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = holder.f374654e;
                java.lang.String str6 = item.f491944d.f66112x830ccb;
                ((ke0.e) xVar).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str6));
            } else {
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = holder.f374654e;
                dm.pd pdVar = item.f491944d;
                java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epv, pdVar.f66116x38e2f75a, pdVar.f66112x830ccb);
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, string));
            }
        } else {
            android.view.View p49 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p49, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p49.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dm.pd pdVar2 = item.f491944d;
        android.view.View p57 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p57, "getView(...)");
        android.view.View p58 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p58, "getView(...)");
        A(pdVar2, (android.widget.ImageView) p57, (android.widget.TextView) p58);
        android.view.View p59 = holder.p(com.p314xaae8f345.mm.R.id.jtj);
        if (p59 != null) {
            p59.setTag(com.p314xaae8f345.mm.R.id.e79, a17);
            dm.pd pdVar3 = item.f491944d;
            if (pdVar3 == null || (c19782x23db1cfa = pdVar3.f66071x3a790d90) == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p59.setTag(com.p314xaae8f345.mm.R.id.e5k, str);
            dm.pd pdVar4 = item.f491944d;
            java.lang.String str7 = pdVar4 != null ? pdVar4.f66112x830ccb : null;
            if (str7 == null) {
                str7 = "";
            }
            p59.setTag(com.p314xaae8f345.mm.R.id.e77, str7);
            dm.pd pdVar5 = item.f491944d;
            java.lang.String str8 = pdVar5 != null ? pdVar5.f66116x38e2f75a : null;
            p59.setTag(com.p314xaae8f345.mm.R.id.e7f, str8 != null ? str8 : "");
        }
    }
}
