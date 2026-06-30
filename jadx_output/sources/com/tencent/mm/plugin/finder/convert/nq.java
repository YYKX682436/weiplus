package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class nq extends com.tencent.mm.plugin.finder.convert.rp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.b3u, data);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        boolean z17;
        boolean z18;
        int i18;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        so2.c4 item = (so2.c4) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        dm.pd pdVar = item.f410411d;
        r45.rk2 rk2Var = pdVar.field_notify;
        if (rk2Var != null) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.jud)).setText(rk2Var.getString(0));
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2)).setText(rk2Var.getString(1));
            android.view.View p17 = holder.p(com.tencent.mm.R.id.cvz);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.f485312h94);
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("FinderMsgNotifyConvert", "title=" + rk2Var.getString(0) + ",content=" + rk2Var.getString(1) + ",subType=" + rk2Var.getInteger(2) + ",link=" + rk2Var.getString(3) + '!');
            }
            if (rk2Var.getInteger(2) == 1 || ((rk2Var.getInteger(2) == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(rk2Var.getString(3))) || rk2Var.getInteger(2) == 6)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                i18 = 2;
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                i18 = 2;
                yj0.a.d(p18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgNotifyConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgNotify;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long j17 = pdVar.field_id;
            if (rk2Var.getInteger(i18) != 6 || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) rk2Var.getCustom(7)) == null) {
                return;
            }
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).Yk(context, p0Var, j17, false);
        }
    }
}
