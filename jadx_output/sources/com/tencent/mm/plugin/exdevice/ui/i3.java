package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class i3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI f99502d;

    public i3(com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI exdeviceManageDeviceUI) {
        this.f99502d = exdeviceManageDeviceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99502d.finish();
        return true;
    }
}
