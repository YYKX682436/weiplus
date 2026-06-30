package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.f0 f225455d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.f0 f0Var) {
        this.f225455d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        this.f225455d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h0.f225504a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225480a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "doCleanLiteApp start");
            java.util.HashSet<java.lang.String> m65324x2c27d8cb = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65324x2c27d8cb();
            java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/pkg/";
            boolean z17 = false;
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
            j17 = 0;
            if (s17 != null) {
                for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "find pkg " + x1Var.f294765b + "  " + x1Var.f294764a);
                    if (x1Var.f294765b.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "wxalitebaselibrary continue");
                    } else if (m65324x2c27d8cb.contains(x1Var.f294765b)) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[z17 ? 1 : 0] = x1Var.f294765b;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: %s is in process, ignore.", objArr);
                    } else {
                        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().z(x1Var.f294765b);
                        java.lang.String str2 = str + x1Var.f294765b;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "absolutePath: " + str2);
                        if (z18 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f294765b + ", not in db");
                            j17 += h0Var.a(new com.p314xaae8f345.mm.vfs.r6(str2));
                            com.p314xaae8f345.mm.vfs.w6.f(str2);
                        } else if ((java.lang.System.currentTimeMillis() / 1000) - z18.f14374xee5c7336 < 86400) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f294765b + ", has recently update. ignore");
                        } else {
                            java.lang.Iterable s18 = com.p314xaae8f345.mm.vfs.w6.s(str2, z17);
                            if (s18 != null) {
                                java.util.Iterator it = s18.iterator();
                                while (it.hasNext()) {
                                    java.lang.String str3 = str2 + "/" + ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294765b;
                                    if (str3.equals(z18.f14369x346425)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f294765b + ", path: " + str3 + " not need to clear.");
                                    } else {
                                        long l17 = com.p314xaae8f345.mm.vfs.w6.l(str3);
                                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                        if (java.lang.System.currentTimeMillis() - l17 < 86400000) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f294765b + ", path: " + str3 + " has recently modified.");
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "appId: " + x1Var.f294765b + ", remove path: " + str3);
                                            j17 += h0Var.a(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3)));
                                            com.p314xaae8f345.mm.vfs.w6.f(str3);
                                        }
                                    }
                                    z17 = false;
                                }
                            }
                        }
                    }
                }
                java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.g();
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(g17);
                if (r6Var.m() && r6Var.y()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "clean tmp file.");
                    java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s19 = com.p314xaae8f345.mm.vfs.w6.s(g17, true);
                    if (s19 != null) {
                        for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : s19) {
                            if (!x1Var2.f294769f) {
                                long j18 = x1Var2.f294768e;
                                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                if (java.lang.System.currentTimeMillis() - j18 > 259200000) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "remove tmp file: " + x1Var2.f294764a);
                                    j17 += x1Var2.f294766c;
                                    x1Var2.a();
                                }
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppCleaner", "LiteApp Size: " + j17);
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("packageUsage", j17);
            java.lang.String replaceAll = jSONObject.toString().replaceAll(",", ";");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(30758, "cleanLiteAppPackage," + replaceAll);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppLite.LiteAppCheckerListener", e17, "", new java.lang.Object[0]);
        }
    }
}
