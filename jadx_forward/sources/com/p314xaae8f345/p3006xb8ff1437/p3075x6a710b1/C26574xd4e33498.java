package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPNetworkChangeMonitor */
/* loaded from: classes13.dex */
public class C26574xd4e33498 extends android.content.BroadcastReceiver {

    /* renamed from: DETAIL_WIFI_NETTYPE */
    private static final java.lang.String f55320xd5ccc03b = "wifi";

    /* renamed from: NETSTATUS_INAVAILABLE */
    public static final int f55321x422f7a94 = 1;

    /* renamed from: NETSTATUS_MOBILE */
    public static final int f55322xf2532f32 = 3;

    /* renamed from: NETSTATUS_NONE */
    public static final int f55323xee23b5c8 = 0;

    /* renamed from: NETSTATUS_WIFI */
    public static final int f55324xee27b5a5 = 2;

    /* renamed from: NETWORK_SUBTYPE_2G */
    public static final int f55325xf985b62b = 2;

    /* renamed from: NETWORK_SUBTYPE_3G */
    public static final int f55326xf985b64a = 3;

    /* renamed from: NETWORK_SUBTYPE_4G */
    public static final int f55327xf985b669 = 4;

    /* renamed from: NETWORK_SUBTYPE_UNKNOWN */
    public static final int f55328x58adfe14 = 0;

    /* renamed from: NETWORK_SUBTYPE_WIFI */
    public static final int f55329xaf01b96b = 1;
    private static final java.lang.String TAG = "TPNetworkChangeMonitor";

    /* renamed from: UNKNOWN_STR */
    private static final java.lang.String f55330xe0f1847c = "unknown";

    /* renamed from: lastNetStatus */
    private static int f55331xd2d011f9 = 0;

    /* renamed from: mDetailNetworkType */
    private static java.lang.String f55332x6cac008a = "unknown";

    /* renamed from: mLastDetailNetType */
    private static java.lang.String f55333xb253d103;

    /* renamed from: mNetStatus */
    private static int f55334xb87b4602;

    /* renamed from: mobileNetSubType */
    private static int f55335x3c517f7f;

    /* renamed from: mListeners */
    private java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener> f55336x32131c52;

    /* renamed from: mNetworkChangeInformThread */
    private android.os.HandlerThread f55337xa4355184;

    /* renamed from: com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$InstanceHolder */
    /* loaded from: classes13.dex */
    public static class InstanceHolder {

        /* renamed from: instance */
        private static com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498 f55338x21169495 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498();

        private InstanceHolder() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener */
    /* loaded from: classes13.dex */
    public interface OnNetStatusChangeListener {
        /* renamed from: onStatusChanged */
        void mo103065xed0a9ac3(int i17, int i18, int i19, int i27);
    }

