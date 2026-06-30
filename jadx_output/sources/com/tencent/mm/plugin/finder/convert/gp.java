package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class gp extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f103507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.b3j, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103507h = "Finder.FinderMsgCommentConvert";
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
        com.tencent.mars.xlog.Log.i(this.f103507h, sb6.toString());
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
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str5 = pdVar.field_content;
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str5));
        if (com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_refContent)) {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.lqv);
            if (p19 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View p27 = holder.p(com.tencent.mm.R.id.lqv);
            if (p27 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgComment;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_replayNickname)) {
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str6 = pdVar.field_refContent;
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str6));
            } else {
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getString(com.tencent.mm.R.string.epv, pdVar.field_replayNickname, pdVar.field_refContent);
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
            }
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p28, "getView(...)");
        android.view.View p29 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p29, "getView(...)");
        A(pdVar, (android.widget.ImageView) p28, (android.widget.TextView) p29);
        android.view.View p37 = holder.p(com.tencent.mm.R.id.jtf);
        if (p37 != null) {
            p37.setTag(com.tencent.mm.R.id.e79, item.a());
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = pdVar.field_authorContact;
            if (finderContact == null || (str = finderContact.getNickname()) == null) {
                str = "";
            }
            p37.setTag(com.tencent.mm.R.id.e5k, str);
            java.lang.String str7 = pdVar.field_content;
            if (str7 == null) {
                str7 = "";
            }
            p37.setTag(com.tencent.mm.R.id.f484418e75, str7);
            java.lang.String str8 = pdVar.field_refContent;
            if (str8 == null) {
                str8 = "";
            }
            p37.setTag(com.tencent.mm.R.id.e77, str8);
            java.lang.String str9 = pdVar.field_replayNickname;
            p37.setTag(com.tencent.mm.R.id.e7f, str9 != null ? str9 : "");
        }
    }
}
