package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class m extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f276632e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.l.f276613r, "BackupMoveTime")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276633d;

    public m(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.l.f276613r, "BackupMoveTime", null);
        this.f276633d = k0Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList("CREATE INDEX IF NOT EXISTS DeviceIdSessionIndex ON BackupMoveTime ( deviceId,sessionName )"));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            k0Var.A("BackupMoveTime", (java.lang.String) arrayList.get(i17));
        }
        java.lang.System.currentTimeMillis();
        k0Var.w(java.lang.Long.valueOf(F));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveTimeStorage", "executeInitSQL last time[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.n0
    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        return super.mo11261xce0038c9(j17, (com.p314xaae8f345.mm.p2621x8fb0427b.l) f0Var);
    }
}
