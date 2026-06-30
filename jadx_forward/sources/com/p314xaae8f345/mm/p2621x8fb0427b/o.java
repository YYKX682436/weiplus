package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class o extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f276720e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.n.f276663p, "BackupRecoverMsgListDataId")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276721d;

    public o(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.n.f276663p, "BackupRecoverMsgListDataId", null);
        this.f276721d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        return super.mo11261xce0038c9(j17, (com.p314xaae8f345.mm.p2621x8fb0427b.n) f0Var);
    }

    public java.lang.String y0(java.lang.String str) {
        android.database.Cursor B = this.f276721d.B("SELECT * FROM BackupRecoverMsgListDataId WHERE msgListDataId = \"" + str + "\" ", null);
        if (B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId failed, msgListDataId:%s", str);
            return null;
        }
        if (!B.moveToFirst()) {
            B.close();
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n nVar = new com.p314xaae8f345.mm.p2621x8fb0427b.n();
        nVar.mo9015xbf5d97fd(B);
        B.close();
        return nVar.f68235x6a658e7c;
    }

    public boolean z0() {
        android.database.Cursor B = this.f276721d.B("SELECT * FROM BackupRecoverMsgListDataId", null);
        if (B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist failed.");
            return false;
        }
        if (B.getCount() > 0) {
            B.close();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "No data in BackupRecoverMsgListDataIdStorage.");
        B.close();
        return false;
    }
}
