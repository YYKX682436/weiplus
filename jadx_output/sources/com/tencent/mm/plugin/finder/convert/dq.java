package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class dq extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.kp f103171h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f103172i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.b3p, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103171h = data;
        this.f103172i = "Finder.FinderMsgFriendObjectLikeLikeConvert";
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
        so2.v3 item = (so2.v3) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = this.f103172i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str2 = item.f410411d.field_username;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(" nickname ");
        java.lang.String str3 = item.f410411d.field_nickname;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(" url ");
        java.lang.String str4 = item.f410411d.field_headUrl;
        sb6.append(str4 != null ? str4 : "");
        sb6.append(" flag ");
        sb6.append(item.f410411d.field_extFlag);
        sb6.append(" content ");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.G1(item.f410411d.field_content));
        sb6.append(" id ");
        sb6.append(item.f410411d.field_id);
        sb6.append(" time ");
        sb6.append(item.f410411d.field_createTime);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i18 = 8;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(item.f410411d.field_headUrl, null, 2, null);
        int i19 = item.f410411d.field_extFlag;
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
        if (this.f103171h.f103851a == 1) {
            android.view.View p28 = holder.p(com.tencent.mm.R.id.i1r);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p28, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p29 = holder.p(com.tencent.mm.R.id.f485991jt2);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p29, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p37 = holder.p(com.tencent.mm.R.id.i1s);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.bm2 e17 = cu2.f0.f222391a.e((int) item.f410411d.field_objectType);
            if (e17 != null) {
                java.lang.String string = e17.getString(10);
                if (!(string == null || string.length() == 0)) {
                    vo0.d e18 = g1Var.e();
                    mn2.q3 q3Var = new mn2.q3(e17.getString(10), com.tencent.mm.plugin.finder.storage.y90.f128355e);
                    android.view.View p38 = holder.p(com.tencent.mm.R.id.i1r);
                    kotlin.jvm.internal.o.f(p38, "getView(...)");
                    e18.c(q3Var, (android.widget.ImageView) p38, g1Var.h(mn2.f1.f329953d));
                    ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.i1r)).setColorFilter(i65.a.d(holder.f293121e, com.tencent.mm.R.color.FG_1), android.graphics.PorterDuff.Mode.SRC_ATOP);
                }
            }
            android.view.View p39 = holder.p(com.tencent.mm.R.id.i1r);
            kotlin.jvm.internal.o.e(p39, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            android.content.Context context = holder.f293121e;
            ((com.tencent.mm.ui.widget.imageview.WeImageView) p39).setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icon_outlined_awesome, context.getResources().getColor(com.tencent.mm.R.color.FG_0)));
            android.view.View p47 = holder.p(com.tencent.mm.R.id.i1r);
            kotlin.jvm.internal.o.e(p47, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) p47).setIconColor(i65.a.d(holder.f293121e, com.tencent.mm.R.color.FG_1));
        } else {
            android.view.View p48 = holder.p(com.tencent.mm.R.id.i1r);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p48, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p48.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p48, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p49 = holder.p(com.tencent.mm.R.id.i1r);
            kotlin.jvm.internal.o.e(p49, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) p49).setIconColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_0));
            android.view.View p57 = holder.p(com.tencent.mm.R.id.f485991jt2);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p57, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p57.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p57, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2)).setText(holder.f293121e.getString(com.tencent.mm.R.string.eph));
            android.view.View p58 = holder.p(com.tencent.mm.R.id.i1s);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p58, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p58.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p58, "com/tencent/mm/plugin/finder/convert/FinderMsgFriendObjectLikeLikeConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFriendObjectLikeLike;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dm.pd pdVar = item.f410411d;
        android.view.View p59 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p59, "getView(...)");
        android.view.View p66 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p66, "getView(...)");
        A(pdVar, (android.widget.ImageView) p59, (android.widget.TextView) p66);
        android.view.View p67 = holder.p(com.tencent.mm.R.id.gah);
        if (p67 == null) {
            return;
        }
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P0().r()).intValue() == 1) {
            r45.t64 t64Var = item.f410411d.field_likeInfo;
            if ((t64Var != null ? t64Var.getInteger(2) : 0) > 0) {
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
