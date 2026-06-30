package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes8.dex */
public final class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95360d;

    public q(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95360d = cardHomePageV3UI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f95360d.finish();
        return false;
    }
}
