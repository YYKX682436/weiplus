package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderErrorTipUI f110358d;

    public o1(com.tencent.mm.plugin.finder.feed.ui.FinderErrorTipUI finderErrorTipUI) {
        this.f110358d = finderErrorTipUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f110358d.finish();
        return false;
    }
}
