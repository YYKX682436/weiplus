package m62;

/* loaded from: classes5.dex */
public class e implements m62.c {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m62.c
    public void a() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_target26_start_service_switch, -1);
        boolean z17 = true;
        boolean z18 = false;
        if ((Ni == 0) == true) {
            com.p314xaae8f345.mm.p642xad8b531f.o.h(false);
        } else {
            if ((Ni == 2) == true) {
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_target26_start_service_manu_exclusive, "", true);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = Zi != null ? Zi : "null";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TargetStartServiceSingleton", "manufacturers:%s", objArr);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                    com.p314xaae8f345.mm.p642xad8b531f.o.h(true);
                } else {
                    java.lang.String[] split = Zi.split(",");
                    int i17 = 0;
                    while (true) {
                        if (i17 >= split.length) {
                            break;
                        }
                        if (("" + split[i17]).equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
                            com.p314xaae8f345.mm.p642xad8b531f.o.h(false);
                            z18 = true;
                            break;
                        }
                        i17++;
                    }
                    if (!z18) {
                        com.p314xaae8f345.mm.p642xad8b531f.o.h(true);
                    }
                }
            } else {
                if ((Ni == 1) != false) {
                    java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_target26_start_service_manufacturer, "", true);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[0] = Zi2 != null ? Zi2 : "null";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TargetStartServiceSingleton", "manufacturers:%s", objArr2);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi2)) {
                        com.p314xaae8f345.mm.p642xad8b531f.o.h(false);
                    } else {
                        java.lang.String[] split2 = Zi2.split(",");
                        int i18 = 0;
                        while (true) {
                            if (i18 >= split2.length) {
                                z17 = false;
                                break;
                            }
                            if (("" + split2[i18]).equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
                                com.p314xaae8f345.mm.p642xad8b531f.o.h(true);
                                break;
                            }
                            i18++;
                        }
                        if (!z17) {
                            com.p314xaae8f345.mm.p642xad8b531f.o.h(false);
                        }
                    }
                }
            }
        }
        boolean c17 = com.p314xaae8f345.mm.p642xad8b531f.o.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("service_launch_way", 4).edit().putInt("huawei_switch", c17 ? 1 : 0).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceUtil", "setTarget26StartServiceHuawei() enable: %s", java.lang.Integer.valueOf(c17 ? 1 : 0));
    }
}
