package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes7.dex */
public class ba extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f275327e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.aa.f275281x, "OpenMsgListener")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275328d;

    public ba(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.aa.f275281x, "OpenMsgListener", null);
        this.f275328d = k0Var;
        k0Var.A("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerAppIdIndex ON OpenMsgListener ( appId )");
        k0Var.A("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerStatusIndex ON OpenMsgListener ( status )");
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.aa aaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.aa) f0Var;
        if (aaVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f69143x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
            return false;
        }
        return this.f275328d.m("OpenMsgListener", com.p314xaae8f345.mm.p2621x8fb0427b.aa.f275281x.f398486b, aaVar.mo9763xeb27878e()) > 0;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.aa y0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f275328d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        android.database.Cursor D = k0Var.D("OpenMsgListener", null, "appId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgListenerStorage", "get null with appId:".concat(str));
            D.close();
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.aa aaVar = new com.p314xaae8f345.mm.p2621x8fb0427b.aa();
        aaVar.mo9015xbf5d97fd(D);
        D.close();
        return aaVar;
    }

    public int z0(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.aa aaVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || aaVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f69143x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
            return 0;
        }
        android.content.ContentValues mo9763xeb27878e = aaVar.mo9763xeb27878e();
        if (mo9763xeb27878e.size() <= 0) {
            return 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        return this.f275328d.p("OpenMsgListener", mo9763xeb27878e, "appId=?", new java.lang.String[]{str});
    }
}
