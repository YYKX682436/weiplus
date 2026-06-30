package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f270506a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f270507b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f270508c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f270509d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f270510e;

    public l() {
        this.f270507b = null;
        this.f270508c = null;
        this.f270509d = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("AppIconServiceTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j(this), false);
        this.f270510e = b4Var;
        this.f270506a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k(this, gm0.j1.e().a());
        this.f270507b = new java.util.ArrayList();
        this.f270508c = new java.util.ArrayList();
        this.f270509d = new java.util.concurrent.ConcurrentHashMap();
        b4Var.c(600000L, 600000L);
    }

    public void a(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push fail, appId is null");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f3 f3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f3(str, i17);
        java.util.List list = this.f270507b;
        if (((java.util.ArrayList) list).contains(f3Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppIconService", "push, appId = " + str + ", iconType = " + i17 + " already in running list");
            return;
        }
        if (((java.util.ArrayList) list).size() < 5) {
            if (b(f3Var)) {
                ((java.util.ArrayList) list).add(f3Var);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppIconService", "running list has reached the max count");
            java.util.List list2 = this.f270508c;
            if (((java.util.ArrayList) list2).contains(f3Var)) {
                return;
            }
            ((java.util.ArrayList) list2).add(f3Var);
        }
    }

    public final boolean b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f3 f3Var) {
        boolean z17;
        java.lang.String str;
        if (f3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "startDownload fail, geticoninfo is null");
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f270509d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) concurrentHashMap.get(f3Var.m75153x9616526c()), 0));
        if (valueOf.intValue() >= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "increaseCounter fail, has reached the max try count");
            z17 = false;
        } else {
            concurrentHashMap.put(f3Var.m75153x9616526c(), java.lang.Integer.valueOf(valueOf.intValue() + 1));
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "increaseCounter fail");
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
        java.lang.String str2 = f3Var.f270423a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m z07 = Ri.z0(str2);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push, appinfo does not exist, appId = " + str2);
            return false;
        }
        int i17 = f3Var.f270424b;
        if (i17 == 1) {
            java.lang.String str3 = z07.f67369x5e556d3a;
            if (str3 == null || str3.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push, appIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.f67369x5e556d3a;
        } else if (i17 == 2) {
            java.lang.String str4 = z07.f67380x32aac1e7;
            if (str4 == null || str4.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push, appWatermarkUrl is null, appId = " + str2);
                return false;
            }
            str = z07.f67380x32aac1e7;
        } else if (i17 == 3) {
            java.lang.String str5 = z07.R;
            if (str5 == null || str5.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push, appSuggestionIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.R;
        } else if (i17 == 4) {
            java.lang.String str6 = z07.f319926y0;
            if (str6 == null || str6.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push, servicePanelIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.f319926y0;
        } else {
            if (i17 != 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push, unknown iconType = " + i17);
                return false;
            }
            java.lang.String str7 = z07.f319908l1;
            if (str7 == null || str7.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppIconService", "push, serviceListIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.f319908l1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppIconService", "appIconUrl = " + str);
        s75.d.b(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g3(this.f270506a, str2, i17, str), "AppIconService_getIcon");
        return true;
    }
}
