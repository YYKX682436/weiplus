package v60;

/* loaded from: classes.dex */
public class w extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static long f514949d;

    public w() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class, java.lang.Class<zy.r>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        long j17;
        java.lang.Class cls = zy.r.class;
        am.r2 r2Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1).f135586g;
        boolean z17 = false;
        if (r2Var.f89292a != 200) {
            return false;
        }
        long j18 = f514949d;
        if (j18 > 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j17 = java.lang.System.currentTimeMillis() - j18;
            if (j17 < 50) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 2);
            } else if (j17 < 100) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 3);
            } else if (j17 < 500) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 4);
            } else if (j17 < 1000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 5);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 6);
            }
        } else {
            j17 = -1;
        }
        try {
            try {
                java.lang.String str = r2Var.f89294c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayGetA8KeyResUpdateListener", "get update res type:%d subType:%d useTime:%d filePatch:%s", java.lang.Integer.valueOf(r2Var.f89292a), java.lang.Integer.valueOf(r2Var.f89293b), java.lang.Long.valueOf(j17), str);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxPayGetA8KeyResUpdateListener", "file:%s not exits", str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 1);
                    jx3.f.INSTANCE.d(31531, 0, 101);
                } else {
                    java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(M)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxPayGetA8KeyResUpdateListener", "file:%s content is empty", str);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 1);
                        jx3.f.INSTANCE.d(31531, 0, 101);
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putString("MMKV_KEY_GETA8KEY_CONFIG_FILE", str);
                        jx3.f.INSTANCE.d(31531, java.lang.Integer.valueOf(new org.json.JSONObject(M).getInt("version")), 0);
                    }
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxPayGetA8KeyResUpdateListener", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 7);
                jx3.f.INSTANCE.d(31531, 0, 102);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxPayGetA8KeyResUpdateListener", e18, "", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2049, 1);
                jx3.f.INSTANCE.d(31531, 0, 103);
            }
            zy.r rVar = (zy.r) i95.n0.c(cls);
            int i17 = r2Var.f89292a;
            cls = r2Var.f89293b;
            ((yy.a) rVar).Ui(i17, cls, r2Var.f89295d, false);
            z17 = true;
            return true;
        } catch (java.lang.Throwable th6) {
            ((yy.a) ((zy.r) i95.n0.c(cls))).Ui(r2Var.f89292a, r2Var.f89293b, r2Var.f89295d, z17);
            throw th6;
        }
    }
}
