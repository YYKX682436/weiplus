package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public abstract class c {
    public static final void a(in5.s0 holder) {
        androidx.lifecycle.k0 k0Var;
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.f484675tj0);
        com.tencent.mm.plugin.finder.highlight.a aVar = tag instanceof com.tencent.mm.plugin.finder.highlight.a ? (com.tencent.mm.plugin.finder.highlight.a) tag : null;
        if (aVar != null && (k0Var = aVar.f111423c) != null && (j0Var = aVar.f111422b) != null) {
            j0Var.removeObserver(k0Var);
        }
        if (aVar != null) {
            aVar.f111422b = null;
        }
        if (aVar != null) {
            aVar.f111423c = null;
        }
        holder.itemView.setTag(com.tencent.mm.R.id.f484675tj0, null);
    }

    public static final void b(java.util.Set set, com.tencent.mm.plugin.finder.highlight.a aVar, in5.s0 s0Var, int i17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout == null || set == null) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo : ((xc2.t) it.next()).f453302d) {
                if (finderJumpInfo.getBusiness_type() == 110) {
                    java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
                    kotlin.jvm.internal.o.f(style, "getStyle(...)");
                    java.util.Iterator<T> it6 = style.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj = it6.next();
                            if (((r45.wf6) obj).getInteger(2) == 41) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    r45.wf6 wf6Var = (r45.wf6) obj;
                    if (wf6Var == null) {
                        finderFullSeekBarLayout.K(null, 0);
                    } else if (!kotlin.jvm.internal.o.b(aVar.f111421a, (r45.s84) wf6Var.getCustom(49))) {
                        aVar.f111421a = (r45.s84) wf6Var.getCustom(49);
                        com.tencent.mars.xlog.Log.e("Finder.FeedFullConvert", "update live_highlight_style");
                        r45.s84 s84Var = (r45.s84) wf6Var.getCustom(49);
                        finderFullSeekBarLayout.K(s84Var != null ? s84Var.getList(0) : null, i17);
                    }
                }
            }
        }
    }

    public static final void c(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null) {
            return;
        }
        pf5.u uVar = pf5.u.f353936a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5);
        a(holder);
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.f484675tj0);
        com.tencent.mm.plugin.finder.highlight.a aVar = tag instanceof com.tencent.mm.plugin.finder.highlight.a ? (com.tencent.mm.plugin.finder.highlight.a) tag : null;
        if (aVar == null) {
            aVar = new com.tencent.mm.plugin.finder.highlight.a();
            holder.itemView.setTag(com.tencent.mm.R.id.f484675tj0, aVar);
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
        int integer2 = mb4Var != null ? mb4Var.getInteger(3) : 0;
        if (integer2 <= 0) {
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
            if (finderFullSeekBarLayout == null) {
                return;
            }
            finderFullSeekBarLayout.K(null, 0);
            return;
        }
        androidx.lifecycle.j0 W6 = ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).W6(item.getItemId(), integer, item.w());
        com.tencent.mm.plugin.finder.highlight.b bVar = new com.tencent.mm.plugin.finder.highlight.b(aVar, holder, integer2);
        pm0.v.y(W6, mMActivity, bVar);
        aVar.f111422b = W6;
        aVar.f111423c = bVar;
        b((java.util.Set) W6.getValue(), aVar, holder, integer2);
    }
}
