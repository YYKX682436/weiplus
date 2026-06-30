package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class tp extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp f186173h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f186174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3r, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f186173h = data;
        this.f186174i = "Finder.FinderMsgFingerLikeConvert";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        java.lang.String str;
        so2.p3 item = (so2.p3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        dm.pd pdVar = item.f491944d;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f186174i, sb6.toString());
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        int i18 = pdVar.f66082x26b1b2e8;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i19 == 0 && (i18 & 1) == 0) {
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
        yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66112x830ccb);
        int i27 = this.f186173h.f185384a;
        android.content.Context context = holder.f374654e;
        if (i27 == 1 && ((int) pdVar.f66110xf8be237e) == 2 && !z18) {
            android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.i1v);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.i1y);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ju_)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epm));
        } else {
            android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.i1v);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p38, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p39 = holder.p(com.p314xaae8f345.mm.R.id.i1y);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p39, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p39.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p47 = holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p47, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p47.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p48 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p48, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p48).setLayerPaint(null);
        android.view.View p49 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p49, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p49).m82040x7541828(0);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.i1r);
        zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        zy2.o6 o6Var = new zy2.o6();
        java.lang.String field_content = pdVar.f66079xad49e234;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_content, "field_content");
        o6Var.f559045b = field_content;
        o6Var.f559046c = pdVar.f66092x4956d0f8 != 0;
        o6Var.f559044a = true;
        ((ht2.y0) s6Var).Bi(c22699x3dcdb352, textView, o6Var);
        y(holder, pdVar, 3);
        if (z18) {
            android.view.View p57 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(p57, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p57.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(p57, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar.f66116x38e2f75a)) {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str5 = pdVar.f66112x830ccb;
                ((ke0.e) xVar).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str5));
            } else {
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567533ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epv, pdVar.f66116x38e2f75a, pdVar.f66112x830ccb);
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
            }
        } else {
            android.view.View p58 = holder.p(com.p314xaae8f345.mm.R.id.lqv);
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(p58, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p58.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(p58, "com/tencent/mm/plugin/finder/convert/FinderMsgFingerLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFingerLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p59 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p59, "getView(...)");
        android.view.View p66 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p66, "getView(...)");
        A(pdVar, (android.widget.ImageView) p59, (android.widget.TextView) p66);
        android.view.View p67 = holder.p(com.p314xaae8f345.mm.R.id.jtj);
        if (p67 != null) {
            p67.setTag(com.p314xaae8f345.mm.R.id.e79, item.a());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = pdVar.f66071x3a790d90;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p67.setTag(com.p314xaae8f345.mm.R.id.e5k, str);
            java.lang.String str6 = pdVar.f66112x830ccb;
            if (str6 == null) {
                str6 = "";
            }
            p67.setTag(com.p314xaae8f345.mm.R.id.e77, str6);
            java.lang.String str7 = pdVar.f66116x38e2f75a;
            p67.setTag(com.p314xaae8f345.mm.R.id.e7f, str7 == null ? "" : str7);
        }
    }
}
