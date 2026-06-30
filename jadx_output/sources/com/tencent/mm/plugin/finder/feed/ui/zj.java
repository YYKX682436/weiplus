package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class zj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSeeLaterDetailUI f110807d;

    public zj(com.tencent.mm.plugin.finder.feed.ui.FinderSeeLaterDetailUI finderSeeLaterDetailUI) {
        this.f110807d = finderSeeLaterDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110807d.onBackPressed();
        return true;
    }
}
