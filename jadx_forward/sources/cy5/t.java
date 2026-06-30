package cy5;

/* loaded from: classes13.dex */
public class t extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f306435f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final cy5.r f306436g = new cy5.r();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f306437h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f306438i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f306439j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f306440k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f306441l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f306442m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f306443n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f306444o = "";

    /* renamed from: p, reason: collision with root package name */
    public cy5.o f306445p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f306446q = "0";

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f306447r = by5.e4.b();

    /* renamed from: s, reason: collision with root package name */
    public final xx5.m f306448s = new xx5.m();

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    @Override // by5.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy5.t.d(java.lang.Object[]):java.lang.Object");
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num.intValue() == -3) {
            o(5, num.intValue());
            return;
        }
        int intValue = num.intValue();
        xx5.m mVar = this.f306448s;
        if (intValue == -4) {
            mVar.f539585a = num.intValue();
            xx5.o.a(mVar);
            o(5, num.intValue());
            return;
        }
        if ("6".equals(this.f306446q)) {
            by5.c4.a("XWalkPluginUpdaterChecker", "check type is only install embed plugin, skip download");
            o(5, 0);
            return;
        }
        by5.c4.a("XWalkPluginUpdaterChecker", "doFetchPluginUpdateConfig start");
        if (!by5.y.b()) {
            by5.c4.a("XWalkPluginUpdaterChecker", "doFetchPluginUpdateConfig network not available");
            mVar.f539585a = -2;
            xx5.o.a(mVar);
            o(5, -2);
            return;
        }
        if (!p(2, 1, null)) {
            by5.c4.a("XWalkPluginUpdaterChecker", "status change to fetch config failed");
            mVar.f539585a = -1;
            xx5.o.a(mVar);
            o(5, -1);
            return;
        }
        zx5.r rVar = new zx5.r();
        rVar.f558790a = this.f306447r;
        rVar.f558791b = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getDir("xwalkconfig", 0).getAbsolutePath() + java.io.File.separator + "pluginUpdateConfig.xml";
        zx5.u.k(rVar, new cy5.q(this));
    }

    @Override // by5.u0
    public void h() {
        p(1, 1, null);
    }

    public final boolean k() {
        java.lang.String str = this.f306444o;
        return (str == null || str.isEmpty() || this.f306445p == null) ? false : true;
    }

    public void l(java.lang.String str, int i17) {
        by5.c4.a("XWalkPluginUpdaterChecker", "onNotifyResult: " + str + " install retCode: " + i17);
        synchronized (this.f306435f) {
            if (this.f306436g.f306430a == 5) {
                return;
            }
            boolean z17 = true;
            if (i17 == -3) {
                this.f306439j++;
            } else if (i17 == -1) {
                this.f306440k++;
            } else if (i17 == -2) {
                this.f306441l++;
            } else if (i17 == 0) {
                this.f306442m++;
            }
            ((cy5.s) ((java.util.HashMap) this.f306437h).get(str)).f306434c = true;
            java.util.Iterator it = ((java.util.HashMap) this.f306437h).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cy5.s sVar = (cy5.s) ((java.util.Map.Entry) it.next()).getValue();
                if (sVar != null && !sVar.f306434c) {
                    z17 = false;
                    break;
                }
            }
            int i18 = this.f306436g.f306430a;
            if (z17) {
                ((java.util.HashMap) this.f306437h).clear();
                cy5.r rVar = this.f306436g;
                rVar.f306430a = 5;
                int i19 = this.f306440k;
                if (i19 > 0 && this.f306441l == 0) {
                    rVar.f306431b = -10;
                } else if (i19 == 0 && this.f306441l > 0) {
                    rVar.f306431b = -11;
                } else if (i19 > 0 || this.f306441l > 0) {
                    rVar.f306431b = -9;
                }
            }
            cy5.r rVar2 = this.f306436g;
            m(i18, rVar2.f306430a, rVar2.f306431b);
        }
    }

    public final void m(int i17, int i18, int i19) {
        if (i18 <= i17) {
            by5.c4.a("XWalkPluginUpdaterChecker", "status not changed, return");
            return;
        }
        by5.c4.a("XWalkPluginUpdaterChecker", "change status from " + i17 + " to " + i18 + ", errcode:" + i19);
        if (k()) {
            if (i17 == 0 && i18 == 1) {
                this.f306445p.a();
            } else if (i17 != 0 && i18 == 5) {
                this.f306445p.c(i19);
            }
        }
        if (i18 == 5) {
            by5.s0.t(15718, this.f306436g.f306431b + "," + this.f306438i + "," + this.f306439j + "," + this.f306440k + "," + this.f306441l + "," + this.f306442m);
            android.content.SharedPreferences g17 = by5.d4.g("xwalk_plugin_update_info");
            if (g17 != null) {
                android.content.SharedPreferences.Editor edit = g17.edit();
                edit.remove("nUpdatingProcessId");
                edit.commit();
                by5.c4.a("XWalkPluginUpdater", "plugin update progress finish");
            }
            this.f306443n = true;
        }
    }

    public void n(java.util.HashMap hashMap, java.lang.String str, cy5.o oVar) {
        if (hashMap != null) {
            java.lang.String str2 = (java.lang.String) hashMap.get("UpdaterCheckType");
            this.f306446q = str2;
            if (str2 == null || str2.isEmpty()) {
                by5.c4.f("XWalkPluginUpdaterChecker", "setParams, not set type, use default type: timer");
                this.f306446q = "0";
            }
        }
        this.f306444o = str;
        this.f306445p = oVar;
        java.lang.String str3 = this.f306446q;
        xx5.m mVar = this.f306448s;
        mVar.f539586b = str3;
        mVar.f539587c = k() ? this.f306444o : "";
        mVar.f539589e = this.f306447r;
        by5.c4.a("XWalkPluginUpdaterChecker", "create XWalkPluginUpdaterChecker, singlePlugin:" + this.f306444o + ", notifyType:" + this.f306446q + " [0:timer/1:notify/2:force/4:embed/5:config/6:embedPlugin/7:auto]");
    }

    public final boolean o(int i17, int i18) {
        return p(i17, i18, null);
    }

    public final boolean p(int i17, int i18, java.util.Map map) {
        int i19;
        int i27;
        int i28;
        synchronized (this.f306435f) {
            cy5.r rVar = this.f306436g;
            i19 = rVar.f306430a;
            if (i17 > i19) {
                rVar.f306430a = i17;
                if (i18 != 1) {
                    rVar.f306431b = i18;
                }
                if (i17 == 4) {
                    if (((java.util.HashMap) this.f306437h).size() == 0) {
                        this.f306436g.f306430a = 5;
                    } else {
                        java.util.Iterator it = ((java.util.HashMap) this.f306437h).entrySet().iterator();
                        while (it.hasNext()) {
                            cy5.s sVar = (cy5.s) ((java.util.Map.Entry) it.next()).getValue();
                            if (sVar != null && !sVar.f306434c) {
                                by5.u0 u0Var = sVar.f306432a;
                                u0Var.f118133d.set(true);
                                u0Var.f118131b.cancel(true);
                            }
                        }
                    }
                } else if (i17 == 3 && map != null) {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        cy5.s sVar2 = (cy5.s) entry.getValue();
                        ((java.util.HashMap) this.f306437h).put(str, sVar2);
                        int i29 = sVar2.f306433b;
                        if (i29 == 1) {
                            ((com.p314xaae8f345.p3210x3857dc.d2) sVar2.f306432a).e(new java.lang.Void[0]);
                        } else if (i29 == 2) {
                            ((com.p314xaae8f345.p3210x3857dc.e2) sVar2.f306432a).e(new java.lang.Void[0]);
                        } else {
                            ((java.util.HashMap) this.f306437h).remove(str);
                        }
                    }
                    this.f306438i = ((java.util.HashMap) this.f306437h).size();
                }
            }
            cy5.r rVar2 = this.f306436g;
            i27 = rVar2.f306430a;
            i28 = rVar2.f306431b;
        }
        m(i19, i27, i28);
        return i27 > i19;
    }
}
