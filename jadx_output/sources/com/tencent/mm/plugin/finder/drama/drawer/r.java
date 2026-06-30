package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class r implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f105271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f105272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f105274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105275i;

    public r(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, r45.qj2 qj2Var, long j17, java.lang.String str, int i17, java.lang.String str2) {
        this.f105270d = e0Var;
        this.f105271e = qj2Var;
        this.f105272f = j17;
        this.f105273g = str;
        this.f105274h = i17;
        this.f105275i = str2;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.qj2 qj2Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var = this.f105270d;
            if (i17 < e0Var.f105226p.size()) {
                androidx.appcompat.app.AppCompatActivity activity = e0Var.getActivity();
                com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
                android.app.Activity parentActivity = vASActivity != null ? vASActivity.getParentActivity() : null;
                java.lang.Object obj = e0Var.f105226p.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                zb2.b bVar = (zb2.b) obj;
                r45.bn2 bn2Var = (r45.bn2) bVar.f471258d.getCustom(1);
                if (bn2Var == null) {
                    return;
                }
                e0Var.f105234x = i17;
                androidx.recyclerview.widget.RecyclerView recyclerView = e0Var.f105228r;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("rangeRv");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.util.Map c17 = d2Var.c(context);
                r45.qj2 qj2Var2 = this.f105271e;
                c17.put("native_drama_id", pm0.v.u(qj2Var2.getLong(0)));
                r45.oj2 oj2Var = bVar.f471258d;
                c17.put("feed_id", pm0.v.u(oj2Var.getLong(0)));
                c17.put("native_drama_item_num", java.lang.Integer.valueOf(bn2Var.getInteger(2)));
                hc2.v0.b(itemView, "native_drama_item", "view_clk", 0, c17, null, 20, null);
                if (parentActivity != null && (parentActivity instanceof com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI)) {
                    e0Var.f105232v = oj2Var.getLong(0);
                    ((com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI) parentActivity).k7(bVar, qj2Var2.getLong(0));
                    return;
                }
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                long j17 = qj2Var2.getLong(0);
                long j18 = oj2Var.getLong(0);
                r45.bn2 bn2Var2 = (r45.bn2) oj2Var.getCustom(1);
                i0Var.ak(context, null, j17, j18, null, (bn2Var2 == null || (qj2Var = (r45.qj2) bn2Var2.getCustom(0)) == null) ? null : qj2Var.getString(1), this.f105272f, this.f105273g, this.f105274h, this.f105275i);
            }
        }
    }
}
