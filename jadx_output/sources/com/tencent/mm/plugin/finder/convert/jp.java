package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class jp extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.kp f103770h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f103771i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.p f103772m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f103773n;

    public /* synthetic */ jp(com.tencent.mm.plugin.finder.convert.kp kpVar, yz5.l lVar, yz5.p pVar, int i17, kotlin.jvm.internal.i iVar) {
        this(kpVar, (i17 & 2) != 0 ? null : lVar, (i17 & 4) != 0 ? null : pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.S0().r()).intValue() == 1) goto L29;
     */
    @Override // com.tencent.mm.plugin.finder.convert.rp, com.tencent.mm.plugin.finder.convert.yw
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.jp.h(in5.s0, so2.o3, int, int, boolean, java.util.List):void");
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        java.lang.String str;
        so2.o3 item = (so2.o3) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        dm.pd pdVar = item.f410411d;
        mn2.n nVar = new mn2.n(pdVar.field_headUrl, null, 2, null);
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
        com.tencent.mars.xlog.Log.i(this.f103773n, sb6.toString());
        int i18 = pdVar.field_extFlag;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329961o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p18 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p18, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f329957h));
        }
        int i27 = pdVar.field_commentContentType;
        r45.e60 e60Var = pdVar.field_commentContentInfo;
        boolean z18 = pm0.v.z(pdVar.field_extFlag, 256);
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        finderMsgContract.b(holder, pdVar.field_commentId, pdVar.field_objectId, i27, e60Var, z18);
        finderMsgContract.c(holder, pdVar.field_commentId, pdVar.field_objectId, i27, e60Var, z18);
        com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView mentionEllipsizeTextView = (com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        mentionEllipsizeTextView.setMention(pdVar);
        java.lang.CharSequence f131525i = mentionEllipsizeTextView.getF131525i();
        if (f131525i == null || f131525i.length() == 0) {
            mentionEllipsizeTextView.setVisibility(8);
        } else {
            mentionEllipsizeTextView.setVisibility(0);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_refContent);
        android.content.Context context = holder.f293121e;
        if (K0) {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p27 = holder.p(com.tencent.mm.R.id.lqv);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_replayNickname)) {
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str5 = pdVar.field_refContent;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str5));
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.tencent.mm.R.string.epv, pdVar.field_replayNickname, pdVar.field_refContent);
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
            }
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p28, "getView(...)");
        android.view.View p29 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p29, "getView(...)");
        A(pdVar, (android.widget.ImageView) p28, (android.widget.TextView) p29);
        android.view.View p37 = holder.p(com.tencent.mm.R.id.jtg);
        if (p37 != null) {
            p37.setTag(com.tencent.mm.R.id.e79, item.a());
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_authorContact;
            if (finderContact == null || (str = finderContact.getNickname()) == null) {
                str = "";
            }
            p37.setTag(com.tencent.mm.R.id.e5k, str);
            java.lang.String str6 = pdVar.field_content;
            if (str6 == null) {
                str6 = "";
            }
            p37.setTag(com.tencent.mm.R.id.f484418e75, str6);
            java.lang.String str7 = pdVar.field_refContent;
            if (str7 == null) {
                str7 = "";
            }
            p37.setTag(com.tencent.mm.R.id.e77, str7);
            java.lang.String str8 = pdVar.field_replayNickname;
            p37.setTag(com.tencent.mm.R.id.e7f, str8 != null ? str8 : "");
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "message_center_comment_tab_comment_item");
        aVar.Tj(holder.itemView, 40, 1, false);
        aVar.gk(holder.itemView, kz5.c1.l(new jz5.l("account_finder_username", xy2.c.e(context)), new jz5.l("feed_id", pm0.v.u(pdVar.field_objectId)), new jz5.l("comment_id", pm0.v.u(pdVar.field_commentId)), new jz5.l("comment_content_type", java.lang.Integer.valueOf(pdVar.field_commentContentType)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(com.tencent.mm.plugin.finder.convert.kp data, yz5.l lVar, yz5.p pVar) {
        super(com.tencent.mm.R.layout.b3k, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103770h = data;
        this.f103771i = lVar;
        this.f103772m = pVar;
        this.f103773n = "Finder.FinderMsgCommentConvert";
    }
}
