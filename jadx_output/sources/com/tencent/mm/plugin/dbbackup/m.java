package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes12.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.dbbackup.n f96867d;

    public m(com.tencent.mm.plugin.dbbackup.n nVar) {
        this.f96867d = nVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jx3.f.INSTANCE.idkeyStat(873L, 25L, 1L, false);
        com.tencent.mm.plugin.dbbackup.DBRecoveryUI dBRecoveryUI = this.f96867d.f96868d;
        int[] iArr = com.tencent.mm.plugin.dbbackup.DBRecoveryUI.f96779q;
        dBRecoveryUI.V6();
    }
}
