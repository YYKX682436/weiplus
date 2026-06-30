package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class w implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI f99708d;

    public w(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI exdeviceBindDeviceGuideUI) {
        this.f99708d = exdeviceBindDeviceGuideUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99708d.finish();
        return true;
    }
}
