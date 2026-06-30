package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wt extends in5.r {
    public wt() {
        jz5.h.b(com.tencent.mm.plugin.finder.convert.vt.f104812d);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b7_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.i72 i72Var;
        so2.q2 item = (so2.q2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.convert.f fVar = com.tencent.mm.plugin.finder.convert.f.f103316a;
        if (list != null) {
            for (java.lang.Object obj : list) {
                if ((obj instanceof java.lang.Integer) && kotlin.jvm.internal.o.b(obj, 2002)) {
                    android.view.View itemView = holder.itemView;
                    kotlin.jvm.internal.o.f(itemView, "itemView");
                    fVar.c(itemView, item);
                    return;
                }
            }
        }
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        fVar.b(itemView2, item);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.lyh);
        java.lang.String n27 = item.n2();
        if (p17 != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.f().c(new mn2.q3(n27, com.tencent.mm.plugin.finder.storage.y90.f128356f), (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329953d));
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = item.f410549n;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        long j17 = (liveInfo == null || (i72Var = (r45.i72) liveInfo.getCustom(44)) == null) ? 0L : i72Var.getLong(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replay:");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        jz5.f0 f0Var = null;
        java.lang.String description = objectDesc != null ? objectDesc.getDescription() : null;
        if (description == null) {
            description = "";
        }
        sb6.append(description);
        sb6.append("(feedId:");
        sb6.append(pm0.v.u(finderObject.getId()));
        sb6.append(",liveId:");
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        sb6.append(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null);
        sb6.append("),");
        sb6.append(item.p2());
        sb6.append(',');
        r45.nw1 liveInfo3 = finderObject.getLiveInfo();
        cm2.a aVar = cm2.a.f43328a;
        sb6.append(liveInfo3 != null ? cm2.a.i(aVar, liveInfo3, "FinderLiveReplayFeed", false, 2, null) : "");
        sb6.append(" ,watchUV:");
        sb6.append(j17);
        sb6.append(", purchaseInfo:");
        r45.nw1 liveInfo4 = finderObject.getLiveInfo();
        sb6.append(aVar.l(liveInfo4 != null ? (r45.o52) liveInfo4.getCustom(28) : null));
        com.tencent.mars.xlog.Log.i("FinderProfileReplayLiveConvert", sb6.toString());
        android.view.View p18 = holder.p(com.tencent.mm.R.id.lyd);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (finderObject.getLiveInfo() != null) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyj)).setText(com.tencent.mm.plugin.finder.assist.w2.l(com.tencent.mm.sdk.platformtools.x2.f193071a, r1.getInteger(6) * 1000));
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyj)).setVisibility(0);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyj)).setVisibility(4);
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.f486638lz0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ly6)).setVisibility(8);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.lyk)).setVisibility(8);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.lyt)).setVisibility(8);
        android.view.View p27 = holder.p(com.tencent.mm.R.id.lyq);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveForAllConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.lyr);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        hc2.o.a((android.widget.TextView) p17, false);
    }
}
