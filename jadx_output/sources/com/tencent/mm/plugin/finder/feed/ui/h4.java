package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class h4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI f110107d;

    public h4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI) {
        this.f110107d = finderGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.finder.report.p2.f125237a.T(sb7, null);
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        w40.e eVar = (w40.e) c17;
        com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI = this.f110107d;
        androidx.appcompat.app.AppCompatActivity context = finderGalleryUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.dialog.k0 kg6 = w40.e.kg(eVar, context, null, 14, 2, null);
        kg6.f211872n = new com.tencent.mm.plugin.finder.feed.ui.e4(finderGalleryUI);
        kg6.f211881s = new com.tencent.mm.plugin.finder.feed.ui.f4(finderGalleryUI, sb7);
        kg6.f211854d = com.tencent.mm.plugin.finder.feed.ui.g4.f110074d;
        kg6.v();
        return true;
    }
}
