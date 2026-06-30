package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes8.dex */
public class q2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceExpireUI f99628d;

    public q2(com.tencent.mm.plugin.exdevice.ui.ExdeviceExpireUI exdeviceExpireUI) {
        this.f99628d = exdeviceExpireUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99628d.finish();
        return false;
    }
}
