package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptHitDebugUI f181380d;

    public q(com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI) {
        this.f181380d = exptHitDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f181380d.finish();
        return true;
    }
}
