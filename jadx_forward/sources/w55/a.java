package w55;

/* loaded from: classes11.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final jz5.l a() {
        try {
            boolean z17 = false;
            int c17 = ku5.t0.f394148d != null ? j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20281x8414f802()) : com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("RepairerConfig_StorageNoSpaceThreshold", 0);
            if (100 <= c17 && c17 < 10001) {
                z17 = true;
            }
            return new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(c17 * 1000000));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RepairerConfigGlobalStorage", "getThresholdBytes failed: " + e17);
            return new jz5.l(java.lang.Boolean.FALSE, 0L);
        }
    }

    public final void b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean exists = new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").exists();
        jz5.l a17 = a();
        boolean booleanValue = ((java.lang.Boolean) a17.f384366d).booleanValue();
        long longValue = ((java.lang.Number) a17.f384367e).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerConfigGlobalStorage", "refreshFileFlag:hasFileFlag=" + exists + ", valid=" + booleanValue + ", threshold=" + longValue);
        try {
            if (!booleanValue) {
                l75.d1.f398479b = 0L;
                if (exists) {
                    try {
                        new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").delete();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerConfigGlobalStorage", e17, "delete file failed", new java.lang.Object[0]);
                    }
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("RepairerConfig_StorageNoSpaceThreshold");
                return;
            }
            l75.d1.f398479b = longValue;
            if (!exists) {
                try {
                    new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").createNewFile();
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RepairerConfigGlobalStorage", "create file failed: " + e18);
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("RepairerConfig_StorageNoSpaceThreshold", j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20281x8414f802()));
            return;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RepairerConfigGlobalStorage", "refreshFileFlag failed: " + e19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RepairerConfigGlobalStorage", "refreshFileFlag failed: " + e19);
    }
}
