package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes4.dex */
public class y6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI f99731d;

    public y6(com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI exdeviceSettingUI) {
        this.f99731d = exdeviceSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99731d.finish();
        return false;
    }
}
