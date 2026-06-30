package com.p314xaae8f345.mm.sdk.p2603x2137b148;

@j95.b
/* loaded from: classes13.dex */
public final class l5 extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static final android.telephony.TelephonyManager[] f274369e = {null};

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f274370d = new java.util.ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (1 != r1.getCallState()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (((android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio")).getMode() == 2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean Bi() {
        /*
            java.lang.String r0 = "MicroMsg.PhoneStatusWatcher"
            r1 = 31
            r2 = 0
            boolean r1 = fp.h.a(r1)     // Catch: java.lang.Throwable -> L58
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L2e
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L58
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L58
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L58
            r5 = 30
            if (r1 > r5) goto L1a
            goto L2e
        L1a:
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "audio"
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch: java.lang.Throwable -> L58
            android.media.AudioManager r1 = (android.media.AudioManager) r1     // Catch: java.lang.Throwable -> L58
            int r1 = r1.getMode()     // Catch: java.lang.Throwable -> L58
            if (r1 != r3) goto L2c
        L2a:
            r1 = r4
            goto L45
        L2c:
            r1 = r2
            goto L45
        L2e:
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "phone"
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch: java.lang.Throwable -> L58
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L58
            int r5 = r1.getCallState()     // Catch: java.lang.Throwable -> L58
            if (r3 == r5) goto L2a
            int r1 = r1.getCallState()     // Catch: java.lang.Throwable -> L58
            if (r4 != r1) goto L2c
            goto L2a
        L45:
            java.lang.String r3 = "isCallingSync, isCalling:%b"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L53
            r4[r2] = r5     // Catch: java.lang.Throwable -> L53
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r4)     // Catch: java.lang.Throwable -> L53
            goto L67
        L53:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L59
        L58:
            r1 = move-exception
        L59:
            java.lang.Throwable r1 = r1.fillInStackTrace()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "iscalling sync checking failed %s,"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3, r1)
            r1 = r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi():boolean");
    }

    public final void Ai(android.content.Context context) {
        android.telephony.TelephonyManager[] telephonyManagerArr = f274369e;
        if (telephonyManagerArr[0] != null) {
            return;
        }
        synchronized (telephonyManagerArr) {
            if (telephonyManagerArr[0] != null) {
                return;
            }
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            try {
                if (fp.h.a(31)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.i5 i5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i5(this, null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(32);
                    arrayList.add(i5Var);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/PhoneStatusWatcher", "initialize", "(Landroid/content/Context;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                    telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(telephonyManager, "com/tencent/mm/sdk/platformtools/PhoneStatusWatcher", "initialize", "(Landroid/content/Context;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                } else {
                    ((android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio")).addOnModeChangedListener(((ku5.t0) ku5.t0.f394148d).p("phone_status_watcher_task"), new com.p314xaae8f345.mm.sdk.p2603x2137b148.k5(this, null));
                }
                telephonyManagerArr[0] = telephonyManager;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PhoneStatusWatcher", th6, "Failure, read_phone_state permission: %s", java.lang.Boolean.valueOf(b3.l.m9698x3fed0563(context, "android.permission.READ_PHONE_STATE") != 0));
            }
        }
    }

    public void Di(com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 h5Var) {
        synchronized (this.f274370d) {
            ((java.util.ArrayList) this.f274370d).remove(h5Var);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        try {
            Ai(context);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PhoneStatusWatcher", th6, "Fail to do initialization.", new java.lang.Object[0]);
        }
    }

    public void wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 h5Var) {
        Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        synchronized (this.f274370d) {
            ((java.util.ArrayList) this.f274370d).add(h5Var);
        }
    }
}
