package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public class gq extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.kp f103508h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f103509i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.b3r, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103508h = data;
        this.f103509i = "Finder.FinderMsgLikeConvert";
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
        int i18;
        java.lang.String str;
        int i19;
        so2.y3 item = (so2.y3) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        dm.pd pdVar = item.f410411d;
        y(holder, pdVar, 2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str2 = pdVar.field_username;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
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
        com.tencent.mars.xlog.Log.i(this.f103509i, sb6.toString());
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(pdVar.field_headUrl, null, 2, null);
        int i27 = pdVar.field_extFlag;
        int i28 = i27 & 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i28 == 0 && (i27 & 1) == 0) {
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
        yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_refContent);
        int i29 = this.f103508h.f103851a;
        android.content.Context context = holder.f293121e;
        if (i29 == 1 && ((int) pdVar.field_objectType) == 2 && !z18) {
            android.view.View p29 = holder.p(com.tencent.mm.R.id.i1v);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p37 = holder.p(com.tencent.mm.R.id.i1y);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ju_)).setText(context.getString(com.tencent.mm.R.string.epm));
        } else {
            android.view.View p38 = holder.p(com.tencent.mm.R.id.i1v);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p38, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p39 = holder.p(com.tencent.mm.R.id.i1y);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p39, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p39.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p47 = holder.p(com.tencent.mm.R.id.f485991jt2);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p47, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p47.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p47, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.i1r);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        r45.bm2 e17 = cu2.f0.f222391a.e((int) pdVar.field_objectType);
        weImageView.setLayerPaint(null);
        weImageView.setIconColor(0);
        if (z18) {
            java.lang.String str5 = pdVar.field_content;
            if (str5 == null || str5.length() == 0) {
                i18 = 8;
                weImageView.setVisibility(0);
                textView.setVisibility(8);
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_star_new, context.getResources().getColor(com.tencent.mm.R.color.FG_0)));
                weImageView.setIconColor(i65.a.d(context, com.tencent.mm.R.color.FG_0));
            } else {
                i18 = 8;
                weImageView.setVisibility(8);
                textView.setVisibility(0);
                i95.m c17 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.s6 s6Var = (zy2.s6) c17;
                java.lang.String field_content = pdVar.field_content;
                kotlin.jvm.internal.o.f(field_content, "field_content");
                textView.setText(zy2.s6.l6(s6Var, field_content, (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs), false, null, 0, false, null, 124, null));
            }
        } else {
            i18 = 8;
            zy2.s6 s6Var2 = (zy2.s6) i95.n0.c(zy2.s6.class);
            kotlin.jvm.internal.o.d(textView);
            zy2.o6 o6Var = new zy2.o6();
            o6Var.f477514d = e17;
            o6Var.f477513c = pdVar.field_forceUseContent != 0;
            java.lang.String field_content2 = pdVar.field_content;
            kotlin.jvm.internal.o.f(field_content2, "field_content");
            o6Var.f477512b = field_content2;
            ((ht2.y0) s6Var2).Bi(weImageView, textView, o6Var);
        }
        if (z18) {
            android.view.View p48 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(p48, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_replayNickname)) {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str6 = pdVar.field_refContent;
                ((ke0.e) xVar).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str6));
            } else {
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.tencent.mm.R.string.epv, pdVar.field_replayNickname, pdVar.field_refContent);
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
            }
        } else {
            android.view.View p49 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(p49, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p49.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderMsgLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p57 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p57, "getView(...)");
        android.view.View p58 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p58, "getView(...)");
        A(pdVar, (android.widget.ImageView) p57, (android.widget.TextView) p58);
        android.view.View p59 = holder.p(com.tencent.mm.R.id.gah);
        if (p59 != null) {
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P0().r()).intValue() == 1) {
                r45.t64 t64Var = pdVar.field_likeInfo;
                if ((t64Var != null ? t64Var.getInteger(2) : 0) > 0) {
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
        android.view.View p66 = holder.p(com.tencent.mm.R.id.jtj);
        if (p66 != null) {
            p66.setTag(com.tencent.mm.R.id.e79, item.a());
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_authorContact;
            if (finderContact == null || (str = finderContact.getNickname()) == null) {
                str = "";
            }
            p66.setTag(com.tencent.mm.R.id.e5k, str);
            java.lang.String str7 = pdVar.field_refContent;
            if (str7 == null) {
                str7 = "";
            }
            p66.setTag(com.tencent.mm.R.id.e77, str7);
            java.lang.String str8 = pdVar.field_replayNickname;
            p66.setTag(com.tencent.mm.R.id.e7f, str8 != null ? str8 : "");
        }
    }
}
