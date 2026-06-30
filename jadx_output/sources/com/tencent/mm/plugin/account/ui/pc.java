package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class pc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg f74113d;

    public pc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg) {
        this.f74113d = mobileLoginOrForceReg;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.N;
        this.f74113d.W6();
        jx3.f.INSTANCE.idkeyStat(2096L, 4L, 1L, false);
        return false;
    }
}
