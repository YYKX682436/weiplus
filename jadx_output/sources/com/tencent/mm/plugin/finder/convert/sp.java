package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class sp extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e7t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        so2.o3 item = (so2.o3) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView mentionEllipsizeTextView = (com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        dm.pd pdVar = item.f410411d;
        mentionEllipsizeTextView.setMention(pdVar);
        java.lang.CharSequence f131525i = mentionEllipsizeTextView.getF131525i();
        if ((f131525i == null || f131525i.length() == 0) == true) {
            mentionEllipsizeTextView.setVisibility(8);
        } else {
            mentionEllipsizeTextView.setVisibility(0);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_refContent);
        android.content.Context context = holder.f293121e;
        if (K0) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p18 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgDetailCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_replayNickname)) {
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = pdVar.field_refContent;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.tencent.mm.R.string.epv, pdVar.field_replayNickname, pdVar.field_refContent);
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
            }
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) p19;
        android.view.View p27 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        android.widget.TextView textView3 = (android.widget.TextView) p27;
        textView3.setVisibility(8);
        java.lang.String l17 = pdVar.l();
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            imageView.setVisibility(8);
            if (pdVar.field_mediaType == 1) {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = textView3.getContext();
                java.lang.String str3 = pdVar.field_description;
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str3));
                textView3.setVisibility(0);
            }
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(l17, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329963q));
            imageView.setVisibility(0);
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.jtg);
        if (p28 != null) {
            p28.setTag(com.tencent.mm.R.id.e79, item.a());
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_authorContact;
            if (finderContact == null || (str = finderContact.getNickname()) == null) {
                str = "";
            }
            p28.setTag(com.tencent.mm.R.id.e5k, str);
            java.lang.String str4 = pdVar.field_content;
            if (str4 == null) {
                str4 = "";
            }
            p28.setTag(com.tencent.mm.R.id.f484418e75, str4);
            java.lang.String str5 = pdVar.field_refContent;
            if (str5 == null) {
                str5 = "";
            }
            p28.setTag(com.tencent.mm.R.id.e77, str5);
            java.lang.String str6 = pdVar.field_replayNickname;
            p28.setTag(com.tencent.mm.R.id.e7f, str6 != null ? str6 : "");
        }
        java.lang.String n17 = com.tencent.mm.plugin.finder.assist.w2.n(context, pdVar.field_createTime * 1000);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o7z);
        if (textView4 != null) {
            textView4.setVisibility(0);
            textView4.setText(n17);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "finder_history_comment_item");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("commentid", pm0.v.u(pdVar.field_commentId));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(pdVar.field_objectId));
        lVarArr[2] = new jz5.l("is_reply_comment", java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_refContent) ? 1 : 0));
        lVarArr[3] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[4] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(holder.itemView, 40, 1, false);
        int i19 = pdVar.field_commentContentType;
        r45.e60 e60Var = pdVar.field_commentContentInfo;
        boolean z18 = pm0.v.z(pdVar.field_extFlag, 256);
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        finderMsgContract.b(holder, pdVar.field_commentId, pdVar.field_objectId, i19, e60Var, z18);
        finderMsgContract.c(holder, pdVar.field_commentId, pdVar.field_objectId, i19, e60Var, z18);
    }
}
