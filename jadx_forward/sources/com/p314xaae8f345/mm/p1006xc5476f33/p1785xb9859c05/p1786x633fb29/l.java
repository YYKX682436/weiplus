package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes14.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.l f224011c;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f224012a = null;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f224013b;

    public l() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f224013b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.model.IPCallFeedbackConfigUpdater$1
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd2 = c5255x5f3208fd;
                if (c5255x5f3208fd2.f135586g.f89292a == 39) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "checkResUpdateListener callback");
                    byte[] N = com.p314xaae8f345.mm.vfs.w6.N(c5255x5f3208fd2.f135586g.f89294c, 0, -1);
                    if (N != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.l.this.a(N);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "checkResUpdateListener file not exist");
                    }
                }
                return false;
            }
        };
    }

    public boolean a(byte[] bArr) {
        try {
            try {
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(new java.lang.String(bArr), "feedbackconfig", null);
                if (d17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse xml feedbackconfig error");
                    return false;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i17 = 0;
                while (true) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".feedbackconfig.resourceslist.resources");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    java.lang.String str = (java.lang.String) d17.get(sb7 + ".$langid");
                    if (str == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "feedbackResource parse finished count:%d", java.lang.Integer.valueOf(arrayList.size()));
                        this.f224012a = arrayList;
                        return true;
                    }
                    i17++;
                    s83.f fVar = new s83.f();
                    fVar.f486408a = str;
                    fVar.f486409b = new java.util.ArrayList();
                    java.lang.String str2 = sb7 + ".string";
                    int i18 = 0;
                    while (true) {
                        s83.e eVar = new s83.e();
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(str2);
                        sb8.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
                        java.lang.String sb9 = sb8.toString();
                        java.lang.String str3 = (java.lang.String) d17.get(sb9);
                        if (str3 == null) {
                            break;
                        }
                        java.lang.String str4 = (java.lang.String) d17.get(sb9 + ".$id");
                        if (str4 == null) {
                            break;
                        }
                        i18++;
                        eVar.f486406a = str4;
                        eVar.f486407b = str3;
                        fVar.f486409b.add(eVar);
                    }
                    fVar.f486409b.size();
                    arrayList.add(fVar);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallFeedbackConfigUpdater", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config error: %s", e17.getMessage());
                return false;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallFeedbackConfigUpdater", e18, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config new string error: %s", e18.getMessage());
            return false;
        }
    }
}
