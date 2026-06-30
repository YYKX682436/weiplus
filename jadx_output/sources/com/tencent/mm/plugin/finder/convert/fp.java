package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class fp extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.kp f103404h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f103405i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(com.tencent.mm.plugin.finder.convert.kp data, yz5.l lVar) {
        super(com.tencent.mm.R.layout.eco, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103404h = data;
        this.f103405i = lVar;
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp, com.tencent.mm.plugin.finder.convert.yw
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.n3 item, int i17, int i18, boolean z17, java.util.List list) {
        dm.pd pdVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.snn);
        dm.pd pdVar2 = item.f410411d;
        if (p17 == null) {
            pdVar = pdVar2;
        } else if (pdVar2.field_type == 39) {
            com.tencent.mars.xlog.Log.i("FinderMsgBulletConvert", "bullet liked no operateLayout");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            pdVar = pdVar2;
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            pdVar = pdVar2;
            if (pm0.v.z(pdVar.field_extFlag, 256)) {
                com.tencent.mars.xlog.Log.i("FinderMsgBulletConvert", "bullet invalid");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                holder.p(com.tencent.mm.R.id.f486642lz3).setOnClickListener(new com.tencent.mm.plugin.finder.convert.dp(this, item));
                android.view.View p18 = holder.p(com.tencent.mm.R.id.i1c);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.i1m);
                boolean z18 = pm0.v.z(pdVar.field_extFlag, 128);
                android.content.Context context = holder.f293121e;
                if (z18) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_good);
                    weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.Red_100));
                    weImageView.setTag(com.tencent.mm.R.id.qco, java.lang.Boolean.TRUE);
                } else {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_star_new);
                    weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                    weImageView.setTag(com.tencent.mm.R.id.qco, java.lang.Boolean.FALSE);
                }
                p18.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ep(weImageView, this, holder, item));
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "bindOperateLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        int i19 = pdVar.field_extFlag;
        android.view.View p19 = holder.p(com.tencent.mm.R.id.ctl);
        android.view.View p27 = holder.p(com.tencent.mm.R.id.f485991jt2);
        android.view.View p28 = holder.p(com.tencent.mm.R.id.snn);
        if (!pm0.v.z(i19, 256)) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p27, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(p19, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "refreshStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        so2.n3 item = (so2.n3) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        dm.pd pdVar = item.f410411d;
        mn2.n nVar = new mn2.n(pdVar.field_headUrl, null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        java.lang.String str = pdVar.field_username;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
        com.tencent.mars.xlog.Log.i("FinderMsgBulletConvert", sb6.toString());
        int i18 = pdVar.field_extFlag;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        boolean z18 = true;
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
        com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView mentionEllipsizeTextView = (com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        java.lang.String str5 = pdVar.field_content;
        java.lang.String str6 = str5 == null ? "" : str5;
        i95.m c17 = i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mentionEllipsizeTextView.setText(zy2.s6.l6((zy2.s6) c17, str6, (int) mentionEllipsizeTextView.getTextSize(), false, null, 0, false, null, 124, null));
        mentionEllipsizeTextView.setVisibility(0);
        java.lang.CharSequence f131525i = mentionEllipsizeTextView.getF131525i();
        if (f131525i != null && f131525i.length() != 0) {
            z18 = false;
        }
        if (z18) {
            int i27 = pdVar.field_type;
            if (i27 == 39) {
                str2 = mentionEllipsizeTextView.getContext().getResources().getString(com.tencent.mm.R.string.owp);
            } else if (i27 != 40) {
                mentionEllipsizeTextView.setVisibility(8);
            } else {
                str2 = mentionEllipsizeTextView.getContext().getResources().getString(com.tencent.mm.R.string.owr);
            }
            mentionEllipsizeTextView.setText(str2);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_refContent)) {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.uxr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p27 = holder.p(com.tencent.mm.R.id.uxr);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgBullet;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(pdVar.field_replayNickname);
            android.content.Context context = holder.f293121e;
            if (K0) {
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486000ju0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str7 = pdVar.field_refContent;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str7));
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
    }
}
