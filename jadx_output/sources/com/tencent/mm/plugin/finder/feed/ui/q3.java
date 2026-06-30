package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class q3 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110442a;

    public q3(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        this.f110442a = finderGallerySearchUI;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 wxRVData) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(wxRVData, "wxRVData");
        int i17 = wxRVData.f293148a;
        if (i17 == 0 || i17 == 8) {
            int i18 = 0;
            for (java.lang.Object obj : wxRVData.f293153f) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                in5.x0 x0Var = (in5.x0) obj;
                in5.c cVar = x0Var.f293158a;
                if (cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    java.lang.String u17 = pm0.v.u(cVar.getItemId());
                    int i27 = x0Var.f293160c;
                    com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI = this.f110442a;
                    finderGallerySearchUI.getClass();
                    finderGallerySearchUI.a(u17, i27, 1);
                    com.tencent.mm.plugin.finder.gallery.b0.f111350a.d(cVar.getItemId(), finderGallerySearchUI.M, i19, finderGallerySearchUI.f109265w);
                }
                i18 = i19;
            }
        }
    }
}
