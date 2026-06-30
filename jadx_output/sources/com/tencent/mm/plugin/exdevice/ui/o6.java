package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class o6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99609d;

    public o6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99609d = exdeviceRankInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99609d.finish();
        return false;
    }
}
