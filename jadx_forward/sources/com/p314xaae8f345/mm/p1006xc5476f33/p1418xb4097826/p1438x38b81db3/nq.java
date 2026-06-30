package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class nq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3u, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        boolean z17;
        boolean z18;
        int i18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        so2.c4 item = (so2.c4) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        dm.pd pdVar = item.f491944d;
        r45.rk2 rk2Var = pdVar.f66107x7dac62e;
        if (rk2Var != null) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jud)).setText(rk2Var.m75945x2fec8307(0));
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2)).setText(rk2Var.m75945x2fec8307(1));
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.cvz);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f566845h94);
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgNotifyConvert", "title=" + rk2Var.m75945x2fec8307(0) + ",content=" + rk2Var.m75945x2fec8307(1) + ",subType=" + rk2Var.m75939xb282bd08(2) + ",link=" + rk2Var.m75945x2fec8307(3) + '!');
            }
            if (rk2Var.m75939xb282bd08(2) == 1 || ((rk2Var.m75939xb282bd08(2) == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rk2Var.m75945x2fec8307(3))) || rk2Var.m75939xb282bd08(2) == 6)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
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
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long j17 = pdVar.f66095xc8a07680;
            if (rk2Var.m75939xb282bd08(i18) != 6 || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) rk2Var.m75936x14adae67(7)) == null) {
                return;
            }
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).Yk(context, p0Var, j17, false);
        }
    }
}
