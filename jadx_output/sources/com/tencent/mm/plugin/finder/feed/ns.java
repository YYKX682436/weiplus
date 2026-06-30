package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ns implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.os f108597a;

    public ns(com.tencent.mm.plugin.finder.feed.os osVar) {
        this.f108597a = osVar;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 wxRVData) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(wxRVData, "wxRVData");
        int i17 = wxRVData.f293148a;
        if (i17 == 0 || i17 == 8) {
            com.tencent.mm.plugin.finder.feed.os osVar = this.f108597a;
            if (!osVar.f108678z) {
                osVar.f108678z = true;
                return;
            }
            java.util.Iterator it = wxRVData.f293153f.iterator();
            while (it.hasNext()) {
                boolean z17 = ((in5.x0) it.next()).f293158a instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            }
        }
    }
}
