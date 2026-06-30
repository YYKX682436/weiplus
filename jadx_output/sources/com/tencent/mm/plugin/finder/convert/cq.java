package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class cq extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f103087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.b3n, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103087h = "Finder.FinderMsgFollowConvert";
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        so2.r3 item = (so2.r3) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String a17 = item.a();
        android.view.View p17 = holder.p(com.tencent.mm.R.id.kne);
        dm.pd pdVar = item.f410411d;
        int i18 = pdVar.u0() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.kdy);
        int i19 = pdVar.u0() ? 8 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486156ke0);
        boolean u07 = pdVar.u0();
        java.lang.String str = this.f103087h;
        android.content.Context context = holder.f293121e;
        if (u07) {
            com.tencent.mars.xlog.Log.i(str, "overlap " + pdVar.v0() + " content " + com.tencent.mm.sdk.platformtools.t8.G1(pdVar.field_content) + " id " + pdVar.field_id + " time " + pdVar.field_createTime);
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.obc)).setText(context.getString(com.tencent.mm.R.string.cxt, com.tencent.mm.plugin.finder.assist.w2.h((long) pdVar.field_aggregatedContacts.getInteger(1))));
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, a17));
        } else {
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
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            android.view.View p19 = holder.p(com.tencent.mm.R.id.a_4);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p27 = holder.p(com.tencent.mm.R.id.knh);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mn2.n nVar = new mn2.n(pdVar.field_headUrl, null, 2, null);
            int i27 = pdVar.field_extFlag;
            int i28 = i27 & 2;
            mn2.g1 g1Var = mn2.g1.f329975a;
            if (i28 == 0 && (i27 & 1) == 0) {
                vo0.d l17 = g1Var.l();
                android.view.View p28 = holder.p(com.tencent.mm.R.id.a_4);
                kotlin.jvm.internal.o.f(p28, "getView(...)");
                l17.c(nVar, (android.widget.ImageView) p28, g1Var.h(mn2.f1.f329961o));
            } else {
                vo0.d a18 = g1Var.a();
                android.view.View p29 = holder.p(com.tencent.mm.R.id.a_4);
                kotlin.jvm.internal.o.f(p29, "getView(...)");
                a18.c(nVar, (android.widget.ImageView) p29, g1Var.h(mn2.f1.f329957h));
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, a17));
            java.lang.String str5 = pdVar.field_content;
            if (str5 == null || str5.length() == 0) {
                ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2)).setText(context.getString(com.tencent.mm.R.string.epg));
            } else {
                ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2)).setText(pdVar.field_content);
            }
        }
        android.view.View p37 = holder.p(com.tencent.mm.R.id.k3l);
        p37.post(new com.tencent.mm.plugin.finder.convert.bq(p37, holder.p(com.tencent.mm.R.id.e_c), holder, (android.widget.TextView) holder.p(com.tencent.mm.R.id.o7z), textView, this));
        android.view.View p38 = holder.p(com.tencent.mm.R.id.jth);
        if (p38 != null) {
            p38.setTag(com.tencent.mm.R.id.e79, a17);
        }
        android.view.View p39 = holder.p(com.tencent.mm.R.id.frp);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[show_finder_identity] ");
        sb7.append(pdVar.field_nickname);
        sb7.append(' ');
        r45.ub1 ub1Var = pdVar.field_finderIdentity;
        sb7.append(ub1Var != null ? java.lang.Integer.valueOf(ub1Var.getInteger(0)) : null);
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.u0().r()).intValue() == 1) {
            r45.ub1 ub1Var2 = pdVar.field_finderIdentity;
            if (ub1Var2 != null && ub1Var2.getInteger(0) == 1) {
                if (p39 == null) {
                    return;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(p39, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "refreshFinderUsername", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p39.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "refreshFinderUsername", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        if (p39 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p39, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "refreshFinderUsername", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p39.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p39, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowNewConvert", "refreshFinderUsername", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollow;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
