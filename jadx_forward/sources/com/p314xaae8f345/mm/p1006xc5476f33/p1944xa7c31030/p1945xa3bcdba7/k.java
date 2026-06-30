package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f234474a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f234475b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f234476c;

    static {
        tp3.a.INSTANCE.getClass();
        f234475b = ".cmd.diagnostic.$token";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f234476c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.performance.diagnostic.DiagnosticPush$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiagnosticPush", "expt changed");
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_diagnostic_expt_push_cmd, "", true);
                if (android.text.TextUtils.isEmpty(Zi)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiagnosticPush", "empty push command");
                    return false;
                }
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(Zi, "cmd", null);
                if (d17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiagnosticPush", "invalid push command: %s", Zi);
                    return false;
                }
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.k.f234475b;
                java.lang.String str2 = (java.lang.String) d17.get(str);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.k.f234474a;
                java.lang.String u17 = o4Var.u(str, "");
                if (android.text.TextUtils.isEmpty(str2) || u17.equalsIgnoreCase(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiagnosticPush", "ignore command, seq = %s, lastSeq = %s", str2, u17);
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiagnosticPush", "valid push cmd: %s", Zi);
                o4Var.D(str, str2);
                tp3.a.INSTANCE.b(d17);
                return false;
            }
        };
    }
}
