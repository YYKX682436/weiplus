package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class dq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp f184704h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f184705i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3p, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f184704h = data;
        this.f184705i = "Finder.FinderMsgFriendObjectLikeLikeConvert";
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
        so2.v3 item = (so2.v3) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = this.f184705i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str2 = item.f491944d.f66131xdec927b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(" nickname ");
        java.lang.String str3 = item.f491944d.f66106x21f9b213;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" url ");
        java.lang.String str4 = item.f491944d.f66093xa3f9e12a;
        sb6.append(str4 != null ? str4 : "");
        sb6.append(" flag ");
        sb6.append(item.f491944d.f66082x26b1b2e8);
        sb6.append(" content ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(item.f491944d.f66079xad49e234));
        sb6.append(" id ");
        sb6.append(item.f491944d.f66095xc8a07680);
        sb6.append(" time ");
        sb6.append(item.f491944d.f66080xac3be4e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i18 = 8;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(item.f491944d.f66093xa3f9e12a, null, 2, null);
        int i19 = item.f491944d.f66082x26b1b2e8;
        int i27 = i19 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i27 == 0 && (i19 & 1) == 0) {
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
        if (this.f184704h.f185384a == 1) {
            android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.i1s);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.bm2 e17 = cu2.f0.f303924a.e((int) item.f491944d.f66110xf8be237e);
            if (e17 != null) {
                java.lang.String m75945x2fec8307 = e17.m75945x2fec8307(10);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    vo0.d e18 = g1Var.e();
                    mn2.q3 q3Var = new mn2.q3(e17.m75945x2fec8307(10), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
                    android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p38, "getView(...)");
                    e18.c(q3Var, (android.widget.ImageView) p38, g1Var.h(mn2.f1.f411486d));
                    ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.i1r)).setColorFilter(i65.a.d(holder.f374654e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), android.graphics.PorterDuff.Mode.SRC_ATOP);
                }
            }
            android.view.View p39 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p39, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            android.content.Context context = holder.f374654e;
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p39).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79562xfeb10c8c, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            android.view.View p47 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p47, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p47).m82040x7541828(i65.a.d(holder.f374654e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else {
            android.view.View p48 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p48, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p49 = holder.p(com.p314xaae8f345.mm.R.id.i1r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p49, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) p49).m82040x7541828(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            android.view.View p57 = holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p57, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p57.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p57, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2)).setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eph));
            android.view.View p58 = holder.p(com.p314xaae8f345.mm.R.id.i1s);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p58, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p58.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p58, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dm.pd pdVar = item.f491944d;
        android.view.View p59 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p59, "getView(...)");
        android.view.View p66 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p66, "getView(...)");
        A(pdVar, (android.widget.ImageView) p59, (android.widget.TextView) p66);
        android.view.View p67 = holder.p(com.p314xaae8f345.mm.R.id.gah);
        if (p67 == null) {
            return;
        }
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P0().r()).intValue() == 1) {
            r45.t64 t64Var = item.f491944d.f66101x5f78ee8a;
            if ((t64Var != null ? t64Var.m75939xb282bd08(2) : 0) > 0) {
                i18 = 0;
            }
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(p67, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p67.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(p67, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
