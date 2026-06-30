package com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1347xdbff2baa;

/* loaded from: classes5.dex */
public class b implements vx1.f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f178203a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f178204b = {"com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI", "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode", "com.tencent.mm.app.WorkerProfile$", "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI"};

    @Override // vx1.f
    public boolean a(int i17) {
        return true;
    }

    @Override // vx1.f
    public boolean b() {
        com.p314xaae8f345.mm.app.w.INSTANCE.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1347xdbff2baa.a(this));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0>(a0Var) { // from class: com.tencent.mm.plugin.crashfix.patch.killself.KillSelfMonitor$2
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0 c5660xf8f060d0) {
                boolean z17 = false;
                if (c5660xf8f060d0.f135986g.f87891a != 0) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1347xdbff2baa.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1347xdbff2baa.b.this;
                if (bVar.f178203a) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1453L, 0L, 1L, false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1453L, 1L, 1L, false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KillSelfMonitor", "killSelf!" + bVar.f178203a);
                java.lang.String str = "";
                for (java.lang.StackTraceElement stackTraceElement : new java.lang.Exception().getStackTrace()) {
                    str = str + stackTraceElement.toString() + "\n";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KillSelfMonitor", "stack:" + str);
                java.lang.String[] strArr = bVar.f178204b;
                int length = strArr.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (str.contains(strArr[i17])) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
                if (!z17) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.RE, true)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20683, bm5.f1.a(), str, java.lang.Integer.valueOf(bVar.f178203a ? 1 : -1));
                    }
                }
                return true;
            }
        }.mo48813x58998cd();
        return true;
    }
}
