package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.DBRecoveryUI f96873d;

    public r(com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI) {
        this.f96873d = dBRecoveryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f96873d.finish();
        com.tencent.wcdb.database.SQLiteCipherSpec sQLiteCipherSpec = com.tencent.mm.plugin.dbbackup.e0.f96841m;
        com.tencent.mm.ui.vb.h(true);
    }
}
