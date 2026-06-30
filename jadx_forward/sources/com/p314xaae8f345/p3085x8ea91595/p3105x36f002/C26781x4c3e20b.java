package com.p314xaae8f345.p3085x8ea91595.p3105x36f002;

/* renamed from: com.tencent.tmassistantsdk.util.TMLog */
/* loaded from: classes9.dex */
public class C26781x4c3e20b {

    /* renamed from: mHardDebugFlag */
    protected static boolean f56863x50bae847 = true;

    /* renamed from: mUseTimeStringList */
    protected static java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> f56865x51084776 = new java.util.HashMap<>();

    /* renamed from: mUseTimeLongList */
    protected static java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Long>> f56864x13d71e21 = new java.util.HashMap<>();

    /* renamed from: mDebugFlagForSDK */
    protected static boolean f56861x3bed53c3 = true;

    /* renamed from: mDebugFlagForSDKTag */
    protected static java.lang.String f56862xc707b8d7 = "";

    public static void d(java.lang.String str, java.lang.String str2) {
        m105534xeab95654();
    }

    /* renamed from: debugE */
    public static void m105532xb0623452(java.lang.String str) {
        if (!f56861x3bed53c3 || android.text.TextUtils.isEmpty(f56862xc707b8d7)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f56862xc707b8d7, str);
    }

    /* renamed from: debugV */
    public static void m105533xb0623463(java.lang.String str) {
        if (f56861x3bed53c3) {
            android.text.TextUtils.isEmpty(f56862xc707b8d7);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (m105534xeab95654()) {
            if (str2 == null) {
                str2 = "............";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (m105534xeab95654()) {
            if (str2 == null) {
                str2 = "............";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        }
    }

    /* renamed from: isForDebug */
    public static boolean m105534xeab95654() {
        return f56863x50bae847;
    }

    /* renamed from: setDebugLog */
    public static void m105535x97392e73(boolean z17, java.lang.String str) {
        f56861x3bed53c3 = z17;
        f56862xc707b8d7 = str;
    }

    /* renamed from: time */
    public static void m105536x3652cd(java.lang.String str) {
        m105538x3652cd("UseTime", str, false);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        m105534xeab95654();
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (m105534xeab95654()) {
            if (str2 == null) {
                str2 = "............";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, str2);
        }
    }

    /* renamed from: time */
    public static void m105539x3652cd(java.lang.String str, boolean z17) {
        m105538x3652cd("UseTime", str, z17);
    }

    /* renamed from: time */
    public static void m105537x3652cd(java.lang.String str, java.lang.String str2) {
        m105538x3652cd(str, str2, false);
    }

    /* renamed from: time */
    public static void m105538x3652cd(java.lang.String str, java.lang.String str2, boolean z17) {
        if (m105534xeab95654()) {
            java.util.ArrayList<java.lang.String> arrayList = f56865x51084776.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                f56865x51084776.put(str, arrayList);
            }
            arrayList.add(str2);
            java.util.ArrayList<java.lang.Long> arrayList2 = f56864x13d71e21.get(str);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList<>();
                f56864x13d71e21.put(str, arrayList2);
            }
            arrayList2.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (z17) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("total time:");
                long longValue = arrayList2.get(0).longValue();
                stringBuffer.append(arrayList2.get(arrayList2.size() - 1).longValue() - longValue);
                stringBuffer.append(" ");
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    stringBuffer.append(arrayList2.get(i17).longValue() - longValue);
                    longValue = arrayList2.get(i17).longValue();
                    stringBuffer.append(" ");
                    stringBuffer.append(arrayList.get(i17));
                    stringBuffer.append(" ");
                }
                arrayList.clear();
                arrayList2.clear();
            }
        }
    }
}
