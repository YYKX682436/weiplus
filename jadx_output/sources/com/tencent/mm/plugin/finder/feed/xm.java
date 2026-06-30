package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xm extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ym f111086a;

    public xm(com.tencent.mm.plugin.finder.feed.ym ymVar) {
        this.f111086a = ymVar;
    }

    @Override // in5.p
    public float a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0.5f;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        in5.c cVar = item.f293070a;
        com.tencent.mm.plugin.finder.feed.model.d5 d5Var = cVar instanceof com.tencent.mm.plugin.finder.feed.model.d5 ? (com.tencent.mm.plugin.finder.feed.model.d5) cVar : null;
        if (d5Var != null) {
            com.tencent.mm.plugin.finder.report.d2.f124994a.h(this.f111086a.f106174d, "drama_tab_series_card", "view_valid_exp", true, com.tencent.mm.plugin.finder.convert.ar.f102899f.a(d5Var));
        }
    }
}
