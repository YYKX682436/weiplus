package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class hl extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.SparseArray f103594f;

    /* renamed from: e, reason: collision with root package name */
    public final int f103595e;

    static {
        new com.tencent.mm.plugin.finder.convert.fl(null);
        f103594f = new android.util.SparseArray();
    }

    public hl(int i17) {
        this.f103595e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487854t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.c2 item = (so2.c2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.util.SparseArray sparseArray = f103594f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i19 = this.f103595e;
        sparseArray.put(i19, valueOf);
        android.text.SpannableString spannableString = item.f410294f;
        int i27 = item.f410295g;
        if (i27 != 1) {
            if (i27 == 2) {
                android.view.View p17 = holder.p(com.tencent.mm.R.id.f486786mh2);
                android.view.View p18 = holder.p(com.tencent.mm.R.id.e0g);
                holder.s(com.tencent.mm.R.id.e0g, spannableString);
                if (p18 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderHistoryDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderHistoryDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.gl(this, holder));
                return;
            }
            return;
        }
        holder.w(com.tencent.mm.R.id.f486786mh2, 8);
        holder.w(com.tencent.mm.R.id.e0g, 0);
        holder.s(com.tencent.mm.R.id.e0g, spannableString);
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        int bl6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(i19);
        o3Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderTimelineMoreFeedExposeStruct finderTimelineMoreFeedExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderTimelineMoreFeedExposeStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderTimelineMoreFeedExposeStruct.f57917d = finderTimelineMoreFeedExposeStruct.b("sessionid", Ri, true);
        finderTimelineMoreFeedExposeStruct.f57918e = 2;
        finderTimelineMoreFeedExposeStruct.f57919f = 1;
        finderTimelineMoreFeedExposeStruct.f57920g = 0;
        finderTimelineMoreFeedExposeStruct.f57921h = bl6;
        finderTimelineMoreFeedExposeStruct.k();
        o3Var.Zk(finderTimelineMoreFeedExposeStruct);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.e0h)).setText(holder.f293121e.getString(com.tencent.mm.R.string.f8b, com.tencent.mm.plugin.finder.storage.t70.f127590a.H2(4, "")));
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.e0h)).setVisibility(8);
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.e0h)).setVisibility(0);
        }
    }
}