    /* renamed from: dumpNetworkInfo */
    private void m104327x2f4dd968() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "-->updateNetStatus(), mNetStatus=" + f55334xb87b4602 + "[wifi: 2, mobile: 3], lastNetStatus=" + f55331xd2d011f9 + ", mDetailNetworkType=" + f55332x6cac008a + ", mobileNetSubType=" + f55335x3c517f7f + "[2G:2 3G:3 4G:4], currentDetailNetType=" + f55332x6cac008a + ", lastDetailNetType=" + f55333xb253d103);
    }

    /* renamed from: getDetailNetSubType */
    public static int m104328xdc22dfe4() {
        return f55335x3c517f7f;
    }

    /* renamed from: getDetailNetworkType */
    private java.lang.String m104330x22ff00c1(android.net.NetworkInfo networkInfo) {
        java.lang.String typeName = networkInfo != null ? networkInfo.getTypeName() : null;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "getDetailNetworkType, typeName: " + typeName);
        if (typeName == null) {
            return "unknown";
        }
        java.lang.String str = "wifi";
        if (!typeName.toLowerCase(java.util.Locale.getDefault()).equals("wifi")) {
            java.lang.String extraInfo = networkInfo.getExtraInfo();
            java.lang.String lowerCase = extraInfo != null ? extraInfo.toLowerCase(java.util.Locale.getDefault()) : null;
            if (lowerCase == null) {
                return "unknown";
            }
            java.lang.String str2 = "cmwap";
            if (!lowerCase.startsWith("cmwap")) {
                str2 = "cmnet";
                if (!lowerCase.startsWith("cmnet") && !lowerCase.startsWith("epc.tmobile.com")) {
                    str2 = "uniwap";
                    if (!lowerCase.startsWith("uniwap")) {
                        str2 = "uninet";
                        if (!lowerCase.startsWith("uninet")) {
                            str2 = "wap";
                            if (!lowerCase.startsWith("wap")) {
                                str2 = "net";
                                if (!lowerCase.startsWith("net")) {
                                    str2 = "ctwap";
                                    if (!lowerCase.startsWith("ctwap")) {
                                        if (lowerCase.startsWith("ctnet")) {
                                            return "ctnet";
                                        }
                                        str = "3gwap";
                                        if (!lowerCase.startsWith("3gwap")) {
                                            str = "3gnet";
                                            if (!lowerCase.startsWith("3gnet")) {
                                                if (!lowerCase.startsWith("#777")) {
                                                    return "unknown";
                                                }
                                                java.lang.String defaultHost = android.net.Proxy.getDefaultHost();
                                                if (defaultHost == null || defaultHost.length() <= 0) {
                                                    str2 = "ctnet";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return str2;
        }
        return str;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498 m104331x9cf0d20b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.InstanceHolder.f55338x21169495;
    }

    /* renamed from: getMobileNetworkSubType */
    private static int m104332x5c8f0544(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 0;
        }
        switch (networkInfo.getSubtype()) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            default:
                return 3;
            case 13:
                return 4;
        }
    }

    /* renamed from: getNetworkStatus */
    public static int m104333x84e6f80a() {
        return f55334xb87b4602;
    }

    /* renamed from: getSimpleNetTypeDesc */
    public static java.lang.String m104334x99564fe0() {
        if (android.text.TextUtils.isEmpty(f55332x6cac008a)) {
            return "unknown";
        }
        if (android.text.TextUtils.equals(f55332x6cac008a, "wifi")) {
            return "wifi";
        }
        if ("unknown".equals(f55332x6cac008a)) {
            return "unknown";
        }
        int i17 = f55335x3c517f7f;
        return i17 == 2 ? "2G" : i17 == 3 ? "3G" : i17 == 4 ? "4G" : "unknown";
    }

    /* renamed from: isMainThread */
    private static boolean m104335x9e2d0ded() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    /* renamed from: isMobileNetwork */
    public static boolean m104336xf08b1e22() {
        return f55334xb87b4602 == 3;
    }

    /* renamed from: isNetStatusInited */
    public static boolean m104337x7023d7f4() {
        return f55334xb87b4602 != 0;
    }

    /* renamed from: isNetworkActive */
    private boolean m104338x292841ca(android.net.NetworkInfo networkInfo) {
        return networkInfo != null && (networkInfo.isConnected() || networkInfo.isConnectedOrConnecting());
    }

    /* renamed from: isNetworkAvailable */
    public static boolean m104339x4bd2a185() {
        return f55334xb87b4602 != 1;
    }

    /* renamed from: isNetworkNoneStatus */
    public static boolean m104340xd195e20e(int i17) {
        return i17 == 0;
    }

    /* renamed from: isTheSameNet */
    private boolean m104341x3cb07270(android.net.NetworkInfo networkInfo, android.net.NetworkInfo networkInfo2) {
        return (networkInfo == null || networkInfo2 == null || (networkInfo != networkInfo2 && ((!networkInfo.isConnected() && !networkInfo.isConnectedOrConnecting()) || (!networkInfo2.isConnected() && !networkInfo2.isConnectedOrConnecting())))) ? false : true;
    }

    /* renamed from: isWifiNetwork */
    public static boolean m104342x941cadcf() {
        return f55334xb87b4602 == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000c, B:10:0x001a, B:12:0x005e, B:13:0x0064, B:15:0x006a, B:17:0x007a), top: B:3:0x0005 }] */
    /* renamed from: notifyIfNetChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m104343x4f2de53d() {
        /*
            r6 = this;
            java.lang.String r0 = "onNetworkStatusChanged oldNetStatus: "
            java.lang.String r1 = "notifyIfNetChanged, isNetChanged: "
            monitor-enter(r6)
            int r2 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602     // Catch: java.lang.Throwable -> L84
            int r3 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55331xd2d011f9     // Catch: java.lang.Throwable -> L84
            r4 = 0
            if (r2 != r3) goto L19
            java.lang.String r2 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55332x6cac008a     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55333xb253d103     // Catch: java.lang.Throwable -> L84
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L17
            goto L19
        L17:
            r2 = r4
            goto L1a
        L19:
            r2 = 1
        L1a:
            java.lang.String r3 = "TPNetworkChangeMonitor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L84
            r5.append(r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = ",  mListeners:  "
            r5.append(r1)     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener> r1 = r6.f55336x32131c52     // Catch: java.lang.Throwable -> L84
            r5.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L84
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(r3, r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "TPNetworkChangeMonitor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55331xd2d011f9     // Catch: java.lang.Throwable -> L84
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = ", netStatus: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602     // Catch: java.lang.Throwable -> L84
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = ", mobileNetSubType"
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            int r0 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55335x3c517f7f     // Catch: java.lang.Throwable -> L84
            r3.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L84
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(r1, r0)     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L82
            java.util.ArrayList<com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener> r0 = r6.f55336x32131c52     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        L64:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L84
            com.tencent.thumbplayer.utils.TPNetworkChangeMonitor$OnNetStatusChangeListener r1 = (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener) r1     // Catch: java.lang.Throwable -> L84
            int r2 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55331xd2d011f9     // Catch: java.lang.Throwable -> L84
            int r3 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602     // Catch: java.lang.Throwable -> L84
            int r5 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55335x3c517f7f     // Catch: java.lang.Throwable -> L84
            r1.mo103065xed0a9ac3(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L84
            goto L64
        L7a:
            int r0 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602     // Catch: java.lang.Throwable -> L84
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55331xd2d011f9 = r0     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55332x6cac008a     // Catch: java.lang.Throwable -> L84
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55333xb253d103 = r0     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r6)
            return
        L84:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104343x4f2de53d():void");
    }

    /* renamed from: registerReceiver */
    private synchronized void m104344xc20729b2(android.content.Context context, android.os.Handler handler) {
        if (context != null) {
            context.registerReceiver(this, new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be), null, handler);
        }
    }

    /* renamed from: unregisterReceiver */
    private synchronized void m104345x41b0e64b(android.content.Context context) {
        if (context != null) {
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "unregister receiver may throw illegal state exception ...");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:41:0x0002, B:4:0x000e, B:6:0x0020, B:8:0x0026, B:9:0x004b, B:14:0x0060, B:16:0x006a, B:17:0x0070, B:23:0x0054, B:24:0x005b, B:25:0x005e, B:26:0x0029, B:28:0x002f, B:29:0x0033, B:31:0x0036, B:33:0x003c, B:36:0x0045, B:38:0x0048), top: B:40:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:41:0x0002, B:4:0x000e, B:6:0x0020, B:8:0x0026, B:9:0x004b, B:14:0x0060, B:16:0x006a, B:17:0x0070, B:23:0x0054, B:24:0x005b, B:25:0x005e, B:26:0x0029, B:28:0x002f, B:29:0x0033, B:31:0x0036, B:33:0x003c, B:36:0x0045, B:38:0x0048), top: B:40:0x0002 }] */
    /* renamed from: updateNetStatus */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m104346x859eb526(android.content.Context r8) {
        /*
            r7 = this;
            if (r8 == 0) goto Lb
            java.lang.String r0 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r0)     // Catch: java.lang.Exception -> L76
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8     // Catch: java.lang.Exception -> L76
            goto Lc
        Lb:
            r8 = 0
        Lc:
            if (r8 == 0) goto L76
            r0 = 0
            android.net.NetworkInfo r1 = r8.getNetworkInfo(r0)     // Catch: java.lang.Exception -> L76
            r2 = 1
            android.net.NetworkInfo r3 = r8.getNetworkInfo(r2)     // Catch: java.lang.Exception -> L76
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L76
            r4 = 2
            r5 = 3
            if (r8 != 0) goto L36
            boolean r6 = r7.m104338x292841ca(r1)     // Catch: java.lang.Exception -> L76
            if (r6 == 0) goto L29
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602 = r5     // Catch: java.lang.Exception -> L76
            goto L4b
        L29:
            boolean r1 = r7.m104338x292841ca(r3)     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L33
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602 = r4     // Catch: java.lang.Exception -> L76
            r1 = r3
            goto L4b
        L33:
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602 = r2     // Catch: java.lang.Exception -> L76
            goto L4a
        L36:
            boolean r3 = r7.m104338x292841ca(r8)     // Catch: java.lang.Exception -> L76
            if (r3 == 0) goto L48
            boolean r1 = r7.m104338x292841ca(r1)     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L44
            r1 = r5
            goto L45
        L44:
            r1 = r4
        L45:
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602 = r1     // Catch: java.lang.Exception -> L76
            goto L4a
        L48:
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602 = r2     // Catch: java.lang.Exception -> L76
        L4a:
            r1 = r8
        L4b:
            int r8 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602     // Catch: java.lang.Exception -> L76
            if (r8 == r2) goto L5e
            if (r8 == r4) goto L5b
            if (r8 == r5) goto L54
            goto L60
        L54:
            int r8 = m104332x5c8f0544(r1)     // Catch: java.lang.Exception -> L76
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55335x3c517f7f = r8     // Catch: java.lang.Exception -> L76
            goto L60
        L5b:
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55335x3c517f7f = r2     // Catch: java.lang.Exception -> L76
            goto L60
        L5e:
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55335x3c517f7f = r0     // Catch: java.lang.Exception -> L76
        L60:
            java.lang.String r8 = r7.m104330x22ff00c1(r1)     // Catch: java.lang.Exception -> L76
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55332x6cac008a = r8     // Catch: java.lang.Exception -> L76
            int r0 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55331xd2d011f9     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L70
            int r0 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55334xb87b4602     // Catch: java.lang.Exception -> L76
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55331xd2d011f9 = r0     // Catch: java.lang.Exception -> L76
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.f55333xb253d103 = r8     // Catch: java.lang.Exception -> L76
        L70:
            r7.m104327x2f4dd968()     // Catch: java.lang.Exception -> L76
            r7.m104343x4f2de53d()     // Catch: java.lang.Exception -> L76
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104346x859eb526(android.content.Context):void");
    }

    /* renamed from: addOnNetStatusChangeListener */
    public synchronized void m104347x9e2a13d3(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener onNetStatusChangeListener) {
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener> arrayList = this.f55336x32131c52;
        if (arrayList != null && !arrayList.contains(onNetStatusChangeListener)) {
            this.f55336x32131c52.add(onNetStatusChangeListener);
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "add onNetStatus change listener: " + onNetStatusChangeListener + ", mListeners: " + this.f55336x32131c52.size());
        }
    }

    /* renamed from: init */
    public synchronized void m104348x316510(android.content.Context context) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104283x36ec6dd5(context, "context can not be null!");
        if (this.f55337xa4355184 == null) {
            this.f55337xa4355184 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104411x2a51c4e4();
        }
        m104344xc20729b2(context, new android.os.Handler(this.f55337xa4355184.getLooper()));
        m104346x859eb526(context);
    }

    /* renamed from: isCurrentUnicomWap */
    public boolean m104349xb57f5e66() {
        return "3gwap".equals(f55332x6cac008a) || "uniwap".equals(f55332x6cac008a);
    }

    /* renamed from: isNonUnicomMobileNetwork */
    public boolean m104350x7d5a39d8() {
        return "cmnet".equals(f55332x6cac008a) || "cmwap".equals(f55332x6cac008a) || "ctnet".equals(f55332x6cac008a) || "ctwap".equals(f55332x6cac008a);
    }

    /* renamed from: isUnicomMobileNetwork */
    public boolean m104351xa435a91() {
        return "3gnet".equals(f55332x6cac008a) || "cmnet".equals(f55332x6cac008a);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceive broadcast action and update net status,onReceive broadcast in ");
        sb6.append(m104335x9e2d0ded() ? com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29 : "work");
        sb6.append(" thread.");
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, sb6.toString());
        m104346x859eb526(context);
    }

    /* renamed from: release */
    public synchronized void m104352x41012807(android.content.Context context) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104283x36ec6dd5(context, "context can not be null!");
        m104345x41b0e64b(context);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104417x408b7293(this.f55337xa4355184, null);
        this.f55337xa4355184 = null;
    }

    /* renamed from: removeOnNetStatusChangeListener */
    public synchronized void m104353xfdf22950(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener onNetStatusChangeListener) {
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener> arrayList = this.f55336x32131c52;
        if (arrayList != null) {
            arrayList.remove(onNetStatusChangeListener);
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "remove netStatusChangeListener, listener: " + onNetStatusChangeListener + ", mListeners: " + this.f55336x32131c52.size());
        }
    }

    private C26574xd4e33498() {
        this.f55336x32131c52 = null;
        this.f55336x32131c52 = new java.util.ArrayList<>();
    }

    /* renamed from: getDetailNetworkType */
    public static java.lang.String m104329x22ff00c1() {
        return f55332x6cac008a;
    }
}
