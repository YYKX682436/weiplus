package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94140d;

    public i(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f94140d = bizTestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f94140d.finish();
        return true;
    }
}
