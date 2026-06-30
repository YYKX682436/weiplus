package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class eq extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f103281h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.b3q, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103281h = "Finder.FinderMsgFriendObjectRecommendLikeConvert";
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gai);
        if (textView != null) {
            d92.f.f227470a.l(textView, 12.0f, false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        boolean z17;
        int i18;
        java.lang.String nickname;
        so2.w3 item = (so2.w3) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        dm.pd pdVar = item.f410411d;
        java.lang.String str = pdVar.field_username;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(" nickname ");
        java.lang.String str3 = pdVar.field_nickname;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" url ");
        java.lang.String str4 = pdVar.field_headUrl;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(" flag ");
        sb6.append(pdVar.field_extFlag);
        sb6.append(" content ");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.G1(pdVar.field_content));
        sb6.append(" id ");
        sb6.append(pdVar.field_id);
        sb6.append(" time ");
        sb6.append(pdVar.field_createTime);
        com.tencent.mars.xlog.Log.i(this.f103281h, sb6.toString());
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(pdVar.field_headUrl, null, 2, null);
        int i19 = pdVar.field_extFlag;
        int i27 = i19 & 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i27 == 0 && (i19 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p19 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p19, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f329961o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p27 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p27, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p27, g1Var.h(mn2.f1.f329957h));
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.i1r);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p29 = holder.p(com.tencent.mm.R.id.f485991jt2);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.i1r);
        r45.bm2 e17 = cu2.f0.f222391a.e((int) pdVar.field_objectType);
        weImageView.setLayerPaint(null);
        weImageView.setIconColor(0);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.d(textView);
        zy2.o6 o6Var = new zy2.o6();
        o6Var.f477514d = e17;
        o6Var.f477513c = pdVar.field_forceUseContent != 0;
        java.lang.String field_content = pdVar.field_content;
        kotlin.jvm.internal.o.f(field_content, "field_content");
        o6Var.f477512b = field_content;
        ((ht2.y0) s6Var).Bi(weImageView, textView, o6Var);
        android.view.View p37 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p37, "getView(...)");
        android.view.View p38 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p38, "getView(...)");
        A(pdVar, (android.widget.ImageView) p37, (android.widget.TextView) p38);
        android.view.View p39 = holder.p(com.tencent.mm.R.id.gah);
        if (p39 == null) {
            z17 = true;
        } else {
            z17 = true;
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P0().r()).intValue() == 1) {
                r45.t64 t64Var = pdVar.field_likeInfo;
                if ((t64Var != null ? t64Var.getInteger(2) : 0) > 0) {
                    i18 = 0;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p39, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p39.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            i18 = 8;
            java.util.ArrayList arrayList52 = new java.util.ArrayList();
            arrayList52.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList52);
            yj0.a.d(p39, arrayList52.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p39.setVisibility(((java.lang.Integer) arrayList52.get(0)).intValue());
            yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p47 = holder.p(com.tencent.mm.R.id.jti);
        if (p47 != null) {
            p47.setTag(com.tencent.mm.R.id.e79, item.a());
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_authorContact;
            if (finderContact != null && (nickname = finderContact.getNickname()) != null) {
                str2 = nickname;
            }
            p47.setTag(com.tencent.mm.R.id.e7f, str2);
        }
        java.lang.String str5 = pdVar.field_refContent;
        if ((str5 == null || str5.length() == 0) ? z17 : false) {
            android.view.View p48 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p48, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p49 = holder.p(com.tencent.mm.R.id.lqv);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(p49, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p49.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectRecommendLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectRecommendLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_replayNickname);
        android.content.Context context = holder.f293121e;
        if (K0) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str6 = pdVar.field_refContent;
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str6));
            return;
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string = context.getString(com.tencent.mm.R.string.epv, pdVar.field_replayNickname, pdVar.field_refContent);
        ((ke0.e) xVar2).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
    }
}
