package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.DBRecoveryUI f96870d;

    public p(com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI) {
        this.f96870d = dBRecoveryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI = this.f96870d;
        if (dBRecoveryUI.f96788o) {
            dBRecoveryUI.T6();
            return true;
        }
        dBRecoveryUI.finish();
        return true;
    }
}
