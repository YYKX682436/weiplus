package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class q0 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.r0 f111400a;

    public q0(com.tencent.mm.plugin.finder.gallery.r0 r0Var) {
        this.f111400a = r0Var;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 wxRVData) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(wxRVData, "wxRVData");
        int i17 = wxRVData.f293148a;
        if (i17 == 0 || i17 == 8) {
            com.tencent.mm.plugin.finder.gallery.r0 r0Var = this.f111400a;
            if (!r0Var.f111403z) {
                r0Var.f111403z = true;
                return;
            }
            java.util.Iterator it = wxRVData.f293153f.iterator();
            while (it.hasNext()) {
                in5.c cVar = ((in5.x0) it.next()).f293158a;
                if (cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.gallery.b0.f111350a.d(cVar.getItemId(), r0Var.f111402y, -1, "");
                }
            }
        }
    }
}
