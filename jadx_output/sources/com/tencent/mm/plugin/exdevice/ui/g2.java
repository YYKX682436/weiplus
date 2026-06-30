package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class g2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI f99462d;

    public g2(com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f99462d = exdeviceDeviceProfileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99462d.finish();
        return false;
    }
}
