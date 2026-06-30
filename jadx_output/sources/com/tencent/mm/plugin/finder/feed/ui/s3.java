package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class s3 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f110521a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110522b;

    public s3(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        this.f110522b = finderGallerySearchUI;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f110521a || i17 <= 0) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI activity = this.f110522b;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            fc2.i iVar = new fc2.i(Z6);
            androidx.recyclerview.widget.RecyclerView recyclerView = activity.F;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            iVar.onScrollStateChanged(recyclerView, 5);
        }
        this.f110521a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    @Override // ym5.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r29) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.s3.b(int):void");
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("Finder.FinderGallerySearchUI", "onLoadMoreEnd");
    }
}
