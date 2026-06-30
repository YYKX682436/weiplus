package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class l5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI f99556d;

    public l5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI exdeviceRankDataSourceUI) {
        this.f99556d = exdeviceRankDataSourceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI.f99329f;
        this.f99556d.finish();
        return true;
    }
}
