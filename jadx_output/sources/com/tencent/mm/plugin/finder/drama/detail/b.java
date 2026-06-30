package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class b implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.detail.c f105130d;

    public b(com.tencent.mm.plugin.finder.drama.detail.c cVar) {
        this.f105130d = cVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.qj2 qj2Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.drama.detail.c cVar = this.f105130d;
            if (i17 < cVar.f105132e.size()) {
                androidx.appcompat.app.AppCompatActivity activity = cVar.getActivity();
                com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
                android.app.Activity parentActivity = vASActivity != null ? vASActivity.getParentActivity() : null;
                java.lang.Object obj = cVar.f105132e.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                zb2.b bVar = (zb2.b) obj;
                r45.bn2 bn2Var = (r45.bn2) bVar.f471258d.getCustom(1);
                if (bn2Var == null) {
                    return;
                }
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.util.Map c17 = d2Var.c(context);
                c17.put("native_drama_id", pm0.v.u(cVar.f105134g));
                r45.oj2 oj2Var = bVar.f471258d;
                c17.put("feed_id", pm0.v.u(oj2Var.getLong(0)));
                c17.put("native_drama_item_num", java.lang.Integer.valueOf(bn2Var.getInteger(2)));
                hc2.v0.b(itemView, "native_drama_item", "view_clk", 0, c17, null, 20, null);
                if (parentActivity != null && (parentActivity instanceof com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI)) {
                    ((com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI) parentActivity).k7(bVar, cVar.f105134g);
                    return;
                }
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                long j17 = cVar.f105134g;
                long j18 = oj2Var.getLong(0);
                r45.bn2 bn2Var2 = (r45.bn2) oj2Var.getCustom(1);
                i0Var.ak(context, null, j17, j18, null, (bn2Var2 == null || (qj2Var = (r45.qj2) bn2Var2.getCustom(0)) == null) ? null : qj2Var.getString(1), cVar.f105135h, cVar.f105137m, cVar.f105136i, cVar.f105138n);
            }
        }
    }
}
