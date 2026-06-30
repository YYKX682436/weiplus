package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class v2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI f99702d;

    public v2(com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI) {
        this.f99702d = exdeviceFollowsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f99702d.finish();
        return false;
    }
}
