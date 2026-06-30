package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes4.dex */
public final class i0 extends c01.i8 {
    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.MenuDelegate_SendToDesktop.ConfigMigration";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return true;
    }

    @Override // c01.i8
    public void c(int i17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().contains("key_sendtodesktop_no_more_show_permission_notify_dialog")) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().edit().putBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().z0("key_sendtodesktop_no_more_show_permission_notify_dialog", "0").equals("1")).apply();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MenuDelegate_SendToDesktop", "SendToDesktopConfigToMMKVMigration.transfer() error=%s", th6);
        }
    }
}
