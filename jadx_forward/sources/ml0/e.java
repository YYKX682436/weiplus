package ml0;

/* loaded from: classes13.dex */
public class e extends ml0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final ml0.e f408721b = new ml0.e();

    @Override // ml0.b
    public boolean a() {
        pl0.e eVar;
        if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_plugin_kara_label_collect_open", "1", false, true), 1) != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TrainDataCollector", "no working");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TrainDataCollector", "run");
        nl0.d a17 = nl0.c.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 86400000;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_plugin_kara_is_save_data_local", "1", false, true), 1) != 0;
        a17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = a17.f419696d.B("select * from KeyNodeInfo where is_train_data_upload_finished=false and happen_time<=?", new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis)});
        while (B.moveToNext()) {
            try {
                dm.u6 u6Var = new dm.u6();
                u6Var.mo9015xbf5d97fd(B);
                arrayList.add(u6Var);
            } catch (java.lang.Throwable th6) {
                if (B != null) {
                    B.close();
                }
                throw th6;
            }
        }
        B.close();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dm.u6 u6Var2 = (dm.u6) it.next();
            if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TrainDataCollector", "background, skip");
                return true;
            }
            if (u6Var2.f68588x2262335f.equals("MomentVideo")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TrainDataCollector", "begin: %s %s", u6Var2.f68588x2262335f, u6Var2.f68574xc8a07680);
                java.lang.String str = u6Var2.f68588x2262335f;
                java.lang.String str2 = u6Var2.f68574xc8a07680;
                if (str.equals("MomentVideo")) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5623x4d14e0b8 c5623x4d14e0b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5623x4d14e0b8();
                    am.sg sgVar = c5623x4d14e0b8.f135950g;
                    sgVar.f89429a = str2;
                    c5623x4d14e0b8.e();
                    eVar = sgVar.f89430b;
                } else {
                    eVar = null;
                }
                if (eVar == null || u6Var2.f68573x68eb8605 <= 0) {
                    u6Var2.f68576x5c5523e2 = true;
                    a17.z0(u6Var2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.TrainDataCollector", "GetSnsVideoFeatureGroupEvent %s null", u6Var2.f68574xc8a07680);
                } else {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    eVar.mo46315x59bc66e();
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TrainDataCollector", "build time:" + currentTimeMillis3);
                    hl0.e eVar2 = new hl0.e(u6Var2.f68588x2262335f, u6Var2.f68574xc8a07680);
                    eVar2.f363598m = currentTimeMillis3;
                    eVar2.a();
                    int i17 = u6Var2.f68584xdc36ef76 > 0 ? 1 : 0;
                    em0.f.a(eVar, u6Var2.f68588x2262335f, i17, java.lang.String.format("%.4f", java.lang.Double.valueOf(java.lang.Double.valueOf(u6Var2.f68573x68eb8605).doubleValue() / 1000.0d)), java.lang.String.format("%.4f", java.lang.Double.valueOf(java.lang.Double.valueOf(u6Var2.f68584xdc36ef76).doubleValue() / 1000.0d)));
                    u6Var2.f68576x5c5523e2 = true;
                    a17.z0(u6Var2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.TrainDataCollector", "update succ: %s %s", u6Var2.f68588x2262335f, u6Var2.f68574xc8a07680);
                    if (z17) {
                        java.lang.String str3 = u6Var2.f68588x2262335f;
                        java.lang.String str4 = u6Var2.f68574xc8a07680;
                        java.lang.String h17 = eVar.h();
                        if (nl0.c.f419693b == null) {
                            nl0.c.b();
                        }
                        nl0.c.f419693b.z0(str3, str4, h17, i17);
                    }
                }
            }
        }
        return true;
    }

    @Override // ml0.b
    public long b() {
        return 3600000L;
    }

    @Override // ml0.b
    public java.lang.String c() {
        return "TrainData";
    }
}
