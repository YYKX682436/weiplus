package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

@j95.b
/* loaded from: classes8.dex */
public class h0 extends i95.w implements m33.b1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f220986d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f220987e = false;

    public java.lang.String Ai(android.content.Context context) {
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).f222530s;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        return context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 ? r53.f.f474189d : "";
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) jj0.a.a()).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "null open or null username");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10738, str, str2, str, str3);
        }
    }

    public void Di(android.content.Context context, java.lang.String str, int i17, int i18, int i19) {
        ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) jj0.a.a()).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "reportGameDetail fail, appId is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10700, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
    }

    public void Ni(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, long j17, java.lang.String str4, int i19) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 != null) {
            jj0.a a17 = jj0.a.a();
            boolean k17 = h17.k();
            ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) a17).getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "reportReadMsg fail, appId is null");
                return;
            }
            java.lang.String bigInteger = new java.math.BigInteger("00FFFFFFFFFFFFFFFF", 16).and(java.math.BigInteger.valueOf(j17)).toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.reportReadMsg", "%s,%s,%s,%s,%s,%s,%s,%s,%d", str, bigInteger, str2, java.lang.Integer.valueOf(i17), str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k17 ? 1 : 0), str4, java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10532, str, bigInteger, str2, java.lang.Integer.valueOf(i17), str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k17 ? 1 : 0), str4, java.lang.Integer.valueOf(i19));
        }
    }

    public void Ri(android.content.Context context, java.lang.String str, java.lang.String str2) {
        ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) jj0.a.a()).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "reportRegToWx fail, appId is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        android.content.pm.PackageInfo a17 = ik1.b.a(context, str2);
        g0Var.d(10534, str, java.lang.Integer.valueOf(a17 == null ? 0 : a17.versionCode), nj0.a.b(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }

    public void Ui(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19) {
        ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) jj0.a.a()).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "rejectGameMsg fail, appId is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10546, str, str2, java.lang.Integer.valueOf(i17), nj0.a.b(), java.lang.Integer.valueOf(i18), str3, java.lang.Integer.valueOf(i19));
        }
    }

    public boolean Vi(android.content.Context context) {
        try {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.o();
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    public void wi(android.content.Context context) {
        if (context != null) {
            context.getSharedPreferences("game_center_pref", 0).edit().putString("notified_game_for_yyb_download_key", "").commit();
            context.getSharedPreferences("game_center_pref", 0).edit().putInt("total_notify_times_for_yyb_download_key", 0).commit();
            context.getSharedPreferences("game_center_pref", 0).edit().putBoolean("delete_message_by_time_key", false).commit();
        }
    }
}
