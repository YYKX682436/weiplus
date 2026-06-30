package com.tencent.kinda.framework;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u000f\u001a\u00020\u0004J0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\fJ\u0010\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dR\u0014\u0010!\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\"R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/tencent/kinda/framework/WxCrossHelper;", "", "", "status", "Ljz5/f0;", "setNfcSattusTo", "", "cacheTime", "updateLocationCacheTime", "", "checkGpsRateLimit", "incrementGpsRequestCount", "", "resultString", "checkShouldHandleHKWalletCGPUrl", "updateNfcStatus", "", "lat", "lng", "positionTs", "countryCode", "updateScene", "handleUpdateLocationCacheIfNeed", "url", "", "tryParseHKHongbaoRouteInfoFromUrl", "sourceUrl", "routeInfoString", "getHKHongbaoRouteInfoData", "Lorg/json/JSONObject;", "reqData", "Lcom/tencent/kinda/gen/ITransmitKvData;", "parseHKCashierReqData", "TAG", "Ljava/lang/String;", "SINGLE_BYTE_CHARSET_FOR_SAVE", "Li11/c;", "onLocationGet", "Li11/c;", "lastLat", "F", "lastLng", "lastTimestamp", "J", "lastCountryCode", "updatingGpsTimestamp", "forbidGps", "Z", "Lu60/e;", "upAddr", "Lu60/e;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WxCrossHelper {
    private static final java.lang.String TAG = "MicroMsg.WxCrossHelper";
    private static boolean forbidGps;
    private static java.lang.String lastCountryCode;
    private static float lastLat;
    private static float lastLng;
    private static long lastTimestamp;
    private static i11.c onLocationGet;
    private static long updatingGpsTimestamp;
    public static final com.tencent.kinda.framework.WxCrossHelper INSTANCE = new com.tencent.kinda.framework.WxCrossHelper();
    private static final java.lang.String SINGLE_BYTE_CHARSET_FOR_SAVE = com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET;
    private static final u60.e upAddr = new u60.e() { // from class: com.tencent.kinda.framework.WxCrossHelper$upAddr$1
        @Override // u60.e
        public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
            long j17;
            long j18;
            java.lang.String str;
            java.lang.String str2;
            kotlin.jvm.internal.o.g(addr, "addr");
            ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(this);
            if (com.tencent.mm.sdk.platformtools.t8.K0(addr.A)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxCrossHelper", "on location addr get, country code is null");
                return;
            }
            r45.h67 h67Var = new r45.h67();
            h67Var.f375883d = addr.f71224t;
            h67Var.f375884e = addr.f71225u;
            h67Var.f375885f = addr.f71213f;
            h67Var.f375886g = addr.f71214g;
            h67Var.f375887h = addr.f71216i;
            h67Var.f375888i = addr.A;
            h67Var.f375889m = addr.f71212e;
            h67Var.f375891o = addr.C;
            j17 = com.tencent.kinda.framework.WxCrossHelper.updatingGpsTimestamp;
            if (j17 == 0) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                com.tencent.kinda.framework.WxCrossHelper.updatingGpsTimestamp = i11.h.e().d() / 1000;
            }
            j18 = com.tencent.kinda.framework.WxCrossHelper.updatingGpsTimestamp;
            h67Var.f375890n = j18;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxCrossHelper", "on location addr get, country is %s, prov is %s, city is %s, disc is %s ,countryCode is %s, ts is %s, adcode is %s", h67Var.f375889m, h67Var.f375885f, h67Var.f375886g, h67Var.f375887h, h67Var.f375888i, java.lang.Long.valueOf(j18), h67Var.f375891o);
            try {
                byte[] byteArray = h67Var.toByteArray();
                if (byteArray == null) {
                    byteArray = new byte[0];
                }
                str2 = com.tencent.kinda.framework.WxCrossHelper.SINGLE_BYTE_CHARSET_FOR_SAVE;
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(str2);
                kotlin.jvm.internal.o.f(forName, "forName(...)");
                str = new java.lang.String(byteArray, forName);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxCrossHelper", "save config exp, " + e17.getLocalizedMessage());
                str = "";
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, str);
        }
    };

    private WxCrossHelper() {
    }

    private final boolean checkGpsRateLimit() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_pay_request_gps_interval, 3600);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_pay_request_gps_maxcount, 10);
        if (Ni > 0) {
            long a17 = c01.id.a();
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_GPS_LAST_REQUEST_TIME_LONG_SYNC, 0L);
            java.lang.Long l17 = m17 instanceof java.lang.Long ? (java.lang.Long) m17 : null;
            long longValue = a17 - (l17 != null ? l17.longValue() : 0L);
            long j17 = Ni;
            if (longValue < 1000 * j17) {
                com.tencent.mars.xlog.Log.i(TAG, "gps interval limit, elapsed: %sms, config interval: %ss, remain: %ss, use gps cache instead", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(Ni), java.lang.Long.valueOf(j17 - (longValue / 1000)));
                return true;
            }
        }
        if (Ni2 > 0) {
            long a18 = c01.id.a();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WCPAY_GPS_REQUEST_COUNT_INT_SYNC;
            java.lang.Object m18 = c17.m(u3Var, 0);
            java.lang.Integer num = m18 instanceof java.lang.Integer ? (java.lang.Integer) m18 : null;
            int intValue = num != null ? num.intValue() : 0;
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WCPAY_GPS_PERIOD_START_TIME_LONG_SYNC;
            java.lang.Object m19 = c18.m(u3Var2, 0L);
            java.lang.Long l18 = m19 instanceof java.lang.Long ? (java.lang.Long) m19 : null;
            long longValue2 = l18 != null ? l18.longValue() : 0L;
            if (longValue2 <= 0 || a18 - longValue2 >= 86400000) {
                com.tencent.mars.xlog.Log.i(TAG, "gps 24h period expired, reset count. prev periodStart: %s, current: %s", java.lang.Long.valueOf(longValue2), java.lang.Long.valueOf(a18));
                gm0.j1.u().c().x(u3Var, 0);
                gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(a18));
                intValue = 0;
                longValue2 = a18;
            }
            if (intValue >= Ni2) {
                com.tencent.mars.xlog.Log.i(TAG, "gps max count limit, currentCount: %s, maxCount: %s, remainTime: %sh, use gps cache instead", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(Ni2), java.lang.Long.valueOf(((86400000 - (a18 - longValue2)) / 1000) / 3600));
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "gps rate limit check passed, interval: %ss, maxCount: %ss", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2));
        return false;
    }

    private final void incrementGpsRequestCount() {
        long a17 = c01.id.a();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WCPAY_GPS_REQUEST_COUNT_INT_SYNC;
        int i17 = 0;
        java.lang.Object m17 = c17.m(u3Var, 0);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        int intValue = num != null ? num.intValue() : 0;
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WCPAY_GPS_PERIOD_START_TIME_LONG_SYNC;
        java.lang.Object m18 = c18.m(u3Var2, 0L);
        java.lang.Long l17 = m18 instanceof java.lang.Long ? (java.lang.Long) m18 : null;
        long longValue = l17 != null ? l17.longValue() : 0L;
        if (longValue <= 0 || a17 - longValue >= 86400000) {
            com.tencent.mars.xlog.Log.i(TAG, "gps 24h period expired, reset count. prev periodStart: %s, current: %s", java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(a17));
            longValue = a17;
        } else {
            i17 = intValue;
        }
        int i18 = i17 + 1;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WCPAY_GPS_LAST_REQUEST_TIME_LONG_SYNC, java.lang.Long.valueOf(a17));
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i18));
        gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(longValue));
        com.tencent.mars.xlog.Log.i(TAG, "gps request count incremented, count: %s, periodStart: %s", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(longValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNfcSattusTo(final int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.WxCrossHelper$setNfcSattusTo$1
            @Override // java.lang.Runnable
            public final void run() {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_SUPPORT_NFC_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLocationCacheTime(long j17) {
        r45.h67 h67Var = new r45.h67();
        java.lang.String str = "";
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        byte[] bArr = null;
        java.lang.String str2 = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i(TAG, "no location cache data");
        } else {
            if (str2 != null) {
                try {
                    java.nio.charset.Charset forName = java.nio.charset.Charset.forName(SINGLE_BYTE_CHARSET_FOR_SAVE);
                    kotlin.jvm.internal.o.f(forName, "forName(...)");
                    bArr = str2.getBytes(forName);
                    kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w(TAG, "parse cacheString exp, " + e17.getLocalizedMessage());
                }
            }
            h67Var.parseFrom(bArr);
        }
        long j18 = h67Var.f375890n;
        if (j18 <= 0 || j18 == j17) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "update location cache time from %s to %s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
        h67Var.f375890n = j17;
        try {
            byte[] byteArray = h67Var.toByteArray();
            if (byteArray == null) {
                byteArray = new byte[0];
            }
            java.nio.charset.Charset forName2 = java.nio.charset.Charset.forName(SINGLE_BYTE_CHARSET_FOR_SAVE);
            kotlin.jvm.internal.o.f(forName2, "forName(...)");
            str = new java.lang.String(byteArray, forName2);
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e(TAG, "save config exp, " + e18.getLocalizedMessage());
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, str);
    }

    public final boolean checkShouldHandleHKWalletCGPUrl(java.lang.String resultString) {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_wphk_scan_url_check, false)) {
            com.tencent.mars.xlog.Log.i(TAG, "WPHK handle hk wallet abtest off");
            return false;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        if (num == null || num.intValue() != 8) {
            com.tencent.mars.xlog.Log.i(TAG, "WPHK not HK wallet region, return false");
            return false;
        }
        if (resultString == null) {
            com.tencent.mars.xlog.Log.i(TAG, "WPHK resultString is null, return false");
            return false;
        }
        if (resultString.length() == 0) {
            com.tencent.mars.xlog.Log.i(TAG, "WPHK resultString is empty, return false");
            return false;
        }
        try {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
            java.lang.String string = M != null ? M.getString("MMKV_KEY_WPHK_CONFIG_DATA", "") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                long j17 = M != null ? M.getLong("MMKV_KEY_WPHK_CONFIG_TIMESTAMP", 0L) : 0L;
                if (j17 > 0) {
                    long a17 = c01.id.a();
                    com.tencent.mars.xlog.Log.i(TAG, "WPHK lastTime is : %s, currentTime is : %s, timeinterval is %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17), 86400000L);
                    if (a17 - j17 > 86400000) {
                        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(216, 1);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(Bi)) {
                            com.tencent.mars.xlog.Log.i(TAG, "WPHK filePath is null, return false");
                            return false;
                        }
                        if (!com.tencent.mm.vfs.w6.j(Bi)) {
                            com.tencent.mars.xlog.Log.i(TAG, "WPHK file : %s, not exist, return false", Bi);
                            return false;
                        }
                        string = com.tencent.mm.vfs.w6.M(Bi);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            com.tencent.mars.xlog.Log.i(TAG, "WPHK get content from res, save to mmkv");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 123);
                            if (M != null) {
                                M.putString("MMKV_KEY_WPHK_CONFIG_DATA", string);
                            }
                            if (M != null) {
                                M.putLong("MMKV_KEY_WPHK_CONFIG_TIMESTAMP", 0L);
                            }
                        }
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 122);
                    }
                } else if (M != null) {
                    M.putLong("MMKV_KEY_WPHK_CONFIG_TIMESTAMP", c01.id.a());
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                int optInt = jSONObject.optInt("version");
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("url-prefix");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    com.tencent.mars.xlog.Log.i(TAG, "WPHK url version is : %s, array count is : %s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optJSONArray.length()));
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString = optJSONArray.optString(i17);
                        if (optString == null) {
                            optString = "";
                        }
                        if ((optString.length() > 0) && r26.i0.y(resultString, optString, false)) {
                            com.tencent.mars.xlog.Log.i(TAG, "WPHK url : %s is startsWith prefix : %s", resultString, optString);
                            return true;
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "WPHK get url config file failed", new java.lang.Object[0]);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: Exception -> 0x0124, TryCatch #0 {Exception -> 0x0124, blocks: (B:15:0x0046, B:17:0x0070, B:20:0x0076, B:24:0x007e, B:25:0x0081, B:27:0x0087, B:30:0x0099, B:32:0x009d, B:34:0x00a3, B:37:0x00ab, B:39:0x00b2, B:41:0x00bf, B:42:0x00c8, B:46:0x00d3, B:48:0x00d7, B:51:0x00df, B:56:0x00fe, B:59:0x0105, B:60:0x011a, B:62:0x0103, B:63:0x00ea, B:67:0x0115), top: B:14:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: Exception -> 0x0124, TryCatch #0 {Exception -> 0x0124, blocks: (B:15:0x0046, B:17:0x0070, B:20:0x0076, B:24:0x007e, B:25:0x0081, B:27:0x0087, B:30:0x0099, B:32:0x009d, B:34:0x00a3, B:37:0x00ab, B:39:0x00b2, B:41:0x00bf, B:42:0x00c8, B:46:0x00d3, B:48:0x00d7, B:51:0x00df, B:56:0x00fe, B:59:0x0105, B:60:0x011a, B:62:0x0103, B:63:0x00ea, B:67:0x0115), top: B:14:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: Exception -> 0x0124, TryCatch #0 {Exception -> 0x0124, blocks: (B:15:0x0046, B:17:0x0070, B:20:0x0076, B:24:0x007e, B:25:0x0081, B:27:0x0087, B:30:0x0099, B:32:0x009d, B:34:0x00a3, B:37:0x00ab, B:39:0x00b2, B:41:0x00bf, B:42:0x00c8, B:46:0x00d3, B:48:0x00d7, B:51:0x00df, B:56:0x00fe, B:59:0x0105, B:60:0x011a, B:62:0x0103, B:63:0x00ea, B:67:0x0115), top: B:14:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] getHKHongbaoRouteInfoData(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.WxCrossHelper.getHKHongbaoRouteInfoData(java.lang.String, java.lang.String):byte[]");
    }

    public final void handleUpdateLocationCacheIfNeed(float f17, float f18, final long j17, java.lang.String str, int i17) {
        boolean fj6;
        boolean z17;
        lastLat = f17;
        lastLng = f18;
        lastTimestamp = j17;
        lastCountryCode = str;
        if (i17 == 1) {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_pay_cashier_gps_forbid, false);
        } else {
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_pay_service_gps_forbid, false);
        }
        forbidGps = fj6;
        com.tencent.mars.xlog.Log.i(TAG, "update loction cache, positionTs: %s, countryCode: %s, updatescene is: %s, forbidGps is: %s", java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(forbidGps));
        if (forbidGps) {
            z17 = false;
        } else {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
                com.tencent.mars.xlog.Log.i(TAG, "startGetLocation checkLocation false and ignore");
                return;
            }
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_pay_request_gps_config_enable, false);
            if (z17 && checkGpsRateLimit()) {
                com.tencent.mars.xlog.Log.i(TAG, "configEnable and checkGpsRateLimit forbidGps = true");
                forbidGps = true;
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "configEnable and checkGpsRateLimit forbidGps = false");
            }
        }
        if (onLocationGet == null) {
            onLocationGet = new i11.c() { // from class: com.tencent.kinda.framework.WxCrossHelper$handleUpdateLocationCacheIfNeed$1
                /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
                @Override // i11.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onGetLocation(boolean r16, float r17, float r18, int r19, double r20, double r22, double r24) {
                    /*
                        Method dump skipped, instructions count: 277
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.WxCrossHelper$handleUpdateLocationCacheIfNeed$1.onGetLocation(boolean, float, float, int, double, double, double):boolean");
                }
            };
        }
        if (forbidGps) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().g(onLocationGet);
            return;
        }
        if (z17) {
            incrementGpsRequestCount();
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().l(onLocationGet, true, false, false);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    public final com.tencent.kinda.gen.ITransmitKvData parseHKCashierReqData(org.json.JSONObject reqData) {
        if (reqData == null) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            kotlin.jvm.internal.o.f(create, "create(...)");
            return create;
        }
        com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
        java.lang.String optString = reqData.optString("attach");
        if (optString == null) {
            optString = "";
        }
        create2.putString("attach", optString);
        java.lang.String optString2 = reqData.optString("ffAttach");
        if (optString2 == null) {
            optString2 = "";
        }
        create2.putString("ff_attach", optString2);
        java.lang.String optString3 = reqData.optString("reqKey");
        if (optString3 == null) {
            optString3 = "";
        }
        create2.putString("req_key", optString3);
        java.lang.String optString4 = reqData.optString("defaultBindSerial");
        if (optString4 == null) {
            optString4 = "";
        }
        create2.putString("default_bind_serial", optString4);
        java.lang.String optString5 = reqData.optString("wxCtxAttach");
        create2.putString("wx_ctx_attach", optString5 != null ? optString5 : "");
        create2.putInt("cashierType", reqData.optInt("cashierType", 0));
        int optInt = reqData.optInt("loadingStyle", 0);
        if (optInt == 1) {
            create2.putBool("fromJsapiScene", true);
        } else if (optInt == 2) {
            create2.putBool("useWPHKLoading", true);
        }
        return create2;
    }

    public final byte[] tryParseHKHongbaoRouteInfoFromUrl(java.lang.String url) {
        java.lang.String str;
        if (url == null || url.length() == 0) {
            return null;
        }
        java.lang.String lowerCase = url.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (!(r26.i0.y(lowerCase, "https://hb.wechatpay.com.hk", false))) {
            com.tencent.mars.xlog.Log.i(TAG, "tryParseHKHongbaoRouteInfoFromUrl: not HK hongbao url");
            return null;
        }
        com.tencent.mars.xlog.Log.i(TAG, "tryParseHKHongbaoRouteInfoFromUrl: detected HK hongbao url: ".concat(url));
        try {
            int K = r26.n0.K(url, '#', 0, false, 6, null);
            if (K > 0) {
                str = url.substring(0, K);
                kotlin.jvm.internal.o.f(str, "substring(...)");
                com.tencent.mars.xlog.Log.i(TAG, "tryParseHKHongbaoRouteInfoFromUrl: removed fragment, urlToParse=".concat(str));
            } else {
                str = url;
            }
            android.net.Uri parse = android.net.Uri.parse(str);
            if (parse == null) {
                com.tencent.mars.xlog.Log.w(TAG, "tryParseHKHongbaoRouteInfoFromUrl: Uri.parse returned null");
                return null;
            }
            java.lang.String queryParameter = parse.getQueryParameter("routeinfo");
            com.tencent.mars.xlog.Log.i(TAG, "tryParseHKHongbaoRouteInfoFromUrl: routeInfoValue=" + queryParameter);
            if (queryParameter == null || queryParameter.length() == 0) {
                com.tencent.mars.xlog.Log.i(TAG, "tryParseHKHongbaoRouteInfoFromUrl: no routeinfo param, fallback to webview");
                return null;
            }
            byte[] hKHongbaoRouteInfoData = getHKHongbaoRouteInfoData(url, queryParameter);
            if (hKHongbaoRouteInfoData != null) {
                if (!(hKHongbaoRouteInfoData.length == 0)) {
                    com.tencent.mars.xlog.Log.i(TAG, "tryParseHKHongbaoRouteInfoFromUrl: parsed successfully, size: " + hKHongbaoRouteInfoData.length);
                    return hKHongbaoRouteInfoData;
                }
            }
            com.tencent.mars.xlog.Log.i(TAG, "tryParseHKHongbaoRouteInfoFromUrl: routeInfoData is null or empty, fallback to webview");
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(TAG, "tryParseHKHongbaoRouteInfoFromUrl: failed to parse url", e17);
            return null;
        }
    }

    public final void updateNfcStatus() {
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.WxCrossHelper$updateNfcStatus$1
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                if (context == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxCrossHelper", "context is null");
                    return;
                }
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (!kotlin.jvm.internal.o.b(packageManager != null ? java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.nfc")) : null, java.lang.Boolean.TRUE)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxCrossHelper", "not support nfc");
                    com.tencent.kinda.framework.WxCrossHelper.INSTANCE.setNfcSattusTo(0);
                } else if (android.nfc.NfcAdapter.getDefaultAdapter(context) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxCrossHelper", " nfc adapter get null");
                    com.tencent.kinda.framework.WxCrossHelper.INSTANCE.setNfcSattusTo(0);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxCrossHelper", "get nfc adapter, set to 1");
                    com.tencent.kinda.framework.WxCrossHelper.INSTANCE.setNfcSattusTo(1);
                }
            }
        });
    }
}
