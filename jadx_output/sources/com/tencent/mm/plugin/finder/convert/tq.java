package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public class tq extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f104642h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.asd, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f104642h = "Finder.FinderMsgLikeRecommendConvert";
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        so2.e4 item = (so2.e4) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String a17 = item.a();
        java.lang.String str2 = this.f104642h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str3 = item.f410411d.field_username;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" nickname ");
        java.lang.String str4 = item.f410411d.field_nickname;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(" url ");
        java.lang.String str5 = item.f410411d.field_headUrl;
        if (str5 == null) {
            str5 = "";
        }
        sb6.append(str5);
        sb6.append(" flag ");
        sb6.append(item.f410411d.field_extFlag);
        sb6.append(" content ");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.G1(item.f410411d.field_content));
        sb6.append(" id ");
        sb6.append(item.f410411d.field_id);
        sb6.append(" time ");
        sb6.append(item.f410411d.field_createTime);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(item.f410411d.field_headUrl, null, 2, null);
        int i18 = item.f410411d.field_extFlag;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p19 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p19, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f329961o));
        } else {
            vo0.d a18 = g1Var.a();
            android.view.View p27 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p27, "getView(...)");
            a18.c(nVar, (android.widget.ImageView) p27, g1Var.h(mn2.f1.f329957h));
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.i1r);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(item.f410411d.field_refContent);
        android.view.View p29 = holder.p(com.tencent.mm.R.id.i1v);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p37 = holder.p(com.tencent.mm.R.id.i1y);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p38 = holder.p(com.tencent.mm.R.id.f485991jt2);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p38, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p38.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p39 = holder.p(com.tencent.mm.R.id.i1r);
        kotlin.jvm.internal.o.e(p39, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) p39).setLayerPaint(null);
        android.view.View p47 = holder.p(com.tencent.mm.R.id.i1r);
        kotlin.jvm.internal.o.e(p47, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) p47).setIconColor(0);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.i1r);
        zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.d(weImageView);
        kotlin.jvm.internal.o.d(textView);
        zy2.o6 o6Var = new zy2.o6();
        java.lang.String field_content = item.f410411d.field_content;
        kotlin.jvm.internal.o.f(field_content, "field_content");
        o6Var.f477512b = field_content;
        o6Var.f477513c = item.f410411d.field_forceUseContent != 0;
        o6Var.f477511a = true;
        o6Var.f477515e = true;
        ((ht2.y0) s6Var).Bi(weImageView, textView, o6Var);
        if (z18) {
            android.view.View p48 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p48, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.p(com.tencent.mm.R.id.f8t).setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_3));
            if (com.tencent.mm.sdk.platformtools.t8.K0(item.f410411d.field_replayNickname)) {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = holder.f293121e;
                java.lang.String str6 = item.f410411d.field_refContent;
                ((ke0.e) xVar).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str6));
            } else {
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = holder.f293121e;
                dm.pd pdVar = item.f410411d;
                java.lang.String string = context2.getString(com.tencent.mm.R.string.epv, pdVar.field_replayNickname, pdVar.field_refContent);
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, string));
            }
        } else {
            android.view.View p49 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p49, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p49.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p49, "com/tencent/mm/plugin/finder/convert/FinderMsgTingLikeRecommendConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgTingLikeRecommendMusic;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dm.pd pdVar2 = item.f410411d;
        android.view.View p57 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p57, "getView(...)");
        android.view.View p58 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p58, "getView(...)");
        A(pdVar2, (android.widget.ImageView) p57, (android.widget.TextView) p58);
        android.view.View p59 = holder.p(com.tencent.mm.R.id.jtj);
        if (p59 != null) {
            p59.setTag(com.tencent.mm.R.id.e79, a17);
            dm.pd pdVar3 = item.f410411d;
            if (pdVar3 == null || (finderContact = pdVar3.field_authorContact) == null || (str = finderContact.getNickname()) == null) {
                str = "";
            }
            p59.setTag(com.tencent.mm.R.id.e5k, str);
            dm.pd pdVar4 = item.f410411d;
            java.lang.String str7 = pdVar4 != null ? pdVar4.field_refContent : null;
            if (str7 == null) {
                str7 = "";
            }
            p59.setTag(com.tencent.mm.R.id.e77, str7);
            dm.pd pdVar5 = item.f410411d;
            java.lang.String str8 = pdVar5 != null ? pdVar5.field_replayNickname : null;
            p59.setTag(com.tencent.mm.R.id.e7f, str8 != null ? str8 : "");
        }
    }
}
